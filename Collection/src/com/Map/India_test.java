package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class India_test {
	public static void main(String[] args) {
		
	List<String> mh=new ArrayList();
	             mh.add("pune");
	             mh.add("mumbai");
	             
	  List<String>jh=new ArrayList();
	              jh.add("ranchi");
	              jh.add("lohardaga");
           
	Map<String,List<String>> india=new HashMap();
	    india.put("Maharashtra",mh);
	    india.put("jharkhand", jh);
	    
	    Set<String>kyes=india.keySet();
	    System.out.println(kyes);
	Iterator itr=kyes.iterator();
	
	     while(itr.hasNext())
	     {
	    	String key= (String) itr.next();
	    	System.out.println(key);
	    	
	    	List <String>list=india.get(key);
	    	Iterator itr1=list.iterator();
	    	while(itr1.hasNext())
	    	{
	    		String s=(String) itr1.next();
	    		
	    		System.out.println(s);
	    	}
	     }
	Set<String>keys=india.keySet();
	   for(String key:keys)
	   {
		   System.out.println(key);
		   List <String>list=india.get(key);
		   for(String city:list)
		   {
			   System.out.println(city);
		   }
				   
	   }
	
	}
}
