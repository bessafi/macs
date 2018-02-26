package com.bombardier.macs.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Drawing
 */
@JsonIgnoreProperties({"updatedFields"})
public class Drawing extends CahierComponentField  {
 
  private Long id = null;

  private String number = null;

  private String revision = null;

  private String effectivity = null;

  private Boolean flagMethod = null;

  private Boolean flagABCL = null;

  public Drawing id(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Drawing number(String number) {
    this.number = number;
    return this;
  }
  
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Drawing revision(String revision) {
    this.revision = revision;
    return this;
  }

  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public Drawing effectivity(String effectivity) {
    this.effectivity = effectivity;
    return this;
  }

  public String getEffectivity() {
    return effectivity;
  }

  public void setEffectivity(String effectivity) {
    this.effectivity = effectivity;
  }

  public Drawing flagMethod(Boolean flagMethod) {
    this.flagMethod = flagMethod;
    return this;
  }

  public Boolean getFlagMethod() {
    return flagMethod;
  }

  public void setFlagMethod(Boolean flagMethod) {
    this.flagMethod = flagMethod;
  }

  public Drawing flagABCL(Boolean flagABCL) {
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

