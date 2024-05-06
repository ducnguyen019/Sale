package com.vti.lesson05;

public class Student extends Person implements IStudy {
	private int id;
	private String name;
	private float point;

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(int id, String name, String fullName, int age) {
		super(fullName, age);
		this.id = id;
		this.name = name;
		this.point = 0.0f;
		System.out.println("Student is contructed!!!");

	}

	@Override
	public void doHomework() {
		System.out.println("Student is doing honework!!");

	}

	@Override
	public void copyHomework() {
		System.out.println("Student is copying homework!!");

	}

	@Override
	public void rollUp() {
		System.out.println("Rolling up...");

	}

}
