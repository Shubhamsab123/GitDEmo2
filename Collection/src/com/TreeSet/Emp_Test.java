package com.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Emp_Test {
	public static void main(String[] args) {
		
		
		Employ e1=new Employ();
		       e1.setEid(101);
		       e1.setEname("jalindar");
		       e1.setEaddr("pune");
		       
		 Employ e2=new Employ();
				 e2.setEid(102);
		         e2.setEname("Rahul");
		         e2.setEaddr("Mumbai");
		         
		  Employ e3=new Employ();
		         e3.setEid(103);
		         e3.setEname("Pramod");
		         e3.setEaddr("Aurangabad");
		         
		   Set<Employ>s=new TreeSet(new Employ());
		              s.add(e1);
		              s.add(e2);
		              s.add(e3);
		              
		              for(Employ emp:s)
		              {
		            	  System.out.println(emp.getEid());
		            	  System.out.println(emp.getEname());
		            	  System.out.println(emp.getEaddr());
		              }
		              }

}
