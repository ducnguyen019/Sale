package com.vti.lesson05;

import com.vti.lesson05.CanBo.Gender;

public class KySu extends CanBo {
	private String major;

	public KySu() {

	}

	public KySu(String major, String name, int age, Gender gender, String address) {
		super(name, age, gender, address);
		this.major = major;

	}
}
