package com.collection.jeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World_by_foreach {
	
public static void main(String[] args) {
		
		
		List<String> mh=new ArrayList<>();
		
		    mh.add("pune");
		    mh.add("mumbai");
		    
		    List<String> jh=new ArrayList<>();
		         jh.add("ranchi");
		         jh.add("lohadaga");
		         
		List<String> s1=new ArrayList<>();
		     s1.add("s1---1");
		     s1.add("s1---2");
		         
	List <String> s2=new ArrayList<>();
		      s2.add("s2--1");
		      s2.add("s2---2");
		      
       List<List<String>> india=new ArrayList();
            india.add(mh);
            india.add(jh);
            
            
      List <List<String>>japan=new ArrayList();
                japan.add(s1);
                japan.add(s2);
                
     List<List<List<String>>> world=new ArrayList();
          world.add(india);
          world.add(japan);
          
          for (List<List<String>> country:world)
          {
        	  for(List<String> state:country)
        	  {
        		  for(String city:state)
        		  {
        			  System.out.println(city);
        		  }
        		  
        	  }
          }
          
     
	}


}
