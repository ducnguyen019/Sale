package com.vti.lesson07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {

//		// Ex02-Q3
//		try {
//			int[] a = new int[] { 1, 2, 3 };
//			System.out.println(a[4]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println(e);
//		}

//		// Ex02-Q1,Q2
//		Scanner s = null;
//
//		try {
//			s = new Scanner(System.in);
//			System.out.println("Enter your age: ");
//			int age = s.nextInt();
//			System.out.println("Your age: " + age);
//			s.close();
//			int result = divide(50, age);
//			System.out.println("Result = " + result);
//		} catch (InputMismatchException e) {
//			System.out.println("pls input int number !!!");
//		} catch (ArithmeticException ex) {
//			System.out.println("Can not divide by zero!!");
//		} finally {
//			if (s != null) {
//				System.out.println("Devide completed!");
//				s.close();
//			}
//		}

		try {
			age();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Method age()
	public static int age() throws Exception {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Input your age");
			int age = s.nextInt();
			s.close();
			System.out.println("your age = " + age);
			return age;

		} catch (Exception e) {
			throw new Exception("Please input your age as int!!");
		}

	}
//	// Method Divide
//	private static int divide(int a, int b) {
//		return a / b;
//	}

}