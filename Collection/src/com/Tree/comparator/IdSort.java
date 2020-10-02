package com.Tree.comparator;

import java.util.Comparator;

public class IdSort  implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ emp=(Employ)o1;
		Employ emp1=(Employ)o2;
		return emp.getEid()-emp1.getEid();
	}

}
