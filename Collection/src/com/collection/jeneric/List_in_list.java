package com.collection.jeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_in_list {
	public static void main(String[] args) {
	
	
	     
	     
  List<String> mh=new ArrayList<>();
               mh.add("pune");
               mh.add("mumbai");
               mh.add("Nagpur");
               
  List<String>jh=new ArrayList<>();
              jh.add("Ranchi");
              jh.add("Lohadaga");
              
              List<List<String>> india=new ArrayList<>();
     	     india .add(mh);
     	     india.add(jh);    
		/*
		 * for(List<String>list:india ) { for(String city:list) {
		 * System.out.println(city); } }
		 */
	
	Iterator<List<String>>itr=india.iterator();
	   while(itr.hasNext())
	   {
		 List  <String> list=itr.next();
		 
		 Iterator<String>itr1=list.iterator();
		 while(itr1.hasNext())
		 {
			 String city=itr1.next();
			 System.out.println(city);
		 }
				 
	   }
	
	
	}
}

	
	
	
	
	
	
