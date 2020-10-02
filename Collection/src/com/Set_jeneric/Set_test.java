package com.Set_jeneric;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_test {
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<>();
		
		s.add("abc");
		s.add("xyz");
		s.add("pqr");
		s.add("abc");
		s.add("lmn");
		/*
		 * Iterator <String>itr=s.iterator(); while(itr.hasNext()) { String
		 * val=itr.next(); System.out.println(val); }
		 */
		/*
		 * for(String val:s) { System.out.println(val); }
		 */
		
	Set<String> s1=new HashSet<>();
		//System.out.println(s);
		
		Set<String> s2=new LinkedHashSet<>(s);
		System.out.println(s2);
	}
	

}
