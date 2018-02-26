package com.bombardier.macs.json.model;

public class PartStatus {

	private PartStatusAssignment number = null;

	private PartStatusAssignment string = null;

	private PartStatusAssignment drawing = null;

	private PartStatusAssignment revision = null;

	public PartStatus() {
		super();
	}

	public PartStatus(String number, String string, String drawing, String revision) {
		super();
		this.number = new PartStatusAssignment(number);
		this.string = new PartStatusAssignment(string);
		this.drawing = new PartStatusAssignment(drawing);
		this.revision = new PartStatusAssignment(revision);
	}

	public PartStatusAssignment getNumber() {
		return number;
	}

	public void setNumber(PartStatusAssignment number) {
		this.number = number;
	}

	public PartStatusAssignment getString() {
		return string;
	}

	public void setString(PartStatusAssignment string) {
		this.string = string;
	}

	public PartStatusAssignment getDrawing() {
		return drawing;
	}

	public void setDrawing(PartStatusAssignment drawing) {
		this.drawing = drawing;
	}

	public PartStatusAssignment getRevision() {
		return revision;
	}

	public void setRevision(PartStatusAssignment revision) {
		this.revision = revision;
	}

	/*
	 * public String getNumber() { StringBuilder sb = new StringBuilder();
	 * sb.append("{ assignment: ").append(number).append("}"); return sb.toString();
	 * }
	 */

}
