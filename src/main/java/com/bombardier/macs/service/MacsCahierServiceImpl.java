package com.bombardier.macs.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.bombardier.macs.ApiStatus;
import com.bombardier.macs.Constants;
import com.bombardier.macs.Constants.MinimumCheckType;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.dao.CahierActionRepository;
import com.bombardier.macs.dao.CahierDrawingRepository;
import com.bombardier.macs.dao.CahierHistoryRepository;
import com.bombardier.macs.dao.CahierNameSequenceRepository;
import com.bombardier.macs.dao.CahierRepository;
import com.bombardier.macs.dao.CahierToolRepository;
import com.bombardier.macs.dao.CahierUpdatedPartRepository;
import com.bombardier.macs.dao.JalonRepository;
import com.bombardier.macs.dao.PartRepository;
import com.bombardier.macs.dao.PartTypeRepository;
import com.bombardier.macs.dao.WorkcenterPartRepository;
import com.bombardier.macs.dao.WorkcenterRepository;
import com.bombardier.macs.json.model.CahierComponentField;
import com.bombardier.macs.json.model.CahierConfirmationResponse;
import com.bombardier.macs.json.model.CahierFields;
import com.bombardier.macs.json.model.CahierHistoryData;
import com.bombardier.macs.json.model.CahierInformation;
import com.bombardier.macs.json.model.CahierMinimumCheckResponse;
import com.bombardier.macs.json.model.CahierSuggestion;
import com.bombardier.macs.json.model.Drawing;
import com.bombardier.macs.json.model.Source;
import com.bombardier.macs.json.model.Tool;
import com.bombardier.macs.json.model.WorkCenterPart;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.CahierAction;
import com.bombardier.macs.model.CahierDrawing;
import com.bombardier.macs.model.CahierHistory;
import com.bombardier.macs.model.CahierNameSequence;
import com.bombardier.macs.model.CahierTool;
import com.bombardier.macs.model.CahierUpdatedPart;
import com.bombardier.macs.model.Jalon;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.PartType;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.util.EntityMapper;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;
import com.google.gson.Gson;

@Service
@Transactional
// @Profile("macs-cache")

public class MacsCahierServiceImpl implements MacsCahierService {

	@Autowired
	private PartRepository partRepository;

	@Autowired
	private WorkcenterPartRepository wcpartRepository;

	@Autowired
	private WorkcenterRepository workcenterRepository;

	@Autowired
	private CahierRepository cahierRepository;

	@Autowired
	private JalonRepository jalonRepository;

	@Autowired
	private CahierDrawingRepository cahierDrwRepository;

	@Autowired
	private CahierToolRepository cahierToolRepository;

	@Autowired
	private CahierUpdatedPartRepository cahierUpdatedPartRepository;

	@Autowired
	private CahierNameSequenceRepository cahierNameSequenceRepository;

	@Autowired
	private PartTypeRepository partTypeRepository;

	@Autowired
	private CahierHistoryRepository cahierHistoryRepository;

	@Autowired
	private CahierActionRepository cahierActionRepository;

	// ---------------------------------------------------
	// ---------------CAHIERS------------------------------
	// ---------------------------------------------------

	@Override
	public Cahier saveCahier(Cahier c) {
		Cahier persCahier = cahierRepository.save(c);
		return persCahier;
	}

	@Override
	public List<Cahier> getAllCahiers() {
		return cahierRepository.findAll();
	}

	@Override
	public ResponseEntity<List<com.bombardier.macs.json.model.Cahier>> getCahiersByProjectSector(String projectId,
			String sectorId, List<String> cahierIds) {

		List<Workcenter> workcenters = workcenterRepository.findByProjectIdAndSectorId(projectId, sectorId);
		List<Cahier> cahiers = new ArrayList<Cahier>();
		for (Workcenter wc : workcenters) {
			cahiers.addAll(cahierRepository.findByWorkcenter(wc));
		}

		List<Cahier> filteredcahiers = new ArrayList<Cahier>();
		if (cahierIds != null && cahierIds.size() > 0) {
			for (Cahier cahier : cahiers) {
				for (String cahierId : cahierIds) {
					if (cahierId.equals(cahier.getId().toString())) {
						filteredcahiers.add(cahier);
					}
				}
			}
		} else {
			filteredcahiers.addAll(cahiers);
		}

		ResponseEntity response = new ResponseEntity<List<com.bombardier.macs.json.model.Cahier>>(HttpStatus.OK);
		return response.ok().body(EntityMapper.getInstance().toJsonCahiers(filteredcahiers));

	};

	@Override
	public ResponseEntity<List<com.bombardier.macs.json.model.Cahier>> getCahiersByProjectSectorSubSector(
			String projectId, String sectorId, String subsectorId, List<String> cahierIds) {
		List<Workcenter> workcenters = workcenterRepository.findByProjectIdAndSectorIdAndSubsectorId(projectId,
				sectorId, subsectorId);

		List<Cahier> cahiers = new ArrayList<Cahier>();
		for (Workcenter wc : workcenters) {
			cahiers.addAll(cahierRepository.findByWorkcenter(wc));
		}

		List<Cahier> filteredcahiers = new ArrayList<Cahier>();
		if (cahierIds != null && cahierIds.size() > 0) {
			for (Cahier cahier : cahiers) {
				for (String cahierId : cahierIds) {
					if (cahierId.equals(cahier.getId().toString())) {
						filteredcahiers.add(cahier);
					}
				}
			}
		} else {
			filteredcahiers.addAll(cahiers);
		}
		ResponseEntity response = new ResponseEntity<List<com.bombardier.macs.json.model.Cahier>>(HttpStatus.OK);
		return response.ok().body(EntityMapper.getInstance().toJsonCahiers(filteredcahiers));
	};

	@Override
	public ResponseEntity<Object> deleteCahierByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, String source, String sourceId) {

		HttpStatus status = deleteCahierById(cahierId, source, sourceId);

		ApiStatus apiStatus = new ApiStatus(status, false, true, false);
		return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());
	}

	public HttpStatus deleteCahierById(String cahierId, String source, String sourceId) {

		if (cahierId == null || cahierId.isEmpty()) {
			return HttpStatus.NO_CONTENT;
		}

		HttpStatus status = HttpStatus.OK;

		Optional<Cahier> cahierOpt = cahierRepository.findOne(new Long(cahierId));
		Cahier dbCahier = null;
		if (cahierOpt != null && cahierOpt.isPresent()) {
			dbCahier = cahierOpt.get();

			if (dbCahier != null) {
				// Do not delete if cahier is anymore linked belongs to source
				// jalon and sourcejalonId
				if ("J".equals(source.toUpperCase())) {
					if (dbCahier.getJalon() == null && !sourceId.equals(Long.toString(dbCahier.getJalon().getId()))) {
						status = HttpStatus.METHOD_NOT_ALLOWED;
						return status;
					}
					// Do not delete if cahier is anymore belongs to source
					// workcenter and source wcId
				} else if ("W".equals(source.toUpperCase())) {
					if (dbCahier.getWorkcenter() != null
							&& !sourceId.equals(Long.toString(dbCahier.getWorkcenter().getId()))) {
						status = HttpStatus.METHOD_NOT_ALLOWED;
						return status;
					}
				}

				status = processToDeleteCahier(dbCahier);

			} else {
				return HttpStatus.NOT_FOUND;
			}

		} else {
			status = HttpStatus.NOT_FOUND;
		}

		return status;

	}

	public HttpStatus processToDeleteCahier(Cahier cahier) {

		// to delete cahier from wip, we have to move back cahierparts to
		// workcenter by setting null in cahierfield
		for (WorkcenterPart wcp : cahier.getCahierParts()) {
			wcp.setCahier(null);
			wcpartRepository.save(wcp);
		}

		// we also need to remove drawings
		for (CahierDrawing drawing : cahier.getDrawings()) {
			cahierDrwRepository.delete(drawing);
		}
		// we also need to remove tools
		for (CahierTool tool : cahier.getTools()) {
			cahierToolRepository.delete(tool);
		}
		// TODO in the future might have to delete strings and DDAs as well

		cahierRepository.delete(cahier);

		/*
		 * if(cahier.getId()!=null){ //Cahier cahierAfter=
		 * cahierRepository.findOne(cahier.getId()).get();
		 * Optional<CahierAction>
		 * optCahAction=cahierActionRepository.findByType("DELETE_CAHIER");
		 * if(optCahAction!=null){ CahierAction action=optCahAction.get();
		 * CahierHistory
		 * cahierHistory=EntityMapper.getInstance().addActionOnCahier(action,
		 * inputMap, cahier, null);
		 * cahierHistory=cahierHistoryRepository.save(cahierHistory); } }
		 * 
		 */

		return HttpStatus.OK;
	}

	@Override
	public ResponseEntity<Object> addCahierToolByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<Tool> body) {
		// validate all required inputs if exist in wip
		HttpStatus status = validateInputsCahierTools(body, cahierId);
		if (!status.equals(HttpStatus.OK)) {
			ApiStatus apiStatus = new ApiStatus(status, true, false);
			if (!status.equals(HttpStatus.OK)) {
				return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());
			}
		}

		// create all cahierTools
		List<Tool> tools = addCahierTools(body, cahierId);
		ResponseEntity response = new ResponseEntity<List<Tool>>(HttpStatus.OK);
		return response.ok().body(tools);
	}

	@Override
	public ResponseEntity<Object> addCahierDrawingByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<Drawing> body) {
		HttpStatus status = validateInputsCahierDrawings(body, cahierId);
		if (!status.equals(HttpStatus.OK)) {
			ApiStatus apiStatus = new ApiStatus(status, true, false);
			if (!status.equals(HttpStatus.OK)) {
				return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());
			}
		}

		// create all cahierDrawings
		List<Drawing> drawings = addCahierDrawings(body, cahierId);
		ResponseEntity response = new ResponseEntity<List<Drawing>>(HttpStatus.OK);
		return response.ok().body(drawings);

	}

	@Override
	public ResponseEntity<Object> addCahierPartByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<WorkCenterPart> body) {

		HttpStatus status = validateInputsCahierPart(body, cahierId, projectId, sectorId, subSectorId, false);
		if (!status.equals(HttpStatus.OK)) {
			ApiStatus apiStatus = new ApiStatus(status, true, false);
			if (!status.equals(HttpStatus.OK)) {
				return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());
			}
		}

		// create all cahierParts
		List<WorkCenterPart> parts = addCahierParts(body, cahierId, projectId, sectorId, subSectorId);
		ResponseEntity response = new ResponseEntity<List<WorkCenterPart>>(HttpStatus.OK);
		return response.ok().body(parts);
	}

	// TODO
	@Override
	public ResponseEntity<Object> updateCahierPartByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<WorkCenterPart> body) {

		HttpStatus status = validateInputsCahierPart(body, cahierId, projectId, sectorId, subSectorId, true);
		if (!status.equals(HttpStatus.OK)) {
			ApiStatus apiStatus = new ApiStatus(status, true, false);
			if (!status.equals(HttpStatus.OK)) {
				return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());
			}
		}

		// update all cahierParts
		List<WorkCenterPart> parts = updateCahierParts(body, cahierId, projectId, sectorId, subSectorId);

		ResponseEntity response = new ResponseEntity<List<WorkCenterPart>>(HttpStatus.OK);
		return response.ok().body(parts);
	}

	@Override
	public ResponseEntity<Object> deleteCahierPartByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String source, String sourceId, List<WorkCenterPart> body) {

		HttpStatus status = deletePartCahierById(body, projectId, source, sourceId);// deleteCahierById(cahierId,
																					// null,
																					// null);//deleteCahierById(cahierId,
																					// source,
																					// sourceId);

		ApiStatus apiStatus = new ApiStatus(status, false, true, false);
		return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());
	}

	public HttpStatus deletePartCahierById(List<WorkCenterPart> jsonwcparts, String projectId, String source,
			String sourceId) {

		if (jsonwcparts == null || jsonwcparts.size() == 0) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}

		HttpStatus status = HttpStatus.OK;

		List<CahierComponentField> partsToDeleteList = new ArrayList<CahierComponentField>();
		Long cahierId = null;
		String partTypeToDelete = "";

		String actionCode = "";
		// METHOD, DASH, KIT, PAM, PHANTOM
		for (WorkCenterPart jsonwcpart : jsonwcparts) {
			if (isValidPartToDelete(jsonwcpart, projectId)) {
				Optional<WorkcenterPart> partOpt = wcpartRepository
						.findOne(projectId + Constants.DOT + jsonwcpart.getId());
				WorkcenterPart cahierPart = null;
				if (partOpt != null && partOpt.isPresent()) {

					partTypeToDelete = jsonwcpart.getType();
					cahierPart = partOpt.get();
					boolean allowedToDelete = true;
					// Do not delete if part is anymore belongs to source
					// cahier and sourceid cahierId
					if (source != null && "C".equals(source.toUpperCase())) {
						if (cahierPart.getCahier() != null && !sourceId.equals(cahierPart.getCahier().getId())) {
							status = HttpStatus.METHOD_NOT_ALLOWED;
							allowedToDelete = false;
							// return status;
						}
						// Do not delete if part is anymore belongs to source
						// workcenter and sourceid wcId
					} else if (source != null && "W".equals(source.toUpperCase())) {
						if (cahierPart.getWorkcenter() != null
								&& !sourceId.equals(Long.toString(cahierPart.getWorkcenter().getId()))) {
							status = HttpStatus.METHOD_NOT_ALLOWED;
							allowedToDelete = false;
							// return status;
						}
					}

					//If is kit/method/phantom  delete this part and add it to actionhistory
					if (allowedToDelete && cahierPart != null
							&& (Constants.TYPE_KIT.equals(jsonwcpart.getType())
									|| Constants.TYPE_METHOD.equals(jsonwcpart.getType())
									|| Constants.TYPE_PHANTOM.equals(jsonwcpart.getType()))) {
						cahierId = (cahierPart.getCahier() != null) ? cahierPart.getCahier().getId() : null;
						partsToDeleteList.add(EntityMapper.getInstance().toJsonCahierPart(cahierPart));
						wcpartRepository.delete(cahierPart);
					}

					//If is dash/pam  delete this part by numberhistory and add it to actionhistory
					if (allowedToDelete && cahierPart != null && (Constants.TYPE_DASH.equals(jsonwcpart.getType())
							|| Constants.TYPE_PAM.equals(jsonwcpart.getType()))) {

						List<CahierUpdatedPart> updatedPartsList = cahierUpdatedPartRepository.findByPart(cahierPart);
						boolean found = false;
						for (CahierUpdatedPart updatedpart : updatedPartsList) {
							if (!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getNumberHistory())) {
								for (String nbr : jsonwcpart.getModifiedFields().getNumberHistory()) {
									if (updatedpart.getNumber().equals(nbr)) {
										found = true;
										partsToDeleteList.add(
												EntityMapper.getInstance().toJsonCahierPart(cahierPart, updatedpart));
										cahierUpdatedPartRepository.delete(updatedpart);

									}
								}
							}
							if (found) {
								break;
							}
						}
						if (!found) {
							status = HttpStatus.METHOD_NOT_ALLOWED;
						}
					}
				}
			} else {
				status = HttpStatus.METHOD_NOT_ALLOWED;
			}

			
			if(!jsonwcpart.getType().isEmpty()) {
				actionCode="DELETE_"+jsonwcpart.getType()+"_PART";

			} else {
				actionCode = "DELETE_PART";
			}
		}

		if (HttpStatus.OK.equals(status)) {
				
			Cahier cahier = null;
			Optional<Cahier> optcahier = null;
			Long cahierid = new Long(cahierId);
			optcahier = cahierRepository.findOne(cahierid);
			if (optcahier != null && optcahier.isPresent()) {
				cahier = optcahier.get();
			} else {
				return status;
			}
			
			if(!CollectionUtils.isEmpty(partsToDeleteList) && cahier!=null && cahier.getIsConfirmed()){
				      addCahierHistory(partsToDeleteList,  cahier, "DELETE", actionCode);
			}
			
				
		}

		return status;

	}

	public ResponseEntity<Object> getCahierHistoryByAction(String projectId, String sectorId, String subSectorId,
			String cahierId, String action) {

		ResponseEntity response = new ResponseEntity<List<WorkCenterPart>>(HttpStatus.OK);
		
			return response.ok().body(getCahierHistory(action));

	}

	
	public List<com.bombardier.macs.json.model.CahierHistory> getCahierHistory(String action) {
		Optional<CahierAction> optCahAction = cahierActionRepository.findByType(action);
		if (optCahAction != null) {
			List<CahierHistory> cahierHistories = cahierHistoryRepository.findByActionId(optCahAction.get().getId());
			return	 EntityMapper.getInstance().toJsonCahierHistoryList(cahierHistories,  action) ;
		}
		return null;
	}
	
	public List<CahierHistory> getCahierHistory1(String action) {
		Optional<CahierAction> optCahAction = cahierActionRepository.findByType(action);
		if (optCahAction != null) {
			List<CahierHistory> cahierHistories = cahierHistoryRepository.findByActionId(optCahAction.get().getId());
			return cahierHistories;
		}
		return null;
	}

	public List<CahierHistory> getCahierHistoryByUpdate(String action) {
		Optional<CahierAction> optCahAction = cahierActionRepository.findByType(action);
		if (optCahAction != null) {
			List<CahierHistory> cahierHistories = cahierHistoryRepository.findByActionId(optCahAction.get().getId());
			return cahierHistories;
		}
		return null;
	}

	// Check if datas are inside
	public HttpStatus validateInputsCahierPart(List<WorkCenterPart> jsonwcparts, String cahierId, String projectId,
			String sectorId, String subSectorId, boolean isEdit) {

		Cahier cahier = null;
		Optional<Cahier> optcahier = null;
		if (!isEdit) {
			Long cahierid = new Long(cahierId);
			optcahier = cahierRepository.findOne(cahierid);
			if (optcahier == null || !optcahier.isPresent()) {
				return HttpStatus.METHOD_NOT_ALLOWED;
			}
		}
		if (jsonwcparts == null || jsonwcparts.size() == 0) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}

		// METHOD, DASH, KIT, PAM, PHANTOM
		for (WorkCenterPart jsoncahierpart : jsonwcparts) {
			if (isEdit) {
				if (jsoncahierpart.getId() == null || jsoncahierpart.getId().isEmpty()) {
					return HttpStatus.METHOD_NOT_ALLOWED;
				}
				Optional<WorkcenterPart> optPart = wcpartRepository
						.findOne(projectId + Constants.DOT + jsoncahierpart.getId());
				if (optPart == null || !optPart.isPresent()) {
					return HttpStatus.METHOD_NOT_ALLOWED;
				}
			}
			if (!isValidInputDataFields(jsoncahierpart, projectId, sectorId, subSectorId)) {
				return HttpStatus.METHOD_NOT_ALLOWED;
			}
		}

		return HttpStatus.OK;
	}

	public Boolean isValidPartToDelete(WorkCenterPart jsonwcpart, String projectId) {

		if ((Constants.TYPE_KIT.equals(jsonwcpart.getType()) || Constants.TYPE_PHANTOM.equals(jsonwcpart.getType())
				|| Constants.TYPE_METHOD.equals(jsonwcpart.getType()))
				&& (jsonwcpart == null || jsonwcpart.getId().isEmpty())) {
			return false;
		}

		if ((Constants.TYPE_DASH.equals(jsonwcpart.getType()) || Constants.TYPE_PAM.equals(jsonwcpart.getType()))
				&& (jsonwcpart == null || jsonwcpart.getId().isEmpty() || jsonwcpart.getModifiedFields() == null
						|| (CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getNumberHistory())
								&& CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getRevisionHistory())))) {
			return false;
		}

		return true;
	}

	private List<WorkCenterPart> addCahierParts(List<WorkCenterPart> jsoncahierparts, String cahierId, String projectId,
			String sectorId, String subsectorId) {

		Cahier cahier = null;
		Optional<Cahier> optcahier = null;
		Long cahierid = new Long(cahierId);
		optcahier = cahierRepository.findOne(cahierid);
		if (optcahier != null && optcahier.isPresent()) {
			cahier = optcahier.get();
		}

		List<CahierComponentField> partsToAddList = new ArrayList<CahierComponentField>();

		String actionCode = "";
		List<WorkCenterPart> jsoncahierParts = new ArrayList<WorkCenterPart>();
		for (WorkCenterPart jsoncahierpart : jsoncahierparts) {

			Optional<WorkcenterPart> optParentPart = wcpartRepository
					.findOne(projectId + Constants.DOT + jsoncahierpart.getParentId());
			WorkcenterPart parentPart = null;
			if (optParentPart != null && optParentPart.isPresent()) {
				parentPart = optParentPart.get();
			}

			PartType partType = null;

			if (!jsoncahierpart.getType().isEmpty()) {
				Optional<PartType> optPartType = partTypeRepository.findByType(jsoncahierpart.getType());
				if (optPartType != null && optPartType.isPresent()) {
					partType = optPartType.get();
				}
			}
		
			WorkcenterPart cahierPart = EntityMapper.getInstance().populateCahierPart(jsoncahierpart, parentPart,
					partType);
			cahierPart.setCahier(cahier);
			cahierPart.setWorkcenter(cahier.getWorkcenter());

			if (!jsoncahierpart.getType().isEmpty()) {
				actionCode = "ADD_" + jsoncahierpart.getType() + "_PART";
			} else {
				actionCode = "ADD_PART";
			}
			
			
			// Generate and Set a part id if parttype is kit or method
			if (("METHOD".equals(jsoncahierpart.getType()) || "KIT".equals(jsoncahierpart.getType())
					|| "PHANTOM".equals(jsoncahierpart.getType())) && jsoncahierpart.getCreatedFields() != null) {

				if ("KIT".equals(jsoncahierpart.getType())) {
					Set<String> allowedPartList = getAllowedPartIdList(jsoncahierpart.getPartList(), projectId);
					Gson gson = new Gson();
					String jsonPartList = gson.toJson(allowedPartList);
					cahierPart.setPartList(jsonPartList);

					cahierPart = generatePartIdForKitOrMethod(jsoncahierpart, cahierPart, projectId, 1);
					cahierPart = wcpartRepository.save(cahierPart);
					partsToAddList.add(EntityMapper.getInstance().toJsonCahierPart(cahierPart));
				}

				// if is METHOD and the partId already exist in wip then return
				// this part with all infos
				// if is METHOD and the partId not exist in wip then generate a
				// partId from partNumber
				if ("METHOD".equals(jsoncahierpart.getType()) || "PHANTOM".equals(jsoncahierpart.getType())) {
					String cahierPartId = EntityMapper.getInstance()
							.composePartIdFromProjectPartNbrSequenceNbr(jsoncahierpart, projectId, 1);

					Optional<WorkcenterPart> optCahierPart = wcpartRepository.findOne(cahierPartId);
					WorkcenterPart wipcahierPart = null;
					if (optCahierPart != null && optCahierPart.isPresent()) {
						wipcahierPart = optCahierPart.get();
					}
					if (wipcahierPart == null) {
						cahierPart = generatePartIdForKitOrMethod(jsoncahierpart, cahierPart, projectId, 1);
						cahierPart = wcpartRepository.save(cahierPart);
						cahierPart.setUpdatedParts(null);
					} else {
						cahierPart = wipcahierPart;
					}
					partsToAddList.add(EntityMapper.getInstance().toJsonCahierPart(cahierPart));
				}
			}

			if (("DASH".equals(jsoncahierpart.getType()) || "PAM".equals(jsoncahierpart.getType()))
					&& jsoncahierpart.getModifiedFields() != null && jsoncahierpart.getId() != null) {

				if (jsoncahierpart.getId() != null && !jsoncahierpart.getId().isEmpty()) {
					Optional<WorkcenterPart> optPart = wcpartRepository
							.findOne(projectId + Constants.DOT + jsoncahierpart.getId());
					if (optPart != null && optPart.isPresent()) {
						cahierPart = optPart.get();
						// --
						cahierPart.setFlagMethod(jsoncahierpart.getFlagMethod());
						cahierPart.setFlagABCL(jsoncahierpart.getFlagABCL());
						cahierPart.setPartType(partType);

						cahierPart = wcpartRepository.save(cahierPart);
						List<CahierUpdatedPart> updatedPartsList = cahierUpdatedPartRepository.findByPart(cahierPart);
						CahierUpdatedPart cahierUpdatedPart=null;
						
						cahierUpdatedPart=getCahierUpdatedPartByReferenceNumber(updatedPartsList, jsoncahierpart.getReferenceNumber());
						if(cahierUpdatedPart!=null && CollectionUtils.isEmpty(jsoncahierpart.getModifiedFields().getNumberHistory())){
								cahierPart= updateCahierPart( jsoncahierpart,  cahierPart,  cahierId,
											 projectId); 
		
								if (!jsoncahierpart.getType().isEmpty()) {
									actionCode = "UPDATE_" + jsoncahierpart.getType() + "_PART";
								} else {
									actionCode = "UPDATE_PART";
								}		
						} else {
							
							 cahierUpdatedPart = EntityMapper.getInstance()
										.populateCahierUpdatedPart(jsoncahierpart, cahierPart, cahierUpdatedPart, partType, updatedPartsList);  
					
						}
						
						cahierUpdatedPart = cahierUpdatedPartRepository.save(cahierUpdatedPart);
						Set<CahierUpdatedPart> updateparts = new HashSet<CahierUpdatedPart>(cahierPart.getUpdatedParts());
						updateparts.add(cahierUpdatedPart);
						cahierPart.setUpdatedParts(updateparts);
						partsToAddList.add(EntityMapper.getInstance().toJsonCahierPart(cahierPart, cahierUpdatedPart));

					}
				}
			}

			if (cahierPart != null) {
				WorkCenterPart jsonCahPart = EntityMapper.getInstance().toJsonCahierPart(cahierPart);
				jsoncahierParts.add(jsonCahPart);
			}		
		}

		CahierHistoryData data = new CahierHistoryData("ADD", partsToAddList);

		// TODO

		Optional<CahierAction> optCahAction = cahierActionRepository.findByType(actionCode);
		if (optCahAction != null) {
			CahierAction action = optCahAction.get();
			CahierHistory cahierHistory = EntityMapper.getInstance().addActionCahier(cahierid, action, data);

			cahierHistory = cahierHistoryRepository.save(cahierHistory);
		}

		return jsoncahierParts;
	}

	private CahierUpdatedPart getCahierUpdatedPartByReferenceNumber(List<CahierUpdatedPart> updatedPartsList, String referenceNumber){	
		for(CahierUpdatedPart cahierUpdatedPart:updatedPartsList){
			if (referenceNumber.equals(cahierUpdatedPart.getNumber())) {
				return cahierUpdatedPart;
			}		
		}
		
		return null;
	}
	
	private List<WorkCenterPart> updateCahierParts(List<WorkCenterPart> jsoncahierparts, String cahierId,
			String projectId, String sectorId, String subsectorId) {

		List<CahierComponentField> partsUpdated = new ArrayList<CahierComponentField>();
		
		String actionCode = "";

		List<WorkCenterPart> returnedjsoncahierparts = new ArrayList<WorkCenterPart>();
		for (WorkCenterPart jsoncahierpart : jsoncahierparts) {

			Optional<WorkcenterPart> optPart = wcpartRepository
					.findOne(projectId + Constants.DOT + jsoncahierpart.getId());
			WorkcenterPart cahierPart = null;
			if (optPart != null && optPart.isPresent()) {
				cahierPart = optPart.get();
			}
			
		    cahierPart= updateCahierPart( jsoncahierpart,  cahierPart,  cahierId, projectId); 
			
			
			if (cahierPart != null) {
				WorkCenterPart jsonCahPart = EntityMapper.getInstance().toJsonCahierPart(cahierPart);
				returnedjsoncahierparts.add(jsonCahPart);

			}
			
			
			
			if (!jsoncahierpart.getType().isEmpty()) {
				actionCode = "UPDATE_" + jsoncahierpart.getType() + "_PART";
			} else {
				actionCode = "UPDATE_PART";
			}		
		}

		
		
		Cahier cahier = null;
		Optional<Cahier> optcahier = null;
		Long cahierid = new Long(cahierId);
		optcahier = cahierRepository.findOne(cahierid);
		if (optcahier != null && optcahier.isPresent()) {
			cahier = optcahier.get();
		} else {
			return returnedjsoncahierparts;
		}
		
		if(!CollectionUtils.isEmpty(partsUpdated) && cahier!=null && cahier.getIsConfirmed()){
			      addCahierHistory(partsUpdated,  cahier, "UPDATE", actionCode);
		}

		return returnedjsoncahierparts;
	}

	
	
	private WorkcenterPart updateCahierPart(WorkCenterPart jsoncahierpart, WorkcenterPart cahierPart, String cahierId,
			String projectId) {

		List<CahierComponentField> partsUpdated = new ArrayList<CahierComponentField>();

		
		String actionCode = "";

		List<WorkCenterPart> returnedjsoncahierparts = new ArrayList<WorkCenterPart>();
	/*	for (WorkCenterPart jsoncahierpart : jsoncahierparts) {
			Optional<WorkcenterPart> optPart = wcpartRepository
					.findOne(projectId + Constants.DOT + jsoncahierpart.getId());
			WorkcenterPart cahierPart = null;
			if (optPart != null && optPart.isPresent()) {
				cahierPart = optPart.get();
			}
	*/		
			// Update part if parttype is kit, phantom or method
			if (("METHOD".equals(jsoncahierpart.getType()) || "KIT".equals(jsoncahierpart.getType())
					|| "PHANTOM".equals(jsoncahierpart.getType())) && jsoncahierpart.getCreatedFields() != null) {

				if ("KIT".equals(jsoncahierpart.getType())) {
					Set<String> allowedPartList = getAllowedPartIdList(jsoncahierpart.getPartList(), projectId);
					Gson gson = new Gson();
					String jsonPartList = gson.toJson(allowedPartList);
					cahierPart.setPartList(jsonPartList);
					actionCode = "KIT_PART_TYPE";
				}

				partsUpdated.add(EntityMapper.getInstance().tojsonCahierComponentField(jsoncahierpart, cahierPart));
				cahierPart = EntityMapper.getInstance().updateCahierPart(jsoncahierpart, cahierPart);
				cahierPart = wcpartRepository.save(cahierPart);
			}

			// Update cahierupdatedpart if parttype is dash or pam
			if (("DASH".equals(jsoncahierpart.getType()) || "PAM".equals(jsoncahierpart.getType()))
					&& jsoncahierpart.getModifiedFields() != null && jsoncahierpart.getId() != null) {

				CahierUpdatedPart cahierUpdatedPart = null;
				List<CahierUpdatedPart> updatedPartsList = cahierUpdatedPartRepository.findByPart(cahierPart);
				
				cahierUpdatedPart=getCahierUpdatedPartByReferenceNumber(updatedPartsList, jsoncahierpart.getReferenceNumber());
				if(cahierUpdatedPart!=null && CollectionUtils.isEmpty(jsoncahierpart.getModifiedFields().getNumberHistory())){
				
					partsUpdated.add(EntityMapper.getInstance().tojsonCahierComponentField(jsoncahierpart, cahierPart,
							cahierUpdatedPart));

					cahierUpdatedPart = EntityMapper.getInstance().updateCahierUpdatedPart(jsoncahierpart,
							cahierUpdatedPart);
					cahierUpdatedPart = cahierUpdatedPartRepository.save(cahierUpdatedPart);
					Set<CahierUpdatedPart> cahierUpdatedParts = new HashSet<CahierUpdatedPart>();
					cahierUpdatedParts.add(cahierUpdatedPart);
					cahierPart.setUpdatedParts(cahierUpdatedParts);
					
					Optional<WorkcenterPart> cahierPartOpt = wcpartRepository.findOne(cahierPart.getId());
					if(cahierPartOpt!=null && cahierPartOpt.isPresent()){
						cahierPart=cahierPartOpt.get();
					}	
						
				} 
		
			}

		
			WorkCenterPart jsonCahPart=null;
			if (cahierPart != null) {
				 jsonCahPart = EntityMapper.getInstance().toJsonCahierPart(cahierPart);
				
			}
		
        return cahierPart;
	}

	
	
	
	
	// check if partId exist in wip , if exist increment the sequence and check
	// again until not found in wip
	private WorkcenterPart generatePartIdForKitOrMethod(WorkCenterPart jsonwcpart, WorkcenterPart wcpart,
			String projectId, int sequenceNbr) {

		String cahierPartId = EntityMapper.getInstance().composePartIdFromProjectPartNbrSequenceNbr(jsonwcpart,
				projectId, sequenceNbr);

		WorkcenterPart newCahierPart = getPartByProjectPartNbrSequenceNbr(jsonwcpart,
				cahierPartId /* projectId, sequenceNbr */);
		if (newCahierPart == null) {
			wcpart.setId(cahierPartId);
			return wcpart;
		} else {
			return generatePartIdForKitOrMethod(jsonwcpart, wcpart, projectId, sequenceNbr + 1);
		}
	}

	private WorkcenterPart getPartByProjectPartNbrSequenceNbr(WorkCenterPart jsonwcpart, String cahierPartId) {

		if (("METHOD".equals(jsonwcpart.getType()) || "KIT".equals(jsonwcpart.getType())
				|| "PHANTOM".equals(jsonwcpart.getType())) && jsonwcpart.getCreatedFields() != null) {

			Optional<WorkcenterPart> optCahierPart = wcpartRepository.findOne(cahierPartId);
			WorkcenterPart cahierPart = null;
			if (optCahierPart != null && optCahierPart.isPresent()) {
				cahierPart = optCahierPart.get();
			}

			return cahierPart;
		}

		return null;
	}

	public Boolean isValidInputDataFields(WorkCenterPart jsonwcpart, String projectId, String sectorId,
			String subsectorId) {
		if ((Constants.TYPE_PHANTOM.equals(jsonwcpart.getType()) || Constants.TYPE_METHOD.equals(jsonwcpart.getType()))
				&& jsonwcpart.getCreatedFields() == null) {
			return false;
		}

		if ((Constants.TYPE_PHANTOM.equals(jsonwcpart.getType()) || Constants.TYPE_METHOD.equals(jsonwcpart.getType()))
				&& jsonwcpart.getCreatedFields() != null && (jsonwcpart.getCreatedFields().getNumber().isEmpty()
						|| jsonwcpart.getCreatedFields().getQty() == 0)) {
			return false;
		}

		if (Constants.TYPE_KIT.equals(jsonwcpart.getType())
				&& (jsonwcpart.getCreatedFields() == null || CollectionUtils.isEmpty(jsonwcpart.getPartList()))) {
			return false;
		}

		if (Constants.TYPE_KIT.equals(jsonwcpart.getType())
				&& CollectionUtils.isEmpty(getAllowedPartIdList(jsonwcpart.getPartList(), projectId))) {
			return false;
		}

		if (Constants.TYPE_KIT.equals(jsonwcpart.getType()) && jsonwcpart.getCreatedFields() != null
				&& (jsonwcpart.getCreatedFields().getNumber().isEmpty()
						|| jsonwcpart.getCreatedFields().getQty() == 0)) {
			return false;
		}

		if (Constants.TYPE_DASH.equals(jsonwcpart.getType()) && (jsonwcpart.getModifiedFields() == null
				|| CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getNumberHistory()))) {
			return false;
		}
        
		//TODO TO CHECK IF TO UNCOMMENT OR NOT
		if (Constants.TYPE_PAM.equals(jsonwcpart.getType()) && (jsonwcpart.getModifiedFields() == null
				/*|| CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getQtyHistory())
				|| CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getRevisionHistory())
				|| CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getDrawingHistory())
				*/|| CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getNumberHistory()))) {
			return false;
		}

		if (Constants.TYPE_DASH.equals(jsonwcpart.getType()) || Constants.TYPE_PAM.equals(jsonwcpart.getType())) {

			String cacheKey = MessageFormat.format(Constants.PARTS_CACHE_KEY_TEMPLATE, projectId, sectorId,
					subsectorId);

			// To check and uncomment

			/*
			 * WorkcenterPart ebompart =
			 * EntityMapper.getInstance().populatePartFromEbom(new
			 * WorkcenterPart(), jsonwcpart.getId(), cacheKey);
			 * 
			 * WorkcenterPart cahierPart=null;
			 * 
			 * if(jsonwcpart.getId()!=null && !jsonwcpart.getId().isEmpty()){
			 * Optional<WorkcenterPart> optPart =
			 * wcpartRepository.findOne(projectId + Constants.DOT +
			 * jsonwcpart.getId()); if (optPart != null && optPart.isPresent())
			 * { cahierPart = optPart.get();
			 * 
			 * //if partid exist in sap/pdi and exist in wip then check the
			 * difference if(!ebompart.getId().isEmpty() && (ebompart.getQty()-
			 * cahierPart.getQty()-jsonwcpart.getQty()) <0){ return false; } } }
			 */
		}

		return true;
	}

	public Boolean validateQtt(String projectId, com.bombardier.macs.json.model.Part piPart) {

		Optional<WorkcenterPart> partOpt = wcpartRepository
				.findOne(HelperClass.buildInternalPartId(projectId, piPart.getId()));
		if (partOpt != null && partOpt.isPresent()) {
			WorkcenterPart wipPart = partOpt.get();
			return piPart.getQty() - wipPart.getQty() < 0;
		}
		return true;
	}

	private Set<String> getAllowedPartIdList(Set<String> partList, String projectId) {

		Set<String> allowedPartList = new HashSet<String>();
		for (String partId : partList) {
			Optional<WorkcenterPart> partOpt = wcpartRepository
					.findOne(HelperClass.buildInternalPartId(projectId, partId));
			if (partOpt != null && partOpt.isPresent()) {
				WorkcenterPart wipPart = partOpt.get();
				if (wipPart != null && !Constants.TYPE_KIT.equals(wipPart.getType())) {
					allowedPartList.add(partId);
				}
			}
		}
		return allowedPartList;
	}

	@Override
	public ResponseEntity<Void> updateCahiersByProjectSector(String projectId, String sectorId,
			List<com.bombardier.macs.json.model.Cahier> body) {
		// TODO can we delete all cahiers ins projectsector and update the body
		// cahiers!!

		HttpStatus status = updateCahiers(body, projectId, sectorId, null);

		ResponseEntity response = new ResponseEntity<Void>(status);
		return response;
	}

	@Override
	public ResponseEntity<Void> updateCahiersByProjectSectorSubSector(String projectId, String sectorId,
			String subsectorId, List<com.bombardier.macs.json.model.Cahier> body) {
		// TODO can we delete all cahiers in projectsectorsubsector and update
		// the body cahiers!!
		HttpStatus status = updateCahiers(body, projectId, sectorId, subsectorId);
		ResponseEntity response = new ResponseEntity<Void>(status);
		return response;
	}

	@Override
	public ResponseEntity<Void> createCahiersByProjectSector(String projectId, String sectorId,
			List<com.bombardier.macs.json.model.Cahier> body) {
		// TODO create all cahiers parts not in wip and update those already
		// exist
		createCahiers(body, projectId, sectorId, null);

		ResponseEntity response = new ResponseEntity<Void>(HttpStatus.OK);
		return response;
	}

	@Override
	public ResponseEntity<List<com.bombardier.macs.json.model.Cahier>> createCahiersByProjectSectorSubSector(
			String projectId, String sectorId, String subsectorId, List<com.bombardier.macs.json.model.Cahier> body) {
		// TODO create all cahiers parts not in wip and update those already
		// exist
		List<Cahier> wipcahiers = createCahiers(body, projectId, sectorId, subsectorId);

		ResponseEntity response = new ResponseEntity<List<com.bombardier.macs.json.model.Cahier>>(HttpStatus.OK);
		return response.ok().body(EntityMapper.getInstance().toJsonCahiers(wipcahiers));

	}

	public List<Cahier> createCahiers(List<com.bombardier.macs.json.model.Cahier> cahiers, String projectId,
			String sectorId, String subsectorId) {
		List<Cahier> wipcahiers = new ArrayList<Cahier>();
		for (com.bombardier.macs.json.model.Cahier cahier : cahiers) {
			wipcahiers.add(createCahier(cahier, projectId, sectorId, subsectorId));
		}
		return wipcahiers;
	}

	public HttpStatus updateCahiers(List<com.bombardier.macs.json.model.Cahier> cahiers, String projectId,
			String sectorId, String subsectorId) {

		HttpStatus status = null;
		// this is a loop, but in current design there wil always be only 1
		// cahier
		for (com.bombardier.macs.json.model.Cahier cahier : cahiers) {
			Cahier dbCahier = cahierRepository.findOne(cahier.getId()).get();
			if (dbCahier != null) {
				status = updateCahier(cahier, projectId, sectorId, subsectorId);
				if (!HttpStatus.OK.equals(status)) {
					break;
				}
			}
		}
		return status;

	}

	// TODO
	private Cahier createCahier(com.bombardier.macs.json.model.Cahier cahier, String projectId, String sectorId,
			String subsectorId) {

		// ApiStatus apiStatus = new ApiStatus(status, false, true, false);
		// return new ResponseEntity<Object>(apiStatus, new HttpHeaders(),
		// apiStatus.getStatus());

		Optional<Workcenter> optwc = null;
		Long wcid = new Long(cahier.getWcId());

		optwc = workcenterRepository.findOne(wcid);
		Workcenter wc = null;
		if (optwc != null && optwc.isPresent()) {
			wc = optwc.get();
		}

		Jalon jalon = null;

		if (cahier.getJalonId() != null) {
			Optional<Jalon> optjalon = jalonRepository.findOne(new Long(cahier.getJalonId()));

			if (optjalon != null && optjalon.isPresent()) {
				jalon = optjalon.get();
			}
		}
		// max = (a > b) ? a : b;
		CahierInformation cahierInf = cahier.getCahierInformation();
		CahierFields cahierFields = cahier.getCahierFields();
		String ci_duration = (cahierInf == null) ? "" : cahierInf.getCahierDuration();
		String ci_description = (cahierInf == null) ? "" : cahierInf.getDescription();
		String ci_effect = (cahierInf == null) ? "" : cahierInf.getEffectivity();
		Long ci_typeid = (cahierInf == null) ? null : cahierInf.getTypeId();
		Long ci_primJobTypeQty = (cahierInf == null) ? null : cahierInf.getPrimaryJobTypeQty();
		Long ci_secJobType = (cahierInf == null) ? null : cahierInf.getSecondaryJobType();
		Long ci_secJobTypeQty = (cahierInf == null) ? null : cahierInf.getSecondaryJobTypeQty();
		Boolean ci_fromBoard = (cahierInf == null) ? false : cahierInf.getFromBoard();
		Boolean ci_fromPva = (cahierInf == null) ? false : cahierInf.getPva();
		Boolean ci_fromWireCut = (cahierInf == null) ? false : cahierInf.getWireCut();
		Boolean ci_fromEdl = (cahierInf == null) ? false : cahierInf.getEdl();

		Long f_productId = (cahierFields == null) ? null : cahierFields.getProductId();
		Long f_jobRoleId = (cahierFields == null) ? null : cahierFields.getJobRoleId();
		Long f_methodId = (cahierFields == null) ? null : cahierFields.getMethodId();
		Long f_typeId = (cahierFields == null) ? null : cahierFields.getTypeId();
		Long f_number = (cahierFields == null) ? null : cahierFields.getNumber();
		Boolean f_flagB = (cahierFields == null || cahierFields.getFlags() == null) ? false
				: cahierFields.getFlags().getB();
		Boolean f_flagR = (cahierFields == null || cahierFields.getFlags() == null) ? false
				: cahierFields.getFlags().getR();
		Boolean f_flagOd = (cahierFields == null || cahierFields.getFlags() == null) ? false
				: cahierFields.getFlags().getOd();

		Cahier cahierToCreate = new Cahier(cahier.getName(), cahier.getWcId(), cahier.getJalonId(), ci_description,
				ci_duration, ci_effect, ci_typeid, ci_primJobTypeQty, ci_secJobType, ci_secJobTypeQty, ci_fromBoard,
				ci_fromPva, ci_fromWireCut, ci_fromEdl, f_productId, f_jobRoleId, f_methodId, f_typeId, f_number,
				f_flagB, f_flagR, f_flagOd, null, null, null, null, wc, jalon, null);

		cahierToCreate = cahierRepository.save(cahierToCreate);

		// look if part exist by project sector subsector partnumber if yes
		// update with wc/cahier foreignkeys
		// if not exist create new one with wc/cahier foreignkeys
		// currently cahier creation will never include parts
		/*
		 * if (cahier.getParts() != null) { for (WorkCenterPart part :
		 * cahier.getParts()) { WorkcenterPart wcp = null; if (part.getId() !=
		 * null && !part.getId().isEmpty()) { wcp =
		 * getPartByProjectSectorSubSectorPartNumber(projectId + "." +
		 * part.getId(), projectId, sectorId, subsectorId); if (wcp == null) {
		 * 
		 * wcp = new WorkcenterPart(projectId + "." + part.getId(),
		 * part.getParentId(), part.getQty(), null, wc, cahierToCreate); // wcp
		 * // =EntityMapper.getInstance().populatePartFromEbom(wcp); MasterPart
		 * masterpart = null; Optional<MasterPart> opt =
		 * partRepository.findOne(part.getId()); if (opt != null &&
		 * opt.isPresent()) { masterpart = opt.get(); } if (masterpart != null)
		 * { wcp =
		 * EntityMapper.getInstance().populatePartFromMasterPartEbom(wcp,
		 * masterpart); } else { wcp =
		 * EntityMapper.getInstance().populatePartFromEbom(wcp); }
		 * 
		 * } wcp.setQty(part.getQty()); wcp.setCahier(cahierToCreate);
		 * wcp.setWorkcenter(wc); wcp.setParentid(part.getParentId()); wcp =
		 * wcpartRepository.save(wcp); }
		 * 
		 * } }
		 */

		return cahierToCreate;
	}

	// Check if wcid exist, and if jalonId not null so check if exist in wip
	// Check if wcid exist, and if jalonId not null so check if exist in wip
	public HttpStatus validateInputsCahier(List<com.bombardier.macs.json.model.Cahier> cahiers) {
		if (cahiers == null || cahiers.size() == 0) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}
		for (com.bombardier.macs.json.model.Cahier cahier : cahiers) {
			Optional<Workcenter> optwc = null;
			Long wcid = new Long(cahier.getWcId());
			optwc = workcenterRepository.findOne(wcid);
			if (optwc == null || !optwc.isPresent()) {
				return HttpStatus.METHOD_NOT_ALLOWED;
			}

			if (cahier.getJalonId() != null) {
				Optional<Jalon> optjalon = jalonRepository.findOne(new Long(cahier.getJalonId()));

				if (optjalon == null || !optjalon.isPresent()) {
					return HttpStatus.METHOD_NOT_ALLOWED;
				}
			}
		}

		return HttpStatus.OK;
	}

	// Check if datas are inside
	public HttpStatus validateInputsCahierTools(List<Tool> tools, String cahierId) {

		Cahier cahier = null;
		Optional<Cahier> optcahier = null;
		Long cahierid = new Long(cahierId);
		optcahier = cahierRepository.findOne(cahierid);
		if (optcahier == null || !optcahier.isPresent()) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}

		if (tools == null || tools.size() == 0) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}
		for (Tool tool : tools) {
			if (tool.getNumber().isEmpty() && tool.getDescription().isEmpty()) {
				return HttpStatus.METHOD_NOT_ALLOWED;
			}
		}

		return HttpStatus.OK;
	}

	private List<Tool> addCahierTools(List<Tool> tools, String cahierId) {

		Cahier cahier = null;
		Optional<Cahier> optcahier = null;
		Long cahierid = new Long(cahierId);
		optcahier = cahierRepository.findOne(cahierid);
		if (optcahier != null && optcahier.isPresent()) {
			cahier = optcahier.get();
		}

		List<CahierComponentField> toolsToAddList = new ArrayList<CahierComponentField>();

		List<Tool> jsoncahierTools = new ArrayList<Tool>();
		for (Tool tool : tools) {
			CahierTool cahierTool = EntityMapper.getInstance().populateCahierTool(tool);
			cahierTool.setCahier(cahier);
			cahierTool = cahierToolRepository.save(cahierTool);
			toolsToAddList.add(tool);
			if (cahierTool != null) {
				Tool jsontool = EntityMapper.getInstance().toJsonCahierTool(cahierTool);
				jsoncahierTools.add(jsontool);
			}
		}

	
		if(!CollectionUtils.isEmpty(toolsToAddList) && cahier!=null && cahier.getIsConfirmed()){
			addCahierHistory(toolsToAddList,  cahier, "ADD", "ADD_TOOL");
		}
		
		return jsoncahierTools;
	}

	// Check if datas are inside
	public HttpStatus validateInputsCahierDrawings(List<Drawing> drawings, String cahierId) {

		Cahier cahier = null;
		Optional<Cahier> optcahier = null;
		Long cahierid = new Long(cahierId);
		optcahier = cahierRepository.findOne(cahierid);
		if (optcahier == null || !optcahier.isPresent()) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}
		if (drawings == null || drawings.size() == 0) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}
		for (Drawing drawing : drawings) {
			if (drawing.getNumber().isEmpty() && drawing.getRevision().isEmpty()
					&& drawing.getEffectivity().isEmpty()) {
				return HttpStatus.METHOD_NOT_ALLOWED;
			}
		}

		return HttpStatus.OK;
	}

	private List<Drawing> addCahierDrawings(List<Drawing> drawings, String cahierId) {

		Cahier cahier = null;
		Optional<Cahier> optcahier = null;
		Long cahierid = new Long(cahierId);
		optcahier = cahierRepository.findOne(cahierid);
		if (optcahier != null && optcahier.isPresent()) {
			cahier = optcahier.get();
		}

		List<CahierComponentField> drawingsToAddList = new ArrayList<CahierComponentField>();

		List<Drawing> jsoncahierDrawings = new ArrayList<Drawing>();
		for (Drawing drawing : drawings) {
			CahierDrawing cahierDrawing = EntityMapper.getInstance().populateCahierDrawing(drawing);
			cahierDrawing.setCahier(cahier);
			cahierDrawing = cahierDrwRepository.save(cahierDrawing);
			drawingsToAddList.add(drawing);
			if (cahierDrawing != null) {
				Drawing jsontool = EntityMapper.getInstance().toJsonCahierDrawing(cahierDrawing);
				jsoncahierDrawings.add(jsontool);
			}
		}
	
		
		if(!CollectionUtils.isEmpty(drawingsToAddList) && cahier!=null && cahier.getIsConfirmed()){
			addCahierHistory(drawingsToAddList,  cahier, "ADD", "ADD_DRAWING");
        }
		
	
		
		return jsoncahierDrawings;
	}

	private HttpStatus updateCahier(com.bombardier.macs.json.model.Cahier cahier, String projectId, String sectorId,
			String subsectorId) {

		Workcenter wc = null;
		Jalon jalon = null;

		HttpStatus status = HttpStatus.OK;
		HttpStatus statusTmp = null;

		CahierComponentField cahierUpdated = null;

		// 1-Add workcenter if not exist
		Optional<Workcenter> optwc = null;
		Long wcid = new Long(cahier.getWcId());
		optwc = workcenterRepository.findOne(wcid);
		// if the wcid in cahier not exist in wip then create one wc and refer
		// the cahier to it
		if (optwc != null && optwc.isPresent()) {
			wc = optwc.get();
		} else {

			// commenting out this code because we never create workcenters
			// directly like this, they are created/added to WIP as a result of
			// querying PI
			// only
			/*
			 * wc = new Workcenter(); wc.setWcNumber(wcid.toString());
			 * wc.setProjectId(projectId.toString()); wc.setSectorId(sectorId);
			 * wc.setSubSectorId(subsectorId); wc =
			 * workcenterRepository.save(wc);
			 */
		}

		// 2-add Jalon
		if (cahier.getJalonId() != null) {
			Optional<Jalon> optjalon = jalonRepository.findOne(new Long(cahier.getJalonId()));
			if (optjalon != null && optjalon.isPresent()) {
				jalon = optjalon.get();
			}
		}

		// 3-Get cahier from Wip to update
		Cahier dbCahier = null;
		Optional<Cahier> optcahier = cahierRepository.findOne(cahier.getId());
		if (optcahier != null && optcahier.isPresent()) {
			dbCahier = optcahier.get();
		}

		if (dbCahier == null)
			return null;

		// 4-Update cahier

		if (cahier.getParts() == null || cahier.getParts().isEmpty()) {
			dbCahier.setName(cahier.getName());
			dbCahier.setWcId(cahier.getWcId());
			dbCahier.setJalonId(cahier.getJalonId());
			if (cahier.getCahierInformation() != null) {
				dbCahier.setDescription(cahier.getCahierInformation().getDescription());
				dbCahier.setCahierDuration(cahier.getCahierInformation().getCahierDuration());
				dbCahier.setEffectivity(cahier.getCahierInformation().getEffectivity());
				dbCahier.setInfotypeId(cahier.getCahierInformation().getTypeId());
				dbCahier.setPrimaryJobTypeQty(cahier.getCahierInformation().getPrimaryJobTypeQty());
				dbCahier.setSecondaryJobType(cahier.getCahierInformation().getSecondaryJobType());
				dbCahier.setSecondaryJobTypeQty(cahier.getCahierInformation().getSecondaryJobTypeQty());
				dbCahier.setFromBoard(cahier.getCahierInformation().getFromBoard());
				dbCahier.setPva(cahier.getCahierInformation().getPva());
				dbCahier.setWireCut(cahier.getCahierInformation().getWireCut());
				dbCahier.setEdl(cahier.getCahierInformation().getEdl());
			}

			if (cahier.getCahierFields() != null) {
				dbCahier.setProductId(cahier.getCahierFields().getProductId());
				dbCahier.setJobRoleId(cahier.getCahierFields().getJobRoleId());
				dbCahier.setMethodId(cahier.getCahierFields().getMethodId());
				dbCahier.setTypeId(cahier.getCahierFields().getTypeId());
				dbCahier.setNumber(cahier.getCahierFields().getNumber());
				dbCahier.setB(cahier.getCahierFields().getFlags().getB());
				dbCahier.setR(cahier.getCahierFields().getFlags().getR());
				dbCahier.setOd(cahier.getCahierFields().getFlags().getOd());
			}

			dbCahier.setJalon(jalon);
			dbCahier.setWorkcenter(wc);
			dbCahier = cahierRepository.save(dbCahier);
			String newJalonTitle = dbCahier.getJalon() != null ? dbCahier.getJalon().getTitle() : "";
			String newWcTitle = dbCahier.getWorkcenter() != null ? dbCahier.getWorkcenter().getTitle() : "";

			cahierUpdated = EntityMapper.getInstance().tojsonCahierComponentField(cahier, dbCahier, newJalonTitle,
					newWcTitle);

		}

		// 6-Update parts

		// look if part exist by project sector subsector partnumber if yes
		// update with wc/cahier foreignkeys
		// if not exist create new one with wc/cahier foreignkeys, remove the
		// rest by null in part cahierforeignkey
		if (cahier.getParts() != null && !cahier.getParts().isEmpty()) {
			for (WorkCenterPart part : cahier.getParts()) {
				WorkcenterPart wcp = null;
				if (part.getId() != null && !part.getId().isEmpty()) {
					statusTmp = generateFullWipPart(projectId, sectorId, subsectorId, wc, dbCahier, part,
							cahier.getSource());
					if (!HttpStatus.OK.equals(statusTmp)) {
						status = statusTmp;
					}
					
					// wcp.setQty(part.getQty());
					// wcp.setCahier(dbCahier);
					// wcp.setWorkcenter(wc);
					// wcp.setParentid(part.getParentId());
					// wcpartRepository.save(wcp);
				}
			}

			// 7-remove parts from cahier if not belongs to list of json
			// cahierparts, so we only change the foreignkeycahier col
			// commenting this out for now, as it is breaking functionality,
			// will reevaluate later if needed

			/*
			 * List<WorkcenterPart> partsExistList =
			 * getPartsByProjectSectorSubSector(projectId, sectorId,
			 * subsectorId); for (WorkcenterPart dbPart : partsExistList) {
			 * boolean exist = false; for (WorkCenterPart part :
			 * cahier.getParts()) { if (dbPart.getId().equals(part.getId()) &&
			 * dbPart.getCahier() != null &&
			 * dbPart.getCahier().getId().equals(cahier.getId())) { exist =
			 * true; } } if (!exist) { dbPart.setCahier(null);
			 * wcpartRepository.save(dbPart); } }
			 * 
			 */
		}

				
		List<CahierComponentField> cahiersUpdated = new ArrayList<CahierComponentField>();
		cahiersUpdated.add(cahierUpdated);
			
		if(!CollectionUtils.isEmpty(cahiersUpdated) && dbCahier!=null && dbCahier.getIsConfirmed()){
			      addCahierHistory(cahiersUpdated,  dbCahier, "UPDATE", "UPDATE_CAHIER");
		}
		
		return status;
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
	
	
	

	private HttpStatus generateFullWipPart(String projectId, String sectorId, String subsectorId, Workcenter wc,
			Cahier dbCahier, WorkCenterPart part, Source source) {
		WorkcenterPart wcp;

		HttpStatus status = HttpStatus.OK;
		List<CahierComponentField> partsToAddList = new ArrayList<CahierComponentField>();
		
		List<String> processedParts = new ArrayList<>();
		wcp = generateWipPart(projectId, sectorId, subsectorId, wc, dbCahier, part, source);
		processedParts.add(part.getId());

		if (wcp == null) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		}
		boolean isSaved = false;

		if (part.getChildren() != null && !part.getChildren().isEmpty()) {

			// wcpartRepository.save(wcp);
			// isSaved = true;

			List<WorkcenterPart> savingQueue = new ArrayList<WorkcenterPart>();

			savingQueue.add(wcp);

			LinkedList<Object[]> queue = new LinkedList<Object[]>(
					part.getChildren().stream().map(c -> new Object[] { wcp, c }).collect(Collectors.toList()));
			while (!queue.isEmpty()) {
				if (!processedParts.contains(part.getId())) {
					processedParts.add(part.getId());

				}
				Object[] partsArray = queue.removeFirst();
				WorkCenterPart child = null;
				WorkcenterPart parent = null;

				if (partsArray.length >= 2) {
					if (partsArray[0] instanceof com.bombardier.macs.model.WorkcenterPart) {
						parent = (com.bombardier.macs.model.WorkcenterPart) partsArray[0];
					}

					if (partsArray[1] instanceof com.bombardier.macs.json.model.WorkCenterPart) {
						child = (com.bombardier.macs.json.model.WorkCenterPart) partsArray[1];
					}
				}
				if (!processedParts.contains(child.getId())) {
					WorkcenterPart wipChild = generateWipPart(projectId, sectorId, subsectorId, wc, dbCahier, child,
							source);
					processedParts.add(child.getId());
					if (wipChild == null) {
						status = HttpStatus.METHOD_NOT_ALLOWED;
						continue;
					}
					wipChild.setParent(parent);
					// wcpartRepository.save(wipChild);
					savingQueue.add(wipChild);
					if (child.getChildren() != null && !child.getChildren().isEmpty()) {
						queue.addAll(child.getChildren().stream().map(c -> new Object[] { wipChild, c })
								.collect(Collectors.toList()));
					}
				} else {
					continue;
				}

			}
			for (WorkcenterPart p : savingQueue) {
				p.setCahier(dbCahier);
				p=wcpartRepository.save(p);
				partsToAddList.add(EntityMapper.getInstance().toJsonCahierPart(p));
			
			}
			isSaved = true;
		}

		if (!isSaved) {
			wcp.setCahier(dbCahier);
			WorkcenterPart wcpart=wcpartRepository.save(wcp);
			partsToAddList.add(EntityMapper.getInstance().toJsonCahierPart(wcpart));
			
		}
		
		if(!CollectionUtils.isEmpty(partsToAddList) && dbCahier!=null && dbCahier.getIsConfirmed()){
			addCahierHistory(partsToAddList,  dbCahier, "ADD", "ADD_PART");
		}
		
		return status;
	}

	private WorkcenterPart generateWipPart(String projectId, String sectorId, String subsectorId, Workcenter wc,
			Cahier dbCahier, WorkCenterPart part, Source source) {
		WorkcenterPart wcp;
		wcp = getPartByProjectSectorSubSectorPartNumber(
				HelperClass.buildInternalPartId(wc.getProjectId(), part.getId()), projectId, sectorId, subsectorId);
		if (wcp == null) {
			if (source != null) {
				// If part not in WIP, source must be Ebom ("E)
				if (!"E".equals(source.getLocation().toUpperCase())) {
					return null;
				}
			}
			// substring
			wcp = new WorkcenterPart(HelperClass.buildInternalPartId(wc.getProjectId(), part.getId()),
					part.getParentId(), part.getQty(), null, wc, dbCahier);
			// wcp
			// =EntityMapper.getInstance().populatePartFromEbom(wcp);
			MasterPart masterpart = null;
			Optional<MasterPart> opt = partRepository.findOne(part.getId());
			if (opt != null && opt.isPresent()) {
				masterpart = opt.get();
			}
			if (masterpart != null) {
				wcp = EntityMapper.getInstance().populatePartFromMasterPartEbom(wcp, masterpart);
			} else {
				String cacheKey = MessageFormat.format(Constants.PARTS_CACHE_KEY_TEMPLATE, projectId, sectorId,
						subsectorId);
				wcp = EntityMapper.getInstance().populatePartFromEbom(wcp, part.getId(), cacheKey);
			}
		} else {
			if (source != null) {
				// if part in WIP source must be different from Ebom ("E")
				if ("E".equals(source.getLocation().toUpperCase())) {
					return null;
				}

				if ("W".equals(source.getLocation().toUpperCase())) {
					if ((wcp.getWorkcenter() != null
							&& !source.getId().equals(Long.toString(wcp.getWorkcenter().getId())))
							|| wcp.getCahier() != null) {
						return null;
					}
				}

				if ("C".equals(source.getLocation().toUpperCase())) {
					if (wcp.getCahier() == null || !source.getId().equals(Long.toString(wcp.getCahier().getId()))) {
						return null;
					}
				}
			}
			// wcp.setCahier(dbCahier);
			wcp.setWorkcenter(wc);
		}
		wcp.setQty(part.getQty());
		wcp.setParentid(part.getParentId());
		return wcp;
	}

	private WorkcenterPart getPartByProjectSectorSubSectorPartNumber(String partnbr, String projectId, String sectorId,
			String subsectorId) {
		List<Workcenter> wcs = null;
		if (subsectorId == null) {
			wcs = workcenterRepository.findByProjectIdAndSectorId(projectId, sectorId);
		} else {
			wcs = workcenterRepository.findByProjectIdAndSectorIdAndSubsectorId(projectId, sectorId, subsectorId);
		}

		for (Workcenter wc : wcs) {
			List<WorkcenterPart> dbParts = wcpartRepository.findByWorkcenter(wc);
			if (dbParts == null) {
				continue;
			} else {
				for (WorkcenterPart p : dbParts) {
					if (p.getId().equals(partnbr)) {
						return p;
					}
				}
			}
		}

		return null;

	}

	private List<WorkcenterPart> getPartsByProjectSectorSubSector(String projectId, String sectorId,
			String subsectorId) {
		List<Workcenter> wcs = null;
		if (subsectorId == null) {
			wcs = workcenterRepository.findByProjectIdAndSectorId(projectId, sectorId);
		} else {
			wcs = workcenterRepository.findByProjectIdAndSectorIdAndSubsectorId(projectId, sectorId, subsectorId);
		}
		List<WorkcenterPart> dbParts = new ArrayList<WorkcenterPart>();

		for (Workcenter workcenter : wcs) {
			dbParts.addAll(wcpartRepository.findByWorkcenter(workcenter));
		}

		return dbParts;
	}

	/*
	 * 
	 * 
	 * public List<Cahier> findCahiersByWorkcenter(long workcenterid) {
	 * Workcenter wc = workcenterRepository.findOne(workcenterid).get(); if (wc
	 * == null) return null; List<Cahier> wcCahiers =
	 * cahierRepository.findByWorkcenter(wc); // List <Cahier> cahiers=new
	 * ArrayList<Cahier>();
	 *
	 * for(Cahier wcPart: wcCahiers ){ cahiers.add(wcPart.getCahier());
	 * //parts.addAll(findPartsByWorkcenter(wc.getId())); }
	 *
	 * return wcCahiers;
	 * 
	 * }
	 * 
	 * public List<Cahier> findCahiersBySectorId(String sectorId) {
	 * 
	 * List<SubSector> subsectors = null;//
	 * subsectorRepository.findBySector(sec); List<Cahier> cahiers = new
	 * ArrayList<Cahier>(); for (SubSector subsec : subsectors) {
	 * cahiers.addAll(findCahiersBySubsectorId(subsec.getId())); }
	 * 
	 * return cahiers; }
	 * 
	 * // TODO public List<Cahier> findCahiersBySubsectorId(String subsectorId)
	 * {
	 * 
	 * List<Workcenter> workcenters = null;//
	 * workcenterRepository.findBySubsector(subsec); List<Cahier> cahiers = new
	 * ArrayList<Cahier>(); for (Workcenter wc : workcenters) {
	 * cahiers.addAll(findCahiersByWorkcenter(wc.getId())); }
	 * 
	 * return cahiers; }
	 * 
	 * 
	 */

	@Override
	public boolean deleteAllCahiers() {
		for (Cahier p : getAllCahiers()) {
			cahierRepository.delete(p);
		}

		return true;
	}

	private boolean deletePartById(String id) {
		if (partRepository.findOne(id) == null)
			return false;
		else {
			MasterPart partToDelete = partRepository.findOne(id).get();
			partRepository.delete(partToDelete);
			return true;
		}
	}

	@Override
	public boolean isCahierExist(Cahier cahier) {
		return cahierRepository.findByName(cahier.getName()) != null;
	}

	@Override
	public ResponseEntity<Object> confirmCahierByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId, String selection, Integer match) {
		try {
			boolean cahierConfirmation = false;
			Optional<Cahier> cahierOpt = cahierRepository.findOne(cahierId);
			Cahier dbCahier = null;
			if (cahierOpt != null && cahierOpt.isPresent()) {
				dbCahier = cahierOpt.get();

				generateSequenceNumber(dbCahier);

				cahierConfirmation = SapClient.getCahierConfirmation(dbCahier);
				dbCahier.setIsConfirmed(cahierConfirmation);
				if (selection != null) {
					dbCahier.setSimilarCahier(selection);
					dbCahier.setSimilarCahierMatch(match);
				}
				cahierRepository.save(dbCahier);
				return ResponseEntity.ok().body(
						new CahierConfirmationResponse(cahierConfirmation, dbCahier.getName(), dbCahier.getNumber()));
			} else {
				return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
						.body("Cahier Confirmation Request Failure, cahier does not exist");
			}
		}

		catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to complete confirm cahier operation.", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Cahier Confirmation Server Error");
		}
	}

	private void generateSequenceNumber(Cahier dbCahier) {
		if (dbCahier.getNumber() == null
				&& (dbCahier.getSimilarCahierMatch() == null || dbCahier.getSimilarCahierMatch() != 100)) {
			CahierNameSequence cahierNameSequence = cahierNameSequenceRepository.findBySequenceKey(dbCahier.getName());
			if (cahierNameSequence == null) {
				cahierNameSequence = new CahierNameSequence(dbCahier.getName());
			}
			Long sequenceNumber = cahierNameSequence.getNextValue();
			cahierNameSequence.incrementValue();
			cahierNameSequenceRepository.save(cahierNameSequence);
			dbCahier.setNumber(sequenceNumber);
			dbCahier.setName(dbCahier.getName() + "-" + HelperClass.leftPad(sequenceNumber.toString(),
					Constants.CAHIER_SEQUENCE_NUMBER_MIN_LENGTH, Constants.CAHIER_SEQUENCE_NUMBER_PADDING_CHAR));
		}
	}

	@Override
	public ResponseEntity<Object> suggestCahierByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId) {
		try {
			List<CahierSuggestion> cahierSuggestions = null;
			Optional<Cahier> cahierOpt = cahierRepository.findOne(cahierId);
			Cahier dbCahier = null;
			if (cahierOpt != null && cahierOpt.isPresent()) {
				dbCahier = cahierOpt.get();
				cahierSuggestions = SapClient.getCahierSuggestion(dbCahier);
			}

			if (cahierSuggestions != null) {
				return ResponseEntity.ok().body(cahierSuggestions);
			} else {
				return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body("Cahier Suggestion Request Failure");
			}
		}

		catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to complete suggest cahier operation.", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Cahier Suggestion Server Error");
		}
	}

	@Override
	public ResponseEntity<Object> checkCahierBomByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId) {
		try {
			boolean minimumCheckStatus = false;
			Optional<Cahier> cahierOpt = cahierRepository.findOne(cahierId);
			Cahier dbCahier = null;
			if (cahierOpt != null && cahierOpt.isPresent()) {
				dbCahier = cahierOpt.get();

				minimumCheckStatus = SapClient.getCahierMinimumCheck(dbCahier, MinimumCheckType.BOM);
				dbCahier.setBomCheck(minimumCheckStatus);
				cahierRepository.save(dbCahier);
				return ResponseEntity.ok().body(new CahierMinimumCheckResponse(minimumCheckStatus));
			} else {
				return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
						.body("Cahier Minimum Check Request Failure, cahier does not exist");
			}
		}

		catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to complete cahier minimum check operation.", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Cahier Minimum Check Server Error");
		}
	}

	@Override
	public ResponseEntity<Object> checkCahierDependencyByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId) {
		try {
			boolean minimumCheckStatus = false;
			Optional<Cahier> cahierOpt = cahierRepository.findOne(cahierId);
			Cahier dbCahier = null;
			if (cahierOpt != null && cahierOpt.isPresent()) {
				dbCahier = cahierOpt.get();

				minimumCheckStatus = SapClient.getCahierMinimumCheck(dbCahier, MinimumCheckType.DEPENDENCY);
				dbCahier.setDependencyCheck(minimumCheckStatus);
				cahierRepository.save(dbCahier);
				return ResponseEntity.ok().body(new CahierMinimumCheckResponse(minimumCheckStatus));
			} else {
				return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
						.body("Cahier Minimum Check Request Failure, cahier does not exist");
			}
		}

		catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to complete cahier minimum check operation.", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Cahier Minimum Check Server Error");
		}
	}

	@Override
	public ResponseEntity<Object> checkCahierRoutingByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId) {
		try {
			boolean minimumCheckStatus = false;
			Optional<Cahier> cahierOpt = cahierRepository.findOne(cahierId);
			Cahier dbCahier = null;
			if (cahierOpt != null && cahierOpt.isPresent()) {
				dbCahier = cahierOpt.get();

				minimumCheckStatus = SapClient.getCahierMinimumCheck(dbCahier, MinimumCheckType.ROUTING);
				dbCahier.setRoutingCheck(minimumCheckStatus);
				cahierRepository.save(dbCahier);
				return ResponseEntity.ok().body(new CahierMinimumCheckResponse(minimumCheckStatus));
			} else {
				return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
						.body("Cahier Minimum Check Request Failure, cahier does not exist");
			}
		}

		catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to complete cahier minimum check operation.", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Cahier Minimum Check Server Error");
		}
	}

	// ResponseEntity<Workspace> getWorkspaces();
	// ResponseEntity<List<Cahier>> getCahiersByProjectSector(
	// @PathVariable("projectId") String projectId, @PathVariable("sectorId")
	// Long
	// sectorId, @Valid @RequestBody List<Body1> body);
	// ResponseEntity<List<Cahier>> getCahiersByProjectSectorSubSector(
	// @PathVariable("projectId") String projectId, @PathVariable("sectorId")
	// Long
	// sectorId, @PathVariable("subSectorId") String subsectorId, @Valid
	// @RequestBody
	// List<Body1> body);
	// ResponseEntity<List<Workcenter>> getWorkCentersByProjectSector(
	// @PathVariable("projectId") String projectId, @PathVariable("sectorId")
	// Long
	// sectorId, @Valid @RequestBody List<Body1> body);
	// ResponseEntity<List<Workcenter>> getWorkCentersByProjectSectorSubSector(
	// @PathVariable("projectId") String projectId, @PathVariable("sectorId")
	// Long
	// sectorId, @PathVariable("subSectorId") String subsectorId, @Valid
	// @RequestBody
	// List<Body1> body);

	/*
	 * ResponseEntity<List<Part>> getPartsByProject(@PathVariable("projectId")
	 * Long projectId); ResponseEntity<List<Part>>
	 * getPartsByProjectSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") String sectorId, @Valid @RequestBody
	 * List<Body> body); ResponseEntity<List<Part>>
	 * getPartsByProjectSectorSubSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") Long
	 * sectorId,@PathVariable("subSectorId") String
	 * subsectorId, @Valid @RequestBody List<Body> body); ResponseEntity<Void>
	 * updatePartsByProjectSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") String sectorId, @Valid @RequestBody
	 * List<Part> body); ResponseEntity<Void>
	 * updatePartsByProjectSectorSubSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") Long
	 * sectorId, @PathVariable("subSectorId") String
	 * subsectorId, @Valid @RequestBody List<Part> body);
	 * 
	 */

}
