package com.bombardier.macs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;


@Entity
@Table(name = "cahierupdatedpart")
public class CahierUpdatedPart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "number") 
    private String number;
	  
	@Column(name = "qty")
	private Integer qty;
    
    @Column(name = "description")
    private String description;
     
    @Column(name = "drawing")
    private String drawing;
    
    @Column(name = "revision")
    private String revision;
  
  
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true)
	WorkcenterPart part;
	
	
	@Column(name = "referenced_on_id")
	Long referencedOnId;
	
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true)
	PartType partType;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDrawing() {
		return drawing;
	}

	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public Integer getIntRevision() {	
		return !this.revision.isEmpty()?Integer.valueOf(revision):0;	
	}
	
	public WorkcenterPart getPart() {
		return part;
	}

	public void setPart(WorkcenterPart part) {
		this.part = part;
	}

	public PartType getPartType() {
		return partType;
	}

	public void setPartType(PartType partType) {
		this.partType = partType;
	}

	public Long getReferencedOn() {
		return referencedOnId;
	}

	public void setReferencedOn(Long referencedOnId) {
		this.referencedOnId = referencedOnId;
	}

	
}
