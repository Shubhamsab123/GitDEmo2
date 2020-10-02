package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_Test2 {
	
	public static void main(String[] args) {
		
		
		List l=new ArrayList();
		            l.add("abc");
		            l.add("efg");
		            l.add("hij");
		            
		Set s=new HashSet();
		            s.add("pqr");
		            s.add("xyz");
		            
		  Map m=new HashMap();         
		                     m.put("List",l);
		                     m.put("Set",s);
		 
		                     Set se=m.keySet();
		                     Iterator  itr=se.iterator();
		                     while(itr.hasNext())
		                     {
		                    	 String keys=(String)itr.next();
		                    	 System.out.println(keys);
		                    	 Object o=m.get(keys);
		                    	 
		              if(o instanceof List)
		              {
		            	  List li=(List)o;
		            	  Iterator itr1=li.iterator();
		            	  while(itr1.hasNext())
		            	  {
		            		  String data=(String)itr1.next();
		            		  System.out.println(data);
		            	  }
		              }
		              
		              else if(o instanceof Set)
		              {
		            	  Set se1=(Set)o;
		            	  Iterator itr2=se1.iterator();
		            	  while(itr2.hasNext())
		            	  {
		            		String data= (String)itr2.next();
		            		System.out.println(data);
		            	  }
		              }
		                     }
		                   
		
	}

}
