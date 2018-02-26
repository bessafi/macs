package com.bombardier.macs.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bombardier.macs.json.model.ParentChildObject;
import com.bombardier.macs.json.model.Sector;
import com.bombardier.macs.json.model.WorkCenter;
import com.bombardier.macs.model.Workcenter;

@Service
// @Profile("macs-cache")

public interface MacsWorkcenterService {

	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, List<String> wcIds);

	public ResponseEntity<List<WorkCenter>> getWorkCentersByProjectSector(String projectId, String sectorId,
			List<String> wcIds);

	public ResponseEntity<Void> updateWorkCentersByProjectSector(String projectId, String sectorId,
			List<WorkCenter> body);

	public ResponseEntity<Void> updateWorkCentersByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, List<WorkCenter> body);

	// To remove some of them
	List<WorkCenter> findWorkcentersBySubsector(String subsectorid);

	public List<Workcenter> getAllWorkcenters();

	public boolean deleteAllWorkcenters();

	ResponseEntity<List<Sector>> getSectorsListByProject(String project);

	Workcenter saveWc(Workcenter p);

	// WorkcenterPart saveWcPart(WorkcenterPart p);
	Set<ParentChildObject> addAllParentsChilds(WorkCenter wc);

	Workcenter getWorkcenterById(Long wcId);

	ResponseEntity<Object> deleteWorkCentersPartsByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, List<WorkCenter> workcenters);

}
