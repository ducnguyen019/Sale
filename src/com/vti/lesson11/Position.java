package com.vti.lesson11;


public class Position {
	int positionId;
	String positionName;
	Account[] account;

	public Position(int positionId, String positionName) {
		this.positionId = positionId;
		this.positionName = positionName;
	}

	public Position() {
	}
}
