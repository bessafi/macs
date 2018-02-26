package com.bombardier.macs.json.model;

public class CahierSuggestion {

	private String wcId;
	private String cahierId;
	private String match;

	public CahierSuggestion(String wcId, String cahierId, String match) {
		super();
		this.wcId = wcId != null ? wcId.trim() : "";
		this.cahierId = cahierId != null ? cahierId.trim().replaceAll("^0+", "") : "";
		this.match = match != null ? match.trim() : "";
	}

	public String getWcId() {
		return wcId;
	}

	public void setWcId(String wcId) {
		this.wcId = wcId;
	}

	public String getCahierId() {
		return cahierId;
	}

	public void setCahierId(String cahierId) {
		this.cahierId = cahierId;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}
}
