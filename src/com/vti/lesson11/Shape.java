package com.vti.lesson11;

public class Shape {
	private String name;
	private Cordinate cordinate;

	public Shape(String name) {
		this.name = name;
	}

	public class Cordinate {
		private int x;
		private int y;

		public Cordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return this.x + ", " + this.y;
		}
	}

	public void setCodinate(Cordinate codinate) {
		this.cordinate = codinate;
	}

	public String toString() {
		return this.name + ", " + this.cordinate;
	}
}
