package com.vti.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Program10 {
	public static void main(String[] args) {
		/*
		 * Employee<Double> e1 = new Employee<>(1.1, "Nguyen Phu Duc");
		 * Employee<Integer> e2 = new Employee<>(2, "Ho Khanh An"); Employee<Float> e3 =
		 * new Employee<>(3.5f, "Tran Van A"); List<Employee<?>> emps = new
		 * ArrayList<>();
		 * 
		 * System.out.println(e1); System.out.println(e2); System.out.println(e3);
		 * 
		 * print(2, 4); print(2.3f, 4.1f); print(3l, 5l);
		 */

//		// Ex03_Q1
//		Student<Integer> s1 = new Student<>(1, "Nguyen Van A");
//		Student<Float> s2 = new Student<>(1.1f, "Nguyen Van B");
//		Student<Double> s3 = new Student<>(1.2, "Nguyen Van C");
//
//		// Ex03_Q2
//		print(s1);
//		print(7);
//		print(7.0f);
//
//		// Ex03_Q4
//		Integer[] arr1 = { 1, 2, 3 };
//		printArray(arr1);
//		Float[] arr2 = { 1.1f, 2.2f, 3.3f };
//		printArray(arr2);
//		Double[] arr3 = { 4.1, 5.2, 6.3 };
//		printArray(arr3);

//		// Ex03_Q5
//		Float[] salaries1 = new Float[] { 1.1f, 2.8f, 10.7f };
//		Employee<Integer, Float> e1 = new Employee<>(1, "Tran Van Teo", salaries1);
//		Long[] salaries2 = new Long[] { 111L, 200L, 10L };
//		Employee<Float, Long> e2 = new Employee<>(2.3f, "Tran Van Teo", salaries2);
//		System.out.println(e2);

		// Ex03_Q6
		Student<Integer> s1 = new Student<>(1, "Nguyen Van A");
		MyMap<Integer, String> myMap = new MyMap<>(s1.getId(), s1.getName());
		System.out.println(myMap.getKey());
		System.out.println(myMap.getValue());

		
//		// Ex03_Q7
//		Phone<String, String> p1 = new Phone<>("ducnguyen@gmail", "09040041234");
//		Phone<Integer, String> p2 = new Phone<>(7, "09040041234");
//		Phone<String, String> p3 = new Phone<>("DucNguyen", "09040041234");
//
//		System.out.println("Key = " + p1.getKey() + ", Phone Number = " + p1.getPhoneNumber());
//		System.out.println("Key = " + p2.getKey() + ", Phone Number = " + p2.getPhoneNumber());
//		System.out.println("Key = " + p3.getKey() + ", Phone Number = " + p3.getValue());

	}

	public static <T> void print(T a, T b) {
		System.out.println("a = " + a + ", b = " + b);
	}

	// Ex03_Q2
	public static <T> void print(T a) {
		System.out.println(a);
	}

	// Ex03_Q4
	public static <E> void printArray(E[] arr) {
		for (E e : arr) {
			System.out.println(e);
		}
	}

}
