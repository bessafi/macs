package com.bombardier.macs.json.model;

public class CahierMinimumCheckResponse {
	private boolean isSuccess;

	public CahierMinimumCheckResponse(boolean isSuccess) {
		super();
		this.isSuccess = isSuccess;
	}

	public boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
