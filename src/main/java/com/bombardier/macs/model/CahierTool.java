package com.bombardier.macs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cahiertool")
public class CahierTool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "number")
	private String number;

	@Column(name = "description")
	private String description = null;

	@Column(name = "flagmethod")
	private Boolean flagMethod = null;

	@Column(name = "flagabcl")
	private Boolean flagABCL = null;

	@ManyToOne(fetch = FetchType.LAZY)
	private Cahier cahier;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cahier getCahier() {
		return cahier;
	}

	public void setCahier(Cahier cahier) {
		this.cahier = cahier;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
