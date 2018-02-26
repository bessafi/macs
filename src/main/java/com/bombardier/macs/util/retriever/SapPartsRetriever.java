package com.bombardier.macs.util.retriever;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bombardier.macs.Constants;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.json.model.PartLinks;
import com.bombardier.macs.json.model.PartStatus;
import com.bombardier.macs.json.model.PartStatusAssignment;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;
import com.bombardier.sap.client.queryview.QueryViewData;
import com.bombardier.sap.client.queryview.QueryViewDataResponse;
import com.bombardier.sap.client.queryview.__QueryViewDataResponse_AxisData_Item;
import com.bombardier.sap.client.queryview.__QueryViewData_Parameter_Item;
import com.bombardier.sap.client.queryview.____QueryViewDataResponse_AxisData_Item_Set_Item;

/**
 * This class calls PI Webservice Client to obtain the list of parts and parse
 * the results as Part objects for application use.
 * 
 * @author jblaplace
 *
 */
public class SapPartsRetriever extends SapClient {

	private static final String PROVIDER = "Z_MEBOM";
	private static final String QUERY = "Z_MEBOM_Q001";

	private static final String PARAM_PROJECT_ID = "ZV_PROJID_V001";
	private static final String PARAM_SECTOR = "ZV_SECTOR_V001";
	private static final String PARAM_SUBSECTOR = "ZV_SUBSECTOR_V001";

	// Returned values
	private static final String VAR_ALL_SECTOR = "AL"; // This is used to make
														// the call to get the
														// RAL
	private static final String VAR_ALL_SUBSECTOR = "ALL";// This is used to
															// make the call to
															// get the RAL

	private static final String VAL_PARTNUMBER = "ZC_LITMNO"; // Part number
	private static final String VAL_PART_ID = "ZC_LITMID"; // Internal Part ID
	private static final String VAL_PARTNUMBER_FULL = "ZC_REFMAT"; // Part
																	// number
	private static final String VAL_DESCRIPTION = "ZC_LITMDS"; // Description
	private static final String VAL_PARTTYPE = "ZC_LITMTY"; // Part type
	private static final String VAL_DRAWING_INTERNAL = "ZC_DPSID"; // Drawing
																	// Number,
	// internal id.
	private static final String VAL_REVISION_INTERNAL = "ZC_DPSREV"; // Drawing
																		// Revision
	private static final String VAL_DRAWING_AND_REVISION = "ZC_REVDPS"; // Drawing
																		// number
																		// +
	// revision
	private static final String VAL_STRING = "ZC_FSTRID"; // String
	private static final String VAL_PARENT_ID = "ZC_PUID"; // Parent ID
	private static final String VAL_MATERIAL_NO = "0MATERIAL";
	// private static final String VAL_PART_ID = "ZC_LITMID"; //Don't think it
	// will be used.
	private static final String VAL_PART_UNIQUE_ID = "ZC_UNID";
	private static final String VAL_DELETE = "ZC_DELETE";
	private static final String VAL_NUMBER_STATUS = "ZC_PTSTAT";
	private static final String VAL_DRAWING_STATUS = "ZC_DST";
	private static final String VAL_REVISION_STATUS = "ZC_DVST";
	private static final String VAL_AUTHORITY = "ZC_RVNUM";
	// private static final String VAL_AUTHORITY_DESCRIPTION = "ZC_RVTTL";
	private static final String VAL_AUTHORITY_DESCRIPTION = "ZC_AUTH";// this
																		// is
																		// the
																		// one
																		// we
																		// need
																		// to
																		// display

	public static List<Part> getPartList(String project, String sector, String subSector) throws MacsException {
		try {
			List<Part> returnedParts = new ArrayList<Part>();

			// Make call to get the RAL (based on project and AL, ALL)
			returnedParts.addAll(getPartListInternal(project, VAR_ALL_SECTOR, VAR_ALL_SUBSECTOR, true));

			// Make call to get the parent RAL (based on project, sector and
			// ALL)
			returnedParts.addAll(getPartListInternal(project, sector, VAR_ALL_SUBSECTOR, true));

			// Make call to get all parts for the specified project, sector and
			// subsector
			returnedParts.addAll(getPartListInternal(project, sector, subSector, false));

			return returnedParts;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	/**
	 * Method that sets up the filter parameters and make that call to PI.
	 * 
	 * @param project
	 * @param sector
	 * @param subSector
	 * @return
	 * @throws MacsException
	 */
	private static List<Part> getPartListInternal(String project, String sector, String subSector,
			boolean isInitialRequest) throws MacsException {
		try {
			List<Part> returnedParts = new ArrayList<Part>();

			QueryViewData requestData = new QueryViewData();
			requestData.setInfoProvider(PROVIDER);
			requestData.setQuery(QUERY);

			List<__QueryViewData_Parameter_Item> parametersList = new ArrayList<__QueryViewData_Parameter_Item>();

			parametersList.addAll(HelperClass.createQueryViewFilter(0, PARAM_PROJECT_ID, project));
			parametersList.addAll(HelperClass.createQueryViewFilter(1, PARAM_SECTOR, sector));
			parametersList.addAll(HelperClass.createQueryViewFilter(2, PARAM_SUBSECTOR, subSector));

			__QueryViewData_Parameter_Item[] parameters = new __QueryViewData_Parameter_Item[12];
			requestData.setParameter(parametersList.toArray(parameters));

			QueryViewDataResponse response = makeQueryViewCall(requestData);
			returnedParts.addAll(parseResponse(response, isInitialRequest));

			return returnedParts;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static String getParentOrNull(String parentId) {
		if (parentId != null) {
			try {
				Integer parent = Integer.valueOf(parentId);

				if (parent == 0) {
					return null;
				} else {
					return parentId;
				}
			} catch (NumberFormatException ex) {
				return parentId;
			}
		} else {
			return parentId;
		}
	}

	/**
	 * Methods that parses the response. A tupleordinal represents a row and
	 * columns are identified as being part of the same row because they have
	 * the "tupleordinal" value
	 * 
	 * @param response
	 * @return
	 */
	private static final List<Part> parseResponse(QueryViewDataResponse response, boolean isInitialRequest) {
		HashMap<String, Part> tupleToPartMap = new HashMap<String, Part>(1000);
		Set<String> rejects = new HashSet<String>();
		if (response.getAxisData() == null) {
			return new ArrayList<Part>();
		}

		for (__QueryViewDataResponse_AxisData_Item axisData : response.getAxisData()) {
			Part currentPart = null;
			String tupleOrdinal = null;

			if (axisData.getSet() != null) {
				for (____QueryViewDataResponse_AxisData_Item_Set_Item axisDataSet : axisData.getSet()) {
					tupleOrdinal = axisDataSet.getTupleOrdinal();
					// System.out.println("TUPLE_ORDINAL: " + tupleOrdinal);
					// System.out.println("FIELDS WE ARE GETTING: " +
					// axisDataSet.getChanm());
					if (tupleOrdinal != null && !tupleOrdinal.isEmpty() && !rejects.contains(tupleOrdinal)) {

						currentPart = tupleToPartMap.get(tupleOrdinal);

						if (currentPart == null) {
							currentPart = new Part();
							currentPart.setQty(Integer.valueOf(Constants.PI_PART_DEFAULT_QUANTITY)); /// TODO
																										/// parse
							/// from
							/// response
							/// once
							/// available.
							/// (Maybe
							/// custom logic
							/// will be
							/// required..
							/// tbd.
							tupleToPartMap.put(tupleOrdinal, currentPart);
						}

						// TODO validate if checkReject really needs to be
						// called at field level. We did it
						// this way based on the assumption that it is POSSIBLE
						// for a field we don't need
						// to contain SUMME while the required fields would not
						// and in this case we need
						// to accept the part. If it turns out this assumption
						// is
						// false then checkReject would
						// be called outside of the switch statement
						switch (axisDataSet.getChanm()) {
						case VAL_DESCRIPTION:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setDescription(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_PART_ID:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setInternalId(HelperClass.nullifyIfInvalid(axisDataSet.getChalExt()));
							break;
						case VAL_PARTNUMBER:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setNumberFallback(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_PARTNUMBER_FULL:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setNumber(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_DRAWING_AND_REVISION:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setDrawingAndRevision(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_DRAWING_INTERNAL:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setDrawingRef(HelperClass.nullifyIfInvalid(axisDataSet.getChalExt()));
							break;
						case VAL_REVISION_INTERNAL:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setRevisionRef(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_STRING:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setString(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_PARTTYPE:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setPartType(HelperClass.nullifyIfInvalid(axisDataSet.getChalExt()));
							break;
						case VAL_PARENT_ID:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart
									.setParentId(HelperClass.nullifyIfInvalid(getParentOrNull(axisDataSet.getChavl())));
							break;
						case VAL_PART_UNIQUE_ID:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setId(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_NUMBER_STATUS:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							setOrUpdatePartStatus(currentPart, HelperClass.nullifyIfInvalid(axisDataSet.getChavl()),
									axisDataSet.getChanm());
							break;
						case VAL_DRAWING_STATUS:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							setOrUpdatePartStatus(currentPart, HelperClass.nullifyIfInvalid(axisDataSet.getChavl()),
									axisDataSet.getChanm());
							break;
						case VAL_REVISION_STATUS:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							setOrUpdatePartStatus(currentPart, HelperClass.nullifyIfInvalid(axisDataSet.getChavl()),
									axisDataSet.getChanm());
							break;
						case VAL_AUTHORITY:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setAuthorityId(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_AUTHORITY_DESCRIPTION:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setAuthority(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_MATERIAL_NO:
							if (checkReject(rejects, tupleOrdinal, axisDataSet)) {
								break;
							}
							currentPart.setMaterialNo(HelperClass.nullifyIfInvalid(axisDataSet.getChalExt()));
							break;
						}
					}
				}
			}
		}

		/**
		 * Need to cleanup Parts that have SUMME or # ids...
		 */
		Part aPart;
		String key;
		Iterator<String> keys = tupleToPartMap.keySet().iterator();

		while (keys.hasNext()) {
			key = keys.next();
			aPart = tupleToPartMap.get(key);
			if (/*
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getAuthority()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getDescription())
				 * || Constants.SUMME_INVALID_DATA.equals(aPart.getDrawing()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getId()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getNumber()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getPartType()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getRevision()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getStatus()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getString()) ||
				 * Constants.SUMME_INVALID_DATA.equals(aPart.getStatus().
				 * getNumber().getAssignment())
				 */
			rejects.contains(key) || Constants.POUND_INVALID_DATA.equals(aPart.getId()) || aPart.getId() == null) {
				keys.remove();
			} else {
				if (aPart.getStatus() != null && aPart.getStatus().getNumber() != null) {
					String numberStatus = aPart.getStatus().getNumber().getAssignment();
					if (Constants.PART_WIP_IN_CAHIER_RELEASED_TO_SAP.equals(numberStatus)
							|| Constants.PART_WIP_IN_CAHIER_NOT_RELEASED_TO_SAP.equals(numberStatus)) {
						aPart.setQty(Integer.valueOf(Constants.PI_PART_DEFAULT_QUANTITY_IF_FULLY_CONSUMED)); // TODO
																												// validate
																												// this
																												// logic
																												// }
					}
					if (isInitialRequest || aPart.getNumber() == null) {
						aPart.setNumber(aPart.getNumberFallback());
					}

					PartLinks links = getPartLinks(aPart);
					aPart.setLinks(links);
				}
			}
		}

		return new ArrayList<Part>(tupleToPartMap.values());
	}

	private static PartLinks getPartLinks(Part aPart) {
		String number = aPart.getNumber() != null && aPart.getInternalId() != null
				? MessageFormat.format(Constants.macsProperties.getUrls().getNumber(), aPart.getInternalId()) : null;
		String string = aPart.getString() != null
				? MessageFormat.format(Constants.macsProperties.getUrls().getString(), aPart.getString()) : null;
		String drawing = aPart.getDrawing() != null ? Constants.macsProperties.getUrls().getDrawing() : null;
		String authority = aPart.getAuthority() != null && aPart.getAuthorityId() != null
				&& aPart.getInternalId() != null
						? MessageFormat.format(Constants.macsProperties.getUrls().getAuthority(), "icms",
								aPart.getInternalId())
						: null;
		PartLinks links = new PartLinks(number, string, drawing, authority);
		return links;
	}

	private static boolean checkReject(Set<String> rejects, String tupleOrdinal,
			____QueryViewDataResponse_AxisData_Item_Set_Item axisDataSet) {
		if (Constants.SUMME_INVALID_DATA.equals(axisDataSet.getChavl())
				|| Constants.SUMME_INVALID_DATA.equals(axisDataSet.getChalExt())) {
			rejects.add(tupleOrdinal);
			return true;
		}
		return false;
	}

	private static void setOrUpdatePartStatus(Part part, String status, String statusField) {
		String number, drawing, revision;
		String statusCode = computeStatusCode(status);
		switch (statusField) {
		case VAL_NUMBER_STATUS:
			if (part.getStatus() == null) {
				part.setStatus(new PartStatus(statusCode, null, null, null));
			} else {
				part.getStatus().setNumber(new PartStatusAssignment(statusCode));
			}
			break;
		case VAL_DRAWING_STATUS:
			if (part.getStatus() == null) {
				part.setStatus(new PartStatus(null, null, statusCode, null));
			} else {
				part.getStatus().setDrawing(new PartStatusAssignment(statusCode));
			}
			break;
		case VAL_REVISION_STATUS:
			if (part.getStatus() == null) {
				part.setStatus(new PartStatus(null, null, null, statusCode));
			} else {
				part.getStatus().setRevision(new PartStatusAssignment(statusCode));
			}
			break;
		default:
			break;
		}
	}

	// TODO might have to create status maps for each time for now using a
	// global one
	// default value to be updated/removed
	private static PartStatus getStatusFromPiResponse(String status) {
		PartStatus partStatus;
		String numberStatus = computeStatusCode(status);
		partStatus = new PartStatus(numberStatus, null, null, null);
		return partStatus;
	}

	private static String computeStatusCode(String status) {
		String itemStatus;
		Map<String, String> statusMap = Constants.partStatusPiToWipMap();
		if (status != null && !status.isEmpty() && statusMap.containsKey(status.trim().toUpperCase())) {
			itemStatus = statusMap.get(status.trim().toUpperCase()).trim();
		} else {
			itemStatus = Constants.PART_WIP_NOT_FULLY_CONSUMED;
		}
		return itemStatus;
	}

}
