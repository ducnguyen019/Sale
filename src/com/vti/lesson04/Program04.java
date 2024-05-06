package com.vti.lesson04;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.vti.lesson01.Account;
import com.vti.lesson01.Department;

public class Program04 {

	// Assignment 4
	// Ex1-Q1a
	public void Department() {
	}
	
	

	public static void main(String[] args) {
//		System.out.println("Max Int = " + Integer.MAX_VALUE);
//		long l = (Integer.MAX_VALUE) + 100l; // int + long = long
//		int i = (int) l;
//		long a = 1000;
//		int b = (int) a;
//		double c = 3.14;
//		int d = (int) c;
//		int e = 10;
//		int f = 3;
//		System.out.println("Long Value: " + l);
//		System.out.println("Int Value: " + i);
//
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
//
//		System.out.println("KQ = " + e / f);
//		System.out.println("KQ = " + (float) e / f);

//		// Ex01 - Q1
//		float salary1 = 5240.5f;
//		float salary2 = 10970.055f;
//
//		int salary1Int = (int) salary1;
//		int salary2Int = (int) salary2;
//
//		System.out.println("Salary Account 1 = " + salary1);
//		System.out.println("Salary Account 2 = " + salary2);
//		System.out.println("Salary Account 1 lam tron = " + salary1Int);
//		System.out.println("Salary Account 2 lam tron = " + salary2Int);

//		// Ex01 - Q2
//		Random random = new Random();
//		int min = 0;
//		int max = 99999;
//		int z = random.nextInt(max - min + 1) + min;

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap so z nho hon 99999: ");
//		int z = scanner.nextInt();
//		String zz = Integer.toString(z);
//
//		if (zz.length() == 1) {
//			System.out.println("0000" + zz);
//		} else if (zz.length() == 2) {
//			System.out.println("000" + zz);
//		} else if (zz.length() == 3) {
//			System.out.println("00" + zz);
//		} else if (zz.length() == 4) {
//			System.out.println("0" + zz);
//		} else
//			System.out.println(zz);

//		// Ex01 - Q3
//		String zz = String.valueOf(z);
//		System.out.println("2 so cuoi cua zz = " + zz.substring(3));

//		// or
//
//		int zzz = z % 100;
//		System.out.println("2 so cuoi cua zz = " + zzz);

		// Ex01 - Q4

//		// Ex02 - Q1
//		Account[] accounts = new Account[5];
//		for (int i = 0; i < accounts.length; i++) {
//			Account a = new Account();
//			a.userName = "acc " + (i + 1);
//			a.fullName = "Nguyen " + (i + 1);
//			a.email = "Email " + (i + 1);
//			a.createDate1 = LocalDate.now();
//			System.out.println("Thong tin account thu " + (i+1) + ": " );
//			System.out.println("User Name: " + a.userName);
//			System.out.println("Full Name: " + a.fullName);
//			System.out.println("Email: " + a.email);
//			System.out.println("Create Date: " + a.createDate1);
//			System.out.println("\n");
//		}

//		// Ex03 - Q1
//		Integer sal = new Integer(5000);
//		int salInt = sal.intValue();
//		float salFloat = salInt;
//		System.out.printf("%2.2f", salFloat);

//		// Ex03 - Q2
//		String a = "1234567";
//		int z = Integer.parseInt(a);
//		System.out.println(a);

//		// Ex03 - Q2Extra
//		String s = new String("1234567  ");
//		int sInt = Integer.valueOf(s.trim());
//		System.out.println("sInt = " + sInt);

//		// Ex04 - Q1
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap chuoi: ");
//		String z = scanner.nextLine();
//		String[] x = z.split(" ");
//		System.out.println("So luong tu = " + x.length);
//		scanner.close();

//		// Ex04 - Q2
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap z1");
//		String z1 = scanner.nextLine();
//		System.out.println("Nhap z2");
//		String z2 = scanner.nextLine();
//		System.out.println("z1 + z2 = " + z1.concat(z2));
//		scanner.close();

//		// toString, .equals, hashcode
//		Department[] dep = new Department[5];
//		for (int i = 0; i < dep.length; i++) {
//			Department d = new Department();
//			d.departmentId = i + 1;
//			d.departmentName = "Name " + (i+1);
//			dep[i] = d;
//		}
//		
//		Department d1 = new Department();
//		Department d2 = new Department();
//		d1.departmentId = 1;
//		d1.departmentName = "Dept 1";
//		d2.departmentId = 1;
//		d2.departmentName = "Dept 2";
//		System.out.println("d1 = " + d1);
//		System.out.println("d2 = " + d2);
//		System.out.println(d1.equals(d2));

	}

}
