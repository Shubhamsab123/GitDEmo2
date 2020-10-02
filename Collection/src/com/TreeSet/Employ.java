package com.TreeSet;

import java.util.Comparator;

public class Employ implements Comparator{
	
	private int eid;
	private String ename;
	private String eaddr;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	




	
	@Override
	public int compare(Object o1, Object o2)
	{
        Employ emp=(Employ)o1;
        Employ emp1=(Employ)o2;
		
		//return this.eid-emp.eid;//return only for primetive .
        return +(emp.ename.compareTo(emp1.ename));//return userdefine value.
		
	}
	
	

}
