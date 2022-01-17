package com.google.s4.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		//Calendar 클래스는 추상클래스여서 객체를 못만듬.
		//그래서 GregorianCalendar가 Calendar 상속 받음
		//그래서 실제로 우리는GregorianCalendar을 사용
		//Calendar 메서드는 GregorianCalendar에도 있다.
		
		//현재 날짜와 시간정보를 가지는 객체 생성
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = calendar.getInstance(); //실제오는건 GregorianCalendar임

		
		
		int y= ca.get(Calendar.YEAR);
		int m= ca.get(Calendar.MONTH);
		int d= ca.get(Calendar.DATE);
		
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		
		long millis = ca.getTimeInMillis();
		
		Date date = ca.getTime();
		
		System.out.println("Y : "+y);
		System.out.println("M : "+(m+1));
		System.out.println("D : "+d);
		System.out.println("H : "+h);
		System.out.println("HH: "+hh);
		System.out.println("Min:"+min);
		System.out.println("sec:"+s);
		System.out.println("MS :"+ms);
		System.out.println("Millis:"+millis);
		System.out.println("date : "+date);
	}

}
