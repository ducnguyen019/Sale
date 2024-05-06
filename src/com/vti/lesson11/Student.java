package com.vti.lesson11;

public class Student {
	private static int id;
	private String name;

	public Student(String name) {
		this.id++;
		this.name = name;

	}

	@Deprecated
	/*
	 * replace by getIdV2
	 */
	public static int getId() {
		return id;
	}

	public static String getIdV2() {
		return "MSSV: " + id;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
