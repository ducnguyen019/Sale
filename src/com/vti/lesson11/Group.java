package com.vti.lesson11;


import java.util.Date;

public class Group {
	int groupId;
	String groupName;
	Account[] accounts;
	Date createDate;
	Account creator;
	String[] userNames;

	public Group(int groupId, String groupName, Account[] accounts) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.accounts = accounts;
	}

	public Group(int groupId, String groupName) {
		this.groupId = groupId;
		this.groupName = groupName;
	}

	public Group() {

	}
}
