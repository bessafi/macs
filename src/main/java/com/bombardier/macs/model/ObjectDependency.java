package com.bombardier.macs.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "objectdependency")
public class ObjectDependency {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
	
	
	 @OneToMany(mappedBy="objectdependency")
	  private Set<Cahier> cahiers = new HashSet<>();
	
	  
}
