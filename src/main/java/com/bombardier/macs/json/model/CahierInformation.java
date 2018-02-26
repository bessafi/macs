package com.bombardier.macs.json.model;

public class CahierInformation {

	private Long id;

	private String description = null;

	private String cahierDuration = null;

	private String effectivity = null;

	private Long typeId = null;

	private Long primaryJobTypeQty = null;

	private Long secondaryJobType = null;

	private Long secondaryJobTypeQty = null;

	private Boolean fromBoard = null;

	private Boolean pva = null;

	private Boolean wireCut = null;

	private Boolean edl = null;

	public CahierInformation(Long id, String description, String cahierDuration, String effectivity, Long typeId,
			Long primaryJobTypeQty, Long secondaryJobType, Long secondaryJobTypeQty, Boolean fromBoard, Boolean pva,
			Boolean wireCut, Boolean edl) {
		super();
		this.id = id;
		this.description = description;
		this.cahierDuration = cahierDuration;
		this.effectivity = effectivity;
		this.typeId = typeId;
		this.primaryJobTypeQty = primaryJobTypeQty;
		this.secondaryJobType = secondaryJobType;
		this.secondaryJobTypeQty = secondaryJobTypeQty;
		this.fromBoard = fromBoard;
		this.pva = pva;
		this.wireCut = wireCut;
		this.edl = edl;
	}

	public CahierInformation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public CahierInformation effectivity(String effectivity) {
		this.effectivity = effectivity;
		return this;
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
		return fromBoard != null && fromBoard;
	}

	public void setFromBoard(Boolean fromBoard) {
		this.fromBoard = fromBoard;
	}

	public Boolean getPva() {
		return pva != null && pva;
	}

	public void setPva(Boolean pva) {
		this.pva = pva;
	}

	public Boolean getWireCut() {
		return wireCut != null && wireCut;
	}

	public void setWireCut(Boolean wireCut) {
		this.wireCut = wireCut;
	}

	public Boolean getEdl() {
		return edl != null && edl;
	}

	public void setEdl(Boolean edl) {
		this.edl = edl;
	}

}
