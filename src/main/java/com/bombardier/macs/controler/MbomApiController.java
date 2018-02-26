package com.bombardier.macs.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.json.model.Cahier;
import com.bombardier.macs.json.model.Drawing;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.json.model.Tool;
import com.bombardier.macs.json.model.WorkCenter;
import com.bombardier.macs.json.model.WorkCenterPart;
import com.bombardier.macs.json.model.WorkCentersCahiers;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.service.MacsCahierService;
import com.bombardier.macs.service.MacsPartService;
import com.bombardier.macs.service.MacsTmpPartService;
import com.bombardier.macs.service.MacsWorkcenterService;
import com.bombardier.macs.util.csv.EntityCsvMapper;

@RestController
public class MbomApiController {

	@Autowired
	private MacsCahierService cahierServiceImpl;

	@Autowired
	private MacsWorkcenterService wcServiceImpl;

	@Autowired
	private MacsPartService partServiceImpl;
	
	@Autowired
	private MacsTmpPartService partTmpServiceImpl;

	// ----------workcenters with cahiers-------------
	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<WorkCentersCahiers> getWorkcentersCahiersByProjectSector(
			@PathVariable("projectId") String projectId, @PathVariable("sectorId") String sectorId) {

		MacsLogger.info(this.getClass(),
				"RequestMethod GET, Method Name getWorkcentersCahiersByProjectSector, Arguments (projectId  , sectorId  )");

		WorkCentersCahiers wcsCahiers = new WorkCentersCahiers();
		wcsCahiers.setWorkCenters(wcServiceImpl.getWorkCentersByProjectSector(projectId, sectorId, null).getBody());
		wcsCahiers.setCahiers(cahierServiceImpl.getCahiersByProjectSector(projectId, sectorId, null).getBody());
	
		
		ResponseEntity response = new ResponseEntity<WorkCentersCahiers>(HttpStatus.OK);
		return response.ok().body(wcsCahiers);

	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<WorkCentersCahiers> getWorkcentersCahiersByProjectSectorSubSector(
			@PathVariable("projectId") String projectId, @PathVariable("sectorId") String sectorId,
			@PathVariable("subSectorId") String subSectorId) {

		MacsLogger.info(this.getClass(),
				"RequestMethod GET, Method Name getWorkcentersCahiersByProjectSectorSubSector, Arguments (ProjectId  , sectorId  , subSectorId )");

		/*WorkCentersCahiers wcsCahiers = new WorkCentersCahiers();
		wcsCahiers.setWorkCenters(
				wcServiceImpl.getWorkCentersByProjectSectorSubSector(projectId, sectorId, subSectorId, null).getBody());
		wcsCahiers.setCahiers(
				cahierServiceImpl.getCahiersByProjectSectorSubSector(projectId, sectorId, subSectorId, null).getBody());
		*/
		WorkCentersCahiers wcsCahiers = new WorkCentersCahiers();
		//TO Uncomment after bessafi  load workcenterscahiers json data  fullCahier.name
		//wcsCahiers.setWorkCenters(partTmpServiceImpl.getWorkcentersCahiersFromJsonFile().getBody().getWorkCenters());//(wcServiceImpl.getWorkCentersByProjectSector(projectId, sectorId, null).getBody());
		wcsCahiers.setWorkCenters(partTmpServiceImpl.getWorkCentersByProjectSectorSubSector(projectId, sectorId, subSectorId, null).getBody());//(wcServiceImpl.getWorkCentersByProjectSector(projectId, sectorId, null).getBody());
		
		
		//wcsCahiers.setCahiers(partTmpServiceImpl.getWorkcentersCahiersFromJsonFile().getBody().getCahiers());//(cahierServiceImpl.getCahiersByProjectSector(projectId, sectorId, null).getBody());
		wcsCahiers.setCahiers(
				cahierServiceImpl.getCahiersByProjectSectorSubSector(projectId, sectorId, subSectorId, null).getBody());
		
		
		ResponseEntity response = new ResponseEntity<WorkCentersCahiers>(HttpStatus.OK);
		return response.ok().body(wcsCahiers);
	}

	// ---GetWorkcenters---

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/workCenters", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId,
			@RequestParam(value = "wcId", required = true) List<String> wcId) {

		MacsLogger.info(this.getClass(),
				"RequestMethod GET, Method Name getWorkCentersByProjectSector, Arguments (ProjectId  , sectorId  and wcId list  )");

		return wcServiceImpl.getWorkCentersByProjectSector(projectId, sectorId, wcId);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/workCenters", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSectorSubSector(
			@PathVariable("projectId") String projectId, @PathVariable("sectorId") String sectorId,
			@PathVariable("subSectorId") String subSectorId,
			@RequestParam(value = "wcId", required = true) List<String> wcId) {

		MacsLogger.info(this.getClass(),
				"RequestMethod GET, Method Name getWorkCentersByProjectSectorSubSector, Arguments (ProjectId  , sectorId , subSectorId and wcId list  )");

		return wcServiceImpl.getWorkCentersByProjectSectorSubSector(projectId, sectorId, subSectorId, wcId);
	}

	// ----UpdateWorkcenters----
	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/workCenters", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Void> updateWorkCentersByProjectSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @Valid @RequestBody List<WorkCenter> body) {

		MacsLogger.info(this.getClass(),
				"RequestMethod PUT, Method Name updateWorkCentersByProjectSector, Arguments (ProjectId  , sectorId  and workcenter list )");

		return wcServiceImpl.updateWorkCentersByProjectSector(projectId, sectorId, body);

	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/workCenters", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Void> updateWorkCentersByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@Valid @RequestBody List<WorkCenter> body) {

		MacsLogger.info(this.getClass(),
				"RequestMethod PUT, Method Name updateWorkCentersByProjectSectorSubsector, Arguments (ProjectId  , sectorId  , subSectorId and workcenter list)");

		return wcServiceImpl.updateWorkCentersByProjectSectorSubSector(projectId, sectorId, subSectorId, body);

	}

	// ----GetCahiers----
	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/cahiers", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Cahier>> getCahiersByProjectSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId,
			@RequestParam(value = "cahierId", required = false) List<String> cahierId) {

		MacsLogger.info(this.getClass(),
				"RequestMethod GET, Method Name getCahiersByProjectSector, Arguments (ProjectId  , sectorId  and cahierId list  )");

		return cahierServiceImpl.getCahiersByProjectSector(projectId, sectorId, cahierId);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Cahier>> getCahiersByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@RequestParam(value = "cahierId", required = false) List<String> cahierId) {

		MacsLogger.info(this.getClass(),
				"RequestMethod GET, Method Name getCahiersByProjectSectorSubSector, Arguments (ProjectId , sectorId  , subSectorId and cahierId list  )");
		return cahierServiceImpl.getCahiersByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId);
	}

	// ----CreateCahiers----
	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/cahiers", consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Void> createCahiersByProjectSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @Valid @RequestBody List<Cahier> body) {

		MacsLogger.info(this.getClass(),
				"RequestMethod POST, Method Name createCahiersByProjectSector, Arguments (ProjectId , sectorId   and cahier list )");

		return cahierServiceImpl.createCahiersByProjectSector(projectId, sectorId, body);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<List<com.bombardier.macs.json.model.Cahier>> createCahiersByProjectSectorSubSector(
			@PathVariable("projectId") String projectId, @PathVariable("sectorId") String sectorId,
			@PathVariable("subSectorId") String subSectorId, @Valid @RequestBody List<Cahier> body) {
		MacsLogger.info(this.getClass(),
				"RequestMethod POST, Method Name createCahiersByProjectSectorSubSector, Arguments (ProjectId , sectorId  , subSectorId and cahier list )");

		return cahierServiceImpl.createCahiersByProjectSectorSubSector(projectId, sectorId, subSectorId, body);
	}

	/*
	 * public ResponseEntity<List<Cahier>>
	 * createCahiersByProjectSectorSubSector(@ApiParam(value =
	 * "ID of project",required=true ) @PathVariable("projectId") String
	 * projectId,
	 * 
	 * @ApiParam(value = "ID of sector",required=true
	 * ) @PathVariable("sectorId") String sectorId,
	 * 
	 * @ApiParam(value = "ID of subSector",required=true
	 * ) @PathVariable("subSectorId") String subSectorId,
	 * 
	 * @ApiParam(value = "New Cahiers" ,required=true ) @Valid @RequestBody
	 * List<Cahier> body) { // do some magic! return new
	 * ResponseEntity<List<Cahier>>(HttpStatus.OK); }
	 * 
	 */

	// ----UpdateCahiers----
	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/cahiers", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Void> updateCahiersByProjectSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @Valid @RequestBody List<Cahier> body) {
		MacsLogger.info(this.getClass(),
				"RequestMethod PUT, Method Name updateCahiersByProjectSector, Arguments (ProjectId  , sectorId  and cahier list )");

		return cahierServiceImpl.updateCahiersByProjectSector(projectId, sectorId, body);

	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Void> updateCahiersByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@Valid @RequestBody List<Cahier> body) {

		if (body != null) {
			MacsLogger.debug(this.getClass(),
					"/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers called. List of cahiers of size: "
							+ body.size());
		} else {
			MacsLogger.debug(this.getClass(),
					"/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers called. List of cahiers is null.");
		}
		return cahierServiceImpl.updateCahiersByProjectSectorSubSector(projectId, sectorId, subSectorId, body);
	}

	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/drawing", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Object> addCahierDrawingByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") String cahierId, @Valid @RequestBody List<Drawing> body) {

		return cahierServiceImpl.addCahierDrawingByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId,
				body);

	}

	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/part", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Object> addCahierPartByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") String cahierId, @Valid @RequestBody List<WorkCenterPart> body) {

		return cahierServiceImpl.addCahierPartByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId,
				body);
	}

	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/part", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Object> updateCahierPartByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") String cahierId, @Valid @RequestBody List<WorkCenterPart> body) {

		return cahierServiceImpl.updateCahierPartByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId,
				body);
	}

	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/tool", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Object> addCahierToolByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") String cahierId, @Valid @RequestBody List<Tool> body) {

		return cahierServiceImpl.addCahierToolByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId,
				body);

	}

	// TODO remove CrossOrigin once stable with UI.
	// TODO cahierId
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/cahierParts", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Object> deletePartsCahierByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@RequestParam(value = "source", required = false) String source,
			@RequestParam(value = "sourceId", required = false) String sourceId,
			@Valid @RequestBody List<WorkCenterPart> body) {
		return cahierServiceImpl.deleteCahierPartByProjectSectorSubSector(projectId, sectorId, subSectorId, source,
				sourceId, body);
	}

	// -- TO remove: For test only
	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/get/{projectId}/{sectorId}/workCenters", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId) {
		return wcServiceImpl.getWorkCentersByProjectSector(projectId, sectorId, null);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/get/{projectId}/{sectorId}/{subSectorId}/workCenters", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSectorSubSector(
			@PathVariable("projectId") String projectId, @PathVariable("sectorId") String sectorId,
			@PathVariable("subSectorId") String subSectorId) {
		return wcServiceImpl.getWorkCentersByProjectSectorSubSector(projectId, sectorId, subSectorId, null);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/get/{projectId}/{sectorId}/cahier", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Cahier>> getCahiersBySector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId) {
		return cahierServiceImpl.getCahiersByProjectSector(projectId, sectorId, null);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/get/{projectId}/{sectorId}/{subSectorId}/cahier", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Cahier>> getCahiersBySubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId) {
		return cahierServiceImpl.getCahiersByProjectSectorSubSector(projectId, sectorId, subSectorId, null);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Object> deleteCahiersByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") String cahierId, @RequestParam(value = "source", required = true) String source,
			@RequestParam(value = "sourceId", required = true) String sourceId) {
		return cahierServiceImpl.deleteCahierByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId,
				source, sourceId);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/confirm", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<Object> confirmCahierByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") long cahierId, @RequestParam(value = "s", required = false) String selection,
			@RequestParam(value = "m", required = false) Integer match) {
		return cahierServiceImpl.confirmCahierByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId,
				selection, match);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/suggest", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<Object> suggestCahierByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") long cahierId) {
		return cahierServiceImpl.suggestCahierByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/bomCheck", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<Object> checkCahierBomByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") long cahierId) {
		return cahierServiceImpl.checkCahierBomByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/dependencyCheck", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<Object> checkCahierDependencyByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") long cahierId) {
		return cahierServiceImpl.checkCahierDependencyByProjectSectorSubSector(projectId, sectorId, subSectorId,
				cahierId);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/routingCheck", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<Object> checkCahierRoutingByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") long cahierId) {
		return cahierServiceImpl.checkCahierRoutingByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId);
	}

	// TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/workCenters", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Object> deleteWorkCentersByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@Valid @RequestBody List<WorkCenter> body) {
		MacsLogger.info(this.getClass(),
				"RequestMethod DELETE, MethodName deleteWorkCentersByProjectSectorSubSector, Arguments (projectId , sectorId, subSectorId and workcenter list )");

		return wcServiceImpl.deleteWorkCentersPartsByProjectSectorSubSector(projectId, sectorId, subSectorId, body);
	}
	
	
	//public ResponseEntity<Object> getCahierHistoryByAction(String action)
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahiers/{cahierId}/history/{action}", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<Object> getCahierHistoryByAction(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") String cahierId,@PathVariable("action") String action) {
		return cahierServiceImpl.getCahierHistoryByAction(projectId, sectorId, subSectorId, cahierId, action);
	}
	
	
	@CrossOrigin
	@RequestMapping(value = "/mbom/{wcId}/csd", produces = "text/csv", method = RequestMethod.GET)
	public void getCsvWorkcenter(@PathVariable Long wcId,
			@RequestParam(value = "cahierId", required = false) List<String> cahierId, HttpServletResponse response)
			throws IOException {
		Workcenter wc = wcServiceImpl.getWorkcenterById(wcId);
		String filename = wcId + "_file.csv";
		response.setHeader("Content-Disposition", "attachment; filename=" + filename);
		List<MasterPart> parts = partServiceImpl.getAllParts();
		List<Part> piParts = partServiceImpl.findPartsByProjectSectorSubsector(wc.getProjectId(), wc.getSectorId(),
				wc.getSubSectorId());
		EntityCsvMapper.getInstance().writeCsdWorkcenters(response.getWriter(),
				EntityCsvMapper.getInstance().toCsdWorkcenters(wc, cahierId, parts, piParts));
	}

	@CrossOrigin
	@RequestMapping(value = "/mbom/{wcId}/csd1", produces = "text/csv")
	public void getCsvWorkcenter1(@PathVariable Long wcId, HttpServletResponse response) throws IOException {
		Workcenter wc = wcServiceImpl.getWorkcenterById(wcId);
		response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv\"");
		List<MasterPart> parts = partServiceImpl.getAllParts();
		// EntityCsvMapper.getInstance().writeCsdWorkcenters(response.getWriter(),
		// EntityCsvMapper.getInstance().toCsdWorkcenters(wc, parts));

		try {
			EntityCsvMapper.getInstance()
					.buildCsvDocument(EntityCsvMapper.getInstance().toCsdWorkcenters(wc, null, parts, null), response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
