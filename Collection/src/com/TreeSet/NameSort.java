package com.TreeSet;

import java.util.Comparator;

public class NameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ2 emp=(Employ2)o1;
		Employ2 emp1=(Employ2)o2;
		return emp.getEname().compareTo(emp1.getEname());
	}
	

}
