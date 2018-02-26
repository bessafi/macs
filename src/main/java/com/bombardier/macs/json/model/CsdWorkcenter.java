package com.bombardier.macs.json.model;

public class CsdWorkcenter {

	private Integer bomItemLevel;
 
    private Integer qty;
	   
    private String partNumber;
    
    private String partTitle ;
   	  
    private String edrnNieoRev ;
   	
    private String installedBy ;
    
    private Boolean toDwg ;
    
    private String dirReleaseDate ;
    
    private String dataSetType ;
  
    private String cageCode ;
    
    private String modSumNo ;
    
    private String materialGrp ;
    
    private String cahierName ;
    
 


public CsdWorkcenter(Integer bomIemLevel, Integer qty, String partNumber, String partTitle, String edrnNieoRev,
			String installedBy, Boolean toDwg, String dirReleaseDate, String dataSetType, String cahierName,
			String cageCode, String modSumNo, String materialGrp) {
		super();
		this.bomItemLevel = bomIemLevel;
		this.qty = qty;
		this.partNumber = partNumber;
		this.partTitle = partTitle;
		this.edrnNieoRev = edrnNieoRev;
		this.installedBy = installedBy;
		this.toDwg = toDwg;
		this.dirReleaseDate = dirReleaseDate;
		this.dataSetType = dataSetType;
		this.cageCode = cageCode;
		this.modSumNo = modSumNo;
		this.materialGrp = materialGrp;
		this.cahierName=cahierName;
	}



public CsdWorkcenter() {
}



public String getPartNumber() {
return partNumber;
}

public void setPartNumber(String number) {
this.partNumber = number;
}



//@JsonProperty("parent")

public Integer getQty() {
return qty;
}

public void setQty(Integer qty) {
this.qty = qty;
}



public Integer getBomIemLevel() {
	return bomItemLevel;
}



public void setBomIemLevel(Integer bomIemLevel) {
	this.bomItemLevel = bomIemLevel;
}



public String getPartTitle() {
	return partTitle;
}



public void setPartTitle(String partTitle) {
	this.partTitle = partTitle;
}



public String getEdrnNieoRev() {
	return edrnNieoRev;
}



public void setEdrnNieoRev(String edrnNieoRev) {
	this.edrnNieoRev = edrnNieoRev;
}



public String getInstalledBy() {
	return installedBy;
}



public void setInstalledBy(String installedBy) {
	this.installedBy = installedBy;
}



public Boolean getToDwg() {
	return toDwg;
}



public void setToDwg(Boolean toDwg) {
	this.toDwg = toDwg;
}



public String getDirReleaseDate() {
	return dirReleaseDate;
}



public void setDirReleaseDate(String dirReleaseDate) {
	this.dirReleaseDate = dirReleaseDate;
}



public String getDataSetType() {
	return dataSetType;
}



public void setDataSetType(String dataSetType) {
	this.dataSetType = dataSetType;
}



public String getCageCode() {
	return cageCode;
}



public void setCageCode(String cageCode) {
	this.cageCode = cageCode;
}



public String getModSumNo() {
	return modSumNo;
}



public void setModSumNo(String modSumNo) {
	this.modSumNo = modSumNo;
}



public String getMaterialGrp() {
	return materialGrp;
}



public void setMaterialGrp(String materialGrp) {
	this.materialGrp = materialGrp;
}



public Integer getBomItemLevel() {
	return bomItemLevel;
}



public void setBomItemLevel(Integer bomItemLevel) {
	this.bomItemLevel = bomItemLevel;
}



public String getCahierName() {
	return cahierName;
}



public void setCahierName(String cahierName) {
	this.cahierName = cahierName;
}




}

