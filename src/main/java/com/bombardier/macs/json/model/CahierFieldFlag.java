/*
 * MACS REST API
 * MACS UI rest api endpoints definition
 *
 * OpenAPI spec version: 0.0.3
 * Contact: macs_support@aero.bombardier.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bombardier.macs.json.model;


public class CahierFieldFlag {

 

  private Boolean b = null;
  
  private Boolean r = null;

  private Boolean od = null;

 
  

public CahierFieldFlag() {
	super();
}

public CahierFieldFlag(Boolean b, Boolean r, Boolean od) {
	super();
	this.b = b;
	this.r = r;
	this.od = od;
}

public Boolean getB() {
    return b;
  }

  public void setB(Boolean b) {
    this.b = b;
  }

 
  public Boolean getR() {
    return r;
  }

  public void setR(Boolean r) {
    this.r = r;
  }

  
  public Boolean getOd() {
    return od;
  }

  public void setOd(Boolean od) {
    this.od = od;
  }


}

