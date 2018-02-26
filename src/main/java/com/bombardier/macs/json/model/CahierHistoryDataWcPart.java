package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.List;


public class CahierHistoryDataWcPart {
	
	private String type;
	
	private  List<WorkCenterPart> data= new ArrayList<WorkCenterPart>();

	public CahierHistoryDataWcPart(String type, List<WorkCenterPart> data) {
		super();
		this.type = type;
		this.data = data;
	}

	public CahierHistoryDataWcPart() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<WorkCenterPart> getData() {
		return data;
	}
	
	public List<WorkCenterPart> getData1() {
		return data;
	}


	public void setData(List<WorkCenterPart> data) {
		this.data = data;
	}
	
	
	
}
