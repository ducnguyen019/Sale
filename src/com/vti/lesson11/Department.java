package com.vti.lesson11;


public class Department {
	public int departmentId;
	public String departmentName;
	public Account[] accounts;

	public Department() {

	}

	public Department(String departmentName) {
		this.departmentId = 0;
		this.departmentName = departmentName;
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public static void Ex01Q1() {
		Department d1 = new Department();
		Department d2 = new Department("Hr");
	}

	public String toString() {
		return this.departmentId + " " + this.departmentName;
	}
//	@Override
//	public String toString() {
//		return "DepartmentID =" + departmentId +"; DeptName = " + departmentName;
//	}	
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null) {
//			return false;
//		}
//	   if(obj instanceof Department) {
//		   Department other = (Department)obj;
//		   if(departmentId == other.departmentId && departmentName.equals(other.departmentName)) {
//			   return true;
//		   }
//		   return false;
//		   
//	   }
//	   return false;		
//		
//	}
//	
//	@Override
//	public int hashCode() {
//		return departmentId + 10;
//	}	

}