package com.vti.lesson06;

public class Bicycle extends Vehicle {

	public Bicycle() {
		this.wheelAmounts = 2;
	}

	@Override
	public void diChuyen() {
		System.out.println("Di chuyen bang 2 banh");
	}

}