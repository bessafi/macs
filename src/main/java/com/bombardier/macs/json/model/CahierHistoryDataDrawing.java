package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.List;


public class CahierHistoryDataDrawing {
	
	private String type;
	
	private  List<Drawing> data= new ArrayList<Drawing>();

	public CahierHistoryDataDrawing(String type, List<Drawing> data) {
		super();
		this.type = type;
		this.data = data;
	}

	public CahierHistoryDataDrawing() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Drawing> getData() {
		return data;
	}
	
	public List<Drawing> getData1() {
		return data;
	}


	public void setData(List<Drawing> data) {
		this.data = data;
	}
	
	
	
}
