package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_Test3 {
	
	public static void main(String[] args) {
		List<String>l1=new ArrayList();
		            l1.add("list1--1");
		            l1.add("list1---2");
		            
	 List<String>l2=new ArrayList();
		         l2.add("list2---1");
		         l2.add("list2---2");
		         
  List<String>l3=new ArrayList();
              l3.add("list3---1");
              l3.add("list3---2");
              
              
    List<String>l4=new ArrayList();
                 l4.add("list4---1");
                 l4.add("list 4---2");
                 
       Map<List<String>,List<String>>m=new HashMap();
       
                       m.put(l1, l2);
                       m.put(l3, l4);
           Set<List<String>> keys=m.keySet();
          
              Iterator<List<String>>itr=keys.iterator();
              while(itr.hasNext())
              {
            	List<String>key=itr.next(); 
            
  
            	Iterator<String>itr1=key.iterator();
            	while(itr1.hasNext())
            	{
            		String s=itr1.next();
            		System.out.println(s);
            	}
            	
            	List<String>key1=m.get(key);
            	Iterator<String>itr2=key1.iterator();
            	while(itr2.hasNext())
            	{
            		String s=itr2.next();
            		System.out.println(s);
            	}
            	
              }
           
       
		         
		
	}

}
