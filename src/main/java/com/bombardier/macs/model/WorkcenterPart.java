package com.bombardier.macs.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "part")
public class WorkcenterPart {

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "number")
	private String number;

	@Column(name = "qty")
	private Integer qty;

	@Column(name = "parentid")
	private String parentid;

	@Column(name = "string")
	private String string;

	@Column(name = "description")
	private String description;

	@Column(name = "drawing")
	private String drawing;

	@Column(name = "revision")
	private String revision;

	@Column(name = "authority")
	private String authority = null;

	@Column(name = "statusNbrAssgn")
	private String statusNbrAssgn;

	@Column(name = "statusStrAssgn")
	private String statusStrAssgn;

	@Column(name = "statusDrwAssgn")
	private String statusDrwAssgn;

	@Column(name = "statusRevAssgn")
	private String statusRevAssgn;

	@Column(name = "lnkNbrRclk")
	private String lnkNbrRclk;

	@Column(name = "lnkStrRclk")
	private String lnkStrRclk;

	@Column(name = "lnkDrwRclk")
	private String lnkDrwRclk;

	@Column(name = "lnkRevRclk")
	private String lnkRevRclk;
	// --
	@Column(name = "type")
	private String type;

	@Column(name = "flagmethod")
	private Boolean flagMethod;

	@Column(name = "flagabcl")
	private Boolean flagABCL;

	@Column(name = "materialNo")
	private String materialNo;

	@Lob
	@Column(name = "partlist", columnDefinition = "TEXT")
	private String partList;

	@ManyToOne(optional = true)
	@JoinColumn(nullable = true)
	WorkcenterPart parent;

	@OneToMany(mappedBy = "parent")
	private Set<WorkcenterPart> children = null;

	@OneToMany(mappedBy = "part")
	private Set<CahierUpdatedPart> updatedParts = new HashSet<>();

	@ManyToOne(fetch = FetchType.LAZY)
	Workcenter workcenter;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cahier_id")
	Cahier cahier;
	
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true)
	PartType partType;
	

	public WorkcenterPart() {
		super();
	}

	public WorkcenterPart(String id, String parentid, Integer qty, WorkcenterPart parent, Workcenter workcenter,
			Cahier cahier) {
		super();
		this.id = id;
		this.parentid = parentid;
		this.qty = qty;
		this.parent = parent;
		this.workcenter = workcenter;
		this.cahier = cahier;
	}

	

	public WorkcenterPart(String id, String number, Integer qty, String parentid, String string, String description,
			String drawing, String revision, String authority, String statusNbrAssgn, String statusStrAssgn,
			String statusDrwAssgn, String statusRevAssgn, String lnkNbrRclk, String lnkStrRclk, String lnkDrwRclk,
			String lnkRevRclk, Workcenter workcenter, Cahier cahier) {
		super();
		this.id = id;
		this.number = number;
		this.qty = qty;
		this.parentid = parentid;
		this.string = string;
		this.description = description;
		this.drawing = drawing;
		this.revision = revision;
		this.authority = authority;
		this.statusNbrAssgn = statusNbrAssgn;
		this.statusStrAssgn = statusStrAssgn;
		this.statusDrwAssgn = statusDrwAssgn;
		this.statusRevAssgn = statusRevAssgn;
		this.lnkNbrRclk = lnkNbrRclk;
		this.lnkStrRclk = lnkStrRclk;
		this.lnkDrwRclk = lnkDrwRclk;
		this.lnkRevRclk = lnkRevRclk;
		this.workcenter = workcenter;
		this.cahier = cahier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Workcenter getWorkcenter() {
		return workcenter;
	}

	public void setWorkcenter(Workcenter workcenter) {
		this.workcenter = workcenter;
		if (this.getChildren() != null) {
			for (WorkcenterPart child : this.getChildren()) {
				child.setWorkcenter(workcenter);
			}
		}
	}

	public WorkcenterPart getParent() {
		return parent;
	}

	public void setParent(WorkcenterPart parent) {
		this.parent = parent;
	}

	public Set<WorkcenterPart> getChildren() {
		return children;
	}

	public void setChildren(Set<WorkcenterPart> children) {
		this.children = children;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Cahier getCahier() {
		return cahier;
	}

	public void setCahier(Cahier cahier) {
		this.cahier = cahier;
		if (this.getChildren() != null) {
			for (WorkcenterPart child : this.getChildren()) {
				child.setCahier(cahier);
			}
		}
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDrawing() {
		return drawing;
	}

	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getStatusNbrAssgn() {
		return statusNbrAssgn;
	}

	public void setStatusNbrAssgn(String statusNbrAssgn) {
		this.statusNbrAssgn = statusNbrAssgn;
	}

	public String getStatusStrAssgn() {
		return statusStrAssgn;
	}

	public void setStatusStrAssgn(String statusStrAssgn) {
		this.statusStrAssgn = statusStrAssgn;
	}

	public String getStatusDrwAssgn() {
		return statusDrwAssgn;
	}

	public void setStatusDrwAssgn(String statusDrwAssgn) {
		this.statusDrwAssgn = statusDrwAssgn;
	}

	public String getStatusRevAssgn() {
		return statusRevAssgn;
	}

	public void setStatusRevAssgn(String statusRevAssgn) {
		this.statusRevAssgn = statusRevAssgn;
	}

	public String getLnkNbrRclk() {
		return lnkNbrRclk;
	}

	public void setLnkNbrRclk(String lnkNbrRclk) {
		this.lnkNbrRclk = lnkNbrRclk;
	}

	public String getLnkStrRclk() {
		return lnkStrRclk;
	}

	public void setLnkStrRclk(String lnkStrRclk) {
		this.lnkStrRclk = lnkStrRclk;
	}

	public String getLnkDrwRclk() {
		return lnkDrwRclk;
	}

	public void setLnkDrwRclk(String lnkDrwRclk) {
		this.lnkDrwRclk = lnkDrwRclk;
	}

	public String getLnkRevRclk() {
		return lnkRevRclk;
	}

	public void setLnkRevRclk(String lnkRevRclk) {
		this.lnkRevRclk = lnkRevRclk;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getFlagMethod() {
		return flagMethod;
	}

	public void setFlagMethod(Boolean flagMethod) {
		this.flagMethod = flagMethod;
	}

	public Boolean getFlagABCL() {
		return flagABCL;
	}

	public void setFlagABCL(Boolean flagABCL) {
		this.flagABCL = flagABCL;
	}

	public String getPartList() {
		return partList;
	}

	public void setPartList(String partList) {
		this.partList = partList;
	}

	public Set<CahierUpdatedPart> getUpdatedParts() {
		return updatedParts;
	}

	public void setUpdatedParts(Set<CahierUpdatedPart> updatedParts) {
		this.updatedParts = updatedParts;
	}

	public String getMaterialNo() {
		return materialNo;
	}

	public void setMaterialNo(String materialNo) {
		this.materialNo = materialNo;
	}

	
	public PartType getPartType() {
		return partType;
	}

	public void setPartType(PartType partType) {
		this.partType = partType;
	}

}
