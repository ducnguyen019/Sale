package com.vti.lesson10;

		// Ex04_Q1
public class SalaryTest {

	public static void main(String[] args) {
//		Salary<Float> sal1 = new Salary<>(10000f);
//		Salary<Integer> sal2 = new Salary<>(10000);
//		System.out.println("Sal1 =" + sal1);
//		System.out.println("Sal2 =" + sal2);

		// Ex04_Q3
		System.out.println(max(29, 30));
		System.out.println(max(25.4f, 25.9f));
		System.out.println(max(100L, 70L));
	}

	public static <T extends Comparable<T>> T max(T a, T b) {
		if (a.compareTo(b) > 0) {
			return a;
		}
		return b;
	}

}