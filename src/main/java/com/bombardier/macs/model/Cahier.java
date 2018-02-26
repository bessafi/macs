package com.bombardier.macs.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cahier")
public class Cahier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;

	// --------------------------Header-------------------------

	@Column(name = "wcid")
	private String wcId = null;

	@Column(name = "jalonid")
	private Long jalonId = null;

	@Column(name = "description")
	private String description = null;

	@Column(name = "cahierduration")
	private String cahierDuration = null;

	@Column(name = "effectivity")
	private String effectivity = null;

	@Column(name = "typeid")
	private Long typeId = null;

	@Column(name = "primaryJobTypeQty")
	private Long primaryJobTypeQty = null;

	@Column(name = "secJobType")
	private Long secondaryJobType = null;

	@Column(name = "secJobTypeQty")
	private Long secondaryJobTypeQty = null;

	@Column(name = "fromboard")
	private Boolean fromBoard = null;

	@Column(name = "pva")
	private Boolean pva = null;

	@Column(name = "wirecut")
	private Boolean wireCut = null;

	@Column(name = "edl")
	private Boolean edl = null;

	@Column(name = "productId")
	private Long productId = null;

	@Column(name = "jobRoleId")
	private Long jobRoleId = null;

	@Column(name = "methodId")
	private Long methodId = null;

	@Column(name = "infotypeId")
	private Long infotypeId = null;

	@Column(name = "number")
	private Long number = null;

	@Column(name = "bflag")
	private Boolean b = null;

	@Column(name = "rflag")
	private Boolean r = null;

	@Column(name = "odflag")
	private Boolean od = null;

	@Column(name = "isConfirmed")
	private Boolean isConfirmed = false;

	@Column(name = "bomCheck")
	private Boolean bomCheck = false;

	@Column(name = "routingCheck")
	private Boolean routingCheck = false;

	@Column(name = "dependencyCheck")
	private Boolean dependencyCheck = false;

	@Column(name = "similarCahier")
	private String similarCahier = null;

	@Column(name = "similarCahierMatch")
	private Integer similarCahierMatch = null;

	@OneToMany(mappedBy = "cahier"/* , cascade = CascadeType.ALL */)
	private Set<WorkcenterPart> cahierparts = new HashSet<>();

	@OneToMany(mappedBy = "cahier")
	private Set<CahierDrawing> drawings = new HashSet<>();

	@OneToMany(mappedBy = "cahier")
	private Set<CahierTool> tools = new HashSet<>();

	@OneToMany(mappedBy = "cahier")
	private Set<CahierString> cahierStrings = new HashSet<>();

	@OneToMany(mappedBy = "cahier")
	private Set<CahierDDA> cahierDDAs = new HashSet<>();

	@ManyToOne(fetch = FetchType.LAZY)
	Workcenter workcenter;

	@ManyToOne(fetch = FetchType.LAZY)
	Jalon jalon;

	@ManyToOne(fetch = FetchType.LAZY)
	ObjectDependency objectdependency;

	public Cahier(String name, String wcId, Long jalonId, String description, String cahierDuration, String effectivity,
			Long infotypeId, Long primaryJobTypeQty, Long secondaryJobType, Long secondaryJobTypeQty, Boolean fromBoard,
			Boolean pva, Boolean wireCut, Boolean edl, Long productId, Long jobRoleId, Long methodId, Long typeId,
			Long number, Boolean b, Boolean r, Boolean od, Set<WorkcenterPart> cahierparts, Set<CahierDrawing> drawings,
			Set<CahierString> cahierStrings, Set<CahierDDA> cahierDDAs, Workcenter workcenter, Jalon jalon,
			ObjectDependency objectdependency) {
		super();
		this.name = name;
		this.wcId = wcId;
		this.jalonId = jalonId;
		this.description = description;
		this.cahierDuration = cahierDuration;
		this.effectivity = effectivity;
		this.infotypeId = infotypeId;

		this.primaryJobTypeQty = primaryJobTypeQty;
		this.secondaryJobType = secondaryJobType;
		this.secondaryJobTypeQty = secondaryJobTypeQty;
		this.fromBoard = fromBoard;
		this.pva = pva;
		this.wireCut = wireCut;
		this.edl = edl;
		this.productId = productId;
		this.jobRoleId = jobRoleId;
		this.methodId = methodId;
		this.typeId = typeId;
		this.number = number;
		this.b = b;
		this.r = r;
		this.od = od;
		this.cahierparts = cahierparts;
		this.drawings = drawings;
		this.cahierStrings = cahierStrings;
		this.cahierDDAs = cahierDDAs;
		this.workcenter = workcenter;
		this.jalon = jalon;
		this.objectdependency = objectdependency;
	}

	/*
	 * public Cahier(String name, Boolean b, Boolean r, Boolean od,
	 * CahierInformation cahierInformation, CahierFields cahierFields,
	 * Set<WorkcenterPart> cahierparts, Workcenter wc) { super(); this.name =
	 * name; this.b = b; this.r = r; this.od = od; //this.cahierInformation =
	 * cahierInformation; //this.cahierFields = cahierFields; this.cahierparts =
	 * cahierparts; this.workcenter=wc;
	 * 
	 * }
	 */

	public Cahier() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getB() {
		return b;
	}

	public void setB(Boolean b) {
		this.b = b;
	}

	public Boolean getR() {
		return r;
	}

	public void setR(Boolean r) {
		this.r = r;
	}

	public Boolean getOd() {
		return od;
	}

	public void setOd(Boolean od) {
		this.od = od;
	}

	public Workcenter getWorkcenter() {
		return workcenter;
	}

	public void setWorkcenter(Workcenter workcenter) {
		this.workcenter = workcenter;
	}

	public Jalon getJalon() {
		return jalon;
	}

	public void setJalon(Jalon jalon) {
		this.jalon = jalon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<WorkcenterPart> getCahierParts() {
		return cahierparts;
	}

	public void setCahierParts(Set<WorkcenterPart> cahierparts) {
		this.cahierparts = cahierparts;
	}

	public Set<CahierDrawing> getDrawings() {
		return drawings;
	}

	public void setDrawings(Set<CahierDrawing> drawings) {
		this.drawings = drawings;
	}

	public Set<CahierDDA> getCahierDDAs() {
		return cahierDDAs;
	}

	public void setCahierDDAs(Set<CahierDDA> cahierDDAs) {
		this.cahierDDAs = cahierDDAs;
	}

	public Set<CahierString> getCahierStrings() {
		return cahierStrings;
	}

	public void setCahierStrings(Set<CahierString> cahierStrings) {
		this.cahierStrings = cahierStrings;
	}

	public ObjectDependency getObjectdependency() {
		return objectdependency;
	}

	public void setObjectdependency(ObjectDependency objectdependency) {
		this.objectdependency = objectdependency;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCahierDuration() {
		return cahierDuration;
	}

	public void setCahierDuration(String cahierDuration) {
		this.cahierDuration = cahierDuration;
	}

	public String getEffectivity() {
		return effectivity;
	}

	public void setEffectivity(String effectivity) {
		this.effectivity = effectivity;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getPrimaryJobTypeQty() {
		return primaryJobTypeQty;
	}

	public void setPrimaryJobTypeQty(Long primaryJobTypeQty) {
		this.primaryJobTypeQty = primaryJobTypeQty;
	}

	public Long getSecondaryJobType() {
		return secondaryJobType;
	}

	public void setSecondaryJobType(Long secondaryJobType) {
		this.secondaryJobType = secondaryJobType;
	}

	public Long getSecondaryJobTypeQty() {
		return secondaryJobTypeQty;
	}

	public void setSecondaryJobTypeQty(Long secondaryJobTypeQty) {
		this.secondaryJobTypeQty = secondaryJobTypeQty;
	}

	public Boolean getFromBoard() {
		return fromBoard;
	}

	public void setFromBoard(Boolean fromBoard) {
		this.fromBoard = fromBoard;
	}

	public Boolean getPva() {
		return pva;
	}

	public void setPva(Boolean pva) {
		this.pva = pva;
	}

	public Boolean getWireCut() {
		return wireCut;
	}

	public void setWireCut(Boolean wireCut) {
		this.wireCut = wireCut;
	}

	public Boolean getEdl() {
		return edl;
	}

	public void setEdl(Boolean edl) {
		this.edl = edl;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getJobRoleId() {
		return jobRoleId;
	}

	public void setJobRoleId(Long jobRoleId) {
		this.jobRoleId = jobRoleId;
	}

	public Long getMethodId() {
		return methodId;
	}

	public void setMethodId(Long methodId) {
		this.methodId = methodId;
	}

	public Long getInfotypeId() {
		return infotypeId;
	}

	public void setInfotypeId(Long infotypeId) {
		this.infotypeId = infotypeId;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Set<WorkcenterPart> getCahierparts() {
		return cahierparts;
	}

	public void setCahierparts(Set<WorkcenterPart> cahierparts) {
		this.cahierparts = cahierparts;
	}

	public Set<CahierTool> getTools() {
		return tools;
	}

	public void setTools(Set<CahierTool> tools) {
		this.tools = tools;
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

	public Integer getSimilarCahierMatch() {
		return similarCahierMatch;
	}

	public void setSimilarCahierMatch(Integer similarCahierMatch) {
		this.similarCahierMatch = similarCahierMatch;
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
}
