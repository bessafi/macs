package com.bombardier.macs.service;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bombardier.macs.MacsException;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.json.model.Sector;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.model.Workspace;


@Service
public interface MacsPartService  {	

	//---parts-------
	public ResponseEntity<List<Part>> findPartsByProject(String projectid);
	public ResponseEntity<List<Part>> findPartsByProjectSector(String projectid, String sectorid, List<String> partIds);
	public ResponseEntity<List<Part>> findPartsByProjectSectorSubsector(String projectid, String sectorid, String subsectorid, List<String> partIds);
	
	public ResponseEntity<Object> updatePartsBySector(String projectId, String sectorId, List<Part> parts);
	public ResponseEntity<Object> updatePartsByProjectSectorSubSector(String projectId, String sectorId, String subsectorId, List<Part> parts);
    
    Workspace getWorkspace() throws MacsException; 
	ResponseEntity<Workspace> getWorkspaces();
	ResponseEntity<List<Sector>> getSectorsListByProject(String project);
	// public ResponseEntity<List<Cahier>> findCahiersByProject(long projectid);
    //public ResponseEntity<List<Cahier>> findCahiersBySector(long sectorid);
    //public ResponseEntity<List<Cahier>> findCahiersBySubsector(long subsectorid);
    com.bombardier.macs.model.MasterPart savePart(com.bombardier.macs.model.MasterPart p);
	List<com.bombardier.macs.model.MasterPart> getAllParts();
	boolean deleteAllParts();
	List<com.bombardier.macs.json.model.Part> fetchAllParts();
	WorkcenterPart saveWcPart(WorkcenterPart p);
	MasterPart saveMasterPart(Part part);
	List<MasterPart> getAllMasterPart();
	boolean deleteAllWcParts();
	ResponseEntity<List<Part>> findMasterPartsByProjectSectorSubsector(String projectid, String sectorid, String  subsectorid);
	ResponseEntity<List<Part>> findMasterParts();
	List<Part> findPartsByProjectSectorSubsector(String projectId, String sectorId, String subsectorId);
						

	
    
    
    
    
}











 






    
        











