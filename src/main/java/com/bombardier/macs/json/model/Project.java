package com.bombardier.macs.json.model;

import java.io.Serializable;

public class Project implements Serializable {
	private static final long serialVersionUID = 1280075458487017492L;
	
	private Long id;
	private String model = null;
	private String tail = null;
	private String sqNo = null;
	private String pa = null;

	public Project() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTail() {
		return tail;
	}

	public void setTailNumber(String tailNumber) {
		this.tail = tailNumber;
	}

	public String getSqNo() {
		return sqNo;
	}

	public void setSqNo(String sequenceNumber) {
		this.sqNo = sequenceNumber;
	}

	public String getPa() {
		return pa;
	}

	public void setPa(String pa) {
		this.pa = pa;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

}
