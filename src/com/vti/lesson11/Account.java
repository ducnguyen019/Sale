package com.vti.lesson11;


import java.time.LocalDate;
import java.util.Date;

public class Account {
	public int accountId;
	public String email;
	public String userName;
	public String firstName;
	public String lastName;
	public String fullName;
	public Department department;
	public Position position;
	public Date createDate;
	public Group[] groups;
	public LocalDate createDate1;

	public Account() {
	}

	public Account(int accountId, String email, String userName, String fullName) {
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}

}
