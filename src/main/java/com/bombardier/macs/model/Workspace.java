package com.bombardier.macs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bombardier.macs.json.model.Project;
import com.bombardier.macs.json.model.Sector;
import com.bombardier.macs.json.model.SubSector;

public class Workspace implements Serializable {
	private static final long serialVersionUID = 3678221267447453836L;

	private List<Project> projects = new ArrayList<Project>();
	private List<Sector> sectors = new ArrayList<Sector>();
	private List<SubSector> subSectors = new ArrayList<SubSector>();

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Sector> getSectors() {
		return sectors;
	}

	public void setSectors(List<Sector> sectors) {
		this.sectors = sectors;
	}

	public List<SubSector> getSubSectors() {
		return subSectors;
	}

	public void setSubSectors(List<SubSector> subSectors) {
		this.subSectors = subSectors;
	}
}
