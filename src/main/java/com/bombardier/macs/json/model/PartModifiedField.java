package com.bombardier.macs.json.model;

import java.util.ArrayList;
import java.util.List;


public class PartModifiedField {

	  private List<String> numberHistory= new ArrayList<String>(); 

	  private List<String> descriptionHistory= new ArrayList<String>(); 

	  private List<Integer> qtyHistory= new ArrayList<Integer>(); 

	  private List<String> drawingHistory= new ArrayList<String>(); 
	  
	  private List<String> revisionHistory= new ArrayList<String>();
	  

	public List<String> getNumberHistory() {
		return numberHistory;
	}

	public void setNumberHistory(List<String> numberHistory) {
		this.numberHistory = numberHistory;
	}

	public List<String> getDescriptionHistory() {
		return descriptionHistory;
	}

	public void setDescriptionHistory(List<String> descriptionHistory) {
		this.descriptionHistory = descriptionHistory;
	}

	public List<Integer> getQtyHistory() {
		return qtyHistory;
	}

	public void setQtyHistory(List<Integer> qtyHistory) {
		this.qtyHistory = qtyHistory;
	}

	public List<String> getDrawingHistory() {
		return drawingHistory;
	}

	public void setDrawingHistory(List<String> drawingHistory) {
		this.drawingHistory = drawingHistory;
	}

	public List<String> getRevisionHistory() {
		return revisionHistory;
	}

	public void setRevisionHistory(List<String> revisionHistory) {
		this.revisionHistory = revisionHistory;
	} 
	  
	  
  
	
}
