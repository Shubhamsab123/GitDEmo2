package com.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Tree_test {
	public static void main(String[] args) {
		
		Student s1=new Student();
		        s1.setSid(101);
		        s1.setSname("Jalindar");
		        s1.setSaddr("pune");
		        
		       
		 Student s2=new Student();
		         s2.setSid(102);
		         s2.setSname("Rahul");
		         s2.setSaddr("mumbai");
		        
		
		Set<Student>s=new TreeSet();
		
		s.add(s1);
		s.add(s2);
		
		for(Student stu:s)
		{
			System.out.println(stu.getSid());
			System.out.println(stu.getSname());
			System.out.println(stu.getSaddr());
		}
		
		//System.out.println(s);
		
	}

}
