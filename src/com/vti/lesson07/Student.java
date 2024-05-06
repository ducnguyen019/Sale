package com.vti.lesson07;

import java.util.Scanner;

public class Student {
	private int age;
	private String name;
	private Scanner scanner;

	public Student() throws Exception {
		this.scanner = new Scanner(System.in);
		this.age = inputAge();
		this.name = inputName();
	}

	private String inputName() throws Exception {
		try {
			System.out.println("Enter your Name: ");
			return this.scanner.nextLine();
		} catch (Exception ex) {
			throw new Exception("Pls enter a correct name!!!");
		}
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
}
