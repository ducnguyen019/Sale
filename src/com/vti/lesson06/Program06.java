package com.vti.lesson06;

public class Program06 {

	public static void main(String[] args) {
		Car ford = new Ford();
		Vehicle honda = new Honda();
		Vehicle bicycle = new Bicycle();
		Vehicle motobike = new Motorbike();

		ford.diChuyen();
		honda.diChuyen();
		bicycle.diChuyen();
		motobike.diChuyen();
		ford.nhapNhienLieu(); // ford duoc tao duoi class Car nen no lay truc tiep nhapNhienLieu duoc
		((Car) honda).nhapNhienLieu(); //vi o tren honda duoc tao duoi class Vehicle nen phai ep kieu Car moi lay method nhapNhienLieu duoc

	}

}