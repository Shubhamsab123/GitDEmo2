package com.collection.jeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorldTest {
	
	public static void main(String[] args) {
		
		
		List mh=new ArrayList();
		
		    mh.add("pune");
		    mh.add("mumbai");
		    
		    List jh=new ArrayList();
		         jh.add("ranchi");
		         jh.add("lohadaga");
		         
		List s1=new ArrayList();
		     s1.add("s1---1");
		     s1.add("s1---2");
		         
	List  s2=new ArrayList();
		      s2.add("s2--1");
		      s2.add("s2---2");
		      
       List india=new ArrayList();
            india.add(mh);
            india.add(jh);
            
            
      List japan=new ArrayList();
                japan.add(s1);
                japan.add(s2);
                
     List world=new ArrayList();
          world.add(india);
          world.add(japan);
          
		
		  Iterator itr=world.iterator(); 
		  while (itr.hasNext()) 
		  { 
		  List country=(List)itr.next();
		  
		  
		  Iterator itr1=country.iterator();
		  
		  while(itr1.hasNext())
		   {
		    List state = (List)itr1.next();
		  
		  Iterator itr2=state.iterator();
		   while(itr2.hasNext()) 
		   {
		    
		  String  city=(String)itr2.next(); 
		  System.out.println(city); 
		  }
		  
		  }
		  
		  }
		 
          
		/* using foreach loop
		 * for( Object coun:world) 
		 * { 
		 * List country=(List)coun;
		 *  for(Object st:country) 
		 *  {
		 * List state=(List) st;
		 *  for(Object cit:state) 
		 *  { 
		 *  String city=(String)cit;
		 * System.out.println(city); } } }
		 */
             
	}

}
