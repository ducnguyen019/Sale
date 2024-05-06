package com.vti.lesson11;

public class OuterClass {
	public void show() {
		InnerClass i1 = new InnerClass();
		i1.show();
	}

	public class InnerClass {
		public void show() {
			System.out.println("This is inner class");
		}
	}
}
