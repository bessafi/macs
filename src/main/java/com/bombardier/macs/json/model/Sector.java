package com.bombardier.macs.json.model;

import java.io.Serializable;

public class Sector implements Serializable  {
	private static final long serialVersionUID = -5424880238131334760L;
	
	private String id;
	private String titleFr;
	private String titleEn;
        
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitleFr() {
		return titleFr;
	}
	public void setTitleFr(String titleFR) {
		this.titleFr = titleFR;
	}
	public String getTitleEn() {
		return titleEn;
	}
	public void setTitleEn(String titleEN) {
		this.titleEn = titleEN;
	}
}
