package com.bombardier.macs.util.temp.forme;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import com.bombardier.macs.json.model.Tool;
import com.bombardier.macs.json.model.WorkCenter;
import com.bombardier.macs.json.model.WorkCenterPart;
import com.bombardier.macs.json.model.WorkCentersCahiers;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.service.MacsCahierService;
import com.bombardier.macs.service.MacsPartService;
import com.bombardier.macs.service.MacsWorkcenterService;
import com.bombardier.macs.util.csv.EntityCsvMapper;

@RestController
public class MbomApiController2 {
	 private static final String[] HEADER = new String[]{"Bom Item Level", "Component Quantity", 
			  "Part Number", "Part Title", "EDRN/NIEO Rev", "INSTALLED BY", "TO DWG" , "DIR Release Date", 
			  "Dataset Type", "Cage Code", "Mod/Sum No.", "Material Group"};
	@Autowired
	private MacsCahierService cahierServiceImpl;

	@Autowired
	private MacsWorkcenterService wcServiceImpl;

	@Autowired
	private MacsPartService partServiceImpl;

	// ----------workcenters with cahiers-------------
	// TODO remove CrossOrigin once stable with UI.
	/*
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

		WorkCentersCahiers wcsCahiers = new WorkCentersCahiers();
		wcsCahiers.setWorkCenters(
				wcServiceImpl.getWorkCentersByProjectSectorSubSector(projectId, sectorId, subSectorId, null).getBody());
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
	@CrossOrigin
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/cahierParts", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Object> deletePartsCahierByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			 @RequestParam(value = "source", required = false) String source,
			@RequestParam(value = "sourceId", required = false) String sourceId, @Valid @RequestBody List<WorkCenterPart> body) {
		return cahierServiceImpl.deleteCahierPartByProjectSectorSubSector(projectId, sectorId, subSectorId, source, sourceId, body);	
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
	ResponseEntity<Void> confirmCahierByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@PathVariable("cahierId") long cahierId) {
		return cahierServiceImpl.confirmCahierByProjectSectorSubSector(projectId, sectorId, subSectorId, cahierId);
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
	@RequestMapping(value = "/mbom/{projectId}/{sectorId}/{subSectorId}/workCenters", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Object> deleteWorkCentersByProjectSectorSubSector(@PathVariable("projectId") String projectId,
			@PathVariable("sectorId") String sectorId, @PathVariable("subSectorId") String subSectorId,
			@Valid @RequestBody List<WorkCenter> body) {
		return wcServiceImpl.deleteWorkCentersPartsByProjectSectorSubSector(projectId, sectorId, subSectorId, body);
	}

	@CrossOrigin
	@RequestMapping(value = "/mbom/{wcId}/{cahierId}/csd", produces = "text/csv")
	public void getCsvWorkcenter(@PathVariable Long wcId, @PathVariable Long cahierId, HttpServletResponse response) throws IOException {
		Workcenter wc = wcServiceImpl.getWorkcenterById(wcId);
		response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv\"");
	    List<MasterPart> parts = partServiceImpl.getAllParts();
		EntityCsvMapper.getInstance().writeCsdWorkcenters(response.getWriter(),
				EntityCsvMapper.getInstance().toCsdWorkcenters(wc, cahierId, parts, null));
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
			EntityCsvMapper.getInstance().buildCsvDocument(EntityCsvMapper.getInstance().toCsdWorkcenters(wc, null, parts, null),
					response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@CrossOrigin
	@RequestMapping(value = "/mbom/{wcId}/csd2", produces = "text/csv")
	public void getCsvWorkcenter2(@PathVariable Long wcId, HttpServletResponse response) throws IOException {
		Workcenter wc = wcServiceImpl.getWorkcenterById(wcId);
		response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv\"");
	    List<MasterPart> parts = partServiceImpl.getAllParts();
	     //EntityCsvMapper.getInstance().writeCsdWorkcenters(response.getWriter(),
		 //EntityCsvMapper.getInstance().toCsdWorkcenters(wc, parts));
		
	
		 XSSFWorkbook workbook = new XSSFWorkbook();
	     XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
	     Object[][] datatypes = {
	             {"Datatype\t", "Type\t\t\t", "Size(in bytes)"},
	             {"int", "Primitive", 2},
	             {"float", "Primitive", 4},
	             {"double", "Primitive", 8},
	             {"char", "Primitive", 1},
	             {"String", "Non-Primitive", "No fixed size"}
	     };
	     sheet.setDefaultColumnWidth(40);
	     int rowNum = 0;
	     System.out.println("Creating excel");
	    
	     Header header = sheet.getHeader();
		
		for (int rn=0; rn<HEADER.length; rn++) {
		   Row r = sheet.createRow(rn);
		   r.createCell(0).setCellValue(HEADER[rn]);
		}
		
		
		for (WorkcenterPart wcpart : wc.getWcparts()) {
		    Row row = sheet.createRow(rowNum++);
		    int colNum = 0;
		    for (Object field : datatypes[0]) {
		        Cell cell = row.createCell(colNum++);
		        if (field instanceof String) {
		            cell.setCellValue((String) field);
		        } else if (field instanceof Integer) {
		            cell.setCellValue((Integer) field);
		        }
		    }
		}
		

	     try {
	         FileOutputStream outputStream = new FileOutputStream("totot.csv");//FILE_NAME);
	         workbook.write(outputStream);
	         workbook.close();
	     } catch (FileNotFoundException e) {
	         e.printStackTrace();
	     } catch (IOException e) {
	         e.printStackTrace();
	     }

	     System.out.println("Done");
	}
	
public void getCsvWorkcenter2(){
	
	
	 XSSFWorkbook workbook = new XSSFWorkbook();
     XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
     Object[][] datatypes = {
             {"Datatype\t", "Type\t\t\t", "Size(in bytes)"},
             {"int", "Primitive", 2},
             {"float", "Primitive", 4},
             {"double", "Primitive", 8},
             {"char", "Primitive", 1},
             {"String", "Non-Primitive", "No fixed size"}
     };
     sheet.setDefaultColumnWidth(40);
     int rowNum = 0;
     System.out.println("Creating excel");

     for (Object[] datatype : datatypes) {
         Row row = sheet.createRow(rowNum++);
         int colNum = 0;
         for (Object field : datatype) {
             Cell cell = row.createCell(colNum++);
             if (field instanceof String) {
                 cell.setCellValue((String) field);
             } else if (field instanceof Integer) {
                 cell.setCellValue((Integer) field);
             }
         }
     }

     try {
         FileOutputStream outputStream = new FileOutputStream("totot");//FILE_NAME);
         workbook.write(outputStream);
         workbook.close();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }

     System.out.println("Done");
	
	
}
	




@CrossOrigin
@RequestMapping(value = "/mbom/{wcId}/csd3", produces = "text/csv")
public void getCsvWorkcenter3(@PathVariable Long wcId, HttpServletResponse res) throws IOException {
	
System.out.println( "start ");
//res.setContentType("application/octet-stream");
res.setContentType("text/csv");
		res.setHeader("Content-Disposition", "attachment; filename=\"TSR1.csv\"");
		
try
{
// Write the header line
OutputStream o = res.getOutputStream();
String header = "DisplayName,Age\n";
o.write(header.getBytes());
// Write the data lines
Vector<String> records = getRecords(); // Custom to my app
Iterator<String> i = records.iterator();
StringBuffer line = new StringBuffer();
while(i.hasNext())
{
line.append(i.next());
}
o.write(line.toString().getBytes());
o.flush();
}catch(Exception e)
{
System.out.println(e);
}
}


private static Vector<String> getRecords()
{
Vector<String> v = new Vector<String>();
v.add("aaa,");
v.add("26\n");
v.add("bbb,");
v.add("29\n");
return v;
}*/
}














	


