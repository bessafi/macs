package com.bombardier.macs.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
import com.bombardier.macs.dao.CahierRepository;
import com.bombardier.macs.dao.JalonRepository;
import com.bombardier.macs.dao.PartRepository;
import com.bombardier.macs.dao.WorkcenterPartRepository;
import com.bombardier.macs.dao.WorkcenterRepository;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.json.model.Project;
import com.bombardier.macs.json.model.Sector;
import com.bombardier.macs.json.model.SubSector;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.model.Workspace;
import com.bombardier.macs.util.EntityMapper;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;

@Service
@Transactional
// @Profile("macs-cache")

public class MacsPartServiceImpl implements MacsPartService {

	@Autowired
	private PartRepository partRepository;

	@Autowired
	private WorkcenterPartRepository wcpartRepository;

	@Autowired
	private WorkcenterRepository workcenterRepository;

	// @Autowired
	// private JalonCahierAssRepository JalonCahierAssRepository;

	@Autowired
	private CahierRepository cahierRepository;

	@Autowired
	private JalonRepository jalonRepository;

	@Override
	public ResponseEntity<List<Sector>> getSectorsListByProject(String project) {
		// TODO Auto-generated method stub
		return null;
	}

	// ---------------------------------------------------------
	// --------------------------------Workspace-----------------
	// --------------------------------------------------------
	public Workspace getWorkspace() throws MacsException {
		Workspace ws = new Workspace();

		List<Project> projects = SapClient.getProjectList();
		List<com.bombardier.macs.util.Sector> sectors = SapClient.getSectors();
		ArrayList<SubSector> subsectors = new ArrayList<SubSector>();

		if (sectors != null) {
			for (com.bombardier.macs.util.Sector sector : sectors) {
				if (null != sector.getSubSectors()) {
					subsectors.addAll(sector.getSubSectors());
				}
			}
		}

		ws.setProjects(projects);
		ws.setSectors(new ArrayList<Sector>(sectors));
		ws.setSubSectors(subsectors);

		return ws;

	}

	public ResponseEntity<Workspace> getWorkspaces() {
		try {
			Workspace ws = null;
			CacheItem cacheItem = MacsObjectCache.getCacheItem(Constants.WORKSPACE_CACHE_KEY);
			long now = System.currentTimeMillis();

			if (cacheItem != null && now <= (cacheItem.getTimeStamp() + Constants.WORKSPACE_MAX_CACHE_TIME)) {
				ws = (Workspace) cacheItem.getData();
			} else {
				ws = getWorkspace();
				cacheItem = new CacheItem(now, ws);
				MacsObjectCache.addOrUpdateCacheItem(Constants.WORKSPACE_CACHE_KEY, cacheItem);
			}
			return ResponseEntity.ok().body(ws);
		} catch (MacsException mae) {
			MacsLogger.error(this.getClass(), "Failed to obtain workspaces", mae);

			ResponseEntity<Workspace> response = new ResponseEntity<Workspace>(HttpStatus.INTERNAL_SERVER_ERROR);
			return response;
		}

	}

	// ---------------------------------------------------
	// ---------------PARTS------------------------------
	// ---------------------------------------------------
	@Override
	public ResponseEntity<List<com.bombardier.macs.json.model.Part>> findPartsByProject(String projectid) {

		List<WorkcenterPart> parts = new ArrayList<WorkcenterPart>();
		List<Workcenter> wcs = workcenterRepository.findByProjectId(String.valueOf(projectid));
		for (Workcenter wc : wcs) {
			parts.addAll(wcpartRepository.findByWorkcenter(wc));
		}
		List<com.bombardier.macs.json.model.Part> jsonparts = new ArrayList<com.bombardier.macs.json.model.Part>();
		jsonparts.addAll(toJsonParts(parts));
		ResponseEntity response = new ResponseEntity<List<com.bombardier.macs.json.model.Part>>(HttpStatus.OK);
		return response.ok().body(jsonparts);
	}

	/**
	 * We get the list of parts through PI and we merge the status with the
	 * parts stored in WIP. The idea is to: a) get the list of parts from PI b)
	 * Store in MasterPart in wip the 'part' to persist the data that we need to
	 * validate for change (drawing, version) c) Validate if new received
	 * drawing and version for each part is aligned with what we had in WIP. If
	 * not.. adjust status d) Complete final status calculation based on part
	 * assignement in wip (to WC or Cahier
	 */
	@Override
	public ResponseEntity<List<Part>> findPartsByProjectSectorSubsector(String projectId, String sectorId,
			String subsectorId, List<String> partIds) {
		try {
			List<Part> returnedParts = new ArrayList<Part>();

			List<Part> piParts = null;

			String cacheKey = MessageFormat.format(Constants.PARTS_CACHE_KEY_TEMPLATE, projectId, sectorId,
					subsectorId);

			CacheItem cacheItem = MacsObjectCache.getCacheItem(cacheKey);
			long now = System.currentTimeMillis();

			// use cache for now. If it uses too much memory, consider saving
			// all to MasterPart table

			if (cacheItem != null && now <= (cacheItem.getTimeStamp() + Constants.PARTS_MAX_CACHE_TIME)) {
				piParts = (List<Part>) cacheItem.getData();
			} else {
				piParts = EntityMapper.getInstance()
						.sortByParent(SapClient.getPartList(projectId, sectorId, subsectorId));
				cacheItem = new CacheItem(now, piParts);
				MacsObjectCache.addOrUpdateCacheItem(cacheKey, cacheItem);
			}

			// Filter out all parts that are not in partIds (
			if ((partIds != null) && (!partIds.isEmpty())) {
				Part aPart;
				returnedParts.addAll(piParts);
				Iterator<Part> parts = returnedParts.iterator();

				while (parts.hasNext()) {
					aPart = parts.next();

					for (String idOfPartToInclude : partIds) {
						if ((aPart.getId() != null) && (idOfPartToInclude != null)) {
							if (!aPart.getId().equalsIgnoreCase(idOfPartToInclude)) {
								parts.remove();
							}
						}
					}
				}
			} else {
				returnedParts = piParts;
			}

			returnedParts = mergeWipUpdates(projectId, returnedParts);

			return ResponseEntity.ok().body(returnedParts);
		} catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to retrieve ebom parts.", e);
			ResponseEntity<List<Part>> response = new ResponseEntity<List<Part>>(HttpStatus.INTERNAL_SERVER_ERROR);
			return response;
		}

	}

	private List<Part> mergeWipUpdates(String projectId, List<Part> parts) {

		// make a deep copy of parts, otherwise we end up updating the
		// cache
		List<Part> partsCopy = parts.stream().map(Part::new).collect(Collectors.toList());

		WorkcenterPart currentPart;
		// TODO improve performance, it takes a long time to query the parts one
		// by one
		// it would be easier with a proper way to select targeted parts from db
		// all at once
		for (Part part : partsCopy) {
			Optional<WorkcenterPart> partOpt = wcpartRepository
					.findOne(HelperClass.buildInternalPartId(projectId, part.getId()));
			if (partOpt != null && partOpt.isPresent()) {
				currentPart = partOpt.get();
				part.setQty(part.getQty() > 0
						? part.getQty() - (currentPart.getQty() != null ? currentPart.getQty() : part.getQty())
						: part.getQty()); // TODO
				// remove
				// temporary
				// fix
				part.setStatus(EntityMapper.getInstance().toJsonPartStatus(currentPart));
			}
		}

		return partsCopy;
	}

	@Override
	public ResponseEntity<List<com.bombardier.macs.json.model.Part>> findPartsByProjectSector(String projectid,
			String sectorid, List<String> partIds) {

		List<WorkcenterPart> parts = new ArrayList<WorkcenterPart>();

		parts.addAll(findFilteredPartsByProjectIdSectorId(projectid, sectorid, partIds));
		List<com.bombardier.macs.json.model.Part> jsonparts = new ArrayList<com.bombardier.macs.json.model.Part>();
		jsonparts.addAll(toJsonParts(parts));
		ResponseEntity response = new ResponseEntity<List<com.bombardier.macs.json.model.Part>>(HttpStatus.OK);
		return response.ok().body(jsonparts);

	}

	@Override
	public ResponseEntity<Object> updatePartsBySector(String projectId, String sectorId,
			List<com.bombardier.macs.json.model.Part> parts) {
		HttpStatus status = updateParts(parts, projectId, sectorId, null);
		ApiStatus apiStatus = new ApiStatus(status, true, false, false);
		return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());

	}

	@Override
	public List<Part> findPartsByProjectSectorSubsector(String projectId, String sectorId, String subsectorId) {
		try {

			List<Part> piParts = null;

			String cacheKey = MessageFormat.format(Constants.PARTS_CACHE_KEY_TEMPLATE, projectId, sectorId,
					subsectorId);

			CacheItem cacheItem = MacsObjectCache.getCacheItem(cacheKey);
			long now = System.currentTimeMillis();

			// use cache for now. If it uses too much memory, consider saving
			// all to MasterPart table

			if (cacheItem != null && now <= (cacheItem.getTimeStamp() + Constants.PARTS_MAX_CACHE_TIME)) {
				piParts = (List<Part>) cacheItem.getData();
			} else {
				piParts = EntityMapper.getInstance()
						.sortByParent(SapClient.getPartList(projectId, sectorId, subsectorId));
				cacheItem = new CacheItem(now, piParts);
				MacsObjectCache.addOrUpdateCacheItem(cacheKey, cacheItem);
			}

			return piParts;
		} catch (MacsException e) {
			MacsLogger.error(this.getClass(), "Failed to retrieve ebom parts.", e);
			return null;
		}

	}

	@Override
	public ResponseEntity<Object> updatePartsByProjectSectorSubSector(String projectId, String sectorId,
			String subsectorId, List<com.bombardier.macs.json.model.Part> parts) {
		// Add the parts filter after
		HttpStatus status = updateParts(parts, projectId, sectorId, subsectorId);

		// ResponseEntity response = new ResponseEntity<Void>(status);
		// return response;
		// final String error = ex.getParameterName() + " parameter is missing";
		// final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST,
		// ex.getLocalizedMessage(), error);
		// return new ResponseEntity<Object>(apiError, new HttpHeaders(),
		// apiError.getStatus());

		ApiStatus apiStatus = new ApiStatus(status, true, false, false);

		// return ResponseEntity.status(status)
		// .contentType(MediaType.TEXT_PLAIN)
		// .body(apiStatus.getMessage());
		return new ResponseEntity<Object>(apiStatus, new HttpHeaders(), apiStatus.getStatus());
		// ResponseEntity response = new ResponseEntity<String>(status);
		// response.status(status).contentType(MediaType.TEXT_PLAIN).body(getMessage(status));
		// return response;

	}

	private List<com.bombardier.macs.json.model.Part> toJsonParts(List<WorkcenterPart> parts) {

		List<com.bombardier.macs.json.model.Part> jsonparts = new ArrayList<com.bombardier.macs.json.model.Part>();
		List<WorkcenterPart> partslist = parts.stream().sorted(Comparator.comparing(WorkcenterPart::getId))
				.collect(Collectors.toList());
		List<WorkcenterPart> sortedParts = EntityMapper.getInstance().sortPartsParentChildren(partslist);
		for (WorkcenterPart part : sortedParts) {
			com.bombardier.macs.json.model.Part jsonPart = EntityMapper.getInstance().toJsonPart(part);
			jsonparts.add(jsonPart);
		}
		return jsonparts;
	}

	// @Override
	public boolean isValid(MasterPart part) {
		return part != null
		/*
		 * && part.getCahier() != null && part().equals("Software Developer")
		 */
		;
	}

	@Override
	@Cacheable("allpartscache")
	// TODO
	public List<com.bombardier.macs.json.model.Part> fetchAllParts() {

		return null;// payloadParts;n
	}

	// TODO
	// @Override
	public List<MasterPart> findPartsByCahier(long cahierid) {
		Cahier cahier = cahierRepository.findOne(cahierid).get();
		if (cahier == null)
			return null;
		return null;// partRepository.findByCahier(cahier);
	}

	@Override
	public List<com.bombardier.macs.model.MasterPart> getAllParts() {
		return partRepository.findAll();
	}

	@Override
	public boolean deleteAllParts() {
		for (MasterPart p : getAllParts()) {
			partRepository.delete(p);
		}

		return true;
	}

	@Override
	public boolean deleteAllWcParts() {
		for (WorkcenterPart p : getAllWcParts()) {
			wcpartRepository.delete(p);
		}

		return true;
	}

	@Override
	public MasterPart savePart(MasterPart p) {
		MasterPart persPart = partRepository.save(p);
		return persPart;
	}

	@Override
	public WorkcenterPart saveWcPart(WorkcenterPart p) {
		WorkcenterPart persPart = wcpartRepository.save(p);
		return persPart;
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

	public List<com.bombardier.macs.model.WorkcenterPart> getAllWcParts() {
		return wcpartRepository.findAll();
	}

	public HttpStatus updateParts(List<com.bombardier.macs.json.model.Part> parts, String projectId, String sectorId,
			String subsectorId) {
		HttpStatus status = HttpStatus.OK;
		for (com.bombardier.macs.json.model.Part part : parts) {
			HttpStatus stt = updatePart(part, projectId, sectorId, subsectorId);
			if (!stt.equals(HttpStatus.OK)) {
				status = stt;
			}
		}
		return status;
	}

	private HttpStatus updatePart(com.bombardier.macs.json.model.Part part, String projectId, String sectorId,
			String subsectorId) {
		String partId = HelperClass.buildInternalPartId(projectId, part.getId());

		Optional<WorkcenterPart> partopt = wcpartRepository.findOne(partId);
		WorkcenterPart partToPersist = null;
		if (partopt != null && partopt.isPresent()) {
			partToPersist = partopt.get();
		}

		if (partToPersist == null) {
			String cacheKey = MessageFormat.format(Constants.PARTS_CACHE_KEY_TEMPLATE, projectId, sectorId,
					subsectorId);

			// TODO make more robust
			partToPersist = new WorkcenterPart(partId, part.getParentId(), part.getQty(), null, null, null);
			partToPersist = EntityMapper.getInstance().populatePartFromEbom(partToPersist, part.getId(), cacheKey);

			// return HttpStatus.METHOD_NOT_ALLOWED;
		}
		/*
		 * partToPersist.setQty(part.getQty());
		 * partToPersist.setAuthority(part.getAuthority());
		 * partToPersist.setDrawing(part.getDrawing());
		 * partToPersist.setQty(part.getQty());
		 * partToPersist.setString(part.getString());
		 * partToPersist.setDescription(part.getDescription());
		 * partToPersist.setLnkDrwRclk(part.getLinks().getDrawing().
		 * getRightClick());
		 * partToPersist.setLnkNbrRclk(part.getLinks().getNumber().getRightClick
		 * ()); partToPersist.setLnkRevRclk(part.getLinks().getRevision().
		 * getRightClick());
		 * partToPersist.setLnkStrRclk(part.getLinks().getString().getRightClick
		 * ());
		 */
		partToPersist.setStatusDrwAssgn(part.getStatus().getDrawing().getAssignment());
		partToPersist.setStatusNbrAssgn(part.getStatus().getNumber().getAssignment());
		partToPersist.setStatusRevAssgn(part.getStatus().getRevision().getAssignment());
		partToPersist.setStatusStrAssgn(part.getStatus().getString().getAssignment());

		partToPersist = wcpartRepository.save(partToPersist);
		return HttpStatus.OK;
	}

	@Override
	public MasterPart saveMasterPart(com.bombardier.macs.json.model.Part part) {
		MasterPart partToPersist = new MasterPart();
		System.out.println(part.getDescription());
		partToPersist.setId(part.getId());
		partToPersist.setParentId(part.getParentId());
		partToPersist.setQty(part.getQty());
		partToPersist.setAuthority(part.getAuthority());
		partToPersist.setRevision(part.getRevision());
		partToPersist.setDrawing(part.getDrawing());
		partToPersist.setQty(part.getQty());
		partToPersist.setString(part.getString());
		partToPersist.setNumber(part.getNumber());
		partToPersist.setDescription(part.getDescription());

		/**
		 * Test data for Francis.. specific projects, sectors and sub are used.
		 */
		if (partToPersist.getId().startsWith("1")
				|| (partToPersist.getParentId() != null && partToPersist.getParentId().startsWith("1"))) {
			partToPersist.setProject("999");
			partToPersist.setSector("999");
			partToPersist.setSubSector("999");
		} else {
			partToPersist.setProject("888");
			partToPersist.setSector("888");
			partToPersist.setSubSector("888");
		}

		if (part.getLinks() != null) {
			partToPersist.setLnkDrwRclk(part.getLinks().getDrawing().getRightClick());
			partToPersist.setLnkNbrRclk(part.getLinks().getNumber().getRightClick());
			// TODO to change setlnkrevrclk by setlnkauthrclk
			partToPersist.setLnkRevRclk(part.getLinks().getAuthority().getRightClick());

			partToPersist.setLnkStrRclk(part.getLinks().getString().getRightClick());
		} else {
			partToPersist.setLnkDrwRclk("");
			partToPersist.setLnkNbrRclk("");
			partToPersist.setLnkRevRclk("");
			partToPersist.setLnkStrRclk("");
		}
		partToPersist.setStatusDrwAssgn(part.getStatus().getDrawing().getAssignment());
		partToPersist.setStatusNbrAssgn(part.getStatus().getNumber().getAssignment());
		partToPersist.setStatusRevAssgn(part.getStatus().getRevision().getAssignment());
		partToPersist.setStatusStrAssgn(part.getStatus().getString().getAssignment());

		partToPersist = partRepository.save(partToPersist);

		return partToPersist;
	}

	@Override
	public List<MasterPart> getAllMasterPart() {
		return partRepository.findAll();
	};

	private List<WorkcenterPart> findFilteredPartsByProjectIdSectorId(String projectId, String sectorId,
			List<String> partIds) {

		List<WorkcenterPart> parts = findPartsByProjectIdSectorId(projectId, sectorId);
		List<WorkcenterPart> filteredparts = new ArrayList<WorkcenterPart>();
		if (partIds != null && partIds.size() > 0) {
			for (WorkcenterPart part : parts) {
				for (String partId : partIds) {
					if (part.getId().equals(HelperClass.buildInternalPartId(projectId, partId))) {
						filteredparts.add(part);
					}
				}
			}
			return filteredparts;
		} else {
			return parts;
		}

	}

	private List<WorkcenterPart> findPartsByProjectIdSectorId(String projectId, String sectorId) {

		List<WorkcenterPart> parts = new ArrayList<WorkcenterPart>();

		List<Workcenter> wcs = workcenterRepository.findByProjectIdAndSectorId(projectId, sectorId);
		for (Workcenter wc : wcs) {
			parts.addAll(wcpartRepository.findByWorkcenter(wc));
		}

		return parts;
	}

	private List<WorkcenterPart> findFilteredPartsByProjectIdSectorIdSubsectorId(String projectId, String sectorId,
			String subsectorId, List<String> partIds) {

		List<WorkcenterPart> parts = findPartsByProjectIdSectorIdSubsectorId(projectId, sectorId, subsectorId);
		List<WorkcenterPart> filteredparts = new ArrayList<WorkcenterPart>();
		if (partIds != null && partIds.size() > 0) {
			for (WorkcenterPart part : parts) {
				for (String partId : partIds) {
					if (part.getId().equals(HelperClass.buildInternalPartId(projectId, partId))) {
						filteredparts.add(part);
					}
				}
			}
			return filteredparts;
		} else {
			return parts;
		}

	}

	private List<WorkcenterPart> findPartsByProjectIdSectorIdSubsectorId(String projectId, String sectorId,
			String subsectorId) {

		List<WorkcenterPart> parts = new ArrayList<WorkcenterPart>();

		List<Workcenter> wcs = workcenterRepository.findByProjectIdAndSectorIdAndSubsectorId(projectId, sectorId,
				subsectorId);
		for (Workcenter wc : wcs) {
			parts.addAll(wcpartRepository.findByWorkcenter(wc));
		}

		return parts;
	}

	// ------------------Master part-------------to remove---------------

	@Override
	public ResponseEntity<List<com.bombardier.macs.json.model.Part>> findMasterPartsByProjectSectorSubsector(
			String projectid, String sectorid, String subsectorid) {

		List<MasterPart> parts = new ArrayList<MasterPart>();
		parts.addAll(findMasterPartsByProjectIdSectorIdSubsectorId(projectid, sectorid, subsectorid));
		List<com.bombardier.macs.json.model.Part> jsonparts = new ArrayList<com.bombardier.macs.json.model.Part>();
		jsonparts.addAll(toJsonPartsFromMasterParts(parts));
		ResponseEntity response = new ResponseEntity<List<com.bombardier.macs.json.model.Part>>(HttpStatus.OK);
		return response.ok().body(jsonparts);
	}

	@Override
	public ResponseEntity<List<Part>> findMasterParts() {
		List<MasterPart> masterparts = new ArrayList<MasterPart>();
		masterparts.addAll(partRepository.findAll());
		List<com.bombardier.macs.json.model.Part> jsonparts = new ArrayList<com.bombardier.macs.json.model.Part>();
		jsonparts.addAll(toJsonPartsFromMasterParts(masterparts));
		ResponseEntity response = new ResponseEntity<List<com.bombardier.macs.json.model.Part>>(HttpStatus.OK);
		return response.ok().body(jsonparts);
	}

	private List<MasterPart> findMasterPartsByProjectIdSectorIdSubsectorId(String projectId, String sectorId,
			String subsectorId) {
		List<WorkcenterPart> wcparts = new ArrayList<WorkcenterPart>();

		List<MasterPart> masterparts = new ArrayList<MasterPart>();
		masterparts.addAll(partRepository.findByProjectIdAndSectorIdAndSubsectorId(projectId, sectorId, subsectorId));

		List<Workcenter> wcs = null;
		if (subsectorId == null) {
			wcs = workcenterRepository.findByProjectIdAndSectorId(projectId, sectorId);
		} else {
			wcs = workcenterRepository.findByProjectIdAndSectorIdAndSubsectorId(projectId, sectorId, subsectorId);
		}
		for (Workcenter wc : wcs) {
			wcparts.addAll(wcpartRepository.findByWorkcenter(wc));
		}

		for (WorkcenterPart part : wcparts) {
			String partId = part.getId();
			if (partId.contains(".")) {
				int index = partId.indexOf(".");
				partId = partId.substring(index + 1);
			}

			for (MasterPart masterpart : masterparts) {

				if (masterpart.getId().equals(partId)) {
					Optional<MasterPart> opt = partRepository.findOne(partId);
					if (opt != null && opt.isPresent()) {
						masterpart = opt.get();
					}
					masterpart.setWip_statusDrwAssgn(part.getStatusDrwAssgn());
					masterpart.setWip_statusDrwAssgn(part.getStatusDrwAssgn());
					masterpart.setWip_statusNbrAssgn(part.getStatusNbrAssgn());
					masterpart.setWip_statusRevAssgn(part.getStatusRevAssgn());
					masterpart.setWip_statusStrAssgn(part.getStatusStrAssgn());
					masterpart.setWip_Qty(part.getQty());
					System.out.println(masterpart.getQty());
				}
			}
		}

		return masterparts;
	}

	private List<com.bombardier.macs.json.model.Part> toJsonPartsFromMasterParts(List<MasterPart> parts) {
		List<com.bombardier.macs.json.model.Part> jsonparts = new ArrayList<com.bombardier.macs.json.model.Part>();
		for (MasterPart part : parts) {
			com.bombardier.macs.json.model.Part jsonPart = EntityMapper.getInstance().toJsonPartFromMasterPart(part);
			jsonparts.add(jsonPart);
		}

		return jsonparts;
	}

	// ResponseEntity<Workspace> getWorkspaces();
	// ResponseEntity<List<Cahier>> getCahiersByProjectSector(
	// @PathVariable("projectId") Long projectId, @PathVariable("sectorId") Long
	// sectorId, @Valid @RequestBody List<Body1> body);
	// ResponseEntity<List<Cahier>> getCahiersByProjectSectorSubSector(
	// @PathVariable("projectId") Long projectId, @PathVariable("sectorId") Long
	// sectorId, @PathVariable("subSectorId") Long subSectorId, @Valid
	// @RequestBody
	// List<Body1> body);
	// ResponseEntity<List<Workcenter>> getWorkCentersByProjectSector(
	// @PathVariable("projectId") Long projectId, @PathVariable("sectorId") Long
	// sectorId, @Valid @RequestBody List<Body1> body);
	// ResponseEntity<List<Workcenter>> getWorkCentersByProjectSectorSubSector(
	// @PathVariable("projectId") Long projectId, @PathVariable("sectorId") Long
	// sectorId, @PathVariable("subSectorId") Long subSectorId, @Valid
	// @RequestBody
	// List<Body1> body);

	/*
	 * ResponseEntity<List<Part>> getPartsByProject(@PathVariable("projectId")
	 * Long projectId); ResponseEntity<List<Part>>
	 * getPartsByProjectSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") Long sectorId, @Valid @RequestBody
	 * List<Body> body); ResponseEntity<List<Part>>
	 * getPartsByProjectSectorSubSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") Long
	 * sectorId,@PathVariable("subSectorId") Long
	 * subSectorId, @Valid @RequestBody List<Body> body); ResponseEntity<Void>
	 * updatePartsByProjectSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") Long sectorId, @Valid @RequestBody
	 * List<Part> body); ResponseEntity<Void>
	 * updatePartsByProjectSectorSubSector( @PathVariable("projectId") Long
	 * projectId, @PathVariable("sectorId") Long
	 * sectorId, @PathVariable("subSectorId") Long
	 * subSectorId, @Valid @RequestBody List<Part> body);
	 * 
	 */

}
