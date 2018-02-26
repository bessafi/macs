package com.bombardier.macs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "masterpart")
public class MasterPart {

		 
		 @Id
		 @Column(name = "id")
		 private String id; 
		
		 @Column(name = "parentid")
	    private String parentId = null;
		
	    @Column(name = "part_nbr")
	     private Long partNbr;
	    
	    private String project;
	    private String sector;
	    private String subSector;
	    
		@Column(name = "cahierid", nullable=true)
	    private Long cahierid;
	   
	    @Column(name = "qty")
	    private Integer qty;
	   
	    
	    
	   //-- 
	    @Column(name = "number")
	     private String number;
	    
	    @Column(name = "string")
	    private String string;
	    
	    @Column(name = "description")
	    private String description;
	    
	    @Column(name = "drawing")
	    private String drawing;
	    
	    @Column(name = "revision")
	    private String revision;
	    
	    
	    @Column(name = "authority")
	    private String authority = null;
	    
	   

	    @Column(name = "ci")
	    private String ci;
	  
	    @Column(name = "type")  
	    private String type;
	  
	    
	    @Column(name = "statusNbrAssgn")  
	    private String statusNbrAssgn;
	    @Column(name = "statusStrAssgn")  
	    private String statusStrAssgn;
	    @Column(name = "statusDrwAssgn")  
	    private String statusDrwAssgn;
	    @Column(name = "statusRevAssgn")  
	    private String statusRevAssgn;
	    
	    @Column(name = "lnkNbrRclk")  
	    private String lnkNbrRclk;
	    @Column(name = "lnkStrRclk")  
	    private String lnkStrRclk;
	    @Column(name = "lnkDrwRclk")  
	    private String lnkDrwRclk;
	    @Column(name = "lnkRevRclk")  
	    private String lnkRevRclk;
	    
	       
	    
	    @ManyToOne(optional=true)
	    @JoinColumn(nullable=true)
	    MasterPart parent;
	    
	    
	    @OneToMany( mappedBy="parent")
	    private Set<MasterPart> children = null;
	
	    @ManyToOne(fetch=FetchType.LAZY) 
	    Workcenter workcenter;
	      
	    @ManyToOne(fetch=FetchType.LAZY) 
	    @JoinColumn(name = "cahier_id")
	    Cahier cahier;
	     
	    
	    //list  of fields   used  to  update ebom part
	    transient
	    private Integer wip_Qty = null;
	    transient
	    private String wip_statusNbrAssgn;
	    transient
	    private String wip_statusStrAssgn;
	    transient
	    private String wip_statusDrwAssgn;
	    transient   
        private String wip_statusRevAssgn;
	    
	    
	    
	    //@ManyToOne(optional=true)
	   // @JoinColumn(name="user_id", nullable=true)
	   // Workcenter workcenter;
	    
	    
	   // TO CONFIRM   @ManyToMany(mappedBy="parts")  in same wc one part we 0 or 1 cahier not more
	    //transient
	   // private Set<Cahier> cahiers = new HashSet<>();
	  
	  
	
	
	 /* public Long getId() {
	    return id;
	  }
	  
	  public void setId(Long id) {
	    this.id = id;
	  }*/
	
	    
	    transient
	    int level ;
	 

		public MasterPart() {
		   super();
	    }

	
	
		/*

	public Part(Long id, String parentId, Long partNbr, Long cahierId, String number, Integer qty, String string,
				String description, String drawing, String revision, String authority, String ci, String type,
				String statusNbrAssgn, String statusStrAssgn, String statusDrwAssgn, String statusRevAssgn,
				String lnkNbrRclk, String lnkStrRclk, String lnkDrwRclk, String lnkRevRclk, Part parent,
				Set<Part> children, Workcenter workcenter) {
			super();
			this.id = id;
			this.parentId = parentId;
			this.partNbr = partNbr;
			this.cahierId = cahierId;
			this.number = number;
			this.qty = qty;
			this.string = string;
			this.description = description;
			this.drawing = drawing;
			this.revision = revision;
			this.authority = authority;
			this.ci = ci;
			this.type = type;
			this.statusNbrAssgn = statusNbrAssgn;
			this.statusStrAssgn = statusStrAssgn;
			this.statusDrwAssgn = statusDrwAssgn;
			this.statusRevAssgn = statusRevAssgn;
			this.lnkNbrRclk = lnkNbrRclk;
			this.lnkStrRclk = lnkStrRclk;
			this.lnkDrwRclk = lnkDrwRclk;
			this.lnkRevRclk = lnkRevRclk;
			this.parent = parent;
			this.children = children;
			this.workcenter = workcenter;
		}





	public Part(String parentId, Long partNbr, Long cahierId, String number, Integer qty, String string,
			String description, String drawing, String revision, String authority, String ci, String type,
			String statusNbrAssgn, String statusStrAssgn, String statusDrwAssgn, String statusRevAssgn,
			String lnkNbrRclk, String lnkStrRclk, String lnkDrwRclk, String lnkRevRclk, Part parent, Set<Part> children,
			Workcenter workcenter) {
		super();
		this.parentId = parentId;
		this.partNbr = partNbr;
		this.cahierId = cahierId;
		this.number = number;
		this.qty = qty;
		this.string = string;
		this.description = description;
		this.drawing = drawing;
		this.revision = revision;
		this.authority = authority;
		this.ci = ci;
		this.type = type;
		this.statusNbrAssgn = statusNbrAssgn;
		this.statusStrAssgn = statusStrAssgn;
		this.statusDrwAssgn = statusDrwAssgn;
		this.statusRevAssgn = statusRevAssgn;
		this.lnkNbrRclk = lnkNbrRclk;
		this.lnkStrRclk = lnkStrRclk;
		this.lnkDrwRclk = lnkDrwRclk;
		this.lnkRevRclk = lnkRevRclk;
		this.parent = parent;
		this.children = children;
		this.workcenter = workcenter;
	}

*/
	
		
		
		
		
		public MasterPart(String id,  Long partNbr, Long cahierId, String number, Integer qty, String string,
				String description, String drawing, String revision, String authority, String ci, String type,
				String statusNbrAssgn, String statusStrAssgn, String statusDrwAssgn, String statusRevAssgn,
				String lnkNbrRclk, String lnkStrRclk, String lnkDrwRclk, String lnkRevRclk, MasterPart parent,
				Set<MasterPart> children, Workcenter workcenter) {
			super();
			this.id = id;
			this.partNbr = partNbr;
			this.cahierid = cahierid;
			this.number = number;
			this.qty = qty;
			this.string = string;
			this.description = description;
			this.drawing = drawing;
			this.revision = revision;
			this.authority = authority;
			this.ci = ci;
			this.type = type;
			this.statusNbrAssgn = statusNbrAssgn;
			this.statusStrAssgn = statusStrAssgn;
			this.statusDrwAssgn = statusDrwAssgn;
			this.statusRevAssgn = statusRevAssgn;
			this.lnkNbrRclk = lnkNbrRclk;
			this.lnkStrRclk = lnkStrRclk;
			this.lnkDrwRclk = lnkDrwRclk;
			this.lnkRevRclk = lnkRevRclk;
			this.parent = parent;
			this.children = children;
			this.workcenter = workcenter;
		}


		
		
		
		
		
	public MasterPart(Long partNbr, Long cahierId, String number, Integer qty, String string,
			String description, String drawing, String revision, String authority, String ci, String type,
			String statusNbrAssgn, String statusStrAssgn, String statusDrwAssgn, String statusRevAssgn,
			String lnkNbrRclk, String lnkStrRclk, String lnkDrwRclk, String lnkRevRclk, MasterPart parent, Set<MasterPart> children,
			Workcenter workcenter) {
		super();
		this.partNbr = partNbr;
		this.cahierid = cahierid;
		this.number = number;
		this.qty = qty;
		this.string = string;
		this.description = description;
		this.drawing = drawing;
		this.revision = revision;
		this.authority = authority;
		this.ci = ci;
		this.type = type;
		this.statusNbrAssgn = statusNbrAssgn;
		this.statusStrAssgn = statusStrAssgn;
		this.statusDrwAssgn = statusDrwAssgn;
		this.statusRevAssgn = statusRevAssgn;
		this.lnkNbrRclk = lnkNbrRclk;
		this.lnkStrRclk = lnkStrRclk;
		this.lnkDrwRclk = lnkDrwRclk;
		this.lnkRevRclk = lnkRevRclk;
		this.parent = parent;
		this.children = children;
		this.workcenter = workcenter;
	}





	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public Long getPartNbr() {
		return partNbr;
	}





		public void setPartNbr(Long partNbr) {
			this.partNbr = partNbr;
		}


	  public String getParentId() {
		
	    return parentId;
	  }
	
	  public void setParentId(String parentId) {
	    this.parentId = parentId;
	  }


	
	public Workcenter getWorkcenter() {
		return workcenter;
	}
	
	public void setWorkcenter(Workcenter workcenter) {
		this.workcenter = workcenter;
	}
	
	/*public Cahier getCahier() {
		return cahier;
	}
	
	public void setCahier(Cahier cahier) {
		this.cahier = cahier;
	}*/
	
	
	public MasterPart getParent() {
		return parent;
	}
	
	public void setParent(MasterPart parent) {
		this.parent = parent;
	}
	
	public Set<MasterPart> getChildren() {
		return children;
	}
	
	public void setChildren(Set<MasterPart> children) {
		this.children = children;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getQty() {
		return qty;
	}
	
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	public String getCi() {
		return ci;
	}
	
	public void setCi(String ci) {
		this.ci = ci;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getString() {
		return string;
	}
	
	public void setString(String string) {
		this.string = string;
	}
	
	public String getDrawing() {
		return drawing;
	}
	
	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}
	
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	public String getStatusNbrAssgn() {
		return statusNbrAssgn;
	}
	
	public void setStatusNbrAssgn(String statusNbrAssgn) {
		this.statusNbrAssgn = statusNbrAssgn;
	}
	
	public String getStatusStrAssgn() {
		return statusStrAssgn;
	}
	
	public void setStatusStrAssgn(String statusStrAssgn) {
		this.statusStrAssgn = statusStrAssgn;
	}
	
	public String getStatusDrwAssgn() {
		return statusDrwAssgn;
	}
	
	public void setStatusDrwAssgn(String statusDrwAssgn) {
		this.statusDrwAssgn = statusDrwAssgn;
	}
	
	public String getStatusRevAssgn() {
		return statusRevAssgn;
	}
	
	public void setStatusRevAssgn(String statusRevAssgn) {
		this.statusRevAssgn = statusRevAssgn;
	}
	
	public String getLnkNbrRclk() {
		return lnkNbrRclk;
	}
	
	public void setLnkNbrRclk(String lnkNbrRclk) {
		this.lnkNbrRclk = lnkNbrRclk;
	}
	
	public String getLnkStrRclk() {
		return lnkStrRclk;
	}
	
	public void setLnkStrRclk(String lnkStrRclk) {
		this.lnkStrRclk = lnkStrRclk;
	}
	
	public String getLnkDrwRclk() {
		return lnkDrwRclk;
	}
	
	public void setLnkDrwRclk(String lnkDrwRclk) {
		this.lnkDrwRclk = lnkDrwRclk;
	}
	
	public String getLnkRevRclk() {
		return lnkRevRclk;
	}
	
	public void setLnkRevRclk(String lnkRevRclk) {
		this.lnkRevRclk = lnkRevRclk;
	}
	
	public String getRevision() {
		return revision;
	}
	
	public void setRevision(String revision) {
		this.revision = revision;
	}

	public Long getCahierid() {
		return cahierid;
	}

	public void setCahierid(Long cahierid) {
		this.cahierid = cahierid;
	}

	public Cahier getCahier() {
		return cahier;
	}



	public void setCahier(Cahier cahier) {
		this.cahier = cahier;
	}



	public Integer getWip_Qty() {
		return wip_Qty;
	}



	public void setWip_Qty(Integer wip_Qty) {
		this.wip_Qty = wip_Qty;
	}



	public String getWip_statusNbrAssgn() {
		return wip_statusNbrAssgn;
	}



	public void setWip_statusNbrAssgn(String wip_statusNbrAssgn) {
		this.wip_statusNbrAssgn = wip_statusNbrAssgn;
	}



	public String getWip_statusStrAssgn() {
		return wip_statusStrAssgn;
	}



	public void setWip_statusStrAssgn(String wip_statusStrAssgn) {
		this.wip_statusStrAssgn = wip_statusStrAssgn;
	}



	public String getWip_statusDrwAssgn() {
		return wip_statusDrwAssgn;
	}



	public void setWip_statusDrwAssgn(String wip_statusDrwAssgn) {
		this.wip_statusDrwAssgn = wip_statusDrwAssgn;
	}



	public String getWip_statusRevAssgn() {
		return wip_statusRevAssgn;
	}



	public void setWip_statusRevAssgn(String wip_statusRevAssgn) {
		this.wip_statusRevAssgn = wip_statusRevAssgn;
	}



	public String getProject() {
		return project;
	}



	public void setProject(String project) {
		this.project = project;
	}



	public String getSector() {
		return sector;
	}



	public void setSector(String sector) {
		this.sector = sector;
	}



	public String getSubSector() {
		return subSector;
	}



	public void setSubSector(String subSector) {
		this.subSector = subSector;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
	
	
	
	
	/*public Set<Cahier> getCahiers() {
		return cahiers;
	}
	
	public void setCahiers(Set<Cahier> cahiers) {
		this.cahiers = cahiers;
	}
	*/
	
	
	



 
/*
  public WorkCenterPart addChildrenItem(WorkCenterPart childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<WorkCenterPart>();
    }
    this.children.add(childrenItem);
    return this;
  }

  
  public List<WorkCenterPart> getChildren() {
    return children;
  }

  public void setChildren(List<WorkCenterPart> children) {
    this.children = children;
  }
*/

  
}

