package com.vti.lesson11;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		car.setEngine(engine);
		System.out.println(car.getEngine());

	}

}
