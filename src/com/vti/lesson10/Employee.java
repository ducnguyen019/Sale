package com.vti.lesson10;

import java.util.Arrays;

public class Employee<T, E extends Number> {
	private T id;
	private String name;
	private E[] salaries;

	public Employee() {
	}

	public Employee(T id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(T id, String name, E[] salaries) {
		this.id = id;
		this.name = name;
		this.salaries = salaries;
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

	public E[] getSalaries() {
		return salaries;
	}

	public void setSalaries(E[] salaries) {
		this.salaries = salaries;
	}

	@Override
	public String toString() {
		return "|Id: " + this.id + "   |Name: " + this.name + "   |Salaries: " + Arrays.toString(this.salaries);
	}

}
