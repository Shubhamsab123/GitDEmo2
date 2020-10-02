package com.Tree.comparator;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//import com.TreeSet.NameSort;

public class Main_Test {
	
	

	public static void main(String[] args) {
		int x=1;
		
		Set<Employ> s=null;
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the choise");
		System.out.println("1.Id sort\n2.Name sort \n3.Salary Sort");
		int ch=sc.nextInt();
		
		switch (ch)
		{
		case 1:
			s=new TreeSet(new IdSort());
			break;
			
			
		case 2:
			
			s=new TreeSet(new NameSort());
			
		case 3:
			s=new TreeSet(new Salaryort());
		}
		
		Employ e=new Employ();
		       e.setEid(101);
		       e.setEname("Jalindar");
		       e.setEsalary(26700.5);
		       
		 Employ e1=new Employ();
		        e1.setEid(102);
		        e1.setEname("Rahul");
		        e1.setEsalary(30000.50);
		        
		        
		   Employ e2=new Employ();
		           e2.setEid(103);
		           e2.setEname("Pramod");
		           e2.setEsalary(25000.50);
		           
		           
		           s.add(e);
		           s.add(e1);
		           s.add(e2);
		           
		           for(Employ emp:s)
		           {
		        	   System.out.println("Employ "+x);
		        	   System.out.println(emp.getEid());
		        	   System.out.println(emp.getEname());
		        	   System.out.println(emp.getEsalary());
		        	   x++;
		        	   
		        	  System.out.println("************");
		           }
		       
		   
		
		
	}
	}
}
