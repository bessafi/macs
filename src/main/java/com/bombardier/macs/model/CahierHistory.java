package com.bombardier.macs.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "cahierhistory")
public class CahierHistory {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "cahier_id")
	private Long cahierId;	
	@Column(name = "action_id")
	private Integer actionId;
	@Lob
	@Column(name = "actiondata", columnDefinition = "TEXT")
	private String actionData;

	@Column(name = "modifiedby")
	private String modifiedBy;
	
	@Column(name = "modifiedon")
	private String modifiedOn;
	


	public CahierHistory( Long cahierId, Integer actionId, String actionData, String modifiedBy, String modifiedOn) {
		super();
		this.cahierId = cahierId;
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

	public String getActionData() {
		return actionData;
	}

	public void setActionData(String actionData) {
		this.actionData = actionData;
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
	
	
	
}
