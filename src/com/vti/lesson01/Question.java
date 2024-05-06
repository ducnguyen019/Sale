package com.vti.lesson01;

import java.util.Date;

public class Question {
	int questionId;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account account;
	Date createDate;
	Answer[] answer;
}
