package com.bombardier.macs.util.retriever;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.bombardier.macs.MacsException;
import com.bombardier.macs.json.model.Project;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;
import com.bombardier.sap.client.queryview.QueryViewData;
import com.bombardier.sap.client.queryview.QueryViewDataResponse;
import com.bombardier.sap.client.queryview.__QueryViewDataResponse_AxisData_Item;
import com.bombardier.sap.client.queryview.____QueryViewDataResponse_AxisData_Item_Set_Item;

/**
 * This class calls PI Webservice Client to obtain the list of projects and
 * parse the results as Project objects for application use.
 * 
 * @author jblaplace
 *
 */
public class SapProjectsRetriever extends SapClient {

	/**
	 * This fields match the Item.Chanm element from which the Item.Chavl values
	 * are retrieved that forms a project.
	 */
	private static final String ZC_PRJTID = "ZC_PRJTID";
	private static final String ZC_PROJTL = "ZC_PROJTL";
	private static final String ZC_PRJPA = "ZC_PRJPA";
	private static final String ZC_PRJMDL = "ZC_PRJMDL";
	private static final String ZC_PPSQNO = "ZC_PPSQNO";

	private static final String PROVIDER = "Z_MPRJECT";
	private static final String QUERY = "Z_MPRJECT_Q001";

	/**
	 * Makes call to PI endpoint. Configuration for endpoint URL, User name and
	 * password is stored in application server JNDI
	 * 
	 * @return
	 * @throws MacsException
	 */
	public static List<Project> getProjectList() throws MacsException {

		try {
			QueryViewData requestData = new QueryViewData();
			requestData.setInfoProvider(PROVIDER);
			requestData.setQuery(QUERY);

			QueryViewDataResponse response = makeQueryViewCall(requestData);
			return parseResponse(response);

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	/**
	 * Parse QueryViewDataResponse object to extract the projects information
	 * 
	 * @param response
	 * @return
	 */
	private static final List<Project> parseResponse(QueryViewDataResponse response) {
		HashMap<String, Project> tupleToProjectMap = new HashMap<String, Project>(1000);

		for (__QueryViewDataResponse_AxisData_Item axisData : response.getAxisData()) {
			Project currentProject = null;
			String tupleOrdinal = null;

			for (____QueryViewDataResponse_AxisData_Item_Set_Item axisDataSet : axisData.getSet()) {
				tupleOrdinal = axisDataSet.getTupleOrdinal();

				if (tupleOrdinal != null && !tupleOrdinal.isEmpty()) {
					currentProject = tupleToProjectMap.get(tupleOrdinal);

					if (currentProject == null) {
						currentProject = new Project();
						tupleToProjectMap.put(tupleOrdinal, currentProject);
					}
					try {
						switch (axisDataSet.getChanm()) {
						case ZC_PRJTID:
							currentProject.setId(Long.valueOf(axisDataSet.getChavl()));
							break;
						case ZC_PROJTL:
							currentProject.setTail(HelperClass.nullifyIfInvalid(axisDataSet.getCaption()));
							break;
						case ZC_PRJPA:
							currentProject.setPa(HelperClass.nullifyIfInvalid(axisDataSet.getCaption()));
							break;
						case ZC_PRJMDL:
							currentProject.setModel(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
							break;
						case ZC_PPSQNO:
							currentProject.setSqNo(HelperClass.nullifyIfInvalidTrimStart(axisDataSet.getChavl(), "0"));
							break;
						}
					} catch (NumberFormatException nfe) {
						/**
						 * This is not a valid project. Discard it from the
						 * result set. For example.. the cube will return
						 * "SUMME" as the project id or tail etc.. This seems to
						 * indicate the end of the result set.
						 */
						tupleToProjectMap.remove(tupleOrdinal);
						continue;
					}
				}
			}
		}

		/**
		 * Need to cleanup projects that have null ids...
		 */
		Project aPrj;
		String key;
		Iterator<String> keys = tupleToProjectMap.keySet().iterator();

		while (keys.hasNext()) {
			key = keys.next();
			aPrj = tupleToProjectMap.get(key);
			if (aPrj.getId() == null) {
				keys.remove();
			}
		}

		return new ArrayList<Project>(tupleToProjectMap.values());

	}
}
