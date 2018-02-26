package com.bombardier.macs.json.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"updatedFields"})
public class Tool  extends CahierComponentField {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("flagMethod")
  private Boolean flagMethod = null;

  @JsonProperty("flagABCL")
  private Boolean flagABCL = null;

  public Tool id(Long id) {
    this.id = id;
    return this;
  }

  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tool number(String number) {
    this.number = number;
    return this;
  }

  

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Tool description(String description) {
    this.description = description;
    return this;
  }

 

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tool flagMethod(Boolean flagMethod) {
    this.flagMethod = flagMethod;
    return this;
  }

  

  public Boolean getFlagMethod() {
    return flagMethod;
  }

  public void setFlagMethod(Boolean flagMethod) {
    this.flagMethod = flagMethod;
  }

  public Tool flagABCL(Boolean flagABCL) {
    this.flagABCL = flagABCL;
    return this;
  }

  

  public Boolean getFlagABCL() {
    return flagABCL;
  }

  public void setFlagABCL(Boolean flagABCL) {
    this.flagABCL = flagABCL;
  }


}

