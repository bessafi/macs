package com.bombardier.macs.util.retriever;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.bombardier.macs.Constants;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.json.model.Jalon;
import com.bombardier.macs.json.model.WorkCenter;
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
public class SapWorkcenterRetriever extends SapClient {
	private static final String CSD = "CSD";
	private static final String PROVIDER = "Z_MWCJM";
	private static final String QUERY = "Z_MWCJM_Q001";

	//

	private static final String PARAM_PROJECT_ID = "ZV_PROJID_V001";
	private static final String PARAM_SECTOR = "ZV_SECTOR_V001";
	private static final String PARAM_SUBSECTOR = "ZV_SUBSECTOR_V001";

	// TODO validate parameter names
	// private static final String PARAM_SECTOR = "ZC_ZSECT";
	// private static final String PARAM_SUBSECTOR = "ZC_ZSUBS";
	// private static final String PARAM_PROJECT_ID = "ZC_PRJTID";

	// Returned values
	private static final String VAL_IS_ACTIVE = "ZC_ACTIVE";
	private static final String VAL_JALON_MAJEUR = "ZC_ZJAM";
	private static final String VAL_WORKCENTER_NAME = "0WORKCENTER";
	private static final String VAL_PLANT = "0PLANT";
	private static final String VAL_SOURCE = "ZC_SOURCE"; // Ex: BDI, SAP, UI
	private static final String VAL_STATUS = "ZC_STATUS"; // Ex: Max, CSD
															// created etc..
	private static final String VAL_DELETED = "ZC_DELETE"; // Ex: Y if delete. N
															// otherwise

	public static List<WorkCenter> getWorkcenterList(String project, String sector, String subSector)
			throws MacsException {
		try {
			QueryViewData requestData = new QueryViewData();
			requestData.setInfoProvider(PROVIDER);
			requestData.setQuery(QUERY);

			List<__QueryViewData_Parameter_Item> parametersList = new ArrayList<__QueryViewData_Parameter_Item>();
			parametersList.addAll(HelperClass.createQueryViewFilter(0, PARAM_SECTOR, sector));
			parametersList.addAll(HelperClass.createQueryViewFilter(1, PARAM_SUBSECTOR, subSector));

			__QueryViewData_Parameter_Item[] parameters = new __QueryViewData_Parameter_Item[8];
			requestData.setParameter(parametersList.toArray(parameters));

			QueryViewDataResponse response = makeQueryViewCall(requestData);
			return parseResponse(response);

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	private static final List<WorkCenter> parseResponse(QueryViewDataResponse response) {
		HashMap<String, WorkCenter> returnedToWorkcenterMap = new HashMap<String, WorkCenter>(25);
		HashMap<String, WorkCenter> tupleToWorkcenterMap = new HashMap<String, WorkCenter>(25);

		if (response.getAxisData() == null) {
			return new ArrayList<WorkCenter>();
		}

		for (__QueryViewDataResponse_AxisData_Item axisData : response.getAxisData()) {
			WorkCenter currentWorkcenter = null;
			String tupleOrdinal = null;

			if (axisData.getSet() != null) {
				for (____QueryViewDataResponse_AxisData_Item_Set_Item axisDataSet : axisData.getSet()) {
					tupleOrdinal = axisDataSet.getTupleOrdinal();

					if (tupleOrdinal != null && !tupleOrdinal.isEmpty()) {
						currentWorkcenter = tupleToWorkcenterMap.get(tupleOrdinal);

						if (currentWorkcenter == null) {
							currentWorkcenter = new WorkCenter();
							currentWorkcenter.setJalons(new HashSet<Jalon>());
							tupleToWorkcenterMap.put(tupleOrdinal, currentWorkcenter);
						}

						switch (axisDataSet.getChanm()) {
						case VAL_WORKCENTER_NAME:
							currentWorkcenter.setTitle(HelperClass.nullifyIfInvalid(axisDataSet.getChalExt()));
							currentWorkcenter.setNumber(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case VAL_SOURCE:
							currentWorkcenter.setIsCSD(CSD.equalsIgnoreCase(axisDataSet.getChavl()));
							break;
						case VAL_IS_ACTIVE:
							currentWorkcenter.setIsActive(!Constants.WORKCENTER_INACTIVE
									.equalsIgnoreCase(HelperClass.nullifyIfInvalid(axisDataSet.getChavl())));
							break;
						case VAL_JALON_MAJEUR:
							Jalon jalon = new Jalon();
							jalon.setTitle(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							currentWorkcenter.getJalons().add(jalon);
							break;
						}
					}
				}
			}
		}

		// Merge Workcenter that are the same (based on their title..)
		mergeWorkcenters(tupleToWorkcenterMap, returnedToWorkcenterMap);

		return new ArrayList<WorkCenter>(returnedToWorkcenterMap.values());
	}

	private static void mergeWorkcenters(HashMap<String, WorkCenter> tupleToWorkcenterMap,
			HashMap<String, WorkCenter> returnedToWorkcenterMap) {
		Iterator<String> keys = tupleToWorkcenterMap.keySet().iterator();
		WorkCenter aWorkCenter = null;
		String key;

		while (keys.hasNext()) {
			key = keys.next();
			aWorkCenter = tupleToWorkcenterMap.get(key);
			keys.remove();

			WorkCenter targetWorkcenter = returnedToWorkcenterMap.get(aWorkCenter.getTitle());
			if (targetWorkcenter == null) {
				returnedToWorkcenterMap.put(aWorkCenter.getTitle(), aWorkCenter);
			} else {
				targetWorkcenter.getJalons().addAll(aWorkCenter.getJalons());
			}
		}
	}

}
