package com.bombardier.macs.controler;

import com.bombardier.macs.service.MacsPartService;
import com.bombardier.macs.service.MacsTmpPartService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.json.model.Part;
import javax.validation.Valid;

@RestController
public class EbomApiController {
	  
	@Autowired
	private MacsPartService serviceImpl;

	@Autowired
	private MacsTmpPartService serviceImpl1;

	

	//TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/ebom/{projectId}", produces = { "application/json" }, 
			method = RequestMethod.GET)
	public ResponseEntity<List<Part>> getPartsByProject(@PathVariable("projectId") String projectId) {
		 MacsLogger.info(this.getClass(),"RequestMethod GET, Method Name getPartsByProject, Arguments (ProjectId)");
		 	 
		return serviceImpl.findPartsByProject(projectId);

	}
	

	//----------------------------TO UPDATE-----------------------
	
	//TODO remove CrossOrigin once stable with UI.
	//TODO  this method To remove 
	@CrossOrigin		
    @RequestMapping(value = "/ebom/masterparts/{projectId}/{sectorId}",
        produces = { "application/json" }, 
         method = RequestMethod.GET)
    public ResponseEntity<List<Part>> getMasterPartsByProjectSector(    		
         @PathVariable("projectId") String projectId,
	        @PathVariable("sectorId") String sectorId) {
    	
		 MacsLogger.info(this.getClass(),"RequestMethod GET, Method Name getMasterPartsByProjectSector, Arguments (ProjectId  , sectorId  )");
		
    	return serviceImpl.findMasterPartsByProjectSectorSubsector(projectId, sectorId, null);
	}
    
	//TODO remove CrossOrigin once stable with UI.
	//TODO  this method To remove 
	@CrossOrigin    
    @RequestMapping(value = "/ebom/masterparts/{projectId}/{sectorId}/{subSectorId}",
        produces = { "application/json" }, 
         method = RequestMethod.GET)
    public ResponseEntity<List<Part>> getMasterPartsByProjectSectorSubSector(    		
         @PathVariable("projectId") String projectId,
	        @PathVariable("sectorId") String sectorId,
	        @PathVariable("subSectorId") String subSectorId) {
		 MacsLogger.info(this.getClass(),"RequestMethod GET, Method Name getMasterPartsByProjectSectorSubSector, Arguments (ProjectId , sectorId and subSectorId)");
		
    	//return serviceImpl.findMasterPartsByProjectSectorSubsector(projectId, sectorId, subSectorId);
    	return serviceImpl1.findPartsByProjectSectorSubsector(projectId, sectorId, subSectorId, null);
	    }


	//TODO remove CrossOrigin once stable with UI.
	@CrossOrigin    
	
    @RequestMapping(value = "/ebom/masterparts",
            produces = { "application/json" }, 
             method = RequestMethod.GET)
        public ResponseEntity<List<Part>> getMasterPartsByProjectSector() {
		 MacsLogger.info(this.getClass(),"RequestMethod GET, Method Name getMasterPartsByProjectSector, Arguments (No )");
		
        	return serviceImpl.findMasterParts();}
	
	//TODO remove CrossOrigin once stable with UI.
	@CrossOrigin    
	 @RequestMapping(value = "/ebom/{projectId}/{sectorId}",
		        produces = { "application/json" }, 
		        method = RequestMethod.GET)
		    public ResponseEntity<List<Part>> getPartsByProjectSector( @PathVariable("projectId") String projectId,
			        @PathVariable("sectorId") String sectorId,
			       @RequestParam(value = "partId", required = false) List<String> partId) {
		 
		 MacsLogger.info(this.getClass(),"RequestMethod GET, Method Name getPartsByProjectSector, Arguments (ProjectId  , sectorId  and partId List )");
				    
		 return serviceImpl.findPartsByProjectSector(projectId, sectorId, partId);
			    }
	   
	


	//TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
    @RequestMapping(value = "/ebom/{projectId}/{sectorId}/{subSectorId}",
        produces = { "application/json" }, 
         method = RequestMethod.GET)
    public ResponseEntity<List<Part>> getPartsByProjectSectorSubSector(    		
         @PathVariable("projectId") String projectId,
	        @PathVariable("sectorId") String sectorId,
	        @PathVariable("subSectorId") String subSectorId,
	        @RequestParam(value = "partId", required = false) List<String> partId) {
	 
    	 MacsLogger.info(this.getClass(),"RequestMethod GET, Method Name findPartsByProjectSectorSubsector, Arguments (ProjectId , sectorId , subSectorId and partId list )");
		
    	return serviceImpl1.findPartsByProjectSectorSubsector(projectId, sectorId, subSectorId, partId);
	    }

	//TODO remove CrossOrigin once stable with UI.
	@CrossOrigin    
	@RequestMapping(value = "/ebom/{projectId}/{sectorId}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePartsByProjectSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @Valid @RequestBody List<Part> body) {
	
		 MacsLogger.info(this.getClass(),"RequestMethod PUT, MethodName updatePartsByProjectSector, Arguments (ProjectId  , sectorId  and part list )");
			
		return serviceImpl.updatePartsBySector(projectId, sectorId, body);

	}

	//TODO remove CrossOrigin once stable with UI.
	@CrossOrigin
	@RequestMapping(value = "/ebom/{projectId}/{sectorId}/{subSectorId}", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePartsByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@Valid @RequestBody List<Part> body) {

		 MacsLogger.info(this.getClass(),"RequestMethod PUT, MethodName updatePartsByProjectSectorSubSector, Arguments (projectId , sectorId, subSectorId and part list )");
		
		return serviceImpl.updatePartsByProjectSectorSubSector(projectId, sectorId, subSectorId, body);
	}

}
