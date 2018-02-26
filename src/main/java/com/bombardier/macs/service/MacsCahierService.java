package com.bombardier.macs.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bombardier.macs.json.model.Drawing;
import com.bombardier.macs.json.model.Tool;
import com.bombardier.macs.json.model.WorkCenterPart;
import com.bombardier.macs.model.Cahier;


@Service
public interface MacsCahierService {

	// ---cahiers-------
	public ResponseEntity<List<com.bombardier.macs.json.model.Cahier>> getCahiersByProjectSector(String projectId,
			String sectorId, List<String> body);

	public ResponseEntity<List<com.bombardier.macs.json.model.Cahier>> getCahiersByProjectSectorSubSector(
			String projectId, String sectorId, String subSectorId, List<String> body);

	public ResponseEntity<Void> createCahiersByProjectSector(String projectId, String sectorId,
			List<com.bombardier.macs.json.model.Cahier> body);

	public ResponseEntity<List<com.bombardier.macs.json.model.Cahier>> createCahiersByProjectSectorSubSector(
			String projectId, String sectorId, String subSectorId, List<com.bombardier.macs.json.model.Cahier> body);

	public ResponseEntity<Void> updateCahiersByProjectSector(String projectId, String sectorId,
			List<com.bombardier.macs.json.model.Cahier> body);

	public ResponseEntity<Void> updateCahiersByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, List<com.bombardier.macs.json.model.Cahier> body);

	public ResponseEntity<Object> addCahierToolByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<Tool> body);

	public ResponseEntity<Object> addCahierDrawingByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<Drawing> body);

	public ResponseEntity<Object> addCahierPartByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<WorkCenterPart> body);

	public ResponseEntity<Object> updateCahierPartByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String cahierId, List<WorkCenterPart> body);
	
	public ResponseEntity<Object> getCahierHistoryByAction(String projectId, String sectorId, String subSectorId, 
			String cahierId, String action);

	Cahier saveCahier(Cahier p);

	List<Cahier> getAllCahiers();

	boolean deleteAllCahiers();

	boolean isCahierExist(Cahier cahier);

	ResponseEntity<Object> deleteCahierByProjectSectorSubSector(String projectId, String sectorId, String subSectorId,
			String cahierId, String source, String sourceId);

	public ResponseEntity<Object> confirmCahierByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId, String selection, Integer match);

	public ResponseEntity<Object> suggestCahierByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId);

	ResponseEntity<Object> deleteCahierPartByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, String source, String sourceId, List<WorkCenterPart> body);

	public ResponseEntity<Object> checkCahierBomByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId);

	public ResponseEntity<Object> checkCahierDependencyByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId);

	public ResponseEntity<Object> checkCahierRoutingByProjectSectorSubSector(String projectId, String sectorId,
			String subSectorId, long cahierId);

}
