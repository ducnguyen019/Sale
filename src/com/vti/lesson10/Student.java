package com.vti.lesson10;

public class Student<T> {
	private T id;
	private String name;

	public Student() {

	}

	public Student(T id, String name) {
		this.id = id;
		this.name = name;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "|Id: " + this.id + "|Name: " + this.name;
	}
}
