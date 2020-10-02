package com.collection.jeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World_by_jenric {
	
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
		      
       List<List<String>> india=new ArrayList<>();
            india.add(mh);
            india.add(jh);
            
            
      List<List<String>> japan=new ArrayList<>();
                japan.add(s1);
                japan.add(s2);
                
   List < List<List<String>>> world=new ArrayList<>();
          world.add(india);
          world.add(japan);
          
      Iterator<List<List<String>>> itr=world.iterator();
        while (itr.hasNext())
        {
       List country=itr.next();
      
       Iterator<List<String>> itr1=country.iterator();
      
       while(itr1.hasNext())
       {
     List state =itr1.next();  
   
         Iterator<String> itr2=state.iterator(); 
         while(itr2.hasNext())
         {
        	 String city=itr2.next();
        	 System.out.println(city);
         }
        
         }
       
        }
        
             
	}


}
