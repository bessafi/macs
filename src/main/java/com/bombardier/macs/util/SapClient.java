package com.bombardier.macs.util;

import java.net.URL;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.bombardier.macs.Constants;
import com.bombardier.macs.Constants.MinimumCheckType;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.MacsLogger;
import com.bombardier.macs.PerformanceStart;
import com.bombardier.macs.json.model.CahierSuggestion;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.json.model.Project;
import com.bombardier.macs.util.retriever.SapCahierConfirmationRetriever;
import com.bombardier.macs.util.retriever.SapCahierSuggestionRetriever;
import com.bombardier.macs.util.retriever.SapMinimumCheckRetriever;
import com.bombardier.macs.util.retriever.SapPartsRetriever;
import com.bombardier.macs.util.retriever.SapProjectsRetriever;
import com.bombardier.macs.util.retriever.SapSectorSubSectorRetriever;
import com.bombardier.sap.client.cahier.Cahier;
import com.bombardier.sap.client.cahier.Cahier_Sync_OUTBindingStub;
import com.bombardier.sap.client.cahier.Entries;
import com.bombardier.sap.client.mbom.MBom;
import com.bombardier.sap.client.mbom.MBomResponse;
import com.bombardier.sap.client.mbom.MBom_Sync_OUTBindingStub;
import com.bombardier.sap.client.minimumcheck.BomMinimumCheck;
import com.bombardier.sap.client.minimumcheck.MaterialMinimumCheck;
import com.bombardier.sap.client.minimumcheck.MinimumCheckResponse;
import com.bombardier.sap.client.minimumcheck.MinimumCheck_Sync_OUTBindingStub;
import com.bombardier.sap.client.minimumcheck.ObjectDependenciesMinimumCheck;
import com.bombardier.sap.client.minimumcheck.RoutingMinimumCheck;
import com.bombardier.sap.client.queryview.QueryViewData;
import com.bombardier.sap.client.queryview.QueryViewDataResponse;
import com.bombardier.sap.client.queryview.QueryViewData_Sync_OUTBindingStub;

public class SapClient {
	protected static final String PI_USERNAME_JNDI = "cell/persistent/macs.pi.user.name";
	protected static final String PI_USERPASSWORD_JNDI = "cell/persistent/macs.pi.user.password";
	protected static final String PI_QUERYVIEW_URL_JNDI = "cell/persistent/macs.pi.url.queryview";
	protected static final String PI_CAHIERSYNC_URL_JNDI = "cell/persistent/macs.pi.url.cahiersync";
	protected static final String PI_MINIMUMCHECK_URL_JNDI = "cell/persistent/macs.pi.url.minimumcheck";
	protected static final String PI_MBOM_URL_JNDI = "cell/persistent/macs.pi.url.mbom";

	/**
	 * 
	 * @param project
	 * @param sector
	 * @param subSector
	 * @return list of Parts for the specific project, sector, subsector
	 * @throws MacsException
	 */
	public static List<Part> getPartList(String project, String sector, String subSector) throws MacsException {
		return SapPartsRetriever.getPartList(project, sector, subSector);
	}

	/**
	 * 
	 * @return a list of sector (that includes its subsectors
	 * @throws MacsException
	 */
	public static List<Sector> getSectors() throws MacsException {
		return SapSectorSubSectorRetriever.getSectors();
	}

	/**
	 * 
	 * @return a Collection of project
	 * @throws MacsException
	 */
	public static List<Project> getProjectList() throws MacsException {
		return SapProjectsRetriever.getProjectList();
	}

	/**
	 * 
	 * @param cahier
	 * @return success status of confirmation
	 * @throws MacsException
	 */
	public static boolean getCahierConfirmation(com.bombardier.macs.model.Cahier cahier) throws MacsException {
		return SapCahierConfirmationRetriever.getCahierConfirmation(cahier);
	}

	public static List<CahierSuggestion> getCahierSuggestion(com.bombardier.macs.model.Cahier cahier)
			throws MacsException {
		return SapCahierSuggestionRetriever.getCahierSuggestion(cahier);
	}

	public static boolean getCahierMinimumCheck(com.bombardier.macs.model.Cahier cahier,
			MinimumCheckType minimumCheckType) throws MacsException {
		return SapMinimumCheckRetriever.getCahierMinimumCheck(cahier, minimumCheckType);
	}

	protected static final InitialContext getInitialContext() throws NamingException {
		return new InitialContext();
	}

	protected static String getJNDIValue(final String jndi) throws NamingException {
		String value = null;
		InitialContext ctx = null;
		try {
			ctx = getInitialContext();
			value = (String) ctx.lookup(jndi);
		} catch (NamingException ne) {
			throw new NamingException("Failed to load JNDI property : " + jndi);
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}

		return value;
	}

	/**
	 * Makes WS call to PI endpoint. Makes call to PI endpoint. Configuration
	 * for endpoint URL, User name and password is stored in application server
	 * JNDI
	 * 
	 * @param requestData
	 * @return
	 * @throws MacsException
	 */
	protected static QueryViewDataResponse makeQueryViewCall(QueryViewData requestData) throws MacsException {

		try {
			String username = getJNDIValue(PI_USERNAME_JNDI);
			String userpassword = getJNDIValue(PI_USERPASSWORD_JNDI);
			String endpointURL = getJNDIValue(PI_QUERYVIEW_URL_JNDI);

			PerformanceStart start = MacsLogger.getPerformanceStart(SapClient.class,
					"PI call to " + endpointURL + " query " + requestData.getQuery());

			QueryViewData_Sync_OUTBindingStub stub = new QueryViewData_Sync_OUTBindingStub(new URL(endpointURL), null);
			stub.setUsername(username);
			stub.setPassword(userpassword);

			QueryViewDataResponse response = stub.retrieve(requestData);

			MacsLogger.performanceEnd(start);

			return response;

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().toUpperCase().replaceAll("\r\n", "")
					.contains(Constants.PI_ERROR_NO_APPLICABLE_DATA)) {
				// if no applicable data, return empty response
				return new QueryViewDataResponse();
			}
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	protected static MBomResponse makeMbomCall(MBom requestData) throws MacsException {

		try {
			String username = getJNDIValue(PI_USERNAME_JNDI);
			String userpassword = getJNDIValue(PI_USERPASSWORD_JNDI);
			String endpointURL = getJNDIValue(PI_MBOM_URL_JNDI);

			PerformanceStart start = MacsLogger.getPerformanceStart(SapClient.class,
					"PI call to " + endpointURL + "FAI " + requestData.getJobRole());

			MBom_Sync_OUTBindingStub stub = new MBom_Sync_OUTBindingStub(new URL(endpointURL), null);
			stub.setUsername(username);
			stub.setPassword(userpassword);

			MBomResponse response = stub.compareCahier(requestData);

			MacsLogger.performanceEnd(start);

			return response;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	protected static Entries[] makeCahierCall(Cahier requestData) throws MacsException {

		try {
			String username = getJNDIValue(PI_USERNAME_JNDI);
			String userpassword = getJNDIValue(PI_USERPASSWORD_JNDI);
			String endpointURL = getJNDIValue(PI_CAHIERSYNC_URL_JNDI);

			PerformanceStart start = MacsLogger.getPerformanceStart(SapClient.class,
					"PI call to " + endpointURL + " Material No " + requestData.getHeader().getMaterialNumber());

			Cahier_Sync_OUTBindingStub stub = new Cahier_Sync_OUTBindingStub(new URL(endpointURL), null);
			stub.setUsername(username);
			stub.setPassword(userpassword);

			Entries[] response = stub.maintain(requestData);

			MacsLogger.performanceEnd(start);

			return response;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	protected static MinimumCheckResponse makeMinimumCheckCall(MaterialMinimumCheck requestData) throws MacsException {

		try {
			String username = getJNDIValue(PI_USERNAME_JNDI);
			String userpassword = getJNDIValue(PI_USERPASSWORD_JNDI);
			String endpointURL = getJNDIValue(PI_MINIMUMCHECK_URL_JNDI);

			PerformanceStart start = MacsLogger.getPerformanceStart(SapClient.class,
					"PI call to " + endpointURL + " Material No " + requestData.getMaterialNbr());

			MinimumCheck_Sync_OUTBindingStub stub = new MinimumCheck_Sync_OUTBindingStub(new URL(endpointURL), null);
			stub.setUsername(username);
			stub.setPassword(userpassword);

			MinimumCheckResponse response = stub.checkMaterial(requestData);

			MacsLogger.performanceEnd(start);

			return response;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	protected static MinimumCheckResponse makeMinimumCheckCall(BomMinimumCheck requestData) throws MacsException {

		try {
			String username = getJNDIValue(PI_USERNAME_JNDI);
			String userpassword = getJNDIValue(PI_USERPASSWORD_JNDI);
			String endpointURL = getJNDIValue(PI_MINIMUMCHECK_URL_JNDI);

			PerformanceStart start = MacsLogger.getPerformanceStart(SapClient.class,
					"PI call to " + endpointURL + " Material No " + requestData.getMaterialNbr());

			MinimumCheck_Sync_OUTBindingStub stub = new MinimumCheck_Sync_OUTBindingStub(new URL(endpointURL), null);
			stub.setUsername(username);
			stub.setPassword(userpassword);

			MinimumCheckResponse response = stub.checkBOM(requestData);

			MacsLogger.performanceEnd(start);

			return response;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	protected static MinimumCheckResponse makeMinimumCheckCall(ObjectDependenciesMinimumCheck requestData)
			throws MacsException {

		try {
			String username = getJNDIValue(PI_USERNAME_JNDI);
			String userpassword = getJNDIValue(PI_USERPASSWORD_JNDI);
			String endpointURL = getJNDIValue(PI_MINIMUMCHECK_URL_JNDI);

			PerformanceStart start = MacsLogger.getPerformanceStart(SapClient.class,
					"PI call to " + endpointURL + " Material No " + requestData.getMaterialNbr());

			MinimumCheck_Sync_OUTBindingStub stub = new MinimumCheck_Sync_OUTBindingStub(new URL(endpointURL), null);
			stub.setUsername(username);
			stub.setPassword(userpassword);

			MinimumCheckResponse response = stub.checkOD(requestData);

			MacsLogger.performanceEnd(start);

			return response;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}

	protected static MinimumCheckResponse makeMinimumCheckCall(RoutingMinimumCheck requestData) throws MacsException {

		try {
			String username = getJNDIValue(PI_USERNAME_JNDI);
			String userpassword = getJNDIValue(PI_USERPASSWORD_JNDI);
			String endpointURL = getJNDIValue(PI_MINIMUMCHECK_URL_JNDI);

			PerformanceStart start = MacsLogger.getPerformanceStart(SapClient.class,
					"PI call to " + endpointURL + " Material No " + requestData.getMaterialNbr());

			MinimumCheck_Sync_OUTBindingStub stub = new MinimumCheck_Sync_OUTBindingStub(new URL(endpointURL), null);
			stub.setUsername(username);
			stub.setPassword(userpassword);

			MinimumCheckResponse response = stub.checkRouting(requestData);

			MacsLogger.performanceEnd(start);

			return response;

		} catch (Exception e) {
			MacsException me = new MacsException(e);
			throw me;
		}
	}
}
