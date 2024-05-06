package com.vti.lesson10;

//Ex04_Q1
public class Salary<T extends Number> {
	private T amount;

	public Salary(T amount) {
		this.amount = amount;
	}

	public String toString() {
		return this.amount + " ";
	}

}