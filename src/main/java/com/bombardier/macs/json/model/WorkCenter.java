package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkCenter {

	private Long id;

	private String title;

	private Source source;

	private boolean isCSD;

	private boolean isActive;

	private List<WorkCenterPart> parts = new ArrayList<WorkCenterPart>();

	private Set<WorkCenterCahier> cahiers = new HashSet<WorkCenterCahier>();

	private Set<Jalon> jalons = new HashSet<>();

	private String number;

	public WorkCenter(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public WorkCenter() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public Set<Jalon> getJalons() {
		return jalons;
	}

	public void setJalons(Set<Jalon> jalons) {
		this.jalons = jalons;
	}

	public List<WorkCenterPart> getParts() {
		return parts;
	}

	public void setParts(List<WorkCenterPart> parts) {
		this.parts = parts;
	}

	public Set<WorkCenterCahier> getCahiers() {
		return cahiers;
	}

	public void setCahiers(Set<WorkCenterCahier> cahiers) {
		this.cahiers = cahiers;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public boolean getIsCSD() {
		return isCSD;
	}

	public void setIsCSD(boolean csd) {
		this.isCSD = csd;
	}

	public void setNumber(String number) {
		this.number = number;

	}

	public String getNumber() {
		return number;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	/*
	 * public SubSector getSubsector() { return null;//subsector; }
	 */

	/*
	 * @JsonProperty("subSectorId") public Long getSubSectorId() {
	 * if(subsector==null) return subSectorId; else return subsector.getId(); }
	 * 
	 * 
	 * 
	 * 
	 * public void setSubsector(SubSector subsector) { this.subsector =
	 * subsector; }
	 * 
	 */

	/*
	 * public Set<Part> getParts() { return null;//parts; }
	 * 
	 * public void setParts(Set<Part> parts) { this.parts = parts; }
	 */

	/*
	 * public Set<Jalon> getJalons() { return jalons; }
	 */

	/*
	 * public Cahier getCahier() { return null;//cahier; }
	 * /* @JsonProperty("cahierId") public Long getCahierId() { if(cahier==null)
	 * return null; else return cahier.getId(); } public void setCahier(Cahier
	 * cahier) { this.cahier = cahier; }
	 */

	/*
	 * public void setJalons(Set<Jalon> jalons) { this.jalons = jalons; }
	 */

}
