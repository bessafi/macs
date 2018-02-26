package com.bombardier.macs.json.model;

import java.util.Date;
import java.util.List;


public class CahierHistory {
	
	
	private Long id;
	
	private Long cahierId;
	
	private Integer actionId;
	
	private String action;
	
	//private CahierHistoryData actionData;
	//private List<Drawing> actionData1;
	private Object actionData;
	private String type;
	
	private String modifiedBy;
	
	private String modifiedOn;
	

	
	public CahierHistory( Integer actionId, CahierHistoryData actionData, String modifiedBy, String modifiedOn) {
		super();
		this.actionId = actionId;
		this.actionData = actionData;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}

	public CahierHistory() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Long getCahierId() {
		return cahierId;
	}

	public void setCahierId(Long cahierId) {
		this.cahierId = cahierId;
	}

	

	public Object getActionData() {
		return actionData;
	}

	public void setActionData(Object actionData) {
		this.actionData = actionData;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
	
}
