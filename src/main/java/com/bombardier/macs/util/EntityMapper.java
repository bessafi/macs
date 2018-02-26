package com.bombardier.macs.util;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.util.CollectionUtils;

import com.bombardier.macs.Constants;
import com.bombardier.macs.MacsException;
import com.bombardier.macs.cache.CacheItem;
import com.bombardier.macs.cache.MacsObjectCache;
import com.bombardier.macs.json.model.CahierComponentField;
import com.bombardier.macs.json.model.CahierFieldFlag;
import com.bombardier.macs.json.model.CahierHistoryData;
import com.bombardier.macs.json.model.CahierHistoryDataDrawing;
import com.bombardier.macs.json.model.CahierHistoryDataTool;
import com.bombardier.macs.json.model.CahierHistoryDataWcPart;
import com.bombardier.macs.json.model.CahierHistoryUpdatedField;
import com.bombardier.macs.json.model.CahierRouting;
import com.bombardier.macs.json.model.Drawing;
import com.bombardier.macs.json.model.Part;
import com.bombardier.macs.json.model.PartCreatedField;
import com.bombardier.macs.json.model.PartLinks;
import com.bombardier.macs.json.model.PartModifiedField;
import com.bombardier.macs.json.model.PartStatus;
import com.bombardier.macs.json.model.Tool;
import com.bombardier.macs.json.model.WorkCenter;
import com.bombardier.macs.json.model.WorkCenterCahier;
import com.bombardier.macs.json.model.WorkCenterPart;
import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.CahierAction;
import com.bombardier.macs.model.CahierDrawing;
import com.bombardier.macs.model.CahierHistory;
import com.bombardier.macs.model.CahierTool;
import com.bombardier.macs.model.CahierUpdatedPart;
import com.bombardier.macs.model.Jalon;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.PartType;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.model.WorkcenterPart;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class EntityMapper {

	private static EntityMapper instance = null;

	public static EntityMapper getInstance() {
		if (instance == null) {
			instance = new EntityMapper();
		}
		return instance;
	}

	public Part toJsonPart(com.bombardier.macs.model.WorkcenterPart part) {

		// System.out.println("" + part.getId() + "<<>>" + part.getChildren());

		PartStatus status = toJsonPartStatus(part);
		PartLinks links = new PartLinks(part.getLnkNbrRclk(), part.getLnkStrRclk(), part.getLnkDrwRclk(),
				part.getLnkRevRclk());
		String parentId = part.getParentid();

		String partId = part.getId();
		if (partId.contains(".")) {
			int index = partId.indexOf(".");
			partId = partId.substring(index + 1);
		}
		Part jsonPart = new Part(partId, part.getNumber(), parentId, part.getQty(), part.getString(),
				part.getDescription(), part.getDrawing(), part.getRevision(), part.getAuthority(), status, links);
		return jsonPart;
	}

	public PartStatus toJsonPartStatus(com.bombardier.macs.model.WorkcenterPart part) {
		return new PartStatus(part.getStatusNbrAssgn(), part.getStatusStrAssgn(), part.getStatusDrwAssgn(),
				part.getStatusRevAssgn());
	}

	public Part toJsonPartFromMasterPart(com.bombardier.macs.model.MasterPart part) {

		String statrev = part.getStatusRevAssgn(), statstr = part.getStatusStrAssgn(),
				statnbr = part.getStatusNbrAssgn(), statdrw = part.getStatusStrAssgn();
		if (part.getWip_statusDrwAssgn() != null && !part.getWip_statusDrwAssgn().isEmpty()) {
			statdrw = part.getWip_statusDrwAssgn();
		}
		if (part.getWip_statusNbrAssgn() != null && !part.getWip_statusNbrAssgn().isEmpty()) {
			statnbr = part.getWip_statusNbrAssgn();
		}
		if (part.getWip_statusStrAssgn() != null && !part.getWip_statusStrAssgn().isEmpty()) {
			statstr = part.getWip_statusStrAssgn();
		}
		if (part.getWip_statusRevAssgn() != null && !part.getWip_statusRevAssgn().isEmpty()) {
			statrev = part.getWip_statusRevAssgn();
		}
		PartStatus status = new PartStatus(statnbr, statstr, statdrw, statrev);

		PartLinks links = new PartLinks(part.getLnkNbrRclk(), part.getLnkStrRclk(), part.getLnkDrwRclk(),
				part.getLnkRevRclk());
		String partId = part.getId();
		Integer qtt = part.getQty();
		if (part.getWip_Qty() != null) {
			qtt = qtt - part.getWip_Qty();
		}
		Part jsonPart = new Part(partId, part.getNumber(), part.getParentId(), qtt, part.getString(),
				part.getDescription(), part.getDrawing(), part.getRevision(), part.getAuthority(), status, links);
		return jsonPart;
	}

	public WorkCenter toJsonWorkcenter(com.bombardier.macs.model.Workcenter wc) {
		WorkCenter jsonwc = new WorkCenter();
		jsonwc.setId(wc.getId());
		jsonwc.setTitle(wc.getTitle());
		jsonwc.setParts(toJsonWcParts(wc.getWcparts()));

		// added this to prevent same cahier from appearing in both workcenter
		// and jalon cahiers
		if (wc.getWccahiers() != null && !wc.getWccahiers().isEmpty()) {
			jsonwc.setCahiers(toJsonWcCahiers(
					wc.getWccahiers().stream().filter(c -> c.getJalon() == null).collect(Collectors.toSet())));
		}

		jsonwc.setJalons(toJsonWcJalons(wc.getJalons()));
		if (wc.getCsd() != null) {
			jsonwc.setIsCSD(wc.getCsd());
		}

		if (wc.getActive() != null) {
			jsonwc.setIsActive(wc.getActive());
		}

		return jsonwc;
	}

	public List<WorkCenterPart> toJsonWcParts1(Set<com.bombardier.macs.model.WorkcenterPart> parts) {

		List<WorkcenterPart> partslist = parts.stream().sorted(Comparator.comparing(WorkcenterPart::getId))
				.collect(Collectors.toList());
		List<WorkcenterPart> sortedParts = sortPartsParentChildren(partslist);

		List<WorkCenterPart> jsonparts = new ArrayList<>();
		for (com.bombardier.macs.model.WorkcenterPart part : sortedParts) {
			WorkCenterPart jsonPart = new WorkCenterPart();
			// Add only not assigned parts sorted
			if (part.getCahier() == null) {
				String partId = getId(part.getId());
				jsonPart.setId(partId);
				jsonPart.setQty(part.getQty());
				if (part.getParent() == null) {
					jsonPart.setParentId(partId);
				} else {
					String parentId = getId(part.getParent().getId());
					jsonPart.setParentId(parentId);
				}
				jsonparts.add(jsonPart);
			}
		}
		return jsonparts;
	}

	public List<WorkCenterPart> toJsonWcParts(Set<com.bombardier.macs.model.WorkcenterPart> parts) {

		List<WorkcenterPart> partslist = parts.stream().sorted(Comparator.comparing(WorkcenterPart::getId))
				.collect(Collectors.toList());
		// List<WorkcenterPart> sortedParts= sortPartsParentChildren(partslist);

		List<WorkCenterPart> jsonparts = new ArrayList<>();
		for (com.bombardier.macs.model.WorkcenterPart part : partslist) {
			WorkCenterPart jsonPart = new WorkCenterPart();
			// Add only not assigned parts sorted
			if (part.getCahier() == null) {
				boolean isCreatedPart = isCreatedPart(getPartTypeValue(part));

				if (!CollectionUtils.isEmpty(part.getUpdatedParts())) {
					Set<CahierUpdatedPart> cahierUpdatedParts = part.getUpdatedParts();
					for (CahierUpdatedPart updatedPart : cahierUpdatedParts) {
						jsonPart.getModifiedFields().getDescriptionHistory().add(updatedPart.getDescription());
						jsonPart.getModifiedFields().getNumberHistory().add(updatedPart.getNumber());
						jsonPart.getModifiedFields().getDrawingHistory().add(updatedPart.getDrawing());
						jsonPart.getModifiedFields().getRevisionHistory()
								.add(String.valueOf(updatedPart.getRevision()));
						jsonPart.getModifiedFields().getQtyHistory().add(updatedPart.getQty());
					}

				} else {
					jsonPart.setModifiedFields(null);
				}

				if (isCreatedPart) {
					PartCreatedField pcf = new PartCreatedField();
					pcf.setNumber(part.getNumber());
					pcf.setDescription(part.getDescription());
					pcf.setRevision(part.getRevision());
					pcf.setDrawing(part.getDrawing());
					pcf.setQty(part.getQty());
					jsonPart.setCreatedFields(pcf);
				} else {
					jsonPart.setCreatedFields(null);
				}
				String partId = getId(part.getId());
				jsonPart.setId(partId);
				jsonPart.setQty(part.getQty());
				if (part.getParent() == null) {
					// jsonPart.setParentId(partId);
					jsonPart.setParentId(null);
				} else {
					String parentId = getId(part.getParent().getId());
					jsonPart.setParentId(parentId);
				}
				// jsonPart.setChildren(addChildren(part.getChildren()));
				jsonparts.add(jsonPart);
			}
		}

		return getParentChildrenList(jsonparts);
	}

	public List<WorkCenterPart> getParentChildrenList(List<WorkCenterPart> jsonparts) {

		Map<String, WorkCenterPart> hmParts = new HashMap<>();

		Set<String> exclusionList = new HashSet<String>();

		for (WorkCenterPart p : jsonparts) {
			hmParts.put(p.getId(), p);
		}

		// populate a Map
		for (Map.Entry<String, WorkCenterPart> hmPartEntry : hmParts.entrySet()) {

			String currentId = hmPartEntry.getKey();
			WorkCenterPart currentPart = hmPartEntry.getValue();
			WorkCenterPart parent;

			if (currentPart.getParentId() != null) {
				if (!currentPart.getParentId().equalsIgnoreCase(currentId)
						&& hmParts.containsKey(currentPart.getParentId())) {
					parent = hmParts.get(currentPart.getParentId());
					parent.addChildrenItem(currentPart);
					exclusionList.add(currentId);
				}
			}

		}

		// Get the root
		List<WorkCenterPart> partParentChildList = new ArrayList<WorkCenterPart>();

		for (Map.Entry<String, WorkCenterPart> hmPartEntry : hmParts.entrySet()) {
			if (!exclusionList.contains(hmPartEntry.getKey())) {
				partParentChildList.add(hmPartEntry.getValue());
			}
		}

		// Print
		for (WorkCenterPart mmd : partParentChildList) {
			System.out.println("partParentChildList contains " + partParentChildList.size() + " that are : " + mmd);
		}

		return partParentChildList;
	}

	public List<WorkCenterPart> addChildren(Set<WorkcenterPart> children) {
		List<WorkCenterPart> jsonchildren = new ArrayList<WorkCenterPart>();
		if (children == null || children.size() == 0) {
			jsonchildren = null;
			return null;
		} else {
			for (WorkcenterPart wcpchild : children) {
				WorkCenterPart jsonPart = new WorkCenterPart();
				String partId = getId(wcpchild.getId());
				jsonPart.setId(partId);
				jsonPart.setQty(wcpchild.getQty());
				if (wcpchild.getParent() == null) {
					jsonPart.setParentId(partId);
				} else {
					String parentId = getId(wcpchild.getParent().getId());
					jsonPart.setParentId(parentId);
				}
				jsonPart.setChildren(addChildren(wcpchild.getChildren()));
				jsonchildren.add(jsonPart);
			}
			return jsonchildren;
		}

		// jsonpart.setChildren(children);
	}

	public List<WorkcenterPart> sortPartsParentChildren(List<WorkcenterPart> parts) {
		List<WorkcenterPart> sortedParts = new ArrayList<WorkcenterPart>();
		for (WorkcenterPart part : parts) {
			if (part.getParent() == null) {
				sortedParts.add(0, part);
			} else {
				int index = 0;
				boolean found = false;
				for (WorkcenterPart sortedpart : sortedParts) {
					if (part.getParent().getId().equals(sortedpart.getId())) {
						sortedParts.add(index + 1, part);
						found = true;
						break;
					}
					index++;
				}
				if (!found) {
					sortedParts.add(part);
				}
			}
		}
		return sortedParts;
	}

	private String getId(String partId) {

		if (partId.contains(".")) {
			int index = partId.indexOf(".");
			partId = partId.substring(index + 1);
		}

		return partId;
	}

	public Set<WorkCenterCahier> toJsonWcCahiers(Set<Cahier> cahiers) {
		Set<WorkCenterCahier> jsonWcCahiers = new HashSet<WorkCenterCahier>();
		for (Cahier cahier : cahiers) {
			WorkCenterCahier jsonCahier = new WorkCenterCahier();
			jsonCahier.setId(cahier.getId());
			CahierFieldFlag flag = new CahierFieldFlag(cahier.getB(), cahier.getR(), cahier.getOd());
			jsonCahier.setFlags(flag);
			jsonWcCahiers.add(jsonCahier);
		}

		return jsonWcCahiers;
	}

	public Set<com.bombardier.macs.json.model.Jalon> toJsonWcJalons(Set<Jalon> jalons) {
		Set<com.bombardier.macs.json.model.Jalon> jsonWcJalons = new HashSet<com.bombardier.macs.json.model.Jalon>();
		for (Jalon jalon : jalons) {
			com.bombardier.macs.json.model.Jalon jsonJalon = new com.bombardier.macs.json.model.Jalon();
			jsonJalon.setId(jalon.getId());
			jsonJalon.setTitle(jalon.getTitle());
			jsonJalon.setCahiers(toJsonJalonCahiers(jalon.getCahiers()));
			jsonWcJalons.add(jsonJalon);
		}
		return jsonWcJalons;
	}

	public Set<com.bombardier.macs.json.model.WorkCenterCahier> toJsonJalonCahiers(Set<Cahier> cahiers) {
		Set<com.bombardier.macs.json.model.WorkCenterCahier> jsonCahiers = new HashSet<com.bombardier.macs.json.model.WorkCenterCahier>();
		for (Cahier cahier : cahiers) {
			com.bombardier.macs.json.model.WorkCenterCahier jsonCahier = toJsonWorkcenterCahier(cahier);
			jsonCahiers.add(jsonCahier);
		}

		return jsonCahiers;
	}

	public List<com.bombardier.macs.json.model.Cahier> toJsonCahiers(List<Cahier> cahiers) {
		List<com.bombardier.macs.json.model.Cahier> jsonCahiers = new ArrayList<com.bombardier.macs.json.model.Cahier>();
		for (Cahier cahier : cahiers) {
			com.bombardier.macs.json.model.Cahier jsonCahier = toJsonCahier(cahier);
			jsonCahiers.add(jsonCahier);
		}

		return jsonCahiers;
	}

	public WorkcenterPart populateCahierPart(WorkCenterPart jsonwcpart, WorkcenterPart parentPart, PartType partType) {

		WorkcenterPart cahierPart = new WorkcenterPart();
		if (jsonwcpart.getId() != null) {
			cahierPart.setId(jsonwcpart.getId());
		}

		cahierPart.setParent(parentPart);
		cahierPart.setFlagMethod(jsonwcpart.getFlagMethod());
		cahierPart.setFlagABCL(jsonwcpart.getFlagABCL());
		cahierPart.setPartType(partType);
		cahierPart.setParentid(jsonwcpart.getParentId());

		if (("METHOD".equals(jsonwcpart.getType()) || "KIT".equals(jsonwcpart.getType())
				|| "PHANTOM".equals(jsonwcpart.getType())) && jsonwcpart.getCreatedFields() != null) {
			cahierPart.setNumber(jsonwcpart.getCreatedFields().getNumber());
			cahierPart.setDescription(jsonwcpart.getCreatedFields().getDescription());
			cahierPart.setRevision(jsonwcpart.getCreatedFields().getRevision());
			cahierPart.setDrawing(jsonwcpart.getCreatedFields().getDrawing());
			cahierPart.setQty(jsonwcpart.getCreatedFields().getQty());
		}

		if ("KIT".equals(jsonwcpart.getType()) && jsonwcpart.getPartList() != null
				&& !jsonwcpart.getPartList().isEmpty()) {
			Gson gson = new Gson();
			String jsonPartList = gson.toJson(jsonwcpart.getPartList());
			cahierPart.setPartList(jsonPartList);
		}

		return cahierPart;
	}

	public WorkcenterPart updateCahierPart(WorkCenterPart jsonwcpart, WorkcenterPart cahierPart) {

		cahierPart.setFlagMethod(jsonwcpart.getFlagMethod());
		cahierPart.setFlagABCL(jsonwcpart.getFlagABCL());

		if (jsonwcpart.getCreatedFields() != null) {
			cahierPart.setNumber(jsonwcpart.getCreatedFields().getNumber());
			cahierPart.setDescription(jsonwcpart.getCreatedFields().getDescription());
			cahierPart.setRevision(jsonwcpart.getCreatedFields().getRevision());
			cahierPart.setDrawing(jsonwcpart.getCreatedFields().getDrawing());
			cahierPart.setQty(jsonwcpart.getCreatedFields().getQty());
		}

		if ("KIT".equals(jsonwcpart.getType()) && jsonwcpart.getPartList() != null
				&& !jsonwcpart.getPartList().isEmpty()) {
			Gson gson = new Gson();
			String jsonPartList = gson.toJson(jsonwcpart.getPartList());
			cahierPart.setPartList(jsonPartList);
		}

		return cahierPart;
	}

	public CahierComponentField tojsonCahierComponentField(WorkCenterPart jsonwcpart, WorkcenterPart cahierPart) {
		Set<CahierHistoryUpdatedField> updatedFields = new HashSet<CahierHistoryUpdatedField>();
		CahierComponentField cahierComponent = new CahierComponentField();
		cahierPart.setFlagMethod(jsonwcpart.getFlagMethod());
		cahierPart.setFlagABCL(jsonwcpart.getFlagABCL());
		updatedFields.add(new CahierHistoryUpdatedField("id", jsonwcpart.getId(), jsonwcpart.getId()));
		updatedFields.add(new CahierHistoryUpdatedField("flagMethod", jsonwcpart.getFlagMethod().toString(),
				cahierPart.getFlagMethod().toString()));
		updatedFields.add(new CahierHistoryUpdatedField("flagABCL", jsonwcpart.getFlagABCL().toString(),
				cahierPart.getFlagABCL().toString()));

		if (jsonwcpart.getCreatedFields() != null) {

			updatedFields.add(new CahierHistoryUpdatedField("number", jsonwcpart.getCreatedFields().getNumber(),
					cahierPart.getNumber()));
			updatedFields.add(new CahierHistoryUpdatedField("description",
					jsonwcpart.getCreatedFields().getDescription(), cahierPart.getDescription()));
			updatedFields.add(new CahierHistoryUpdatedField("revision", jsonwcpart.getCreatedFields().getRevision(),
					cahierPart.getRevision().toString()));
			updatedFields.add(new CahierHistoryUpdatedField("drawing", jsonwcpart.getCreatedFields().getDrawing(),
					cahierPart.getDrawing()));
			updatedFields.add(new CahierHistoryUpdatedField("qty", jsonwcpart.getCreatedFields().getQty().toString(),
					cahierPart.getQty().toString()));

		}

		if ("KIT".equals(jsonwcpart.getType()) && jsonwcpart.getPartList() != null
				&& !jsonwcpart.getPartList().isEmpty()) {
			Gson gson = new Gson();
			String jsonPartList = gson.toJson(jsonwcpart.getPartList());
			updatedFields.add(new CahierHistoryUpdatedField("partList", jsonPartList, cahierPart.getPartList()));

		}
		cahierComponent.setUpdatedFields(updatedFields);
		return cahierComponent;
	}

	

	public CahierComponentField tojsonCahierComponentField(WorkCenterPart jsonwcpart, WorkcenterPart cahierPart,
			CahierUpdatedPart updatedPart) {
		Set<CahierHistoryUpdatedField> updatedFields = new HashSet<CahierHistoryUpdatedField>();
		CahierComponentField cahierComponent = new CahierComponentField();

		if (jsonwcpart.getModifiedFields() != null) {
			updatedFields.add(new CahierHistoryUpdatedField("id", jsonwcpart.getId(), jsonwcpart.getId()));

			if ("PAM".equals(jsonwcpart.getType())) {

				for (String description : jsonwcpart.getModifiedFields().getDescriptionHistory()) {
					updatedPart.setDescription(description);
					updatedFields
							.add(new CahierHistoryUpdatedField("description", description, updatedPart.getNumber()));

				}
				for (String drawing : jsonwcpart.getModifiedFields().getDrawingHistory()) {
					updatedPart.setDrawing(drawing);
					updatedFields.add(new CahierHistoryUpdatedField("drawing", drawing, updatedPart.getNumber()));

				}

				for (String revision : jsonwcpart.getModifiedFields().getRevisionHistory()) {
					updatedPart.setRevision(revision);
					updatedFields.add(
							new CahierHistoryUpdatedField("revision", revision, updatedPart.getRevision().toString()));

				}
				for (Integer qtt : jsonwcpart.getModifiedFields().getQtyHistory()) {
					updatedPart.setQty(qtt);
					updatedFields
							.add(new CahierHistoryUpdatedField("qty", qtt.toString(), updatedPart.getQty().toString()));

				}
			}

			for (String number : jsonwcpart.getModifiedFields().getNumberHistory()) {
				updatedPart.setNumber(number);
				updatedFields.add(new CahierHistoryUpdatedField("number", number, updatedPart.getNumber()));

			}

		}

		cahierComponent.setUpdatedFields(updatedFields);
		return cahierComponent;
	}

	private String getStringValue(Object obj) {
		if (obj != null) {
			return obj.toString();
		} else {
			return "";
		}
	}

	public CahierComponentField tojsonCahierComponentField(com.bombardier.macs.json.model.Cahier jsoncahier,
			Cahier cahier, String newjalontitle, String newWcTitle) {
		Set<CahierHistoryUpdatedField> updatedFields = new HashSet<CahierHistoryUpdatedField>();
		CahierComponentField cahierComponent = new CahierComponentField();
		updatedFields.add(new CahierHistoryUpdatedField("id", getStringValue(jsoncahier.getId()),
				getStringValue(jsoncahier.getId())));
		updatedFields.add(new CahierHistoryUpdatedField("name", jsoncahier.getName(), cahier.getName()));
		updatedFields.add(new CahierHistoryUpdatedField("wcId", jsoncahier.getWcId(), cahier.getWcId()));
		updatedFields.add(new CahierHistoryUpdatedField("jalonId", getStringValue(jsoncahier.getJalonId()),
				getStringValue(cahier.getJalonId())));
		updatedFields.add(new CahierHistoryUpdatedField("wcTitle", newjalontitle,
				cahier.getWorkcenter() != null ? cahier.getWorkcenter().getTitle() : ""));
		updatedFields.add(new CahierHistoryUpdatedField("jalonTitle", newjalontitle,
				cahier.getJalon() != null ? cahier.getJalon().getTitle() : ""));

		if (jsoncahier.getCahierInformation() != null) {

			updatedFields.add(new CahierHistoryUpdatedField("cahierDuration",
					jsoncahier.getCahierInformation().getCahierDuration(), cahier.getCahierDuration()));
			updatedFields.add(new CahierHistoryUpdatedField("description",
					jsoncahier.getCahierInformation().getDescription(), cahier.getDescription()));
			updatedFields.add(new CahierHistoryUpdatedField("effectivity",
					getStringValue(jsoncahier.getCahierInformation().getEffectivity()),
					getStringValue(cahier.getEffectivity())));
			updatedFields.add(new CahierHistoryUpdatedField("infotypeId",
					getStringValue(jsoncahier.getCahierInformation().getTypeId()),
					getStringValue(cahier.getInfotypeId())));
			updatedFields.add(new CahierHistoryUpdatedField("primaryJobTypeQty",
					jsoncahier.getCahierInformation().getPrimaryJobTypeQty() != null
							? jsoncahier.getCahierInformation().getPrimaryJobTypeQty() + "" : "",
					cahier.getPrimaryJobTypeQty() != null ? cahier.getPrimaryJobTypeQty() + "" : ""));

			updatedFields.add(new CahierHistoryUpdatedField("secondaryJobType",
					getStringValue(jsoncahier.getCahierInformation().getSecondaryJobType()),
					getStringValue(cahier.getSecondaryJobType())));
			updatedFields.add(new CahierHistoryUpdatedField("secondaryJobTypeQty",
					getStringValue(jsoncahier.getCahierInformation().getSecondaryJobTypeQty()),
					getStringValue(cahier.getSecondaryJobTypeQty())));
			updatedFields.add(new CahierHistoryUpdatedField("fromBoard",
					getStringValue(jsoncahier.getCahierInformation().getFromBoard()),
					getStringValue(cahier.getFromBoard())));
			updatedFields.add(new CahierHistoryUpdatedField("pva",
					getStringValue(jsoncahier.getCahierInformation().getPva()), getStringValue(cahier.getPva())));

			updatedFields.add(new CahierHistoryUpdatedField("wireCut",
					getStringValue(jsoncahier.getCahierInformation().getWireCut()),
					getStringValue(cahier.getWireCut())));
			updatedFields.add(new CahierHistoryUpdatedField("edl",
					getStringValue(jsoncahier.getCahierInformation().getEdl()), getStringValue(cahier.getEdl())));

		}

		if (jsoncahier.getCahierFields() != null) {

			updatedFields.add(new CahierHistoryUpdatedField("productId",
					getStringValue(jsoncahier.getCahierFields().getProductId()),
					getStringValue(cahier.getProductId())));
			updatedFields.add(new CahierHistoryUpdatedField("jobRoleId",
					getStringValue(jsoncahier.getCahierFields().getJobRoleId()),
					getStringValue(cahier.getJobRoleId())));
			updatedFields.add(new CahierHistoryUpdatedField("methodId",
					getStringValue(jsoncahier.getCahierFields().getMethodId()), getStringValue(cahier.getMethodId())));
			updatedFields.add(new CahierHistoryUpdatedField("typeId",
					getStringValue(jsoncahier.getCahierFields().getTypeId()), getStringValue(cahier.getTypeId())));
			updatedFields.add(new CahierHistoryUpdatedField("number",
					getStringValue(jsoncahier.getCahierFields().getNumber()), getStringValue(cahier.getNumber())));

			updatedFields.add(new CahierHistoryUpdatedField("B",
					getStringValue(jsoncahier.getCahierFields().getFlags().getB()), getStringValue(cahier.getB())));
			updatedFields.add(new CahierHistoryUpdatedField("R",
					getStringValue(jsoncahier.getCahierFields().getFlags().getR()), getStringValue(cahier.getR())));
			updatedFields.add(new CahierHistoryUpdatedField("Od",
					getStringValue(jsoncahier.getCahierFields().getFlags().getOd()), getStringValue(cahier.getOd())));

		}
		cahierComponent.setUpdatedFields(updatedFields);

		return cahierComponent;
	}

	public CahierHistory addActionCahier(Long cahierId, CahierAction action, CahierHistoryData actiondata) {
 
		Gson gson = new Gson();
		// String jsonCahierState = gson.toJson(cahierstate);
		// Converts JSON string into a set of String.
		// Type type = new TypeToken<List<String>>() { }.getType();
		// Set<String> partList = new
		// HashSet<>(gson.fromJson(cahierPart.getPartList(), type));
		// jsonObject.getAsString();
		// jsonObject.addProperty("metric", "name1");
		// jsonObject.addProperty("timestamp", 1443785014);
		// jsonObject.addProperty("value", 18);

		// cahier.setDrawings(list);
		// inputMap.put("cahier", cahier);
		// inputMap.put("site", cdr);
		// convert map to JSON String
		String jsonStr = gson.toJson(actiondata);

		
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
		CahierHistory cahHistory = new CahierHistory(cahierId, action.getId(), jsonStr, null, formatDateTime);

		return cahHistory;
	}

	// TODO
	public void editActionOnCahier(WorkCenterPart jsonwcpart, String projectId, int sequenceNbr) {
	}

	// TODO
	public void removeActionOnCahier(WorkCenterPart jsonwcpart, String projectId, int sequenceNbr) {
	}

	public String composePartIdFromProjectPartNbrSequenceNbr(WorkCenterPart jsonwcpart, String projectId,
			int sequenceNbr) {

		String newCahierPartId = projectId + Constants.DOT + jsonwcpart.getCreatedFields().getNumber().trim()
				+ Constants.DASH + sequenceNbr + Constants.DASH + jsonwcpart.getType();

		if (jsonwcpart.getCreatedFields().getNumber().trim().isEmpty()) {
			newCahierPartId = projectId + Constants.DOT + sequenceNbr + Constants.DASH + jsonwcpart.getType();
		}
		return newCahierPartId;
	}

	
	public CahierUpdatedPart updateCahierUpdatedPart(WorkCenterPart jsonwcpart, CahierUpdatedPart updatedPart) {

		if (jsonwcpart.getModifiedFields() != null) {
			if ("PAM".equals(jsonwcpart.getType()) || "DASH".equals(jsonwcpart.getType())) {
                if(!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getDescriptionHistory())){
					for (String description : jsonwcpart.getModifiedFields().getDescriptionHistory()) {
						updatedPart.setDescription(description);
					}
                }
                if(!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getDrawingHistory())){
					for (String drawing : jsonwcpart.getModifiedFields().getDrawingHistory()) {
						updatedPart.setDrawing(drawing);
					}
                }	
                if(!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getRevisionHistory())){	
					for (String revision : jsonwcpart.getModifiedFields().getRevisionHistory()) {
						updatedPart.setRevision(revision);
					}
                }
                if(!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getQtyHistory())){	
					for (Integer qtt : jsonwcpart.getModifiedFields().getQtyHistory()) {
						updatedPart.setQty(qtt);
					}
                }
			}

		}

		return updatedPart;
	}
	
	
	public CahierUpdatedPart populateCahierUpdatedPart(WorkCenterPart jsonwcpart, WorkcenterPart associatedPart,
			CahierUpdatedPart referenceCahierUpdatedPart,
			PartType partType, List<CahierUpdatedPart> updatedPartsList) {

		if (("DASH".equals(jsonwcpart.getType()) || "PAM".equals(jsonwcpart.getType()))
				&& jsonwcpart.getModifiedFields() != null) {

			CahierUpdatedPart updatedPart = new CahierUpdatedPart();
			for (String number : jsonwcpart.getModifiedFields().getNumberHistory()) {
				updatedPart.setPartType(partType);
				updatedPart.setPart(associatedPart);
				updatedPart.setNumber(number);
			}

			if (!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getRevisionHistory())) {
				for (String revision : jsonwcpart.getModifiedFields().getRevisionHistory()) {
					updatedPart.setRevision(revision);
				}
			} else {	
				if(referenceCahierUpdatedPart==null){
					updatedPart.setRevision(associatedPart.getRevision());
				} else {
					updatedPart.setRevision(referenceCahierUpdatedPart.getRevision());
				}	
			}

			if (!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getDescriptionHistory())) {
				for (String description : jsonwcpart.getModifiedFields().getDescriptionHistory()) {
					updatedPart.setDescription(description);
				}
			} else {
				
				if(referenceCahierUpdatedPart==null){
					updatedPart.setDescription(associatedPart.getDescription());
				} else {
					updatedPart.setDescription(referenceCahierUpdatedPart.getDescription());
				}		
			}

			if (!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getDrawingHistory())) {
				for (String drawing : jsonwcpart.getModifiedFields().getDrawingHistory()) {
					updatedPart.setDrawing(drawing);
				}
			} else {
				if(referenceCahierUpdatedPart==null){
					updatedPart.setDrawing(associatedPart.getDrawing());
				} else {
					updatedPart.setDrawing(referenceCahierUpdatedPart.getDrawing());
				}		
			}

			if (!CollectionUtils.isEmpty(jsonwcpart.getModifiedFields().getQtyHistory())) {
				for (Integer qtt : jsonwcpart.getModifiedFields().getQtyHistory()) {
					updatedPart.setQty(qtt);
				}
			} else {
				if(referenceCahierUpdatedPart==null){
					updatedPart.setQty(associatedPart.getQty());
				} else {
					updatedPart.setQty(referenceCahierUpdatedPart.getQty());
				}
				
				
				
			}

			return updatedPart;

		} else {
			return null;
		}
	}

	private String generateRevision(List<CahierUpdatedPart> updatedPartsList, String revision, int sequenceNbr,
			String type) {

		if ("DASH".equals(type)) {
			List<CahierUpdatedPart> filteredPartsList = new ArrayList<CahierUpdatedPart>();
			for (CahierUpdatedPart cahierUpdatedPart : updatedPartsList) {
				if (isInteger(cahierUpdatedPart.getRevision())) {
					filteredPartsList.add(cahierUpdatedPart);
				}
			}

			List<CahierUpdatedPart> sortedlist = filteredPartsList.stream()
					.sorted(Comparator.comparing(CahierUpdatedPart::getIntRevision)).collect(Collectors.toList());

			if (!CollectionUtils.isEmpty(sortedlist)) {
				Integer maxtRevision = Integer.valueOf(sortedlist.get(sortedlist.size() - 1).getRevision());
				return String.valueOf(maxtRevision + sequenceNbr);
			}
			return String.valueOf(sequenceNbr);

		}

		if ("PAM".equals(type)) {
			for (CahierUpdatedPart cahierUpdatedPart : updatedPartsList) {
				if (cahierUpdatedPart.getRevision().equalsIgnoreCase(revision)) {
					return generateRevision(updatedPartsList, revision + sequenceNbr, sequenceNbr + 1, "PAM");
				}
			}
			return revision;
		} else {
			return revision;
		}
	}

	private boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	
	
	public List<com.bombardier.macs.json.model.CahierHistory> toJsonCahierHistoryList(List<CahierHistory> cahierhistoryList, String action) {
        
		List<com.bombardier.macs.json.model.CahierHistory> jsonCahierHistoryList = new ArrayList<com.bombardier.macs.json.model.CahierHistory>();
		com.bombardier.macs.json.model.CahierHistory jsonCahierHistory = new com.bombardier.macs.json.model.CahierHistory();		
		Gson gson=new Gson();
		
		/*Type type = new TypeToken<List<String>>() {
		}.getType();
		Set<String> partList = new HashSet<>(gson.fromJson(cahierPart.getPartList(), type));
		jsonWorkCenterPart.setPartList(partList);
*/
		 Type typeHistoryData=null,typeDrawing=null,typeTool=null,typePart =null;
		//Type type = new TypeToken<CahierHistoryData>() {
		 if(action.contains("UPDATE")){
				typeHistoryData = new TypeToken<CahierHistoryData>() {
			}.getType();
	    } else {
		if(action.contains("DRAWING")){
			typeDrawing = new TypeToken<CahierHistoryDataDrawing>() {
			}.getType();
	    }
		if(action.contains("TOOL")){
			typeTool = new TypeToken<CahierHistoryDataTool>() {
		}.getType();
        }
		if(action.contains("PART")){
			typePart = new TypeToken<CahierHistoryDataWcPart>() {
		}.getType();
        }
	    }
		
    
		for(CahierHistory cahierhistory:cahierhistoryList){	
			if(action.contains("UPDATE")){
				CahierHistoryData data = gson.fromJson(cahierhistory.getActionData(), typeHistoryData);
				jsonCahierHistory.setActionData(data.getData());
				jsonCahierHistory.setType(data.getType());
			} else {
			if(action.contains("DRAWING")){
				CahierHistoryDataDrawing data = gson.fromJson(cahierhistory.getActionData(), typeDrawing);
				jsonCahierHistory.setActionData(data.getData());
				jsonCahierHistory.setType(data.getType());		
			}
			if(action.contains("TOOL")){
				CahierHistoryDataTool data = gson.fromJson(cahierhistory.getActionData(), typeTool);
				jsonCahierHistory.setActionData(data.getData());
				jsonCahierHistory.setType(data.getType());
			}
			if(action.contains("PART")){
				CahierHistoryDataWcPart data = gson.fromJson(cahierhistory.getActionData(), typePart);
				jsonCahierHistory.setActionData(data.getData());
				jsonCahierHistory.setType(data.getType());
			}
			
			}
			//jsonCahierHistory.setActionData(data);
			//jsonCahierHistory.setActionData1(data.getData());
			
			
			jsonCahierHistory.setAction(action);
			jsonCahierHistory.setId(cahierhistory.getId());
			jsonCahierHistory.setActionId(cahierhistory.getActionId());
			jsonCahierHistory.setCahierId(cahierhistory.getCahierId());
			jsonCahierHistory.setModifiedBy(cahierhistory.getModifiedBy());
			jsonCahierHistory.setModifiedOn(cahierhistory.getModifiedOn());
			jsonCahierHistoryList.add(jsonCahierHistory);
		}
		return jsonCahierHistoryList;
	}

	public WorkCenterPart toJsonCahierPart(WorkcenterPart cahierPart, CahierUpdatedPart updatedpart) {

		WorkCenterPart jsonWorkCenterPart = new WorkCenterPart();
		PartModifiedField partModifiedFields = new PartModifiedField();

		jsonWorkCenterPart.setId(getId(cahierPart.getId()));
		if (cahierPart.getPartType() != null) {
			jsonWorkCenterPart.setType(cahierPart.getPartType().getType());
		} else {
			jsonWorkCenterPart.setType(null);
		}
		partModifiedFields.getRevisionHistory().add(updatedpart.getRevision());
		partModifiedFields.getDescriptionHistory().add(updatedpart.getDescription());
		partModifiedFields.getDrawingHistory().add(updatedpart.getDrawing());
		partModifiedFields.getNumberHistory().add(updatedpart.getNumber());
		partModifiedFields.getQtyHistory().add(updatedpart.getQty());

		jsonWorkCenterPart.setModifiedFields(partModifiedFields);

		return jsonWorkCenterPart;
	}
	
	
	
	public WorkCenterPart toJsonCahierPart(WorkcenterPart cahierPart, List<CahierUpdatedPart> updatedPartsList) {

		WorkCenterPart jsonWorkCenterPart = new WorkCenterPart();
		PartModifiedField partModifiedFields = new PartModifiedField();

		jsonWorkCenterPart.setId(getId(cahierPart.getId()));
		if (cahierPart.getPartType() != null) {
			jsonWorkCenterPart.setType(cahierPart.getPartType().getType());
		} else {
			jsonWorkCenterPart.setType(null);
		}
		
		for(CahierUpdatedPart updatedpart:updatedPartsList){	
			partModifiedFields.getRevisionHistory().add(updatedpart.getRevision());
			partModifiedFields.getDescriptionHistory().add(updatedpart.getDescription());
			partModifiedFields.getDrawingHistory().add(updatedpart.getDrawing());
			partModifiedFields.getNumberHistory().add(updatedpart.getNumber());
			partModifiedFields.getQtyHistory().add(updatedpart.getQty());
		}	

		jsonWorkCenterPart.setModifiedFields(partModifiedFields);

		return jsonWorkCenterPart;
	}

	public WorkCenterPart toJsonCahierPart(WorkcenterPart cahierPart) {

		Gson gson = new Gson();
		WorkCenterPart jsonWorkCenterPart = new WorkCenterPart();
		jsonWorkCenterPart.setId(getId(cahierPart.getId()));
		if (cahierPart.getPartType() != null) {
			jsonWorkCenterPart.setType(cahierPart.getPartType().getType());
		} else {
			jsonWorkCenterPart.setType(null);
		}

		PartCreatedField pcf = new PartCreatedField();
		pcf.setNumber(cahierPart.getNumber());
		pcf.setDescription(cahierPart.getDescription());
		pcf.setRevision(cahierPart.getRevision());
		pcf.setDrawing(cahierPart.getDrawing());
		pcf.setQty(cahierPart.getQty());
		jsonWorkCenterPart.setCreatedFields(pcf);

		boolean isCreatedPart = isCreatedPart(getPartTypeValue(cahierPart));
		if (!isCreatedPart) {
			jsonWorkCenterPart.setCreatedFields(new PartCreatedField());
		}

		jsonWorkCenterPart.setFlagMethod(cahierPart.getFlagMethod());
		jsonWorkCenterPart.setFlagABCL(cahierPart.getFlagABCL());
		jsonWorkCenterPart.setQty(cahierPart.getQty());
		jsonWorkCenterPart.setParentId(cahierPart.getParentid());
		if (cahierPart.getParent() != null) {
			String parentId = getId(cahierPart.getParent().getId());
			jsonWorkCenterPart.setParentId(parentId);
		} else {
			jsonWorkCenterPart.setParentId(jsonWorkCenterPart.getId());
		}

		if (cahierPart.getPartList() != null && !cahierPart.getPartList().isEmpty()) {
			// Converts JSON string into a set of String.
			Type type = new TypeToken<List<String>>() {
			}.getType();
			Set<String> partList = new HashSet<>(gson.fromJson(cahierPart.getPartList(), type));
			jsonWorkCenterPart.setPartList(partList);
		}

		
		if (!CollectionUtils.isEmpty(cahierPart.getUpdatedParts())) {
			
			List<CahierUpdatedPart> cahierUpdatedParts = cahierPart.getUpdatedParts().stream().sorted(Comparator.comparing(CahierUpdatedPart::getId))
					.collect(Collectors.toList());
		    for (CahierUpdatedPart updatepart : cahierUpdatedParts) {
				jsonWorkCenterPart.getModifiedFields().getDescriptionHistory().add(updatepart.getDescription());
				jsonWorkCenterPart.getModifiedFields().getNumberHistory().add(updatepart.getNumber());
				jsonWorkCenterPart.getModifiedFields().getDrawingHistory().add(updatepart.getDrawing());
				jsonWorkCenterPart.getModifiedFields().getRevisionHistory()
						.add(String.valueOf(updatepart.getRevision()));
				jsonWorkCenterPart.getModifiedFields().getQtyHistory().add(updatepart.getQty());
			}

		}
		return jsonWorkCenterPart;
	}

	private boolean isCreatedPart(String partTypeValue) {
		return "KIT".equals(partTypeValue) || "METHOD".equals(partTypeValue) || "PHANTOM".equals(partTypeValue);
	}

	private boolean isModifiedPart(String partTypeValue) {
		return "DASH".equals(partTypeValue) || "PAM".equals(partTypeValue);
	}

	private String getPartTypeValue(WorkcenterPart cahierPart) {
		PartType partType = cahierPart.getPartType();
		if (partType != null && partType.getType() != null) {
			return partType.getType().trim().toUpperCase();
		} else {
			return cahierPart.getType() != null ? cahierPart.getType().trim().toUpperCase() : null;
		}
	}

	private com.bombardier.macs.json.model.Cahier toJsonCahier(Cahier cahier) {
		com.bombardier.macs.json.model.Cahier jsoncahier = new com.bombardier.macs.json.model.Cahier();

		com.bombardier.macs.json.model.CahierInformation cahierInfo = new com.bombardier.macs.json.model.CahierInformation(
				cahier.getId(), cahier.getDescription(), cahier.getCahierDuration(), cahier.getEffectivity(),
				cahier.getTypeId(), cahier.getPrimaryJobTypeQty(), cahier.getSecondaryJobType(),
				cahier.getSecondaryJobTypeQty(), cahier.getFromBoard(), cahier.getPva(), cahier.getWireCut(),
				cahier.getEdl());

		jsoncahier.setCahierInformation(cahierInfo);

		com.bombardier.macs.json.model.CahierFields cf = new com.bombardier.macs.json.model.CahierFields(
				cahier.getProductId(), cahier.getJobRoleId(), cahier.getMethodId(), cahier.getTypeId(),
				cahier.getNumber(), cahier.getB(), cahier.getR(), cahier.getOd());

		// Workcenter wc=
		// workcenterRepository.findOne(Long.getLong(cahierInfo.getWcId())).get();
		jsoncahier.setWcId(cahier.getWcId());
		jsoncahier.setJalonId(cahier.getJalonId());
		jsoncahier.setCahierFields(cf);
		jsoncahier.setId(cahier.getId());
		jsoncahier.setName(cahier.getName());
		jsoncahier.setIsConfirmed(cahier.getIsConfirmed());

		jsoncahier.setBomCheck(cahier.getBomCheck());
		jsoncahier.setDependencyCheck(cahier.getDependencyCheck());
		jsoncahier.setRoutingCheck(cahier.getRoutingCheck());

		jsoncahier.setSimilarCahier(cahier.getSimilarCahier());

		Set<WorkCenterPart> parts = new HashSet<WorkCenterPart>();

		Set<CahierDrawing> cahierDrawings = cahier.getDrawings();
		Set<CahierTool> cahierTools = cahier.getTools();

		if (cahier.getCahierParts() != null && cahier.getCahierParts().size() > 0) {
			List<WorkcenterPart> partslist = cahier.getCahierParts().stream()
					.sorted(Comparator.comparing(WorkcenterPart::getId)).collect(Collectors.toList());
			List<WorkcenterPart> sortedParts = EntityMapper.getInstance().sortPartsParentChildren(partslist);
			for (WorkcenterPart part : sortedParts) {
				WorkCenterPart wcp = new WorkCenterPart();
				wcp = toJsonCahierPart(part);
				parts.add(wcp);
			}
			List<WorkCenterPart> newParts = getParentChildrenList(new ArrayList<WorkCenterPart>(parts));

			jsoncahier.setParts(new HashSet<WorkCenterPart>(newParts));
		}

		CahierRouting cahierRouting = new CahierRouting();
		if (cahierDrawings != null && !cahierDrawings.isEmpty()) {
			List<Drawing> drawings = new ArrayList<Drawing>();
			for (CahierDrawing cahierDrawing : cahierDrawings) {
				Drawing dw = new Drawing();
				dw.setId(cahierDrawing.getId());
				dw.setNumber(cahierDrawing.getNumber());
				dw.setRevision(cahierDrawing.getRevision());
				dw.setEffectivity(cahierDrawing.getEffectivity());
				dw.setFlagABCL(cahierDrawing.getFlagABCL());
				dw.setFlagMethod(cahierDrawing.getFlagMethod());
				drawings.add(dw);
			}
			cahierRouting.setDrawings(drawings);
		}

		if (cahierTools != null && !cahierTools.isEmpty()) {
			List<Tool> tools = new ArrayList<Tool>();
			for (CahierTool cahierTool : cahierTools) {
				Tool tool = new Tool();
				tool.setId(cahierTool.getId());
				tool.setNumber(cahierTool.getNumber());
				tool.setDescription(cahierTool.getDescription());
				tool.setFlagABCL(cahierTool.getFlagABCL());
				tool.setFlagMethod(cahierTool.getFlagMethod());
				tools.add(tool);
			}
			cahierRouting.setTools(tools);
		}
		jsoncahier.setRouting(cahierRouting);
		return jsoncahier;
	}

	// TODO Remove it when the ebom parts are integrated with project
	public WorkcenterPart populatePartFromEbom(WorkcenterPart part) {

		part.setAuthority("RV-504-608 A" + part.getId());
		part.setDescription("EXTENSION ASSY, CON" + part.getId());
		part.setDrawing("G25022555 [ A ]" + part.getId());
		part.setLnkDrwRclk("http://bdiauthority1/" + part.getId());
		part.setLnkNbrRclk("http://bdiauthority2/" + part.getId());
		part.setLnkRevRclk("http://bdiauthority3/" + part.getId());
		part.setLnkStrRclk("http://bdiauthority4/" + part.getId());
		part.setNumber("G25022555-004" + part.getId());
		part.setRevision("[004]" + part.getId());
		part.setStatusDrwAssgn("NOTASSIGNED");
		part.setStatusNbrAssgn("ASSIGNED");
		part.setStatusRevAssgn("ASSIGNED");
		part.setStatusStrAssgn("ASSIGNED");
		part.setString("test" + part.getId());

		return part;
	}

	// TODO Remove it when the ebom parts are integrated with project .jar
	public WorkcenterPart populatePartFromMasterPartEbom(WorkcenterPart part, MasterPart masterPart) {

		part.setAuthority(masterPart.getAuthority());
		part.setDescription(masterPart.getDescription());
		part.setDrawing(masterPart.getDrawing());
		part.setLnkDrwRclk(masterPart.getLnkDrwRclk());
		part.setLnkNbrRclk(masterPart.getLnkNbrRclk());
		part.setLnkRevRclk(masterPart.getLnkRevRclk());
		part.setLnkStrRclk(masterPart.getLnkStrRclk());
		part.setNumber(masterPart.getNumber());
		part.setRevision(masterPart.getRevision());
		part.setStatusDrwAssgn(masterPart.getStatusDrwAssgn());
		part.setStatusNbrAssgn(masterPart.getStatusNbrAssgn());
		part.setStatusRevAssgn(masterPart.getStatusRevAssgn());
		part.setStatusStrAssgn(masterPart.getStatusStrAssgn());
		part.setString(masterPart.getString());
		part.setParentid(masterPart.getParentId());

		return part;
	}

	public CahierTool populateCahierTool(Tool tool) {

		CahierTool cahierTool = new CahierTool();
		cahierTool.setId(tool.getId());
		cahierTool.setNumber(tool.getNumber());
		cahierTool.setDescription(tool.getDescription());
		cahierTool.setFlagMethod(tool.getFlagMethod());
		cahierTool.setFlagABCL(tool.getFlagABCL());

		return cahierTool;
	}

	public Tool toJsonCahierTool(CahierTool cahierTool) {
		Tool jsonCahierTool = new Tool();
		jsonCahierTool.setId(cahierTool.getId());
		jsonCahierTool.setNumber(cahierTool.getNumber());
		jsonCahierTool.setDescription(cahierTool.getDescription());
		jsonCahierTool.setFlagMethod(cahierTool.getFlagMethod());
		jsonCahierTool.setFlagABCL(cahierTool.getFlagABCL());
		return jsonCahierTool;
	}

	public CahierDrawing populateCahierDrawing(Drawing drawing) {
		CahierDrawing cahierDrawing = new CahierDrawing();
		cahierDrawing.setId(drawing.getId());
		cahierDrawing.setNumber(drawing.getNumber());
		cahierDrawing.setEffectivity(drawing.getEffectivity());
		cahierDrawing.setRevision(drawing.getRevision());
		cahierDrawing.setFlagMethod(drawing.getFlagMethod());
		cahierDrawing.setFlagABCL(drawing.getFlagABCL());
		return cahierDrawing;
	}

	public Drawing toJsonCahierDrawing(CahierDrawing cahierDrawing) {
		Drawing jsonCahierDrawing = new Drawing();
		jsonCahierDrawing.setId(cahierDrawing.getId());
		jsonCahierDrawing.setNumber(cahierDrawing.getNumber());
		jsonCahierDrawing.setEffectivity(cahierDrawing.getEffectivity());
		jsonCahierDrawing.setRevision(cahierDrawing.getRevision());
		jsonCahierDrawing.setFlagMethod(cahierDrawing.getFlagMethod());
		jsonCahierDrawing.setFlagABCL(cahierDrawing.getFlagABCL());
		return jsonCahierDrawing;
	}

	// _
	public WorkCenterCahier toJsonWorkcenterCahier(Cahier cahier) {
		WorkCenterCahier jsonwcCahier = new WorkCenterCahier();
		jsonwcCahier.setId(cahier.getId());
		CahierFieldFlag flag = new CahierFieldFlag(cahier.getB(), cahier.getR(), cahier.getOd());
		jsonwcCahier.setFlags(flag);
		return jsonwcCahier;
	}

	public List<com.bombardier.macs.json.model.WorkCenter> toJsonWorkCenters(List<Workcenter> workcenters) {
		List<com.bombardier.macs.json.model.WorkCenter> jsonWcs = new ArrayList<com.bombardier.macs.json.model.WorkCenter>();
		for (Workcenter wc : workcenters) {
			com.bombardier.macs.json.model.WorkCenter jsonPart = toJsonWorkcenter(wc);
			jsonWcs.add(jsonPart);
		}

		return jsonWcs;
	}

	public List<com.bombardier.macs.json.model.WorkCenterCahier> toJsonWcCahiers(List<Cahier> cahiers) {

		List<WorkCenterCahier> jsonCahiers = new ArrayList<WorkCenterCahier>();
		for (Cahier wccahier : cahiers) {
			WorkCenterCahier jsonCahier = toJsonWorkcenterCahier(wccahier);
			jsonCahiers.add(jsonCahier);
		}

		return jsonCahiers;
	}

	/**
	 * Maps a list of Jalon in json format to at list of Jalon dao.
	 * 
	 * @param jsonJalons
	 * @return
	 */

	public static Set<Jalon> jsonToJalonModel(Workcenter workcenter,
			Set<com.bombardier.macs.json.model.Jalon> jsonJalons) {
		Set<Jalon> daoJalons = new HashSet<Jalon>(jsonJalons.size());

		for (com.bombardier.macs.json.model.Jalon jsonJalon : jsonJalons) {
			Jalon daoJalon = new Jalon();
			daoJalon.setWorkcenter(workcenter);
			daoJalon.setTitle(jsonJalon.getTitle());
			daoJalons.add(daoJalon);
		}

		return daoJalons;
	}

	public WorkcenterPart populatePartFromEbom(WorkcenterPart part, String partId, String cacheKey) {
		Part ebomPart = getEbomPartFromCache(cacheKey, partId);
		if (ebomPart != null) {
			part.setNumber(ebomPart.getNumber());
			part.setMaterialNo(ebomPart.getMaterialNo());
			part.setString(ebomPart.getString());
			part.setDrawing(ebomPart.getDrawing());
			part.setRevision(ebomPart.getRevision());
			part.setAuthority(ebomPart.getAuthority());
			part.setDescription(ebomPart.getDescription());
			part.setLnkDrwRclk(ebomPart.getLinks().getDrawing().getRightClick());
			part.setLnkNbrRclk(ebomPart.getLinks().getNumber().getRightClick());
			part.setLnkRevRclk(ebomPart.getLinks().getRevision().getRightClick());
			part.setLnkStrRclk(ebomPart.getLinks().getString().getRightClick());

			PartStatus partStatus = ebomPart.getStatus();

			part.setStatusNbrAssgn(partStatus != null && partStatus.getNumber() != null
					? partStatus.getNumber().getAssignment() : null);
			part.setStatusStrAssgn(partStatus != null && partStatus.getString() != null
					? partStatus.getString().getAssignment() : null);
			part.setStatusDrwAssgn(partStatus != null && partStatus.getDrawing() != null
					? partStatus.getDrawing().getAssignment() : null);
			part.setStatusRevAssgn(partStatus != null && partStatus.getRevision() != null
					? partStatus.getRevision().getAssignment() : null);
		}
		return part;

	}

	public Part getEbomPartFromCache(String cacheKey, String partId) {

		Part ebomPart = null;
		List<Part> ebomParts = null;

		CacheItem cacheItem = MacsObjectCache.getCacheItem(cacheKey);
		long now = System.currentTimeMillis();

		if (cacheItem != null && now <= (cacheItem.getTimeStamp() + Constants.PARTS_MAX_CACHE_TIME)) {
			ebomParts = (List<Part>) cacheItem.getData();
		} else {
			Pattern partsCahierKeyPattern = Pattern.compile(Constants.PARTS_CACHE_KEY_REGEX);
			Matcher m = partsCahierKeyPattern.matcher(cacheKey);
			if (m.matches()) {
				String projectId = m.group(1);
				String sectorId = m.group(2);
				String subsectorId = m.group(3);

				if (projectId != null && sectorId != null && subsectorId != null) {
					try {
						ebomParts = sortByParent(SapClient.getPartList(projectId, sectorId, subsectorId));
						cacheItem = new CacheItem(now, ebomParts);
						MacsObjectCache.addOrUpdateCacheItem(cacheKey, cacheItem);
					} catch (MacsException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

		}
		if (ebomParts != null) {
			ebomPart = ebomParts.stream().filter(p -> p.getId().trim().equalsIgnoreCase(partId.trim())).findFirst()
					.orElse(null);
		}
		return ebomPart;
	}

	public List<Part> sortByParent(List<Part> partList) {

		// 2017-10-19 TEMPORARY CODE
		// Investigating some duplicates issues experienced recently
		List<Part> partListNoDuplicates = new ArrayList<Part>(new TreeSet<Part>(partList));

		if (partListNoDuplicates.size() < partList.size()) {
			System.out.printf("WARNING - DUPLICATES FOUND IN PI EBOM PARTS RESULTS. Size Before/After: %s/%s\n",
					partList.size(), partListNoDuplicates.size());
		}

		List<Part> remainingItems = partListNoDuplicates;
		List<Part> newList = new ArrayList<Part>();

		List<Part> rootElements = partListNoDuplicates.stream().filter(p -> p.getParentId() == null)
				.collect(Collectors.toList());

		if (!rootElements.isEmpty()) {
			Set<String> parentIds = rootElements.stream().map(Part::getId).collect(Collectors.toSet());
			;
			remainingItems = remainingItems.stream().filter(p -> !parentIds.contains(p.getId()))
					.collect(Collectors.toList());
			for (Part parent : rootElements) {
				List<Part> children = remainingItems.stream()
						.filter(i -> parent.getId().equalsIgnoreCase(i.getParentId())).collect(Collectors.toList());
				Set<String> childrenIds = children.stream().map(Part::getId).collect(Collectors.toSet());
				remainingItems = remainingItems.stream().filter(p -> !childrenIds.contains(p.getId()))
						.collect(Collectors.toList());
				newList.add(parent);
				newList.addAll(children);
			}

			int loopIndex = 0;
			int loopLimit = remainingItems.size();

			while (!remainingItems.isEmpty() && loopIndex < loopLimit) {
				List<Part> tempNewList = new ArrayList<Part>(newList);

				for (Part parent : newList) {
					List<Part> children = remainingItems.stream()
							.filter(i -> parent.getId().equalsIgnoreCase(i.getParentId())).collect(Collectors.toList());
					Set<String> childrenIds = children.stream().map(Part::getId).collect(Collectors.toSet());
					remainingItems = remainingItems.stream().filter(p -> !childrenIds.contains(p.getId()))
							.collect(Collectors.toList());
					int currentParentIndex = tempNewList.indexOf(parent);
					tempNewList.addAll(currentParentIndex + 1, children);
				}
				loopIndex++;
				newList = tempNewList;
			}
			// check if we have items with parent missing from this list
			if (loopIndex == loopLimit && !remainingItems.isEmpty()) {
				newList.addAll(remainingItems);
			}

			return newList;
		} else {
			System.out.println("WARNING - Collection without root element, skipping sort");
			return partListNoDuplicates;
		}
	}
}