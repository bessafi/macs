package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"updatedFields"})
public class WorkCenterPart extends CahierComponentField{

	public WorkCenterPart() {

	}

	private String id;

	private String parentId;

	private Integer qty;

	private String referenceNumber;
	
	private String type ; 

	private PartCreatedField createdFields=new PartCreatedField();;

	private PartModifiedField modifiedFields=new PartModifiedField();;

	private Boolean flagMethod = true;

	private Boolean flagABCL = true;

	private Set<String> partList = new HashSet<String>();

	private List<WorkCenterPart> children = new ArrayList<WorkCenterPart>();

	public WorkCenterPart(String id, Integer qty, String parent) {
		super();
		this.id = id;
		this.qty = qty;
		this.parentId = parent;

	}

	public WorkCenterPart(String id, String parentId, Integer qty, String type, PartCreatedField createdFields,
			PartModifiedField modifiedFields, Boolean flagMethod, Boolean flagABCL, Set<String> partList,
			List<WorkCenterPart> children) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.qty = qty;
		this.type = type;
		this.createdFields = createdFields;
		this.modifiedFields = modifiedFields;
		this.flagMethod = flagMethod;
		this.flagABCL = flagABCL;
		this.partList = partList;
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public List<WorkCenterPart> getChildren() {
		return children;
	}

	public void setChildren(List<WorkCenterPart> children) {
		this.children = children;
	}

	public void addChildrenItem(WorkCenterPart childrenItem) {
		if (!this.children.contains(childrenItem))
			this.children.add(childrenItem);
	}

	@Override
	public String toString() {
		return "WorkCenterPart [Id=" + id + " , parentId=" + parentId + ", childrens=" + children + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PartCreatedField getCreatedFields() {
		return createdFields;
	}

	public void setCreatedFields(PartCreatedField createdFields) {
		this.createdFields = createdFields;
	}

	public PartModifiedField getModifiedFields() {
		return modifiedFields;
	}

	public void setModifiedFields(PartModifiedField modifiedFields) {
		this.modifiedFields = modifiedFields;
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

	public Set<String> getPartList() {
		return partList;
	}

	public void setPartList(Set<String> partList) {
		this.partList = partList;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	
	
	/*JsonIgnoreProperties
	 * @JsonProperty("linksId") public long getLinksId() { if(links==null)
	 * return 0; else return links.getId(); }
	 * 
	 * 
	 * @JsonProperty("statusId") public long getStatusId() { if(status==null)
	 * return 0; else return status.getId();
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @JsonProperty("workcenterId") public long getWorkcenterId() {
	 * if(workcenter==null) { return workcenterId; } else return
	 * workcenter.getId(); }
	 * 
	 * 
	 * 
	 * //@JsonProperty("cahierId") //public long getCahierId() {
	 * //if(cahier==null) { // return cahierId; //} else return cahier.getId();
	 * //}
	 * 
	 * 
	 */

}
