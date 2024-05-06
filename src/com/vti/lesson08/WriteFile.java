package com.vti.lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		String content = "Hello! I Love Java";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("D:\\Demo1.txt"), true);
			fos.write(content.getBytes());
			fos.flush();
			fos.close();
			System.out.println(fos);
			System.out.println("Write successfully!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
