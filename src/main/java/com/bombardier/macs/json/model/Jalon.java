package com.bombardier.macs.json.model;

import java.util.HashSet;
import java.util.Set;


public class Jalon {
 
 
 private Long id;
  private String title = null;
  private Set<WorkCenterCahier> cahiers = new HashSet<WorkCenterCahier>();

  
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

public Set<WorkCenterCahier> getCahiers() {
	return cahiers;
}

public void setCahiers(Set<WorkCenterCahier> cahiers) {
	this.cahiers = cahiers;
}



  
  
  
//@OneToMany(mappedBy="workcenterjalon")
// private List<WorkCenterCahier> cahiers = null;

//@ManyToOne(fetch=FetchType.LAZY) 
//Workcenter workcenter;


}

