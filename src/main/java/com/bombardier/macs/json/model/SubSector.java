package com.bombardier.macs.json.model;

import java.io.Serializable;

public class SubSector implements Serializable {
	private static final long serialVersionUID = -879485448934688161L;
	private String id;
	private String titleEn;
	private String titleFr;
	private String sectorId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitleEn() {
		return titleEn;
	}

	public void setTitleEn(String titleEn) {
		this.titleEn = titleEn;
	}

	public String getTitleFr() {
		return titleFr;
	}

	public void setTitleFr(String titleFr) {
		this.titleFr = titleFr;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
}
