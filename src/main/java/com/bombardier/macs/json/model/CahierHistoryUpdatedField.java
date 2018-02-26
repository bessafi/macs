package com.bombardier.macs.json.model;


public class CahierHistoryUpdatedField   {

    private String field  = null;
	private String newValue  = null;
	private String oldValue  = null;
	  
  
	public CahierHistoryUpdatedField() {
		super();
	}

	public CahierHistoryUpdatedField(String field, String newValue, String oldValue) {
		super();
		this.field = field;
		this.newValue = newValue;
		this.oldValue = oldValue;
	}
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}

	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	  


}

