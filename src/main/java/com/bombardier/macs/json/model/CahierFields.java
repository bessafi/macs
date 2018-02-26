


package com.bombardier.macs.json.model;


public class CahierFields {

  private Long id;	
	
  
  private Long productId = null;

 
  private Long jobRoleId = null;
 
  
  private Long methodId = null;


  private Long typeId = null;

 
  private Long number = null;


  private CahierFieldFlag flags = null;


  public CahierFields() {
	super();
}

public CahierFields(Long productId, Long jobRoleId, Long methodId, Long typeId, Long number, Boolean b,
			Boolean r, Boolean od) {
		super();
		this.productId = productId;
		this.jobRoleId = jobRoleId;
		this.methodId = methodId;
		this.typeId = typeId;
		this.number = number;
		flags=new CahierFieldFlag(b,  r,  od) ;
		
	}

public CahierFields(Long id, Long productId, Long jobRoleId, Long methodId, Long typeId, Long number, Boolean b,
		Boolean r, Boolean od) {
	super();
	this.id = id;
	this.productId = productId;
	this.jobRoleId = jobRoleId;
	this.methodId = methodId;
	this.typeId = typeId;
	this.number = number;
	flags=new CahierFieldFlag(b,  r,  od) ;
	
}
  
  
  public CahierFields(Long id, Long productId, Long jobRoleId, Long methodId, Long typeId, Long number,
		CahierFieldFlag flags) {
	super();
	this.id = id;
	this.productId = productId;
	this.jobRoleId = jobRoleId;
	this.methodId = methodId;
	this.typeId = typeId;
	this.number = number;
	this.flags = flags;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public Long getJobRoleId() {
    return jobRoleId;
  }

  public void setJobRoleId(Long jobRoleId) {
    this.jobRoleId = jobRoleId;
  }

  
  public Long getMethodId() {
    return methodId;
  }

  public void setMethodId(Long methodId) {
    this.methodId = methodId;
  }


  public Long getTypeId() {
    return typeId;
  }

  public void setTypeId(Long typeId) {
    this.typeId = typeId;
  }

  
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  
  public CahierFieldFlag getFlags() {
    return flags;
  }

  public void setFlags(CahierFieldFlag flags) {
    this.flags = flags;
  }


  

}

