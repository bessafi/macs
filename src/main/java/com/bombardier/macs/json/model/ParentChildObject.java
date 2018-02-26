package com.bombardier.macs.json.model;
public class ParentChildObject{
		String id;
	    private ParentChildObject parent;
	    public ParentChildObject getParent(){ return parent;}
		public void setParent(ParentChildObject parent) {
			this.parent = parent;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public ParentChildObject(String id, ParentChildObject parent) {
			super();
			this.id = id;
			this.parent = parent;
		}
		public ParentChildObject() {
			super();
		};
		
	    
	}