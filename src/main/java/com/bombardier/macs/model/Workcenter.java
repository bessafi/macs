package com.bombardier.macs.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "workcenter")
public class Workcenter implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "wcnumber")
	private String wcNumber;

	@Column(name = "title")
	private String title;

	@Column(name = "projectid")
	private String projectId;

	@Column(name = "subsectorid")
	private String subSectorId;

	@Column(name = "sectorid")
	private String sectorId;

	@Column(name = "csd")
	private Boolean csd;

	@Column(name = "active")
	private Boolean active;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "workcenter")
	private Set<WorkcenterPart> wcparts = new HashSet<WorkcenterPart>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "workcenter")
	private Set<Cahier> wccahiers = new HashSet<>();

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, mappedBy = "workcenter")
	private Set<Jalon> jalons = new HashSet<>();

	public Workcenter(Long id, String wcNumber, String title, String projectId, String subSectorId, String sectorId,
			Set<WorkcenterPart> wcparts, Set<Cahier> wccahiers, Set<Jalon> jalons) {
		super();
		this.id = id;
		this.wcNumber = wcNumber;
		this.title = title;
		this.projectId = projectId;
		this.subSectorId = subSectorId;
		this.sectorId = sectorId;
		this.wcparts = wcparts;
		this.wccahiers = wccahiers;
		this.jalons = jalons;
	}

	public Workcenter(String wcNumber, String title, String projectId, String sectorId, String subSectorId,
			Set<WorkcenterPart> wcparts, Set<Cahier> wccahiers, Set<Jalon> jalons) {
		super();
		this.wcNumber = wcNumber;
		this.title = title;
		this.projectId = projectId;
		this.subSectorId = subSectorId;
		this.sectorId = sectorId;
		this.wcparts = wcparts;
		this.wccahiers = wccahiers;
		this.jalons = jalons;
	}

	public Workcenter(Long id, String title, Set<WorkcenterPart> wcparts, Set<Cahier> wccahiers, Set<Jalon> jalons) {
		super();
		this.id = id;
		this.title = title;
		this.wcparts = wcparts;
		this.wccahiers = wccahiers;
		this.jalons = jalons;
	}

	public Workcenter() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public Set<WorkcenterPart> getWcparts() {
		return wcparts;
	}

	public void setWcparts(Set<WorkcenterPart> wcparts) {
		this.wcparts = wcparts;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public String getWcNumber() {
		return wcNumber;
	}

	public void setWcNumber(String wcNumber) {
		this.wcNumber = wcNumber;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSubSectorId() {
		return subSectorId;
	}

	public void setSubSectorId(String subSectorId) {
		this.subSectorId = subSectorId;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public Set<Cahier> getWccahiers() {
		return wccahiers;
	}

	public void setWccahiers(Set<Cahier> wccahiers) {
		this.wccahiers = wccahiers;
	}

	public Set<Jalon> getJalons() {
		return jalons;
	}

	public void setJalons(Set<Jalon> jalons) {
		this.jalons = jalons;
	}

	public Boolean getCsd() {
		return csd;
	}

	public void setCsd(Boolean csd) {
		this.csd = csd;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
