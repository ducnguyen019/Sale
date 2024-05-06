package com.vti.lesson11;

public class StudentTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Student s1 = new Student("Nguyen Van A");
		System.out.println("Id cua s1: " + s1.getId());
		Student s2 = new Student("Nguyen Van B");
		System.out.println("Id cua s2: " + s2.getId());

		System.out.println(s1);
		System.out.println(s1.getId());
		System.out.println(s1.getIdV2());

	}
}
