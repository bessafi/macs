package com.bombardier.macs.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "jalon",
		uniqueConstraints=
		@UniqueConstraint(columnNames={"title", "workcenter_id"})
)
public class Jalon {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private Long id;
		   
  @NotNull
  @Column(name = "title")	  
  private String title = null;

  @OneToMany(mappedBy="jalon")
  private Set<Cahier> cahiers = new HashSet<>();

  @ManyToOne(fetch=FetchType.LAZY) 
  Workcenter workcenter;
 
  
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

public Set<Cahier> getCahiers() {
	return cahiers;
}

public void setCahiers(Set<Cahier> cahiers) {
	this.cahiers = cahiers;
}

public Workcenter getWorkcenter() {
	return workcenter;
}

public void setWorkcenter(Workcenter workcenter) {
	this.workcenter = workcenter;
}
  
  
  
  

}

