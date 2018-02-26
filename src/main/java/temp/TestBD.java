package temp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.bombardier.macs.json.model.ParentChildObject;
import com.bombardier.macs.json.model.WorkCenter;
import com.bombardier.macs.json.model.WorkCenterPart;
import com.bombardier.macs.model.WorkcenterPart;
import com.bombardier.macs.service.MacsWorkcenterService;

public class TestBD {
		@Autowired
	private static MacsWorkcenterService wcserviceImpl;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deleteAll();
		
		/*List<WorkcenterPart> toSort=new ArrayList<WorkcenterPart>();
		WorkcenterPart wcpart2 = new WorkcenterPart("2", "G25022555-002", 1, null,  null, null);
		WorkcenterPart wcpart3 = new WorkcenterPart("3", "G25022555-003", 1, null,  null, null);
		WorkcenterPart wcpart4 = new WorkcenterPart("4", "G25022555-004", 1, null,  null, null);
		WorkcenterPart wcpart1 = new WorkcenterPart("1", "G25022555-001", 1, wcpart2,  null, null);
		WorkcenterPart wcpart5 = new WorkcenterPart("5", "G25022555-005", 1, wcpart1,  null, null);
		System.out.println("=============== All ===============");
		toSort.add(wcpart1);
		toSort.add(wcpart2);
		toSort.add(wcpart3);
		toSort.add(wcpart4);
		toSort.add(wcpart5);
		orderList2(toSort);*/
		
		WorkCenterPart wcpart2 = new WorkCenterPart("2",  1,  "4");
		WorkCenterPart wcpart3 = new WorkCenterPart("3",  1,  "");
		WorkCenterPart wcpart4 = new WorkCenterPart("4",  1,  "3");
		WorkCenterPart wcpart1 = new WorkCenterPart("1",  1,  "2");
		WorkCenterPart wcpart5 = new WorkCenterPart("5",  1,  "1");
		
		Set<WorkCenterPart> parts= new HashSet<WorkCenterPart>();
		parts.add(wcpart2);parts.add(wcpart3);parts.add(wcpart4);
		parts.add(wcpart1);parts.add(wcpart5);
		
		WorkCenter wc=new WorkCenter();
		//wc.setParts(parts);
		
		
		Set<ParentChildObject> set=addAllParentsChilds(wc);
		
		Map <String,  ParentChildObject> map=new HashMap<>();
		
		
		System.out.println("----");
		 for( ParentChildObject p:set ) {
			    map.put(p.getId(), p);
		    	System.out.print("---->"+p.getId());  	
		 }
		 System.out.println("----");
		 
		 
		List<ParentChildObject> toSort=new ArrayList<ParentChildObject>();
		for(ParentChildObject o:set) {
			toSort.add(o);	
		}
		
		/*List<MyObject> toSort=new ArrayList<MyObject>();
		MyObject wcpart_2 = new MyObject("2", null);
		MyObject wcpart_3 = new MyObject("3", null);
		MyObject wcpart_4 = new MyObject("4", null);
		MyObject wcpart_1 = new MyObject("1", wcpart_2);
		MyObject wcpart_5 = new MyObject("5", wcpart_1);
		System.out.println("=============== All ===============");
		toSort.add(wcpart_1);toSort.add(wcpart_3);
		toSort.add(wcpart_2);toSort.add(wcpart_5);
		toSort.add(wcpart_4);*/
		
		//orderList1(toSort);
		List< WorkCenterPart> partsList=new ArrayList<WorkCenterPart>(parts);
		//List<?> list = new ArrayList<?>(set);
		//partsList.addAll(toSort);
		
		orderList3(partsList);
		
		

	}
	
	public static void deleteAll(){
		System.out.println("===============Delete All ===============");
		//serviceImpl.deleteAll();
		//serviceImpl.deleteAllProjects();
		//serviceImpl.deleteAllSectors();
		//serviceImpl.deleteAllSubSectors();
		//serviceImpl.deleteAllWorkcenters();
		//serviceImpl.deleteAllParts(); 
		//serviceImpl.deleteAllCahiers();
		
		
	}
	
	
	
	//order list: every object comes after its parent in the list 
	//(the parent will always be in the list).
	static void orderList(List<MyObject> toSort) {
	    final MyObject nullPlaceholder = new MyObject();
	    Map<MyObject, List<MyObject>> byParent = toSort.stream()
	         .collect(Collectors.groupingBy(obj -> 
	           (obj.getParent() == null ? nullPlaceholder : obj.getParent())
	           , Collectors.toList()));

	    List<MyObject> ordered = new ArrayList<>();
	    Queue<MyObject> processor = new LinkedList<>();
	    byParent.get(nullPlaceholder).forEach(processor::add);
	    while (!processor.isEmpty()) {
	        MyObject tmp = processor.poll();
	        byParent.getOrDefault(tmp, Collections.emptyList())
	          .forEach(processor::add);
	        ordered.add(tmp);
	    }
	    toSort.clear();
	    toSort.addAll(ordered);
	    for( MyObject p:toSort ) {
	    	System.out.println("---->"+p.getId()+"----"/*+p.getParent().getId()*/);
	    	
	    }
	}
	
	//order list: every object comes after its parent in the list 
		//(the parent will always be in the list).
		static void orderList1(List<ParentChildObject> toSort) {
		    final ParentChildObject nullPlaceholder = new ParentChildObject();
		    Map<ParentChildObject, List<ParentChildObject>> byParent = toSort.stream()
		         .collect(Collectors.groupingBy(obj -> 
		           (obj.getParent() == null ? nullPlaceholder : obj.getParent())
		           , Collectors.toList()));

		    List<ParentChildObject> ordered = new ArrayList<>();
		    Queue<ParentChildObject> processor = new LinkedList<>();
		    byParent.get(nullPlaceholder).forEach(processor::add);
		    while (!processor.isEmpty()) {
		    	ParentChildObject tmp = processor.poll();
		        byParent.getOrDefault(tmp, Collections.emptyList())
		          .forEach(processor::add);
		        ordered.add(tmp);
		    }
		    toSort.clear();
		    toSort.addAll(ordered);
		   /* for( ParentChildObject p:toSort ) {
		    	System.out.println("---->"+p.getId()+"----");
		    	
		    }*/
		    System.out.println("--start--");
			 for( ParentChildObject p:toSort ) {
			    	System.out.print(">"+p.getId());  	
			 }
			 System.out.println("--end--");  
			 
		    
		}
	
		public int fib(int n) {
		    if(n <= 1) {
		        return n;
		    } else {
		        return fib(n - 1) + fib(n - 2);
		    }
		}	
	
		public List<ParentChildObject> convert(Set<WorkCenterPart> parts) {
			
			Map<String, ParentChildObject> toSort=new HashMap<>();
			for(WorkCenterPart p:parts) {
				
			}
			
			return null;
						
		}
		    
		
		
		
		
		/*public List<ParentChildObject>   createObj(String i, Map<String, WorkCenterPart> parts, List<ParentChildObject> list ) {
		    
			if(parts.get(i).getParentId().equals(i) || 
			   parts.get(i).getParentId()==null ||  
			   parts.get(i).getParentId()==parts.get(i).getId()
					*||  parts.get(i).getParentId() BD*
					) {
		        list.add(new ParentChildObject(i, null));
		        
		    } else {
		    	list.add(new ParentChildObject(parts.get(i).getParentId(), null));
		         createObj(parts.get(i).getParentId(), parts,  list ) ;
				    
		    }
		}*/
		
/*
public static Map<String, ParentChildObject> addAllParentsChildsMap(WorkCenter wc, Map<String, ParentChildObject> map) {
			
			Set<ParentChildObject> toSort  =new HashSet<ParentChildObject>();
			for(String key: map.keySet()) {
				for(WorkCenterPart wcp: wc.getParts()) {
					if(key.equals(wcp.getId())) {
						if(wcp.getParentId()!=null && !wcp.getParentId().isEmpty()
								&&wcp.getId()!=wcp.getParentId() || (BD)) {
						//	map.get(key).setParent(parent);
		                     					
						}				
					}		
			}	
				
				
			}
				
				       
}*/
		
		
		
		static void orderList3(List<WorkCenterPart> toSort){
		    List<WorkCenterPart> tmp = new ArrayList<>();
		    while(!toSort.isEmpty()) {
		        for(WorkCenterPart wcp: toSort){
		            if(wcp.getParentId()==null || wcp.getParentId().isEmpty()
							||wcp.getId()!=wcp.getParentId()) {
		                tmp.add(wcp);
		            }else {
		                if(contain(tmp,wcp.getParentId())) {
		                    tmp.add(wcp);
		                }
		            }
		        }
		        toSort.removeAll(tmp);
		    }
		    toSort.addAll(tmp);
		    
		    for( WorkCenterPart p:toSort ) {
		    	System.out.println("---->"+p.getId());
		    	
		    }
		}
	
		
	/*	void orderList(List<MyObject> toSort){
		    List<MyObject> tmp = new ArrayList<>();
		    while(!toSort.isEmpty()) {
		        for(MyObject obj: toSort){
		            if(obj.getParent() == null) {
		                tmp.add(obj);
		            }else {
		                if(tmp.contains(obj.getParent())) {
		                    tmp.add(obj);
		                }
		            }
		        }
		        toSort.removeAll(tmp);
		    }
		    toSort.addAll(tmp);
		}*/
		
		
		
		
public static  Set<ParentChildObject> addAllParentsChilds(WorkCenter wc) {
			
			Set<ParentChildObject> toSort  =new HashSet<ParentChildObject>();
			for(WorkCenterPart wcp: wc.getParts()) {
				ParentChildObject pc=new ParentChildObject(wcp.getId(),null);
				ParentChildObject parent=new ParentChildObject(wcp.getParentId(),null);	
			    if(!contains(toSort,pc.getId())) {
			    	           toSort.add(pc);
			    } 
			    if(!contains(toSort, parent.getId())) {
			    	 toSort.add(parent)  ;
			    }    
			}
			
			for(ParentChildObject pc:toSort) {
				for(WorkCenterPart wcp: wc.getParts()) {
					if(wcp.getId().equals(pc.getId())&&  wcp.getParentId()==null &&  
							              !wcp.getParentId().isEmpty() ) {
						     pc.setParent(getParent(toSort,  wcp.getParentId()));
					}
				}	
			}
			return toSort;
}



public static  Set<ParentChildObject> addAllParentsChilds1(WorkCenter wc) {
	
	Set<ParentChildObject> toSort  =new HashSet<ParentChildObject>();
	Map<String, WorkCenterPart> mapList  =new HashMap<String, WorkCenterPart>();
	
	
	for(WorkCenterPart wcp: wc.getParts()) {
		if(wcp.getParentId()==null || wcp.getId() == wcp.getParentId()) {
			mapList.put(wcp.getId(), wcp);
		}
	}
	
	
	for(WorkCenterPart wcp: wc.getParts()) {
		ParentChildObject pc=new ParentChildObject(wcp.getId(),null);
		ParentChildObject parent=new ParentChildObject(wcp.getParentId(),null);	
	    if(!contains(toSort,pc.getId())) {
	    	           toSort.add(pc);
	    } 
	    if(!contains(toSort, parent.getId())) {
	    	 toSort.add(parent)  ;
	    }    
	}
	
	for(ParentChildObject pc:toSort) {
		for(WorkCenterPart wcp: wc.getParts()) {
			if(wcp.getId().equals(pc.getId())&&  wcp.getParentId()==null &&  
					              !wcp.getParentId().isEmpty() ) {
				     pc.setParent(getParent(toSort,  wcp.getParentId()));
			}
		}	
	}
	return toSort;
}


static private boolean contains(Set<ParentChildObject> toSort, String id) {
	
	for(ParentChildObject pc:toSort) {
		if(id.equals(pc.getId())) {
			return true;	
		}
	}
	return false;
}
		

static private boolean contain(List<WorkCenterPart> toSort, String id) {
	
	for(WorkCenterPart pc:toSort) {
		if(id.equals(pc.getId())) {
			return true;	
		}
	}
	
	return false;
}
		private static ParentChildObject getParent(Set<ParentChildObject> toSort, String id) {
			for(ParentChildObject pc:toSort) {
				if(pc.getId().equals(id)) return  pc;
			}
			return null;
		}
		
		
	
	public static void orderList2(List<WorkcenterPart> toSort) {
	    Map<WorkcenterPart, List<WorkcenterPart>> parentMap = new HashMap<>();

	    for (WorkcenterPart obj : toSort) {
	        if (!parentMap.containsKey(obj.getParent())) {
	            parentMap.put(obj.getParent(), new ArrayList<>());
	        }

	        parentMap.get(obj.getParent()).add(obj);
	    }

	    if (parentMap.get(null) == null) {
	        throw new IllegalArgumentException("The input is not a tree.");
	    }

	    ArrayDeque<WorkcenterPart> queue = new ArrayDeque<>(parentMap.get(null));
	    toSort.clear();

	    while (!queue.isEmpty()) {
	    	WorkcenterPart current = queue.removeFirst();
	        toSort.add(current);
	        List<WorkcenterPart> children = parentMap.get(current);

	        if (children != null) {
	            queue.addAll(children);
	        }
	    }
	    
	    for( WorkcenterPart p:queue ) {
	    	System.out.println("---->"+p.getId()+"----"+p.getParent().getId());
	    	
	    }
	}
}
