package com.bombardier.macs.json.model;

public class PartLinks {

	private PartLinksRightClick number = null;

	private PartLinksRightClick string = null;

	private PartLinksRightClick drawing = null;

	private PartLinksRightClick revision = null;
	private PartLinksRightClick authority = null;

	public PartLinks() {
		super();
	}

	public PartLinks(String number, String string, String drawing, String authority) {
		super();
		this.number = new PartLinksRightClick(number);
		this.string = new PartLinksRightClick(string);
		this.drawing = new PartLinksRightClick(drawing);
		this.revision = new PartLinksRightClick(drawing);
		this.authority = new PartLinksRightClick(authority);
	}

	public PartLinksRightClick getNumber() {
		return number;
	}

	public void setNumber(PartLinksRightClick number) {
		this.number = number;
	}

	public PartLinksRightClick getString() {
		return string;
	}

	public void setString(PartLinksRightClick string) {
		this.string = string;
	}

	public PartLinksRightClick getDrawing() {
		return drawing;
	}

	public void setDrawing(PartLinksRightClick drawing) {
		this.drawing = drawing;
	}

	public PartLinksRightClick getRevision() {
		return revision;
	}

	public void setRevision(PartLinksRightClick revision) {
		this.revision = revision;
	}

	public PartLinksRightClick getAuthority() {
		return authority;
	}

	public void setAuthority(PartLinksRightClick authority) {
		this.authority = authority;
	}

	/*
	 * public String getRevision() { StringBuilder sb = new StringBuilder();
	 * sb.append("{ rightClick: ").append(revision).append("}"); return
	 * sb.toString(); }
	 */

}
