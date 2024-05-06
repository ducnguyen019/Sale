package com.vti.lesson11;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Program11 {

	public static void main(String[] args) {
		Double d = 123456.123;
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
		String dFormat = nf.format(d);
		System.out.println(dFormat);

		NumberFormat nf1 = NumberFormat.getInstance();
		String dFormat1 = nf1.format(d);
		System.out.println(dFormat);

		DateFormat dfm = DateFormat.getDateInstance(0, Locale.US);
		Date today = new Date(System.currentTimeMillis());
		String todayfrm = dfm.format(today);
		System.out.println(todayfrm);

		String pattern = "dd/MM/yyyy hh:mm:ss";
		SimpleDateFormat simpleFrm = new SimpleDateFormat(pattern);
		String frmDate = simpleFrm.format(today);
		System.out.println(frmDate);

		Exam e1 = new Exam(1, 007, null, null, 90, null, null);
		System.out.println(e1);
	}

}
