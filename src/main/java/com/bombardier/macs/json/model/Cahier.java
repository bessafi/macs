package com.bombardier.macs.json.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"updatedFields"})
public class Cahier extends CahierComponentField{

	private Long id;

	private String name;

	private Source source;

	private String wcId = null;

	private Long jalonId = null;

	CahierInformation cahierInformation;

	CahierFields cahierFields;

	private Set<WorkCenterPart> parts = new HashSet<WorkCenterPart>();

	private CahierRouting routing = null;

	private Boolean isConfirmed = false;

	private Boolean bomCheck = false;

	private Boolean routingCheck = false;

	private Boolean dependencyCheck = false;

	private String similarCahier = null;

	public Cahier() {
		super();
	}

	public Cahier(Long id, String name, String wcId, Long jalonId, CahierInformation cahierInformation,
			CahierFields cahierFields, Set<WorkCenterPart> parts) {
		super();
		this.id = id;
		this.name = name;
		this.wcId = wcId;
		this.jalonId = jalonId;
		this.cahierInformation = cahierInformation;
		this.cahierFields = cahierFields;
		this.parts = parts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("information")
	public CahierInformation getCahierInformation() {
		return cahierInformation;
	}

	public void setCahierInformation(CahierInformation cahierInformation) {
		this.cahierInformation = cahierInformation;
	}

	@JsonProperty("fields")
	public CahierFields getCahierFields() {
		return cahierFields;
	}

	public void setCahierFields(CahierFields cahierFields) {
		this.cahierFields = cahierFields;
	}

	public Set<WorkCenterPart> getParts() {
		return parts;
	}

	public void setParts(Set<WorkCenterPart> parts) {
		this.parts = parts;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public String getWcId() {
		return wcId;
	}

	public void setWcId(String wcId) {
		this.wcId = wcId;
	}

	public Long getJalonId() {
		return jalonId;
	}

	public void setJalonId(Long jalonId) {
		this.jalonId = jalonId;
	}

	public CahierRouting getRouting() {
		return routing;
	}

	public void setRouting(CahierRouting routing) {
		this.routing = routing;
	}

	public Boolean getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public String getSimilarCahier() {
		return similarCahier;
	}

	public void setSimilarCahier(String similarCahier) {
		this.similarCahier = similarCahier;
	}

	public Boolean getBomCheck() {
		return bomCheck;
	}

	public void setBomCheck(Boolean bomCheck) {
		this.bomCheck = bomCheck;
	}

	public Boolean getRoutingCheck() {
		return routingCheck;
	}

	public void setRoutingCheck(Boolean routingCheck) {
		this.routingCheck = routingCheck;
	}

	public Boolean getDependencyCheck() {
		return dependencyCheck;
	}

	public void setDependencyCheck(Boolean dependencyCheck) {
		this.dependencyCheck = dependencyCheck;
	}

	// @OneToMany(mappedBy="cahier")
	// private Set<Drawing> drawings = new HashSet<>();

	// @OneToMany(mappedBy="cahier")
	// private Set<CahierString> cahierStrings = new HashSet<>();

	// ************************

	// @ManyToOne(fetch=FetchType.LAZY)
	// Workcenter workcenter;

	// @ManyToOne(fetch=FetchType.LAZY)
	// Jalon jalon;

	// @ManyToOne(fetch=FetchType.LAZY)
	// Jalon workcenterjalon;

	// @ManyToOne(fetch=FetchType.LAZY)
	// Workcenter objectdependency;

}
