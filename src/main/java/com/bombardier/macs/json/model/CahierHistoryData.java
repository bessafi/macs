package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.List;


public class CahierHistoryData {
	
	private String type;
	
	private  List<CahierComponentField> data= new ArrayList<CahierComponentField>();

	public CahierHistoryData(String type, List<CahierComponentField> data) {
		super();
		this.type = type;
		this.data = data;
	}

	public CahierHistoryData() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<CahierComponentField> getData() {
		return data;
	}
	
	public List<CahierComponentField> getData1() {
		return data;
	}


	public void setData(List<CahierComponentField> data) {
		this.data = data;
	}
	
	
	
}
