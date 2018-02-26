package com.bombardier.macs.json.model;

public class CahierConfirmationResponse {

	private boolean isConfirmed;
	private String cahierName;
	private Long sequenceNumber;

	public CahierConfirmationResponse(boolean isConfirmed, String cahierName, Long sequenceNumber) {
		super();
		this.isConfirmed = isConfirmed;
		this.cahierName = cahierName;
		this.sequenceNumber = sequenceNumber;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public String getCahierName() {
		return cahierName;
	}

	public void setCahierName(String cahierName) {
		this.cahierName = cahierName;
	}

	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

}
