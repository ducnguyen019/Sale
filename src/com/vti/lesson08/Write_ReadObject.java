package com.vti.lesson08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Write_ReadObject {
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
		// write object
		Student[] stu = new Student[] { s1, s2, s3 };
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("D:\\Demo1.txt"));
			for (Student s : stu) {
				oos.writeObject(s.toString());
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// read object
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("D:\\Demo1.txt"));
			for (int i = 0; i < 3; i++) {
				Student s = (Student) ois.readObject();
				System.out.println(s);
			}
			ois.close();

		} catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
	}
}
