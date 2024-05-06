package com.vti.lesson07;

import java.util.Scanner;

import com.vti.lesson07.exceptions.MyInvalidAgeException;

public class Student_exception {

	private int age;
	private String name;
	private Scanner scanner;

	public Student_exception() throws Exception {
		this.scanner = new Scanner(System.in);
		this.age = inputAge();
		this.name = inputName();
	}

	private int inputAge() throws Exception {
		int inputAge = 0;

		while (inputAge <= 0)
			try {
				System.out.println("Please enter your age: ");
				inputAge = this.scanner.nextInt();
			} catch (Exception ex) {
				System.out.println("Please enter valid age as int");
				//this.scanner.nextLine();
				continue;
			}
		return inputAge;
	}

	private String inputName() throws Exception {
		try {
			System.out.println("Enter your name: ");
			return this.scanner.next();
		} catch (Exception e) {
			throw new Exception("Please enter correct name!");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		try {
			Student_exception s = new Student_exception();
			System.out.println("Name = " + s.getName());
			System.out.println("Age  = " + s.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
