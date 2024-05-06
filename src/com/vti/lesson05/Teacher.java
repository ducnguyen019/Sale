package com.vti.lesson05;

public class Teacher extends Person{
     private String position;
	
	public Teacher(String fullName, int age, String position) {
		super(fullName, age);
		this.position = position;		
	}

	@Override
	public void rollUp() {
		System.out.println("Teacher is rolling up...");		
	}
	public void teach() {
		System.out.println("Teacher is teaching...");
	}	

}
