package com.bombardier.macs.util.csv;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.CollectionUtils;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.json.model.CsdWorkcenter;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.WorkcenterPart;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;

public class EntityCsvMapper1 {

	private static EntityCsvMapper instance = null;

	public static EntityCsvMapper getInstance() {
		if (instance == null) {
			instance = new EntityCsvMapper();
		}
		return instance;
	}

	public void writeCsdWorkcenters(PrintWriter writer, List<CsdWorkcenter> wcs) {

		try {

			CustomMappingStrategy<CsdWorkcenter> mapStrategy = new CustomMappingStrategy();
			mapStrategy.setType(CsdWorkcenter.class);

			String[] columns = new String[] { "bomItemLevel", "qty", "partNumber", "partTitle", "edrnNieoRev",
					"installedBy", "toDwg", "dirReleaseDate", "dataSetType", "cageCode", "modSumNo", "materialGrp",
					"cahierId" };

			mapStrategy.setColumnMapping(columns);

			StatefulBeanToCsv btcsv = new StatefulBeanToCsvBuilder(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.withMappingStrategy(mapStrategy).withSeparator(';').build();

			btcsv.write(wcs);

		} catch (CsvException ex) {
			MacsLogger.error(this.getClass(), "Error mapping Bean to CSV" + ex);
		}
	}

	// To Remove
	public void buildCsvDocument(List<CsdWorkcenter> wcs, HttpServletResponse response) throws Exception {

		response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv\"");

		String[] header = { "Firstname", "LastName", "LastName", "JobTitle", "Company", "Address", "City", "Country",
				"PhoneNumber" };
		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

		csvWriter.writeHeader(header);

		for (CsdWorkcenter user : wcs) {
			csvWriter.write(user, header);
		}
		csvWriter.close();

	}

	public List<CsdWorkcenter> toCsdWorkcenters(com.bombardier.macs.model.Workcenter csdWc, List<String> cahierIds,
			List<MasterPart> parts, List<Part> piParts) {

		List<CsdWorkcenter> csdWcs = new ArrayList<CsdWorkcenter>();
		int bomItemLevel = 0;
		for (WorkcenterPart wcpart : csdWc.getWcparts()) {

			if (piParts == null) {
				bomItemLevel = calculateLevel(getMasterPart(wcpart.getId(), parts), 0, parts);
			} else {
				bomItemLevel = calculateLevel(getPart(wcpart.getId(), piParts), 0, piParts);
			}

			String cahierName = "";
			if (wcpart.getCahier() != null) {
				cahierName = wcpart.getCahier().getName();
			}


			CsdWorkcenter csd = new CsdWorkcenter(bomItemLevel, wcpart.getQty(), wcpart.getNumber(),
					wcpart.getDescription(), wcpart.getRevision(), "", false, "", "", cahierName, "", "", "");

			if (!CollectionUtils.isEmpty(cahierIds)) {
				for (String cahierId : cahierIds) {
					if (wcpart.getCahier() != null
							&& cahierId.equalsIgnoreCase(wcpart.getCahier().getId().toString())) {
						csdWcs.add(csd);
						break;
					}
				}
			} else {
				csdWcs.add(csd);
			}
		}

		return csdWcs;
	}

	public MasterPart getMasterPart(String id, List<MasterPart> parts) {
		for (MasterPart prt : parts) {
			String partId = id;
			if (partId.contains(".")) {
				int index = partId.indexOf(".");
				partId = partId.substring(index + 1);
			}
			if (partId.equals(prt.getId())) {
				return prt;
			}
		}
		return null;
	}

	private MasterPart getParentMasterPart(String id, List<MasterPart> parts) {
		for (MasterPart part : parts) {
			if (id.equals(part.getId())) {
				return part;
			}
		}
		return null;
	}

	public int calculateLevel(MasterPart part, int level, List<MasterPart> parts) {
		if (part == null)
			return level;
		if (part.getParentId() == null || part.getId() == part.getParentId())
			return level;
		else {
			MasterPart parent = getParentMasterPart(part.getParentId(), parts);
			return calculateLevel(parent, level + 1, parts);
		}
	}

	public Part getPart(String id, List<Part> parts) {
		for (Part prt : parts) {
			String partId = id;
			if (partId.contains(".")) {
				int index = partId.indexOf(".");
				partId = partId.substring(index + 1);
			}
			if (partId.equals(prt.getId())) {
				return prt;
			}
		}
		return null;
	}

	private Part getParentPart(String id, List<Part> parts) {
		for (Part part : parts) {
			if (id.equals(part.getId())) {
				return part;
			}
		}
		return null;
	}

	public int calculateLevel(Part part, int level, List<Part> parts) {
		if (part == null)
			return level;
		if (part.getParentId() == null || part.getId() == part.getParentId())
			return level;
		else {
			Part parent = getParentPart(part.getParentId(), parts);
			return calculateLevel(parent, level + 1, parts);
		}
	}

}