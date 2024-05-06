package com.vti.lesson05;

import com.vti.lesson05.CanBo.Gender;

public class NhanVien extends CanBo {
	private String job;

	public NhanVien() {

	}

	public NhanVien(String job, String name, int age, Gender gender, String address) {
		super(name, age, gender, address);
		this.job = job;

	}
}
