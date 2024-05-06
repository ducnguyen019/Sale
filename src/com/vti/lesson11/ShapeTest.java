package com.vti.lesson11;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Shape("Hinh Chu Nhat");
		Shape.Cordinate cordinate = s1.new Cordinate(5, 10);
		s1.setCodinate(cordinate);
		System.out.println(cordinate);
		System.out.println(s1);
	}
}
