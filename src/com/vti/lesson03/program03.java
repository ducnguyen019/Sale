package com.vti.lesson03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import com.vti.lesson01.Account;
import com.vti.lesson01.CategoryQuestion;
import com.vti.lesson01.Exam;

public class program03 {

	public static void main(String[] args) {
//		Locale vnLocale = new Locale(VNContants.vi, VNContants.Vn);

//		// Exercise 2 - Q1
//		int z = 5;
//		System.out.printf("%d%n", z);

//		// Exercise 2 - Q2
//		int z = 100000000;
//		System.out.printf(Locale.US, "%,d%n", z);

//		// Exercise 2 - Q3
//		double z = 5.567098;
//		System.out.printf("%5.4f%n", z);

//		// Exercise 2 - Q4
//		String z = "Nguyễn Văn A";
//		System.out.printf("Tên tôi là \"" + z + "\" và tôi đang độc thân");

//		// Exercise 2 - Q5
//		String z = "dd/MM/yyyy HH:mm:ss";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(z);
//		String Date = simpleDateFormat.format(new Date());
//		System.out.println(Date);

//		// Exercise 6 - Q1
//	
//
//	public static void InSoChan() {
//		for (int i = 1; i < 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//	}
	}
}

// Exercise 2 - Q5

//		// Ex01
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, vnLocale);
//		String vnFormat = dateFormat.format(new Date());
//		System.out.println("Vn Date = " + vnFormat);

//		// Ex02
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(VNContants.DATE_PATTERN);
//		String dateFormatStr = simpleDateFormat.format(new Date());
//		System.out.println("Date = " + dateFormatStr);
//
//		// Exercise 3 - Q1
//		Exam exam1 = new Exam();
//		exam1.code = 1;
//		exam1.categoryId = new CategoryQuestion[] {};
//		exam1.creatorId = new Account();
//		exam1.duration = 60;
//		exam1.createDate = new Date();
//
//		System.out.println("======================");
//		System.out.println("Exam 1: ");
//		System.out.println("Code: " + exam1.code);
//		System.out.println("createDate Vnese format: " + dateFormat.format(exam1.createDate));
//
//		// Scanner
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhap vao ten ");
//		String myName = scanner.nextLine();
//		System.out.println("My Name " + myName);
//		System.out.print("Nhap vao tuoi cua ban: ");
//		int age = scanner.nextInt();
//		System.out.println("My age = " + age);
//		System.out.print("Nhap vao weight cua ban ");
//		double weight = scanner.nextDouble();
//		System.out.print("My Weight = " + weight);

// Random
//		Random random = new Random();
//		System.out.println("Random Int " + random.nextInt());
//		System.out.println("Random 1 --> 50 = " + random.nextInt(50));
//		// Random x-->y ==> nextInt(y-x+1) + x; x=30, y=50
//		System.out.println("[30,50] = " + (random.nextInt(50 - 30 + 1) + 30));
//		
//		// Exercise 4 - Q3
//		Random random = new Random();
//		String[] names = new String[] { "Nam", "Duc", "Giang", "Tuyen", "An" };
//		int randomIndex = random.nextInt(4 - 0 + 1);
//		System.out.println("Index: " + randomIndex + "; Name = " + names[randomIndex]);
//
//		// Exercise 4 - Q1
//		Random random = new Random();
//		int x = random.nextInt();
//		System.out.println("So nguyen ngau nhien x = " + x);
//
//		// Exercise 4 - Q2
//		Random random = new Random();
//		double y = random.nextDouble();
//		System.out.println("So thuc ngau nhien y = " + y);

//		// Exercise 4 - Q4
//		Random random = new Random();
//		int ngay 1 = (int) LocalDate.of(ngay, ngay, ngay)

//		inputAccount();
//		InSoChan();
//	}

//	// Method nhap Account
//	public static void inputAccount() {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Nhap vao Id: ");
//		int id = s.nextInt();
//		s.nextLine(); // remove buffer
//
//		System.out.print("Nhap vao email: ");
//		String email = s.nextLine();
//
//		System.out.print("Nhap vao UserName: ");
//		String userName = s.nextLine();
//
//		Account acc = new Account();
//		acc.accountId = id;
//		acc.email = email;
//		acc.userName = userName;
//
//		System.out.println("Account infomation: ");
//		System.out.println("ID = " + acc.accountId + "; Email: " + acc.email + "; UserName: " + acc.userName);
//	}

//	}
//}
