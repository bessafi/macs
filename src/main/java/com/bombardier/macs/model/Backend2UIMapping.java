package com.bombardier.macs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "backend_ui_mapping")
public class Backend2UIMapping {

	@Id
	private String backEndCode;
	private String uidCode;

	public String getBackEndCode() {
		return backEndCode;
	}

	public void setBackEndCode(String backEndCode) {
		this.backEndCode = backEndCode;
	}

	public String getUidCode() {
		return uidCode;
	}

	public void setUidCode(String uidCode) {
		this.uidCode = uidCode;
	}
}
