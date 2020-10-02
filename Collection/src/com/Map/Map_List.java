package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_List {
	public static void main(String[] args) {
		
		
		List <String>mh=new ArrayList();
		             mh.add("pune");
		             mh.add("mumbai");
		            
	    List <String>jh=new ArrayList();
		             jh.add("Ranchi");
		             jh.add("Lohardaga");
		             
		List <String>Ak=new ArrayList();
						Ak.add("Akila---1");
						Ak.add("Akila--2"); 
		     		             
		     		            
	     List <String>Nak=new ArrayList();
					     Nak.add("Nagasaki---1");
					     Nak.add("Nagasaki--2");
		     		  
		 Map <String,List<String>> india=new HashMap();
		                     india.put("maharashtra(State)",mh);
		                     india.put("jharkhand(State)",jh);
		  Map<String,List<String>> japan=new  HashMap();
		                     japan.put("Nagasaki(State)",Nak);
		                     japan.put("Akila(State)",Ak);
		  
		  	    
		 Map <String,Map<String,List<String>>> world=new HashMap();
		       world.put("country1",india);
		       world.put("country2",japan );
		     Set<String> keys= world.keySet();
		   // System.out.println(keys);
		     Iterator<String> itr=keys.iterator();
		        while(itr.hasNext())
		        {
		      String key=  itr.next();	
		     System.out.println(key);
		      
		     Map<String,List<String>>country=world.get(key);
		    Set<String>keys1=country.keySet();
		    
		      
		      Iterator<String> itr1=keys1.iterator();
		            while(itr1.hasNext())
		            {
		            	String state1=itr1.next();
		            	System.out.println(state1);
		            	List<String>ls=country.get(state1);
		            	Iterator <String>itr2=ls.iterator();
		            	     while(itr2.hasNext())
		            	     {
		            	    	 String city=itr2.next();
		            	    	 System.out.println(city);
		            	     }
		            }
		      
		        }
		       
	       
		       
		 
	}

}
