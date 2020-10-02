package com.TreeSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		Set<Employ2> s=null;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your choise");
		System.out.println("1 Id sort\n2 Name sort");
		int choise =sc.nextInt();
		
		switch(choise)
		{
		case 1:
			s=new TreeSet<>(new IdSort()); 
			break;
			
		case 2:
			s=new TreeSet<>(new NameSort());
			
		}
		
		Employ2 e1=new Employ2();
		System.out.println("Employ 1");
		       e1.setEid(102);
		       e1.setEname("jalindar");
		       
		       Employ2 e2=new Employ2();
		              e2.setEid(101);
		              e2.setEname("rahul");
		              s.add(e1);
                      s.add(e2);
                                  
		              
		     for(Employ2 emp:s)  
		     {
		    	 System.out.println("Id="+emp.getEid());
		    	 System.out.println("Name="+emp.getEname());
		     }
		              
		
	}
	}
}
