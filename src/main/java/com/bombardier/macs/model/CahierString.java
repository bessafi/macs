package com.bombardier.macs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "string")
public class CahierString   {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
		
	
	
	 @ManyToOne(fetch=FetchType.LAZY) 
	 private Workcenter cahier;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Workcenter getCahier() {
		return cahier;
	}



	public void setCahier(Workcenter cahier) {
		this.cahier = cahier;
	}
	 
	 
}
