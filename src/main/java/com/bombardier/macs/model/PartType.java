package com.bombardier.macs.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity  
@Table(name = "parttype")
public class PartType {
   
	@Id
	@Column(name = "id")
	private Integer id;
	 
	@Column(name = "type") 
	private String type;
     
	
	/*@OneToMany(mappedBy = "parttype")
	private Set<CahierTool>  = new HashSet<>();*/

	public Integer getId() {
		return id;
	}
  
	public void setId(Integer id) {
		this.id = id; 
	}

	public String getType() {
		return type;
	}  

	public void setType(String type) {
		this.type = type;
	} 
	
}
