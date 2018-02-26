package com.bombardier.macs.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bombardier.macs.ApiStatus;
import com.bombardier.macs.Constants;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.cache.CacheItem;
import com.bombardier.macs.cache.MacsObjectCache;
import com.bombardier.macs.dao.CahierActionRepository;
import com.bombardier.macs.dao.CahierHistoryRepository;
import com.bombardier.macs.dao.CahierRepository;
import com.bombardier.macs.dao.JalonRepository;
import com.bombardier.macs.dao.PartRepository;
import com.bombardier.macs.dao.WorkcenterPartRepository;
import com.bombardier.macs.dao.WorkcenterRepository;
import com.bombardier.macs.json.model.CahierComponentField;
import com.bombardier.macs.json.model.CahierHistoryData;
import com.bombardier.macs.json.model.ParentChildObject;
import com.bombardier.macs.json.model.Sector;
import com.bombardier.macs.json.model.Source;
import com.bombardier.macs.json.model.WorkCenter;
import com.bombardier.macs.json.model.WorkCenterCahier;
import com.bombardier.macs.json.model.WorkCenterPart;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.CahierAction;
import com.bombardier.macs.model.CahierHistory;
import com.bombardier.macs.model.Jalon;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.util.EntityMapper;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.retriever.SapWorkcenterRetriever;

@Service
@Transactional
public class MacsWorkcenterServiceImpl implements MacsWorkcenterService {

	@Autowired
	private WorkcenterPartRepository wcpartRepository;

	@Autowired
	private PartRepository partRepository;

	@Autowired
	private WorkcenterRepository workcenterRepository;

	@Autowired
	private CahierRepository cahierRepository;

	@Autowired
	private JalonRepository jalonRepository;
	
	@Autowired
	private CahierHistoryRepository cahierHistoryRepository;

	@Autowired
	private CahierActionRepository cahierActionRepository;

	// ---------------------------------------------------
	// ---------------WORKCENTERS------------------------------
	// ---------------------------------------------------

	@Override
	public ResponseEntity<Object> deleteWorkCentersPartsByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, List<WorkCenter> workcenters) {
		HttpStatus status = deleteWorkcentersParts(workcenters, projectId, sectorId, subSectorId);
		ApiStatus apiStatus = new ApiStatus(status, false, false, true);
		return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());

	}

	@Override
	public ResponseEntity<Void> updateWorkCentersByProjectSector(String projectId, String sectorId,
			List<WorkCenter> workcenters) {
		HttpStatus status = updateWorkcenters(workcenters, projectId, sectorId, null);
		ResponseEntity response = new ResponseEntity<Void>(status);
		return response;
	}

	@Override
	public ResponseEntity<Void> updateWorkCentersByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, List<WorkCenter> workcenters) {
		HttpStatus status = updateWorkcenters(workcenters, projectId, sectorId, subSectorId);
		ResponseEntity response = new ResponseEntity<Void>(status);
		return response;
	}

	@Override
	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSector(String projectId, String sectorId,
			List<String> wcIds) {

		List<Workcenter> listworkcenters = workcenterRepository.findByProjectIdAndSectorId(projectId, sectorId);

		List<Workcenter> filteredworkcenters = new ArrayList<Workcenter>();
		if (wcIds != null && wcIds.size() > 0) {
			for (Workcenter wc : listworkcenters) {
				for (String wcId : wcIds) {
					if (wcId.equals(wc.getId().toString())) {
						filteredworkcenters.add(wc);
					}
				}
			}
		} else {
			filteredworkcenters.addAll(listworkcenters);
		}

		ResponseEntity response = new ResponseEntity<List<WorkCenter>>(HttpStatus.OK);
		return response.ok().body(EntityMapper.getInstance().toJsonWorkCenters(filteredworkcenters));

	};

	@Override
	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSectorSubSector(String projectId, String sectorId,
			String subsectorId, List<String> wcIds) {
		try {
			loadWorkcentersFromPI(projectId, sectorId, subsectorId);
		} catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to retrieve workcenters through PI.", e);
			ResponseEntity<List<WorkCenter>> response = new ResponseEntity<List<WorkCenter>>(
					HttpStatus.INTERNAL_SERVER_ERROR);
			return response;
		}

		List<WorkCenter> listWorkCenters = getWorkCentersFromWipAsJson(projectId, sectorId, subsectorId, wcIds);

		return ResponseEntity.ok().body(listWorkCenters);
	};

	// Load Workcenter data from WIP
	private List<WorkCenter> getWorkCentersFromWipAsJson(String projectId, String sectorId, String subsectorId,
			List<String> wcIds) {
		List<WorkCenter> listWorkCenters;
		// Fetch the list from WIP-DB to include cahiers etc..
		List<Workcenter> daoWorkCenters;
		if ((wcIds == null) || wcIds.isEmpty()) {
			// No wcIds specified. Fetching full list.
			daoWorkCenters = workcenterRepository.findByProjectIdAndSectorIdAndSubsectorId(projectId, sectorId,
					subsectorId);
			listWorkCenters = new ArrayList<WorkCenter>(daoWorkCenters.size());
			for (Workcenter daoWorkCenter : daoWorkCenters) {
				listWorkCenters.add(EntityMapper.getInstance().toJsonWorkcenter(daoWorkCenter));
			}
		} else {
			// Fetch only the specified list of workcenters by Ids
			listWorkCenters = new ArrayList<WorkCenter>(wcIds.size());

			for (String wcId : wcIds) {
				Optional<Workcenter> possibleWC = workcenterRepository.findOne(Long.valueOf(wcId));

				if (possibleWC != null) {
					Workcenter wc = possibleWC.get();
					listWorkCenters.add(EntityMapper.getInstance().toJsonWorkcenter(wc));
				}
			}
		}

		return listWorkCenters;
	}

	// Loads Workcenter data from PI and write data to wips db.
	private void loadWorkcentersFromPI(String projectId, String sectorId, String subsectorId) throws MacsException {
		List<WorkCenter> listWorkCenters = null;

		// Check if workcenters have already been loaded from SAP or if cache is
		// expired.

		String cacheKey = MessageFormat.format(Constants.WORKCENTER_CACHE_KEY_TEMPLATE, projectId, sectorId,
				subsectorId);

		CacheItem cacheItem = MacsObjectCache.getCacheItem(cacheKey);
		long now = System.currentTimeMillis();

		if (cacheItem == null || now > (cacheItem.getTimeStamp() + Constants.WORKCENTER_MAX_CACHE_TIME)) {
			listWorkCenters = SapWorkcenterRetriever.getWorkcenterList(projectId, sectorId, subsectorId);

			cacheItem = new CacheItem(now, null); // only the timeStamp is
													// stored, since data is
													// saved to db
			MacsObjectCache.addOrUpdateCacheItem(cacheKey, cacheItem);

			// Create the workcenters in MACS-WIP if not yet there.
			/// It is easier to create them up front rather than wait for a part
			// to be added to it
			for (WorkCenter wc : listWorkCenters) {
				createWcIfNotExist(wc, projectId, sectorId, subsectorId);
			}
		}
	}

	@Override
	public Workcenter getWorkcenterById(Long wcId) {

		Optional<Workcenter> wcOpt = workcenterRepository.findOne(wcId);
		Workcenter wc = null;
		if (wcOpt != null && wcOpt.isPresent()) {
			wc = wcOpt.get();
			return wc;
		}
		return null;

	};

	private HttpStatus getPartById(List<WorkCenterPart> jsonparts, Workcenter wc, String projectId) {

		List<WorkcenterPart> wipparts = wcpartRepository.findByWorkcenter(wc);
		for (WorkCenterPart jsonpart : jsonparts) {
			boolean isPartFound = false;
			for (WorkcenterPart part : wipparts) {
				if (part.getId().equals(HelperClass.buildInternalPartId(projectId, jsonpart.getId()))) {
					isPartFound = true;

				}
			}
			if (!isPartFound) {

				return HttpStatus.METHOD_NOT_ALLOWED;
			}
		}

		return HttpStatus.OK;
	}

	public HttpStatus deleteWorkcentersParts(List<WorkCenter> jsonworkcenters, String projectId, String sectorId,
			String subsectorId) {

		if (jsonworkcenters == null || jsonworkcenters.size() == 0) {
			return HttpStatus.NO_CONTENT;
		}

		HttpStatus status = HttpStatus.OK;

		for (WorkCenter jsonwc : jsonworkcenters) {
			Optional<Workcenter> wcOpt = workcenterRepository.findOne(jsonwc.getId());
			Workcenter dbWc = null;
			if (wcOpt != null && wcOpt.isPresent()) {
				dbWc = wcOpt.get();
				status = processToDeleteParts(dbWc, jsonwc.getParts(), projectId);
			}
		}
		return status;
	}

	// ------------------------------------------------------------
	// update the wip wcs , add those not exist in wip,
	public HttpStatus updateWorkcenters(List<WorkCenter> jsonworkcenters, String projectId, String sectorId,
			String subsectorId) {

		if (jsonworkcenters == null || jsonworkcenters.size() == 0) {
			return HttpStatus.NO_CONTENT;
		}

		String cacheKey = MessageFormat.format(Constants.PARTS_CACHE_KEY_TEMPLATE, projectId, sectorId, subsectorId);

		HttpStatus status = HttpStatus.OK;
		for (WorkCenter jsonwc : jsonworkcenters) {
			// 2-create new workcenter if not laready exist in wip
			Workcenter dbWc = createWcIfNotExist(jsonwc, projectId, sectorId, subsectorId);
			// 3- update workcenter and update all parts all cahiers and all
			// jalons inside
			HttpStatus statusWc = updateWorkcenter(dbWc, jsonwc, projectId, cacheKey);

			if (!statusWc.equals(HttpStatus.OK)) {
				status = statusWc;
			}

		}

		return status;
	}

	private Workcenter createWcIfNotExist(WorkCenter jsonWc, String projectId, String sectorId, String subsectorId) {
		// Assumption: Workcenters are unique for a given: project,sector,
		// subsector and WC number.
		// Optional<Workcenter> wcOpt =
		// workcenterRepository.findByProjectIdSectorIdSubSectorIdAndNumber(projectId,
		// sectorId, subsectorId, jsonWc.getNumber());
		// fix bug,

		Optional<Workcenter> wcOpt = null;

		if (jsonWc.getId() != null && jsonWc.getId() >= 0) {
			wcOpt = workcenterRepository.findOne(jsonWc.getId());
		}

		else if (jsonWc.getNumber() != null && !jsonWc.getNumber().isEmpty()) {
			wcOpt = workcenterRepository.findByProjectIdSectorIdSubSectorIdAndNumber(projectId, sectorId, subsectorId,
					jsonWc.getNumber());
		} else {
			return null;
		}

		Workcenter wc = null;
		if (wcOpt != null && wcOpt.isPresent()) {
			wc = wcOpt.get();
			return wc;
		}

		Workcenter newWc = new Workcenter();
		newWc.setWcNumber(jsonWc.getNumber());
		newWc.setProjectId(String.valueOf(projectId));
		newWc.setSectorId(sectorId);

		if (subsectorId != null) {
			newWc.setSubSectorId(subsectorId);
		}

		newWc.setTitle(jsonWc.getTitle());
		newWc.setCsd(jsonWc.getIsCSD());
		newWc.setActive(jsonWc.getIsActive());

		if (jsonWc.getJalons() != null) {
			newWc.setJalons(EntityMapper.jsonToJalonModel(newWc, jsonWc.getJalons()));
		}

		newWc = workcenterRepository.save(newWc);
		return newWc;

	}

	private HttpStatus updateWorkcenter(Workcenter wcToPersist, WorkCenter jsonwc, String projectId, String cacheKey) {

		HttpStatus status = HttpStatus.OK;

		// 4- create all parts not in wip, update those already exist, remove
		// not exist in jsonwc parts
		// wcToPersist.setWcparts(processToUpdateParts(wcToPersist,
		// jsonwc.getParts(), projectId));
		HttpStatus statusparts = processToUpdateParts(wcToPersist, jsonwc.getParts(), jsonwc.getSource(), projectId,
				cacheKey);

		// 7- update all cahiers already exist in wip, remove cahiers not exist
		// in jsonwc cahiers
		HttpStatus statuscahiers = processtoUpdateWcCahiers(wcToPersist, jsonwc.getCahiers(), jsonwc.getSource());// !!!!
		// 10- create all jalons not in wip, update those already exist, remove
		// not exist in jsonwc jalons

		HttpStatus statusjalons = processToUpdateJalons(wcToPersist, jsonwc.getJalons(), jsonwc.getSource());

		if (!status.equals(statusparts))
			return statusparts;
		if (!status.equals(statuscahiers))
			return statuscahiers;
		if (!status.equals(statusjalons))
			return statusjalons;

		return status;
	}

	// process to update parts inside worcenter
	public HttpStatus processToUpdateParts(Workcenter wcToPersist, List<WorkCenterPart> jsonparts, Source source,
			String projectId, String cacheKey) {

		// If jsonparts (json workcenter parts) is null then ignore to do
		// changement on wip wc parts
		if (jsonparts == null) {
			return HttpStatus.NO_CONTENT;
		}

		HttpStatus status = HttpStatus.OK;

		// update notassignedparts from wip wc if belongs to list of
		// jsonnotassigned wcparts,
		// create the notassignedparts that belong to json wc, but not in wip

		// 6-update or create the workcenter notassignedparts
		for (WorkCenterPart jsonpart : jsonparts) {
			String partId = HelperClass.buildInternalPartId(wcToPersist.getProjectId(), jsonpart.getId());
			Optional<WorkcenterPart> optPart = wcpartRepository.findOne(partId);
			WorkcenterPart wcp = null;

			// if part exist , then update it, before updating check if the
			// source wc match
			// with part workcenter in wip, if not match return 405 status.
			if (optPart != null && optPart.isPresent()) {
				wcp = optPart.get();
				if (source != null) {
					// if part in WIP source must be different from Ebom ("E")
					if ("E".equals(source.getLocation().toUpperCase())) {
						status = HttpStatus.METHOD_NOT_ALLOWED;
						continue;
					}
					// if part wc not match with source for wc so continue to
					// next part in loop
					if ("W".equals(source.getLocation().toUpperCase())) {
						if ((wcp.getWorkcenter() != null
								&& !source.getId().equals(Long.toString(wcp.getWorkcenter().getId())))
								|| wcp.getCahier() != null) {
							status = HttpStatus.METHOD_NOT_ALLOWED;
							continue;
						}
					}

					// if part wc not match with source for cahier so continue
					// to next part in loop
					if ("C".equals(source.getLocation().toUpperCase())) {
						if (wcp.getCahier() == null || !source.getId().equals(Long.toString(wcp.getCahier().getId()))) {
							status = HttpStatus.METHOD_NOT_ALLOWED;
							continue;
						}
						// we are moving to workcenter, so if there was a cahier
						// before, that reference needs to be removed from part
						else {
							List<CahierComponentField> partsToDeleteList = new ArrayList<CahierComponentField>();
							partsToDeleteList.add(
									EntityMapper.getInstance().toJsonCahierPart(wcp));
								
							if( wcp.getCahier()!=null && wcp.getCahier().getIsConfirmed()){
								      addCahierHistory(partsToDeleteList,  wcp.getCahier(), "DELETE", "DELETE_PART");
							}

							wcp.setCahier(null);
						}
					}
				}
			}

			if (wcp == null) {
				// if part not in WIP, then source must be Ebom ("E")
				if (source != null) {
					if (!"E".equals(source.getLocation().toUpperCase())) {
						status = HttpStatus.METHOD_NOT_ALLOWED;
						continue;
					}
				}
				wcp = new WorkcenterPart(partId, jsonpart.getParentId(), jsonpart.getQty(), null, wcToPersist, null);

				// commented out as not used
				// wcp.setNumber(jsonpart.getId());

				// TODO is to remove when the sap ebom list is done
				MasterPart masterpart = null;
				Optional<MasterPart> opt = partRepository.findOne(jsonpart.getId());
				if (opt != null && opt.isPresent()) {
					masterpart = opt.get();
				}
				if (masterpart != null) {
					wcp = EntityMapper.getInstance().populatePartFromMasterPartEbom(wcp, masterpart);
				} else {
					wcp = EntityMapper.getInstance().populatePartFromEbom(wcp, jsonpart.getId(), cacheKey);
				}
			}
			wcp.setWorkcenter(wcToPersist);
			wcp.setQty(jsonpart.getQty());

			if (null != jsonpart.getParentId()) {
				if (jsonpart.getParentId().isEmpty() || jsonpart.getId().equals(jsonpart.getParentId())) {
					wcp.setParentid(null);
				} else {
					wcp.setParentid(jsonpart.getParentId());
				}
			}

			if (jsonpart.getChildren() != null && jsonpart.getChildren().size() > 0) {
				savePartChildren(wcToPersist, wcp, jsonpart, projectId, cacheKey);
			} else {
				wcp = wcpartRepository.save(wcp);
			}
		}

		return status;
	}

	// recursive method to save part and children,
	private void savePartChildren(Workcenter wcToPersist, WorkcenterPart workcentercpart, WorkCenterPart jsonpart,
			String projectid, String cacheKey) {

		WorkcenterPart wcpart = wcpartRepository.save(workcentercpart);
		if (jsonpart.getChildren() == null || jsonpart.getChildren().isEmpty() || jsonpart.getChildren().size() == 0)
			return;
		for (WorkCenterPart childpart : jsonpart.getChildren()) {

			String partId = HelperClass.buildInternalPartId(projectid, childpart.getId());
			Optional<WorkcenterPart> optPart = wcpartRepository.findOne(partId);
			WorkcenterPart wcpchild = null;

			if (optPart != null && optPart.isPresent()) {
				wcpchild = optPart.get();
			}

			if (wcpchild == null) {
				wcpchild = new WorkcenterPart(partId, childpart.getParentId(), childpart.getQty(), null, wcToPersist,
						null);
				// commented out as not used
				// wcpchild.setNumber(childpart.getId());

				// TODO is to remove when the sap ebom list is done
				MasterPart masterpart = null;
				Optional<MasterPart> opt = partRepository.findOne(childpart.getId());
				if (opt != null && opt.isPresent()) {
					masterpart = opt.get();
				}
				if (masterpart != null) {
					wcpchild = EntityMapper.getInstance().populatePartFromMasterPartEbom(wcpchild, masterpart);
				} else {
					wcpchild = EntityMapper.getInstance().populatePartFromEbom(wcpchild, jsonpart.getId(), cacheKey);
				}
			}
			wcpchild.setWorkcenter(wcToPersist);
			wcpchild.setCahier(null);
			wcpchild.setQty(childpart.getQty());

			if (null != childpart.getParentId()) {
				if (childpart.getParentId().isEmpty() || childpart.getId().equals(childpart.getParentId())) {
					wcpchild.setParentid(null);
				} else {
					wcpchild.setParentid(childpart.getParentId());
				}
			}
			wcpchild.setParent(wcpart);

			if (childpart.getChildren() != null && childpart.getChildren().size() > 0) {
				savePartChildren(wcToPersist, wcpchild, childpart, projectid, cacheKey);
			} else {
				wcpchild = wcpartRepository.save(wcpchild);
			}
		}

	}
	
	
	
     private void  addCahierHistory(List<CahierComponentField> cahiersUpdated, Cahier cahier, String type, String actiontype){
		
		CahierHistoryData data = new CahierHistoryData(type, cahiersUpdated);
		Optional<CahierAction> optCahAction = cahierActionRepository.findByType(actiontype);
		if (optCahAction != null) {
			CahierAction action = optCahAction.get();
			CahierHistory cahierHistory = EntityMapper.getInstance().addActionCahier(cahier.getId(), action,
					data);

			cahierHistory = cahierHistoryRepository.save(cahierHistory);
		}

		
	}

	// process to delete parts inside worcenter
	public HttpStatus processToDeleteParts(Workcenter wcToPersist, List<WorkCenterPart> jsonparts, String projectId) {

		// If jsonparts (json workcenter parts) is null then return with no
		// content status
		if (jsonparts == null) {
			return HttpStatus.NO_CONTENT;
		}

		// If wcpart not found return 405 status
		HttpStatus status = getSatus(jsonparts, wcToPersist, projectId);
		// Delete notassignedparts from wip wc
		for (WorkCenterPart jsonpart : jsonparts) {
			Optional<WorkcenterPart> optPart = wcpartRepository
					.findOne(HelperClass.buildInternalPartId(projectId, jsonpart.getId()));
			WorkcenterPart wcp = null;
			if (optPart != null && optPart.isPresent()) {
				wcp = optPart.get();
				wcpartRepository.delete(wcp);
			}
		}

		return status;
	}

	private HttpStatus getSatus(List<WorkCenterPart> jsonparts, Workcenter wc, String projectId) {

		List<WorkcenterPart> wipparts = wcpartRepository.findByWorkcenter(wc);
		for (WorkCenterPart jsonpart : jsonparts) {
			boolean isPartFound = false;
			for (WorkcenterPart part : wipparts) {
				if (part.getId().equals(HelperClass.buildInternalPartId(projectId, jsonpart.getId()))) {
					isPartFound = true;

				}
			}
			if (!isPartFound) {

				return HttpStatus.METHOD_NOT_ALLOWED;
			}
		}

		return HttpStatus.OK;
	}

	public HttpStatus processtoUpdateWcCahiers(Workcenter wcToPersist, Set<WorkCenterCahier> jsonWccahiers,
			Source source) {

		// if jsonWccahiers list is null then ignore wc cahiers(no changement on
		// it)
		if (jsonWccahiers == null) {
			return HttpStatus.OK;
		}

		HttpStatus status = HttpStatus.OK;

		// 8- update existing cahiers in wip
		Set<com.bombardier.macs.model.Cahier> cahiers = new HashSet<com.bombardier.macs.model.Cahier>();
		for (WorkCenterCahier jsonwcCahier : jsonWccahiers) {
			Optional<Cahier> optCahier = cahierRepository.findOne(jsonwcCahier.getId());
			Cahier cahier = null;
			if (optCahier != null && optCahier.isPresent()) {
				cahier = optCahier.get();

				if (source != null) {
					// if cahier not match with source for wc so continue to
					// next cahier in loop
					if ("W".equals(source.getLocation().toUpperCase())) {
						if (cahier.getWorkcenter() != null
								&& !source.getId().equals(Long.toString(cahier.getWorkcenter().getId()))) {
							status = HttpStatus.METHOD_NOT_ALLOWED; // 405
							continue;
						}
					}
					// if cahier not match with source for jalon so continue to
					// next cahier in loop
					if ("J".equals(source.getLocation().toUpperCase())) {
						if (cahier.getJalon() != null
								&& !source.getId().equals(Long.toString(cahier.getJalon().getId()))) {
							status = HttpStatus.METHOD_NOT_ALLOWED; // 405
							continue;
						}
					}
				}
			}

			if (cahier != null) {
				cahier.setWorkcenter(wcToPersist);
				// cahier.setB(jsonwcCahier.getFlags().getB());
				// cahier.setR(jsonwcCahier.getFlags().getR());
				// cahier.setOd(jsonwcCahier.getFlags().getOd());
				cahier.setJalon(null);
				// TODO create save jalon with jalonid, check with francis for
				// missed jalonid in json
				cahier = cahierRepository.save(cahier);
				cahiers.add(cahier);
			} else {
				// if cahier not exist so status is 404
				status = HttpStatus.NOT_FOUND; // 404
				continue;
			}

		}

		// 9-remove cahiers from wc if not belongs to list of json wccahiers,
		// update foreigncahier for parts belong to this removed cahier
		/*
		 * List<Cahier>
		 * wipWcCahiersList=cahierRepository.findByWorkcenter(wcToPersist);
		 * 
		 * if(wipWcCahiersList!=null) { for (Cahier dbCahier : wipWcCahiersList)
		 * { boolean exist=false; for(WorkCenterCahier jsoncahier:jsonWccahiers)
		 * { if(dbCahier.getId().equals(jsoncahier.getId())) { exist=true; } }
		 * if(!exist) { List<WorkcenterPart>
		 * wipCahierpartsList=wcpartRepository.findByCahier(dbCahier);
		 * for(WorkcenterPart part:wipCahierpartsList) { part.setCahier(null);
		 * wcpartRepository.save(part); } cahierRepository.delete(dbCahier); } }
		 * }
		 */

		List<Cahier> wipWcCahiersList = cahierRepository.findByWorkcenter(wcToPersist);
		/*
		 * //if jsonWccahiers list is empty, so remove all wip wc cahiers
		 * if(jsonWccahiers.size()==0){ for(Cahier dbCahier : wipWcCahiersList){
		 * cahierRepository.delete(dbCahier); } } else {
		 * 
		 * // if there is a cahier belong to workcenter in wip that not include
		 * in jsonWccahiers //list then remove it for(Cahier
		 * dbcah:wipWcCahiersList){ if(isToRemove(jsonWccahiers, dbcah)){
		 * List<WorkcenterPart>
		 * wipCahierpartsList=wcpartRepository.findByCahier(dbcah); //before
		 * removing cahier, change the part cahierforeignkey to null
		 * for(WorkcenterPart part:wipCahierpartsList) { part.setCahier(null);
		 * wcpartRepository.save(part); } cahierRepository.delete(dbcah); } }
		 * //}
		 */

		return status;
	}

	public HttpStatus processToUpdateJalons(Workcenter wcToPersist, Set<com.bombardier.macs.json.model.Jalon> jalons,
			Source source) {

		HttpStatus status = HttpStatus.OK;

		Set<com.bombardier.macs.model.Jalon> jalonsToPersist = new HashSet<com.bombardier.macs.model.Jalon>();
		if (jalons != null) {
			for (com.bombardier.macs.json.model.Jalon jsonjalon : jalons) {

				Optional<Jalon> optJalon = jalonRepository.findOne(jsonjalon.getId());

				Jalon jalon = null;
				if (optJalon != null && optJalon.isPresent()) {
					jalon = optJalon.get();
					if (source != null) {
						// if cahier not match with source for wc so continue to
						// next cahier in loop
						if ("W".equals(source.getLocation().toUpperCase())) {
							if (jalon.getWorkcenter() != null
									&& !source.getId().equals(Long.toString(jalon.getWorkcenter().getId()))) {
								status = HttpStatus.METHOD_NOT_ALLOWED; // 405
								continue;
							}
						}
					}
				}

				if (jalon == null) {
					jalon = new Jalon();
					jalon.setId(jsonjalon.getId());
					jalon.setTitle(jsonjalon.getTitle());
				}

				jalon.setWorkcenter(wcToPersist);
				jalon = jalonRepository.save(jalon);
				processtoUpdateJalonCahiers(wcToPersist, jalon, jsonjalon.getCahiers(), source);

			}
		}
		return status;
	}

	public HttpStatus processtoUpdateJalonCahiers(Workcenter wcToPersist, Jalon jalonToPersist,
			Set<WorkCenterCahier> jsonJaloncahiers, Source source) {

		HttpStatus status = HttpStatus.OK;

		// - update existing cahiers in wip
		Set<com.bombardier.macs.model.Cahier> cahiers = new HashSet<com.bombardier.macs.model.Cahier>();

		for (WorkCenterCahier jsonjalonCahier : jsonJaloncahiers) {
			Optional<Cahier> optCahier = cahierRepository.findOne(jsonjalonCahier.getId());
			Cahier cahier = null;
			if (optCahier != null && optCahier.isPresent()) {
				cahier = optCahier.get();
				if (source != null) {
					// if cahier not match with source for wc so continue to
					// next cahier in loop
					if ("W".equals(source.getLocation().toUpperCase())) {
						if (cahier.getJalon() != null
								&& !source.getId().equals(Long.toString(cahier.getJalon().getId()))) {
							status = HttpStatus.METHOD_NOT_ALLOWED; // 405
							continue;
						}
					}
				}
			}
			if (cahier != null) {
				cahier.setWorkcenter(wcToPersist);
				cahier.setJalon(jalonToPersist);
				// cahier.setB(jsonjalonCahier.getFlags().getB());
				// cahier.setR(jsonjalonCahier.getFlags().getR());
				// cahier.setOd(jsonjalonCahier.getFlags().getOd());
				cahier = cahierRepository.save(cahier);
				cahiers.add(cahier);
			}
		}

		return status;

	}

	@Override
	public ResponseEntity<List<Sector>> getSectorsListByProject(String project) {
		Sector sector = new Sector();
		sector.setTitleEn("toto-sector");
		sector.setTitleFr("toto-sector1");
		List<Sector> sectors = new ArrayList<Sector>();
		sectors.add(sector);
		ResponseEntity response = new ResponseEntity<List<Sector>>(HttpStatus.OK);
		return response.ok().body(sectors);

	}

	@Override
	public List<WorkCenter> findWorkcentersBySubsector(String subsectorid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Workcenter saveWc(Workcenter wc) {
		Workcenter persWc = workcenterRepository.save(wc);
		return persWc;
	}

	@Override
	public List<Workcenter> getAllWorkcenters() {
		return workcenterRepository.findAll();
	}

	@Override
	public boolean deleteAllWorkcenters() {
		for (Workcenter wc : getAllWorkcenters()) {
			workcenterRepository.delete(wc);
		}

		return true;
	}

	// order list: every object comes after its parent in the list
	// (the parent will always be in the list).
	private void orderList(List<ParentChildObject> toSort) {
		final ParentChildObject nullPlaceholder = new ParentChildObject();
		Map<ParentChildObject, List<ParentChildObject>> byParent = toSort.stream().collect(Collectors
				.groupingBy(obj -> (obj.getParent() == null ? nullPlaceholder : obj.getParent()), Collectors.toList()));

		List<ParentChildObject> ordered = new ArrayList<>();
		Queue<ParentChildObject> processor = new LinkedList<>();
		byParent.get(nullPlaceholder).forEach(processor::add);
		while (!processor.isEmpty()) {
			ParentChildObject tmp = processor.poll();
			byParent.getOrDefault(tmp, Collections.emptyList()).forEach(processor::add);
			ordered.add(tmp);
		}
		toSort.clear();
		toSort.addAll(ordered);
		for (ParentChildObject p : toSort) {
			System.out.println(
					"---->" + p.getId() + "----"/* +p.getParent().getId() */);
		}
	}

	@Override
	public Set<ParentChildObject> addAllParentsChilds(WorkCenter wc) {

		Set<ParentChildObject> toSort = new HashSet<ParentChildObject>();
		for (WorkCenterPart wcp : wc.getParts()) {
			ParentChildObject pc = new ParentChildObject(wcp.getId(), null);
			ParentChildObject parent = new ParentChildObject(wcp.getParentId(), null);
			if (!toSort.contains(pc)) {
				toSort.add(pc);
			}
			if (!toSort.contains(parent)) {
				toSort.add(parent);
			}
		}

		for (ParentChildObject pc : toSort) {
			for (WorkCenterPart wcp : wc.getParts()) {
				if (wcp.getId().equals(pc.getId()) && wcp.getParentId() == null && !wcp.getParentId().isEmpty()) {
					pc.setParent(getParent(toSort, wcp.getParentId()));
				}
			}
		}
		return toSort;
	}

	private ParentChildObject getParent(Set<ParentChildObject> toSort, String id) {
		for (ParentChildObject pc : toSort) {
			if (pc.getId().equals(id))
				return pc;
		}
		return null;
	}

}
