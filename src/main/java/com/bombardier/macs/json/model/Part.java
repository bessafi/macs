package com.bombardier.macs.json.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bombardier.macs.Constants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "numberFallback", "materialNo", "drawingRef", "revisionRef", "level", "internalId",
		"authorityDescription" })
public class Part implements Comparable<Part> {

	private String id;

	private String number;

	private String internalId;

	private String numberFallback;

	private String parentId;

	private Integer qty;

	private String string;

	private String description;

	private String drawing;

	private String revision;

	private String drawingRef;

	private String revisionRef;

	private String materialNo;

	private String authorityId = null;
	private String authority = null;

	/**
	 * For example this could be : TOP-ASSSEMBLY
	 */
	private String type;

	// private String parent ;

	private PartStatus status = null;

	private PartLinks links = null;

	int level;

	public String getId() {
		return id;
	}

	// TODO check if that constructor needs to be extended to new fields, and if
	// so, update all references
	public Part(String id, String number, String parentId, Integer qty, String string, String description,
			String drawing, String revision, String authority, PartStatus status, PartLinks links) {
		super();
		this.id = id;
		this.number = number;
		this.parentId = parentId;
		this.qty = qty;
		this.string = string;
		this.description = description;
		this.drawing = drawing;
		this.revision = revision;
		this.authority = authority;
		this.status = status;
		this.links = links;
	}

	public Part(String id, String number, String numberFallback, String parentId, Integer qty, String string,
			String description, String drawing, String revision, String drawingRef, String revisionRef,
			String materialNo, String authorityId, String authority, String type, PartStatus status, PartLinks links,
			int level) {
		super();
		this.id = id;
		this.number = number;
		this.numberFallback = numberFallback;
		this.parentId = parentId;
		this.qty = qty;
		this.string = string;
		this.description = description;
		this.drawing = drawing;
		this.revision = revision;
		this.setDrawingRef(drawingRef);
		this.setRevisionRef(revisionRef);
		this.materialNo = materialNo;
		this.authorityId = authorityId;
		this.authority = authority;
		this.type = type;
		this.status = status;
		this.links = links;
		this.level = level;
	}

	// added new constructor to use to copy. This is used to avoid data
	// overwriting when updating cache from wip
	public Part(Part part) {
		this.id = part.getId();
		this.number = part.getNumber();
		this.parentId = part.getParentId();
		this.qty = part.getQty();
		this.string = part.getString();
		this.description = part.getDescription();
		this.drawing = part.getDrawing();
		this.revision = part.getRevision();
		this.setDrawingRef(part.getDrawingRef());
		this.setRevisionRef(part.getRevisionRef());
		this.authority = part.getAuthority();
		this.authorityId = part.getAuthorityId();

		copyPartStatus(part);

		this.links = part.getLinks();
		this.materialNo = part.getMaterialNo();
		this.type = part.getPartType();

	}

	private void copyPartStatus(Part part) {
		PartStatus statusCopy = new PartStatus();
		PartStatus statusOriginal = part.getStatus();
		if (statusOriginal != null) {
			if (statusOriginal.getNumber() != null) {
				statusCopy.setNumber(new PartStatusAssignment(statusOriginal.getNumber().getAssignment()));
			}
			if (statusOriginal.getDrawing() != null) {
				statusCopy.setDrawing(new PartStatusAssignment(statusOriginal.getDrawing().getAssignment()));
			}
			if (statusOriginal.getRevision() != null) {
				statusCopy.setRevision(new PartStatusAssignment(statusOriginal.getRevision().getAssignment()));
			}
			if (statusOriginal.getString() != null) {
				statusCopy.setString(new PartStatusAssignment(statusOriginal.getString().getAssignment()));
			}
		}
		this.status = statusCopy;
	}

	public Part() {
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

	/*
	 * public String getParent() { return parent; }
	 * 
	 * public void setParent(String parent) { this.parent = parent; }
	 */

	@JsonProperty("parent")
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

	public void setDrawingAndRevision(String drawingWithRevision) {
		if (drawingWithRevision != null) {
			Pattern drawingAndRevisionPattern = Pattern.compile(Constants.DRAWING_AND_REVISION_REGEX);
			Matcher m = drawingAndRevisionPattern.matcher(drawingWithRevision);
			if (m.matches()) {
				String drawing = m.group(1);
				String revision = m.group(2);
				if (drawing != null) {
					this.drawing = drawing.trim();
				}
				if (revision != null) {
					this.revision = revision.trim();
				}
			}
		}

		this.drawing = drawing;
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

	@JsonProperty("authority")
	public String getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(String authority) {
		this.authorityId = authority;
	}

	public PartStatus getStatus() {
		return status;
	}

	public void setStatus(PartStatus status) {
		this.status = status;
	}

	public PartLinks getLinks() {
		return links;
	}

	public void setLinks(PartLinks links) {
		this.links = links;
	}

	public String getPartType() {
		return type;
	}

	public void setPartType(String partType) {
		this.type = partType;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this)
			return true;
		if (!(o instanceof Part)) {
			return false;
		}
		Part part = (Part) o;
		return this.getId().equalsIgnoreCase(part.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public int compareTo(Part part) {
		return this.getId().compareToIgnoreCase(part.getId());
	}

	public String getMaterialNo() {
		return materialNo;
	}

	public void setMaterialNo(String materialNo) {
		this.materialNo = materialNo;
	}

	@JsonProperty("authorityDescription")
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authorityDescription) {
		this.authority = authorityDescription;
	}

	public String getNumberFallback() {
		return numberFallback;
	}

	public void setNumberFallback(String numberFallback) {
		this.numberFallback = numberFallback;
	}

	public String getDrawingRef() {
		return drawingRef;
	}

	public void setDrawingRef(String drawingRef) {
		this.drawingRef = drawingRef;
	}

	public String getRevisionRef() {
		return revisionRef;
	}

	public void setRevisionRef(String revisionRef) {
		this.revisionRef = revisionRef;
	}

	public String getInternalId() {
		return internalId;
	}

	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}

}
