package com.vti.lesson11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exam {
	public int examId;
	public int code;
	public String title;
	public CategoryQuestion categoryId;
	public int duration;
	public LocalDate createDate;
	public Account creatorId;
	public Question[] question;

	public Exam(int examId, int code, String title, CategoryQuestion categoryId, int duration, Account creatorId,
			Question[] question) {
		this.examId = examId;
		this.code = code;
		this.title = title;
		this.categoryId = categoryId;
		this.duration = duration;
		this.creatorId = creatorId;
		this.question = question;
		this.createDate = LocalDate.now();
	}

	public String toString() {

		return this.examId + ", " + this.code + ", "
				+ this.createDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
}
