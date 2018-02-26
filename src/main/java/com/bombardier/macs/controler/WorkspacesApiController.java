package com.bombardier.macs.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bombardier.macs.service.MacsPartService;
import com.bombardier.macs.service.MacsTmpPartService;
import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.model.Workspace;


@RestController
public class WorkspacesApiController  {
	
	
	@Autowired
	private MacsPartService serviceImpl;
	@Autowired
	private MacsTmpPartService serviceImpl1;
	
	//TODO remove CrossOrigin once stable with UI.
	@CrossOrigin	
	@RequestMapping(value = "/workspaces",
		        produces = { "application/json" }, 
		        method = RequestMethod.GET)
    public ResponseEntity<Workspace> getWorkspaces() {
		 MacsLogger.info(this.getClass(),"RequestMethod GET, Method Name getWorkspaces, Arguments ( No Args");
	    return serviceImpl1.getWorkspaces();
    }

}
