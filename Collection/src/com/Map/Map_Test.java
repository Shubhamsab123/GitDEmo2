package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test {
	public static void main(String[] args) {
		
	
	
	Map<Integer,String> m= new HashMap();
	    m.put(5, "java");
	    m.put(10,"pythan");
	    m.put(15,"Spring");
	    m.put(5,"cjc");//dublicate element replace  with privious element.
	    
	  // System.out.println(m);
	   
	   String val=(String) m.get(10);
	  // System.out.println(val);
	   
	   Set<Integer> keys=m.keySet();
	  //  System.out.println(keys);
	    
	    Iterator<Integer> itr=keys.iterator();
	    
	          while(itr.hasNext())
	        		  {
	        	  int key=itr.next();
	        	  System.out.println(key);
	        	  
	        	  String val1=(String)m.get(key);
	        	  System.out.println(val1);
	        	  
	        		  }
	    
	   
	

}
}