package com.google.s4.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		//현재시간
		Calendar ca =Calendar.getInstance();
		System.out.println(ca.getTime());
		//ca2를 미래로 시간변경
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.YEAR, 2023);
		ca2.set(Calendar.MONTH, 1);
		ca2.set(Calendar.DATE, 15);
		System.out.println(ca2.getTime());

	}

}
