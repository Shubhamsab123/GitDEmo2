package com.collection.jeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JenTest {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		              list.add(1);
		              list.add(2);
		              list.add(3);
		              list.add(4);
		              list.add(5);
		/*
		 * Iterator<Integer> itr=list.iterator(); while(itr.hasNext()) { int
		 * a=itr.next(); System.out.println(a); }
		 */
         
         for(Integer a:list)
         {
        	 System.out.println(a);
         }
		              
		
	}

}
