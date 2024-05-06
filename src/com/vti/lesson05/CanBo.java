package com.vti.lesson05;

public class CanBo {
	private String name;
	private int age;
	private Gender gender;
	private String address;

	public enum Gender {
		Male, Female, Unknow
	}
	
	public CanBo() {
		
	}
	public CanBo(String name, int age, Gender gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

}
