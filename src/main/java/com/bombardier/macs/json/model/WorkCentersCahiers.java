package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.List;

public class WorkCentersCahiers   {
  
	 private List<WorkCenter> workCenters = new ArrayList<WorkCenter>();
	 private List<Cahier> cahiers = new ArrayList<Cahier>();
	public List<WorkCenter> getWorkCenters() {
		return workCenters;
	}
	public void setWorkCenters(List<WorkCenter> workCenters) {
		this.workCenters = workCenters;
	}
	public List<Cahier> getCahiers() {
		return cahiers;
	}
	public void setCahiers(List<Cahier> cahiers) {
		this.cahiers = cahiers;
	}
	 
	
	 
	
 
}
