package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.List;

public class Workspace   {
  
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
