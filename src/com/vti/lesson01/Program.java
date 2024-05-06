package com.vti.lesson01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program {
	@SuppressWarnings("null")

	public static void main(String[] agrs) {
//		System.out.println("Hello World !!");
//		System.out.println("\n");
		// Create object

		Department d1 = new Department();
		Department d2 = new Department();
		Department d3 = new Department();
		d1.departmentId = 1;
		d1.departmentName = "Technical";
		d2.departmentId = 2;
		d2.departmentName = "Marketting";
		d3.departmentId = 3;
		d3.departmentName = "Hr";

//		System.out.println("Thong tin phong ban 1");
//		System.out.println("Id = " + d1.departmentId + ", Name = " + d1.departmentName);
//		System.out.println("\n");

		Position p1 = new Position();
		Position p2 = new Position();
		Position p3 = new Position();
		p1.positionName = "Dev";
		p1.positionId = 1;
		p2.positionName = "Test";
		p2.positionId = 2;
		p3.positionName = "PM";
		p3.positionId = 3;
//		System.out.println("Thong tin Position 1");
//		System.out.println("Id = " + p1.positionId + ", PositionName = " + p1.positionName);
//		System.out.println("\n");

		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		a1.accountId = 1;
		a1.email = "ducnguyen@gmail.com";
		a1.userName = "ducnguyen";
		a1.fullName = "Nguyen Phu Duc";
		a1.department = d1;
		a1.position = p1;
		a1.createDate = new Date("2022/04/03");
		a2.accountId = 2;
		a2.email = "namnguyen@gmail.com";
		a2.userName = "namnguyen";
		a2.fullName = "Nguyen Van Nam";
		a2.department = d2;
		a2.position = p2;
		a2.createDate = new Date("2022/04/01");
		a3.accountId = 3;
		a3.email = "khanhan@gmail.com";
		a3.userName = "khanhan";
		a3.fullName = "Ho Khanh An";
		a3.department = d3;
		a3.position = p3;
		a3.createDate = new Date("2022/02/14");
//		System.out.println("Thong tin account 1");
//		System.out.println("ID: " + a1.accountId);
//		System.out.println("Email: " + a1.email);
//		System.out.println("Department Name: " + a1.department.departmentName);
//		System.out.println("Position: " + a1.position.positionName);
//		System.out.println("CreateDate: " + a1.createDate);
//		System.out.println("\n");

		Group g1 = new Group();
		Group g2 = new Group();
		Group g3 = new Group();
		g1.groupId = 1;
		g1.groupName = "Fresher C#";
		g1.accounts = new Account[] { a1, a2 };
		g1.createDate = new Date("2022/04/03");
		g2.groupId = 2;
		g2.groupName = "Java";
		g2.accounts = new Account[] { a1 };
		g2.createDate = new Date("2022/03/03");
		g3.groupId = 3;
		g3.groupName = "Senior";
		g3.createDate = new Date("2022/01/05");
//		System.out.println("Thong tin Group");
//		System.out.println("ID: " + g1.groupId);
//		System.out.println(a1);
//		System.out.println("Group Name: " + g1.groupName);
//		System.out.println("Ngay tao: " + g1.createDate);

		a2.groups = new Group[] { g1, g2 };
		a1.groups = new Group[] { g1 };

		GroupAccount ga1 = new GroupAccount();
		GroupAccount ga2 = new GroupAccount();
		GroupAccount ga3 = new GroupAccount();
		ga1.group = g1;
		ga1.account = a1;
		ga1.joinDate = new Date("2022/01/01");
		ga2.group = g2;
		ga2.account = a2;
		ga2.joinDate = new Date("2021/06/01");
		ga3.group = g3;
		ga3.account = a3;
		ga3.joinDate = new Date("2021/07/07");

		TypeQuestion tq1 = new TypeQuestion();
		TypeQuestion tq2 = new TypeQuestion();
		TypeQuestion tq3 = new TypeQuestion();
		tq1.typeID = 1;
		tq1.typeName = "Essay 1";
		tq2.typeID = 2;
		tq2.typeName = "Essay 2";
		tq3.typeID = 3;
		tq3.typeName = "Essay 3";

		CategoryQuestion cq1 = new CategoryQuestion();
		CategoryQuestion cq2 = new CategoryQuestion();
		CategoryQuestion cq3 = new CategoryQuestion();
		cq1.categoryId = 1;
		cq1.categoryName = "Java";
		cq2.categoryId = 2;
		cq2.categoryName = "Python";
		cq3.categoryId = 3;
		cq3.categoryName = "PHP";

		Question q1 = new Question();
		Question q2 = new Question();
		Question q3 = new Question();
		q1.questionId = 1;
		q1.content = "java la gi ?";
		q1.category = cq1;
		q1.type = tq1;
		q1.account = a1;
		q1.createDate = new Date("2019/09/01");
		q2.questionId = 2;
		q2.content = "Python la gi ?";
		q2.category = cq2;
		q2.type = tq2;
		q2.account = a2;
		q2.createDate = new Date("2020/05/01");
		q3.questionId = 3;
		q3.content = "PHP la gi ?";
		q3.category = cq3;
		q3.type = tq3;
		q3.account = a3;
		q3.createDate = new Date("2019/05/02");

		Answer an1 = new Answer();
		Answer an2 = new Answer();
		Answer an3 = new Answer();
		an1.answerId = 1;
		an1.content = "Java la 1 ngon ngu lap trinh";
		an1.questionId = q1;
		an2.answerId = 2;
		an2.content = "Python la 1 ngon ngu lap trinh";
		an2.questionId = q2;
		an3.answerId = 3;
		an3.content = "PHP la 1 ngon ngu lap trinh";
		an3.questionId = q3;

		Exam e1 = new Exam();
		Exam e2 = new Exam();
		Exam e3 = new Exam();
		e1.examId = 1;
		e1.code = 001;
		e1.title = "Kiem tra cuoi khoa";
		e1.categoryId = cq1;
		e1.duration = 90;
		e1.creatorId = a1;
		e1.createDate = new Date("2022/02/03");
		e2.examId = 2;
		e2.code = 002;
		e2.title = "Kiem tra cuoi khoa";
		e2.categoryId = cq2;
		e2.duration = 90;
		e2.creatorId = a2;
		e2.createDate = new Date("2021/03/04");
		e3.examId = 3;
		e3.code = 003;
		e3.title = "Kiem tra cuoi khoa";
		e3.categoryId = cq3;
		e3.duration = 90;
		e3.creatorId = a3;
		e3.createDate = new Date("2023/05/05");

		ExamQuestion eq1 = new ExamQuestion();
		ExamQuestion eq2 = new ExamQuestion();
		ExamQuestion eq3 = new ExamQuestion();
		eq1.exam = e1;
		eq1.question = q1;
		eq2.exam = e2;
		eq2.question = q2;
		eq3.exam = e3;
		eq3.question = q3;

//		// Exercise 1 - Q1 if - else
//		if (a2.department == null) {
//			System.out.println("Nhan vien nay chua co phong ban");
//		} else {
//			System.out.println("phong ban cua nhan vien la " + a2.department.departmentName);
//		}
//		
//		
//		// Exercise 1 - Q2
//		if (a1.groups == null || a1.groups.length == 0) {
//			System.out.println("Nhan vien nay chua thuoc group nao");
//		} else if (a1.groups.length == 1 || a1.groups.length == 2) {
//			System.out.println("Nhan vien nay thuoc group Java Fresher hoac C# Fresher");
//		} else if (a1.groups.length == 3) {
//			System.out.println("Nhan vien nay quan trong, tham gia nhieu group");
//		} else {
//			System.out.println("Nhan vien nay hong chuyen, tham gia tat ca cac group");
//		}

//		// Exercise 1 - Q3 Ternary
//		System.out.println(a2.department == null ? "nhan vien nay chua co phong ban"
//				: "phong ban nhan vien nay la " + a2.department.departmentName);

//		// Exercise 1 - Q4
//		System.out.println(p1.positionName == "Dev" ? "Day la Developer" : "Nguoi nay khong phai la Developer");

//		// Exercise 1 - Q5
//		if (g1.accounts == null || g1.accounts.length == 0) {
//			System.out.println("Nhom nay ko co thanh vien");
//		} else if (g1.accounts.length == 1) {
//			System.out.println("Nhom nay co 1 thanh vien");
//		} else if (g1.accounts.length == 2) {
//			System.out.println("Nhom nay co 2 thanh vien");
//		} else if (g1.accounts.length == 3) {
//			System.out.println("Nhom nay co 3 thanh vien");
//		} else
//			System.out.println("Nhom nay co nhieu thanh vien");

		// Exercise 1 - Q6
//		switch (a1.groups.length) {
//		case 0:
//			System.out.println("Nhan vien nay chua thuoc group nao");
//			break;
//		case 1:
//		case 2:
//			System.out.println("Nhan vien nay thuoc group Java Fresher hoac C# Fresher");
//			break;
//		case 3:
//			System.out.println("Nhan vien nay quan trong, tham gia nhieu group");
//			break;
//		default:
//			System.out.println("Nhan vien nay hong chuyen, tham gia tat ca cac group");
//			break;
//		}

//		// Exercise 1 - Q7
//		switch (a1.position.positionName) {
//		case "Dev":
//			System.out.println("Day la Developer");
//			break;
//		default:
//			System.out.println("Nguoi nay khong phai Developer");
//			break;
//		}

		// Exercise 1 - Q8
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		for (Account a : accounts) {
//			System.out.println("Full Name: " + a.fullName);
//			System.out.println("Email: " + a.email);
//			System.out.println("Department: " + a.department.departmentName);
//			System.out.println("\n");
//		}

		// Exercise 1 - Q9
//		Department[] departments = new Department[] { d1, d2, d3 };
//		for (Department d : departments) {
//			System.out.println("Id = " + d.departmentId);
//			System.out.println("DeptName = " + d.departmentName);
//			System.out.println("\n");
//		}

//		// Exercise 1 - Q10
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		for (int i = 0; i < accounts.length; i++) {
//			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phong ban: " + accounts[i].department.departmentName);
//			System.out.println("\n");
//		}

//		// Exercise 1 - Q11
//		Department[] departments = new Department[] { d1, d2, d3 };
//		for (int i = 0; i < departments.length; i++) {
//			System.out.println("Thong tin department thu " + (i + 1) + " la: ");
//			System.out.println("ID: " + departments[i].departmentId);
//			System.out.println("Name: " + departments[i].departmentName);
//			System.out.println("\n");
//		}

//		// Exercise 1 - Q12
//		Department[] departments = new Department[] { d1, d2, d3 };
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Thong tin Department thu " + (i + 1) + " la: ");
//			System.out.println("ID: " + departments[i].departmentId);
//			System.out.println("Ten phong ban: " + departments[i].departmentName);
//			System.out.println("\n");
//		}

//		// Exercise 1 - Q13
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		for (int i = 0; i < accounts.length; i++) {
//			if(i==1) {
//				continue;
//			}
//			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phong ban: " + accounts[i].department.departmentName);
//			System.out.println("\n");
//		}

//		// Exercise 1 - Q14
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i].accountId < 4) {
//				System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Full Name: " + accounts[i].fullName);
//				System.out.println("Phong ban: " + accounts[i].department.departmentName);
//				System.out.println("\n");
//			}
//		}

//		// Exercise 1 - Q15
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

//		// Exercise 1 - Q16
//			// Exercise 1 - Q16 - 10
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		int i = 0;
//		while (i < accounts.length) {
//			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phong ban: " + accounts[i].department.departmentName);
//			System.out.println("\n");
//			i++;
//		}

//			// Exercise 1 - Q16 - 11
//		Department[] departments = new Department[] { d1, d2, d3 };
//		int i = 0;
//		while (i < departments.length) {
//			System.out.println("Thong tin department thu " + (i + 1) + " la: ");
//			System.out.println("ID: " + departments[i].departmentId);
//			System.out.println("Name: " + departments[i].departmentName);
//			System.out.println("\n");
//			i++;
//		}

//			// Exercise 1 - Q16 - 12
//		Department[] departments = new Department[] { d1, d2, d3 };
//		int i = 0;
//		while (i < departments.length) {
//			System.out.println("Thong tin Department thu " + (i + 1) + " la: ");
//			System.out.println("ID: " + departments[i].departmentId);
//			System.out.println("Ten phong ban: " + departments[i].departmentName);
//			System.out.println("\n");
//			i++;
//		}

//			// Exercise 1 - Q16 - 13
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		int i = 0;
//		while (i < accounts.length) {
//			if (i == 1) {
//				continue;
//			}
//			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phong ban: " + accounts[i].department.departmentName);
//			System.out.println("\n");
//			i++;
//		}

//			// Exercise 1 - Q16 - 14
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		int i = 0;
//		while (i < accounts.length) {
//			if (accounts[i].accountId < 4) {
//				System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Full Name: " + accounts[i].fullName);
//				System.out.println("Phong ban: " + accounts[i].department.departmentName);
//				System.out.println("\n");
//				i++;
//			}
//		}

//			// Exercise 1 - Q16 - 15
//		int i = 1;
//		while (i <= 20) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}

//		// Exercise 1 - Q17
//		// Exercise 1 - Q17 - 10
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		int i = 0;
//		do {
//			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phong ban: " + accounts[i].department.departmentName);
//			System.out.println("\n");
//			i++;
//		} while (i < accounts.length);

//		// Exercise 1 - Q17 - 11
//		Department[] departments = new Department[] { d1, d2, d3 };
//		int i = 0;
//		do {
//			System.out.println("Thong tin department thu " + (i + 1) + " la: ");
//			System.out.println("ID: " + departments[i].departmentId);
//			System.out.println("Name: " + departments[i].departmentName);
//			System.out.println("\n");
//			i++;
//		} while (i < departments.length);

//		// Exercise 1 - Q17 - 12
//		Department[] departments = new Department[] { d1, d2, d3 };
//		int i = 0;
//		do {
//			System.out.println("Thong tin Department thu " + (i + 1) + " la: ");
//			System.out.println("ID: " + departments[i].departmentId);
//			System.out.println("Ten phong ban: " + departments[i].departmentName);
//			System.out.println("\n");
//			i++;
//		} while (i < departments.length);

//		// Exercise 1 - Q17 - 13
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		int i = 0;
//		do {
//			if (i == 1) {
//				continue;
//			}
//			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phong ban: " + accounts[i].department.departmentName);
//			System.out.println("\n");
//			i++;
//		} while (i < accounts.length);

//		// Exercise 1 - Q17 - 14
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		int i = 0;
//		do {
//			if (accounts[i].accountId < 4) {
//				System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Full Name: " + accounts[i].fullName);
//				System.out.println("Phong ban: " + accounts[i].department.departmentName);
//				System.out.println("\n");
//				i++;
//			}
//		} while (i < accounts.length);

//		// Exercise 1 - Q17 - 15
//		int i = 1;
//		do {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		} while (i <= 20);

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

//		// Exercise 2 - Q6
//		System.out.printf("|%-20s|%-30s|%-20s", "Full Name", "Email", "Department");
//		System.out.printf("%n");
//		Account[] accounts = new Account[] { a1, a2, a3 };
//		for (Account a : accounts) {
//			System.out.printf("%n");
//			System.out.printf("|%-20s|%-30s|%-20s", a.fullName, a.email, a.department.departmentName);
//		}

//		// Exercise 3 - Q1
//		Locale locale = new Locale("vn", "VN");
//		DateFormat dateFormat = DateFormat.getDateInstance();
//		System.out.println("======================");
//		System.out.println("Exam 1");
//		System.out.println("Code: " + e1.code);
//		System.out.println("Create Date: " + dateFormat.format(e1.createDate));

//		// Exercise 3 - Q2
//		String pattern = "yyyy-MM-dd HH-mm-SS";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//		Exam[] exams = new Exam[] { e1, e2, e3 };
//		for (Exam e : exams) {
//			System.out.println("Exam Code " + e.code + ": " + simpleDateFormat.format(e.createDate));
//		}

//		// Exercise 3 - Q3
//		String pattern = "yyyy";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//		Exam[] exams = new Exam[] { e1, e2, e3 };
//		for (Exam e : exams) {
//			System.out.println("Exam Code " + e.code + ": " + simpleDateFormat.format(e.createDate));
//		}

//		// Exercise 3 - Q4
//		String pattern = "yyyy-MM";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//		Exam[] exams = new Exam[] { e1, e2, e3 };
//		for (Exam e : exams) {
//			System.out.println("Exam Code " + e.code + ": " + simpleDateFormat.format(e.createDate));
//		}

//		// Exercise 3 - Q5
//		String pattern = "MM-dd";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//		Exam[] exams = new Exam[] { e1, e2, e3 };
//		for (Exam e : exams) {
//			System.out.println("Exam Code " + e.code + ": " + simpleDateFormat.format(e.createDate));
//		}

//		// Exercise 4 - Q1
//		Random random = new Random();
//		int x = random.nextInt();
//		System.out.println("So nguyen ngau nhien x = " + x);

//		// Exercise 4 - Q2
//		Random random = new Random();
//		double y = random.nextDouble();
//		System.out.println("So thuc ngau nhien y = " + y);

//		// Exercise 4 - Q3
//		Random random = new Random();
//		String[] names = new String[] { "Nam", "Duc", "Giang", "Tuyen", "An" };
//		int randomIndex = random.nextInt(4 - 0 + 1) + 0;
//		System.out.println("Index: " + randomIndex + "; Name = " + names[randomIndex]);

//		// Exercise 4 - Q4
//		Random random = new Random();
//		int Day1 = (int)LocalDate.of(1995, 7, 24).toEpochDay(); //dem so ngay tinh tu 1995/7/24 den EpochDay 1970/01/01
//		int Day2 = (int)LocalDate.of(1995, 12, 20).toEpochDay(); //dem so ngay tinh tu 1994/12/20 den EpochDay 1970/01/01
//		System.out.println("Day1: " + Day1);
//		System.out.println("Day2: " + Day2);
//		int RandomNumberOfDays = random.nextInt(Day2 - Day1);
//		LocalDate randomDay = LocalDate.ofEpochDay(Day1 + RandomNumberOfDays);
//		System.out.println("Ngay ngau nhien: " + randomDay);

//		// Exercise 4 - Q5
//		Random random = new Random();
//		int now = (int) LocalDate.now().toEpochDay();
//		int randomDay = now - random.nextInt(365);
//		LocalDate result = LocalDate.ofEpochDay(randomDay);
//		System.out.println("Ngay ngau nhien trong 1 nam tro lai day: " + result);

//		// Exercise 4 - Q6
//		Random random = new Random();
//		int now = (int) LocalDate.now().toEpochDay();
//		int randomDay = random.nextInt(now);
//		LocalDate result = LocalDate.ofEpochDay(randomDay);
//		System.out.println("Ngay ngau nhien trong qua khu: " + result);

//		// Exercise 4 - Q7
//		Random random = new Random();
//		int z = random.nextInt(999 - 100 + 1) + 100;
//		System.out.println(z);

//		// Exercise 5 - Q1
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Nhap so nguyen thu 1: ");
//		int z1 = sc1.nextInt();
//		System.out.println("Nhap so nguyen thu 2: ");
//		int z2 = sc1.nextInt();
//		System.out.println("Nhap so nguyen thu 3: ");
//		int z3 = sc1.nextInt();
//		System.out.println("So nguyen thu 1 la: " + z1);
//		System.out.println("So nguyen thu 2 la: " + z2);
//		System.out.println("So nguyen thu 3 la: " + z3);

//		// Exercise 5 - Q2
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("Nhap vao so thuc thu 1: ");
//		float z1 = sc2.nextFloat();
//		System.out.println("Nhap vao so thuc thu 2: ");
//		float z2 = sc2.nextFloat();
//		System.out.println("So thuc thu 1 la: " + z1);
//		System.out.println("So thuc thu 2 la: " + z2);

//		// Exercise 5 - Q3
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("Nhap vao ho cua ban: ");
//		String z1 = sc3.nextLine();
//		System.out.println("Nhap vao ten cua ban: ");
//		String z2 = sc3.nextLine();
//		System.out.println("Ho & Ten cua ban la: " + z1 + " " + z2);

//		// Exercise 5 - Q4
//		Scanner sc4 = new Scanner(System.in);
//		System.out.println("Nhap vao ngay sinh cua ban: ");
//		int z1 = sc4.nextInt();
//		System.out.println("Nhap vao thang sinh cua ban: ");
//		int z2 = sc4.nextInt();
//		System.out.println("Nhap vao nam sinh cua ban: ");
//		int z3 = sc4.nextInt();
//		LocalDate birthday = LocalDate.of(z3, z2, z1);
//		System.out.println("Ngay sinh nhat cua ban la: " + birthday);

//		// Exercise 5 - Q5
//		Ex5Q5();

//		// Exercise 5 - Q6
//		Ex5Q6();

//		// Exercise 5 - Q7
//		Scanner sc7 = new Scanner(System.in);
//		while (true) {
//			System.out.println("Nhap vao 1 so chan: ");
//			int z = sc7.nextInt();
//			if (z % 2 == 0) {
//				System.out.println("So chan z = " + z);
//				break; // or return;
//			} else {
//				System.out.println("So vua nhap ko phai so chan, hay nhap lai 1 so khac! ");
//			}
//		}

//		// Exercise 5 - Q8
//		Ex5Q8();

//		// Exercise 5 - Q9
//		Ex5Q9();

//		// Exercise 5 - Q10
//		Ex5Q10();

//		// Exercise 5 - Q11
//		Ex5Q11();

//		// Exercise 6 - Q1
//		Ex6Q1();

//		// Exercise 6 - Q2
//		Ex6Q2();

//		// Exercise 6 - Q3
//		Ex6Q3();

	}

	// Exercise 5 - Q5
	public static void Ex5Q5() {
		Scanner sc5 = new Scanner(System.in);
		sc5.useDelimiter(System.lineSeparator());
		Account acc = new Account();
		System.out.println("Nhap vao ID: ");
		acc.accountId = sc5.nextInt();
		System.out.println("Nhap vao User Name cua ban: ");
		acc.userName = sc5.next();
		System.out.println("Nhap vao Full Name cua ban: ");
		acc.fullName = sc5.nextLine();
		sc5.nextLine(); // them vao dong nay de khi nhap ID roi bam enter thi no doc dau enter cho minh
		System.out.println("Nhap vao Email cua ban: ");
		acc.email = sc5.next();
		System.out
				.println("Nhap vao PositionId cua ban (Id = 1: Dev, Id = 2: Test, Id = 3: Scrum_Master, Id = 4: PM): ");
		int x = sc5.nextInt();
		Position position = new Position();
		switch (x) {
		case 1:

			position.positionName = "Dev";
			acc.position = position;
			break;
		case 2:
			position.positionName = "Test";
			acc.position = position;
			break;
		case 3:
			position.positionName = "Scrum_Master";
			acc.position = position;
			break;
		case 4:
			position.positionName = "PM";
			acc.position = position;
			break;

		}

		acc.createDate1 = LocalDate.now();
		System.out.println("Thong tin Account cua ban la: ");
		System.out.println("Id: " + acc.accountId);
		System.out.println("User Name: " + acc.userName);
		System.out.println("Full Name: " + acc.fullName);
		System.out.println("Email: " + acc.email);
		System.out.println("Position: " + position.positionName);
	}

	// Exercise 5 - Q6
	public static void Ex5Q6() {
		Scanner sc6 = new Scanner(System.in);
		Department dep = new Department();
		System.out.println("Nhap vao Department ID: ");
		dep.departmentId = sc6.nextInt();
		System.out.println("Nhap vao Department Name: ");
		dep.departmentName = sc6.next();
		System.out.println("Thong tin department cua ban la: ");
		System.out.println("ID: " + dep.departmentId);
		System.out.println("Department Name: " + dep.departmentName);
	}

	// Exercise 5 - Q8
	public static void Ex5Q8() {
		System.out.println("Moi ban nhap vao chuc nang muon su dung");
		while (true) {
			System.out.println("Nhap 1: Tao Account, Nhap 2: Tao Department");
			Scanner sc8 = new Scanner(System.in);
			int z = sc8.nextInt();
			if (z == 1) {
				Ex5Q5();
			} else if (z == 2) {
				Ex5Q6();
			} else {
				System.out.println("Moi ban nhap lai");
			}
			sc8.close();
		}
	}

	// Exercise 5 - Q9
	public static void Ex5Q9() {
		// Exercise 5 - Q9a
		Account a1 = new Account(1, "ducnguyen@gmail.com", "ducnguyen", "Nguyen Phu Duc");
		Account a2 = new Account(2, "namnguyen@gmail.com", "namnguyen", "Nguyen Van Nam");
		Account a3 = new Account(3, "khanhan@gmail.com", "khanhan", "Ho Khanh An");

		Group g1 = new Group(1, "Fresher C#", new Account[] { a1, a2 });
		Group g2 = new Group(2, "Java", new Account[] { a1 });
		Group g3 = new Group(3, "Senior");

		Department d1 = new Department(1, "Technical");
		Department d2 = new Department(2, "Marketting");
		Department d3 = new Department(3, "Hr");

		Position p1 = new Position(1, "Dev");
		Position p2 = new Position(2, "Test");
		Position p3 = new Position(3, "PM");

		Account[] listAcc = new Account[] { a1, a2, a3 };
		System.out.println("Danh sach cac Username: ");
		for (int i = 0; i < listAcc.length; i++) {
			System.out.println("Username: " + (i + 1) + " :" + listAcc[i].userName);
		}

		// Exercise 5 - Q9b
		Scanner sc9b = new Scanner(System.in);
		System.out.println("Nhap vao User Name cua Account...");
		String nameAcc = sc9b.next();

		// Exercise 5 - Q9c
		Group[] listG = { g1, g2, g3 };
		System.out.println("Danh sach ten cac Group...");
		for (int i = 0; i < listG.length; i++) {
			System.out.println("Group " + (i + 1) + ": " + listG[i].groupName);
		}

		// Exercise 5 - Q9d
		Scanner sc9d = new Scanner(System.in);
		System.out.println("Nhap vao ten cua Group...");
		String nameGroup = sc9d.nextLine();
		sc9d.nextLine();

		// Exercise 5 - Q9e
		Account[] listAcc1 = { a1, a2, a3 };
		Group[] listG1 = { g1, g2, g3 };
		int z1 = 0;
		for (int i = 0; i < listAcc1.length; i++) {
			if (listAcc1[i].userName.equals(nameAcc)) {
				z1++;
			}
		}
		int z2 = 0;
		for (int j = 0; j < listG1.length; j++) {
			if (listG1[j].groupName.equals(nameGroup)) {
				z2++;
			}
		}

		if (z1 <= 0 || z2 <= 0) {
			System.out.println("Khong co Account Name voi Group Name vua nhap!!!");
		} else {
			for (int k = 0; k < listAcc1.length; k++) {
				if (listAcc1[k].userName.equals(nameAcc)) {
					Group[] listG2 = { listG1[z2] };
					listAcc1[k].groups = listG2;
					System.out.println("Them thanh cong Group voi Group Name " + nameGroup
							+ " ,co Account User Name la " + nameAcc + " vao Account");
				}
			}
		}
	}

	// Exercise 5 - Q10
	public static void Ex5Q10() {
		System.out.println("Moi ban nhap vao chuc nang muon su dung");
		while (true) {
			System.out.println("|Nhap 1: Tao Account, |Nhap 2: Tao Department, |Nhap 3: Them Group vao Account");
			Scanner sc10 = new Scanner(System.in);
			int z = sc10.nextInt();
			switch (z) {
			case 1:
				Ex5Q5();
				break;
			case 2:
				Ex5Q6();
				break;
			case 3:
				Ex5Q9();
				break;
			}
			System.out.println(
					"Ban co muon thuc hien chuc nang khac ko ???  |Nhap 0: Ko, ket thuc chuong trinh, |Nhap 1: Co, tiep tuc chuong trinh");
			int z1 = sc10.nextInt();
			switch (z1) {
			case 0:
				System.out.println("Ket thuc chuong trinh!!!");
				sc10.close();
				return;
			case 1:
				break;
			default:
				System.out.println("Nhap lai 0 hoac 1");
			}
		}
	}

	// Exercise 5 - Q11
	public static void Ex5Q11() {
		System.out.println("Moi ban nhap vao chuc nang muon su dung");
		while (true) {
			System.out.println(
					"|Nhap 1: Tao Account, |Nhap 2: Tao Department, |Nhap 3: Them Group vao Account, |Nhap 4: Them Account vao Group ngau nhien");
			Scanner sc11 = new Scanner(System.in);
			int z = sc11.nextInt();
			switch (z) {
			case 1:
				Ex5Q5();
				break;
			case 2:
				Ex5Q6();
				break;
			case 3:
				Ex5Q9();
				break;
			case 4:
				Ex5Q11z();
				break;
			}
			System.out.println(
					"Ban co muon thuc hien chuc nang khac ko ???  |Nhap 0: Ko, ket thuc chuong trinh, |Nhap 1: Co, tiep tuc chuong trinh");
			int z1 = sc11.nextInt();
			if (z1 == 0) {
				switch (z1) {
				case 0:
					System.out.println("Ket thuc chuong trinh!!!");
					sc11.close();
					return;
				case 1:
					break;
				default:
					System.out.println("Nhap lai 0 hoac 1");
				}
			}
		}
	}

	// Exercise 5 - Q11z
	public static void Ex5Q11z() {
		// Exercise 5 - Q11z - a
		Account a1 = new Account(4, "ducnguyen4@gmail.com", "ducnguyen4", "Nguyen Phu Duc 4");
		Account a2 = new Account(5, "namnguyen5@gmail.com", "namnguyen5", "Nguyen Van Nam 5");
		Account a3 = new Account(6, "khanhan6@gmail.com", "khanhan6", "Ho Khanh An 6");

		Group g1 = new Group(1, "Fresher Java", new Account[] { a1, a2 });
		Group g2 = new Group(2, "Python", new Account[] { a1 });
		Group g3 = new Group(3, "Junior");

		Department d1 = new Department(1, "Technical");
		Department d2 = new Department(2, "Marketting");
		Department d3 = new Department(3, "Hr");

		Position p1 = new Position(1, "Dev");
		Position p2 = new Position(2, "Test");
		Position p3 = new Position(3, "PM");

		Account[] listAcc2 = new Account[] { a1, a2, a3 };
		System.out.println("Danh sach cac Username: ");
		for (int i = 0; i < listAcc2.length; i++) {
			System.out.println("Username: " + (i + 1) + " :" + listAcc2[i].userName);
		}

		Group[] listG2 = { g1, g2, g3 };
		System.out.println("Danh sach ten cac Group...");
		for (int j = 0; j < listG2.length; j++) {
			System.out.println("Group " + (j + 1) + ": " + listG2[j].groupName);
		}

		// Exercise 5 - Q11z - b
		Scanner sc11z = new Scanner(System.in);
		System.out.println("Nhap vao User Name cua Account...");
		String userName = sc11z.next();

		// Exercise 5 - Q11z - c
		Random random = new Random();
		int randomG = random.nextInt(2);

		// Exercise 5 - Q11z - d
		int z1 = 0;
		for (int i = 0; i < listAcc2.length; i++) {
			if (listAcc2[i].userName.equals(userName)) {
				z1++;
			}
		}

		if (z1 <= 0) {
			System.out.println("Ko co Account vua nhap trong he thong !!!");
		} else {
			for (int k = 0; k < listAcc2.length; k++) {
				if (listAcc2[k].userName.equals(userName)) {
					Group[] addG = { listG2[randomG] };
					listAcc2[k].groups = addG;
					System.out.println("Them Account co User Name vua nhap vao Group ngau nhien thanh cong !!!");
				}
			}
		}
	}

	// Exercise 6 - Q1
	public static void Ex6Q1() {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
	}

	// Exercise 6 - Q2
	public static void Ex6Q2() {
		Account a1 = new Account();
		a1.accountId = 1;
		a1.userName = "NguyenDuc";
		a1.fullName = "Nguyễn Phú Đức";
		a1.email = "nguyenphuduc@gmail.com";
		a1.createDate = new Date("2017/02/01");

		Account a2 = new Account();
		a2.accountId = 2;
		a2.userName = "NguyenNam";
		a2.fullName = "Nguyễn Văn Nam";
		a2.email = "nguyenvannam@gmail.com";
		a2.createDate = new Date("2018/05/01");

		Account a3 = new Account();
		a3.accountId = 3;
		a3.userName = "Nguyen";
		a3.fullName = "Nguyễn Văn Công";
		a3.email = "nguyenvancong@gmail.com";
		a3.createDate = new Date("2019/06/02");
		Account[] accounts = new Account[] { a1, a2, a3 };
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thong tin account thu " + (i + 1) + " : ");
			System.out.println("ID: " + accounts[i].accountId);
			System.out.println("User Name: " + accounts[i].userName);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Create Date: " + accounts[i].createDate);
			System.out.println("\n");
		}
	}

	// Exercise 6 - Q3
	public static void Ex6Q3() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
