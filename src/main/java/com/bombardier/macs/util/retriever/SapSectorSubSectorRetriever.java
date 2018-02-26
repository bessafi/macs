package com.bombardier.macs.util.retriever;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bombardier.macs.Constants;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.json.model.SubSector;
import com.bombardier.macs.util.HelperClass;
import com.bombardier.macs.util.SapClient;
import com.bombardier.macs.util.Sector;
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
public class SapSectorSubSectorRetriever extends SapClient {

	/**
	 * This fields match the Item.Chanm element from which the Item.Chavl values
	 * are retrieved that forms a project.
	 */
	private static final String ZC_ZSECT = "ZC_ZSECT";
	private static final String ZC_ZSUBS = "ZC_ZSUBS";

	private static final String PROVIDER = "Z_MPRSEC";
	private static final String QUERY = "Z_MPRSEC_Q002";

	/**
	 * Makes call to PI endpoint. Configuration for endpoint URL, User name and
	 * password is stored in application server JNDI
	 * 
	 * @return SectorSubsectorLists that contains the list of sectors and the
	 *         list of subsector
	 * @throws MacsException
	 */
	public static List<Sector> getSectors() throws MacsException {

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
	 * Parse QueryViewDataResponse object to extract the Sector and its
	 * subsectors
	 * 
	 * @param response
	 * @return
	 */
	public static final List<Sector> parseResponse(QueryViewDataResponse response) {
		HashMap<String, Sector> sectorMap = new HashMap<String, Sector>(10); // Stores
																				// the
																				// sectors
																				// by
																				// their
																				// Chavl;

		Sector currentSector = null;

		for (__QueryViewDataResponse_AxisData_Item axisData : response.getAxisData()) {
			for (____QueryViewDataResponse_AxisData_Item_Set_Item axisDataSet : axisData.getSet()) {
				switch (axisDataSet.getChanm()) {
				case ZC_ZSECT:
					currentSector = addIfNotExistSector(axisDataSet, sectorMap);
					break;
				case ZC_ZSUBS:
					addSubSector(axisDataSet, currentSector);
					break;
				}
			}
		}

		for (Sector sector : sectorMap.values()) {
			MacsLogger.debug(SapSectorSubSectorRetriever.class,
					sector.getId() + " [" + sector.getSubSectors().size() + "]");

			for (SubSector sub : sector.getSubSectors()) {
				MacsLogger.debug(SapSectorSubSectorRetriever.class, "\t" + sub.getId() + " " + sub.getTitleEn());
			}
		}

		return new ArrayList<Sector>(sectorMap.values());
	}

	private static void addSubSector(____QueryViewDataResponse_AxisData_Item_Set_Item axisDataSet, Sector sector) {
		if (sector != null) {
			SubSector sub = new SubSector();
			sub.setSectorId(HelperClass.nullifyIfInvalid(sector.getId()));
			sub.setId(HelperClass.nullifyIfInvalid(axisDataSet.getChavl()));
			sub.setTitleFr(HelperClass.nullifyIfInvalid(axisDataSet.getCaption()));
			sub.setTitleEn(HelperClass.nullifyIfInvalid(axisDataSet.getCaption()));

			if (!Constants.SUMME_INVALID_DATA.equals(sub.getId()) && sub.getId() != null) {
				sector.getSubSectors().add(sub);
			}
		} else {
			String subTmp = axisDataSet.getChavl();
			if (!Constants.SUMME_INVALID_DATA.equals(subTmp)) {
				String subsectorInfo = axisDataSet.getCaption() + " [" + subTmp + "]";
				MacsLogger.error(SapSectorSubSectorRetriever.class,
						"Trying to add an orphan subsector. Sector was not detected first: " + subsectorInfo);
			}
		}
	}

	private static Sector addIfNotExistSector(____QueryViewDataResponse_AxisData_Item_Set_Item axisDataSet,
			HashMap<String, Sector> sectorMap) {
		String sectorId = HelperClass.nullifyIfInvalid(axisDataSet.getChavl());

		if (!Constants.SUMME_INVALID_DATA.equals(sectorId) && sectorId != null) {
			Sector sector = sectorMap.get(sectorId);

			if (sector == null) {
				sector = new Sector();
				sector.setId(sectorId);
				sector.setTitleEn(HelperClass.nullifyIfInvalid(axisDataSet.getCaption()));
				sector.setTitleFr(HelperClass.nullifyIfInvalid(axisDataSet.getCaption()));
				sectorMap.put(sector.getId(), sector);
			}

			return sector;

		} else {
			return null;
		}
	}
}
