package com.vti.lesson08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program08 {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Nguyen Van A");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Nguyen Van B");

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Nguyen Van C");

		Student.college = "Dai Hoc Bach Khoa";

		Student[] stu = new Student[] { s1, s2, s3 };

		// DHBK
		for (Student s : stu) {
			System.out.println(s);
		}

		// DHCN
		Student.college = "Dai Hoc Cong Nghe";
		for (Student s : stu) {
			System.out.println(s);
		}

	}
}
