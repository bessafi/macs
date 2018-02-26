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
@Table(name = "cahierdrawing")
public class CahierDrawing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "number")
	private String number;

	@Column(name = "revision")
	private String revision = null;

	@Column(name = "effectivity")
	private String effectivity = null;

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

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getEffectivity() {
		return effectivity;
	}

	public void setEffectivity(String effectivity) {
		this.effectivity = effectivity;
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

}
