package com.vti.lesson08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] agrs) {

		File file = new File("D:\\practice.sql");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte[] b = new byte[1024];
			while (fis.read(b, 0, b.length) > -1) {
				String content = new String(b, 0, b.length);
				System.out.println(content);
				fis.read();
			}
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
