package com.vti.lesson06;

public class Motorbike extends Vehicle {

	public Motorbike() {
		this.wheelAmounts = 2;
	}

	@Override
	public void diChuyen() {
		System.out.println("Motorkike...di chuyen");
	}

}