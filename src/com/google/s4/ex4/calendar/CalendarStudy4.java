package com.google.s4.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		// 현재시간
		Calendar ca = Calendar.getInstance();
		System.out.println("현재시간 : "+ca.getTime());
		
		//태어난날
		Calendar ca1 = Calendar.getInstance();
		ca1.set(1994, 1, 5);
		System.out.println("태어난날 : "+ca1.getTime());
		
		//365 *20살=7300일째 이런식으로 얼마나 살았는지,
		
		long l1 = ca.getTimeInMillis();
		
		long l2 = ca1.getTimeInMillis();
		
		long result = l1-l2;
		
		System.out.println(result/(1000*60*60*24));
		System.out.println(result/(1000*60*60*24*365.2425));

		//나이

	}

}
