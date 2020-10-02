package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_Test_Forloop {
	
	public static void main(String[] args) {
		
		
		List <String> l=new ArrayList();
		              l.add("jalu");
		              l.add("Rahul");
		              
		 List <String>l1=new ArrayList();
		              l1.add("l1--abc");
		              l1.add("l1---pqr");
		              
		    Map<String,List<String>>m=new HashMap();
		       m.put("List1",l);
		       m.put("List2",l1);
		       
		       Set<String>se=m.keySet();
		       Iterator<String>itr=se.iterator();
		       while(itr.hasNext())
		    	   
		       {
		    	   String key=itr.next();
		    	   System.out.println(key);
		    	   List <String>list=m.get(key);
		    	   Iterator<String> itr1=list.iterator();
		    	   while(itr1.hasNext())
		    	   {
		    		  String key2=itr1.next();
		    		   System.out.println(key2);
		    	   }
		       }
		       
		    
		
	}

}
