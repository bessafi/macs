package com.bombardier.macs;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bombardier.macs.cache.MacsObjectCache;
import com.bombardier.macs.config.MacsProperties;
import com.bombardier.macs.json.model.CahierFields;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.service.MacsCahierService;
import com.bombardier.macs.service.MacsPartService;
import com.bombardier.macs.service.MacsWorkcenterService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.websphere.cache.DistributedMap;

@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.ibm.ws.amm.scan.util.*"))
@EnableScheduling
public class SpringBootMacsApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private MacsPartService partserviceImpl;
	@Autowired
	private MacsWorkcenterService wcserviceImpl;
	@Autowired
	private MacsCahierService cahierserviceImpl;

	@Autowired
	private MacsProperties macsProperties;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootMacsApplication.class);
	}

	/**
	 * This methods refreshes the Workspace object in the cache. The Workspsace
	 * object contains the list of Project, Sector and Subsector. Cache is
	 * refreshed every 15mn. Could really be once a day if required.
	 */
	// TODO decide how to go about refreshing, for now refreshing the same for
	// all calls
	// @Scheduled(initialDelay = 1000*20, fixedRate = 1000*60*15)
	/*
	 * public void refreshWorkspaces() { try { Workspace workspace =
	 * partserviceImpl.getWorkspace(); DistributedMap cache =
	 * MacsObjectCache.getCacheMap();
	 * 
	 * if (cache != null) { cache.put(Constants.WORKSPACE_CACHE_KEY, workspace);
	 * }
	 * 
	 * MacsLogger.info(this.getClass(), "Refreshed Workspace in cache.");
	 * 
	 * } catch(MacsException me) { MacsLogger.error(this.getClass()
	 * ,"Failed to cache workspace data on schedule.", me); } }
	 */

	@Override
	public void run(String... args) throws Exception {
		cleanUpObjectCache();
		// loadDataFromJson();
		// deleteAll();
		// saveData();
		setProperties();
		// showAll();
	}

	private void setProperties() {
		if (macsProperties != null) {
			Constants.macsProperties.setUrls(macsProperties.getUrls());
		}
	}

	private void cleanUpObjectCache() {
		try {
			DistributedMap cache = MacsObjectCache.getCacheMap();

			if (cache != null) {
				// cache.remove(Constants.WORKSPACE_CACHE_KEY);
				// TODO make a decision about how to behave here, currently
				// clearing all cache on application startup
				cache.clear();
			}
		} catch (MacsException me) {

		}

	}

	public void loadDataFromJson() {
		List<MasterPart> masterparts = partserviceImpl.getAllMasterPart();
		if (masterparts == null || masterparts.size() == 0) {
			System.out.println("===============load json data  .===============");
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Part>> mapType = new TypeReference<List<Part>>() {
			};
			InputStream is = TypeReference.class.getResourceAsStream("/ebom2.json");
			try {
				List<Part> partList = mapper.readValue(is, mapType);
				// stateRepository.save(stateList);
				System.out.println("States list saved successfully" + partList);
				for (Part part : partList) {

					partserviceImpl.saveMasterPart(part);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void deleteAll() {
		System.out.println("===============Delete All ===============");
		// partserviceImpl.deleteAllParts();
		// cahierserviceImpl.deleteAllCahiers();
		// wcserviceImpl.deleteAllWorkcenters();

	}

	private Workcenter saveOrupdate(Workcenter wc, Long prjid, Long sectid, Long subsectid) {
		List<Workcenter> wcs = wcserviceImpl.getAllWorkcenters();
		if (wcs == null || wcs.size() == 0) {
			wc = wcserviceImpl.saveWc(wc);
			return wc;
		} else {
			for (Workcenter wcenter : wcs) {
				if (wcenter.getProjectId().equals(prjid.toString()) && wcenter.getSectorId().equals(sectid)
						&& wcenter.getSubSectorId().equals(subsectid))
					return wcenter;
			}

			wc = wcserviceImpl.saveWc(wc);
			return wc;
		}

	}

	private Cahier saveOrGet(Cahier cahier, Workcenter wc) {
		List<Cahier> cahiers = cahierserviceImpl.getAllCahiers();
		if (cahiers == null || cahiers.size() == 0) {
			cahier = cahierserviceImpl.saveCahier(cahier);
			return cahier;
		} else {
			for (Cahier cah : cahiers) {
				if (cah.getName().equals(cahier.getName()) && cah.getNumber().equals(cahier.getNumber()))
					return cah;
			}

			cahier = cahierserviceImpl.saveCahier(cahier);
			return cahier;
		}

	}

	public void saveData() {

		System.out.println("===============Storing Project===============");

		Workcenter wc = null, wc1 = null, wc2 = null;
		Cahier cahier = null;

		if (wcserviceImpl.getAllWorkcenters() == null || wcserviceImpl.getAllWorkcenters().size() == 0) {
			wc = new Workcenter("1000", "workcenter1000", "1000", "1000", "1000", null, null, null);
			wc = saveOrupdate(wc, 1000L, 1000L, 1000L);

			wc1 = new Workcenter("2000", "workcenter2000", "1000", "1000", "2000", null, null, null);
			wc1 = saveOrupdate(wc1, 1000L, 1000L, 2000L);

			wc2 = new Workcenter("3000", "workcenter3000", "1000", "2000", "2000", null, null, null);
			wc2 = saveOrupdate(wc2, 1000L, 2000L, 2000L);

			cahier = new Cahier("cahier1", "1000", null, "", "duration", "effec", 1L, 1L, 1L, 1L, true, true, true,
					true, 111L, 11L, 101L, 120L, 123L, true, true, true, null, null, null, null, wc2, null, null);
			cahier = saveOrGet(cahier, wc2);
		}
		com.bombardier.macs.json.model.CahierInformation cahierInfo = new com.bombardier.macs.json.model.CahierInformation(
				null, // id
				"cafier one", // description
				"cahier Duration", // cahierduration
				"cahier effectivity", // effectivity
				12L, // typeId
				122L, 11L, // SecondaryJobType
				10L, // SecondaryJobTypeqty
				true, // fromboard
				true, // pva
				true, // wirecut
				true);

		CahierFields cahierfield = new CahierFields(1L, 11L, 1L, 1L, 10L, true, true, true);
		com.bombardier.macs.json.model.Cahier cah1 = new com.bombardier.macs.json.model.Cahier(null, "", "2000", null,
				cahierInfo, cahierfield, null);
		List<com.bombardier.macs.json.model.Cahier> bodycahiers = new ArrayList<com.bombardier.macs.json.model.Cahier>();
		bodycahiers.add(cah1);
		if (cahierserviceImpl.getAllCahiers().isEmpty()) {
			cahierserviceImpl.createCahiersByProjectSector("1000", "1000", bodycahiers);
		}
	}

	public void showAll(MasterPart p) {
		System.out.println("===============Show All Customers' Info===============");

	}

}
