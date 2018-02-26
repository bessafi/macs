package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.List;


public class CahierHistoryDataTool {
	
	private String type;
	
	private  List<Tool> data= new ArrayList<Tool>();

	public CahierHistoryDataTool(String type, List<Tool> data) {
		super();
		this.type = type;
		this.data = data;
	}

	public CahierHistoryDataTool() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Tool> getData() {
		return data;
	}
	
	public List<Tool> getData1() {
		return data;
	}


	public void setData(List<Tool> data) {
		this.data = data;
	}
	
	
	
}
