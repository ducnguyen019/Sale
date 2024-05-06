package com.vti.lesson06;

public abstract class Car extends Vehicle {
	public Car() {
		this.wheelAmounts = 4;
	}

	public abstract void nhapNhienLieu();

	@Override
	public void diChuyen() {
		System.out.println("  Di chuyen bang 4 banh");
	}
}
