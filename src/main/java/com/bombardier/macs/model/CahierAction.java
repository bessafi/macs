package com.bombardier.macs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cahieraction")
public class CahierAction {
  
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "nameen")
	private String nameEn;
	
	@Column(name = "namefr")
	private String nameFr;
	

	public CahierAction(String type, String nameEn, String nameFr) {
		super();
		this.type = type;
		this.nameEn = nameEn;
		this.nameFr = nameFr;
	}

	public CahierAction() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameFr() {
		return nameFr; 
	}

	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}

	
}
