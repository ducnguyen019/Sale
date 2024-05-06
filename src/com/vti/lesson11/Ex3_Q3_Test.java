package com.vti.lesson11;

import com.vti.lesson11.OuterClass.InnerClass;

public class Ex3_Q3_Test {
	public static void main(String[] args) {
		OuterClass o1 = new OuterClass();
		o1.show();

		InnerClass i1 = o1.new InnerClass();
		i1.show();
	}
}
