package com.bombardier.macs.json.model;

public class Source   {

	private String location = null;
	private String id = null;

	public Source() {
		super();
	}

	public Source(String location, String id) {
		super();
		this.location = location;
		this.id=id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
	
}

