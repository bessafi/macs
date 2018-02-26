package temp;
class MyObject{
		String id;
	    private MyObject parent;
	    public MyObject getParent(){ return parent;}
		public void setParent(MyObject parent) {
			this.parent = parent;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public MyObject(String id, MyObject parent) {
			super();
			this.id = id;
			this.parent = parent;
		}
		public MyObject() {
			super();
		};
		
	    
	}