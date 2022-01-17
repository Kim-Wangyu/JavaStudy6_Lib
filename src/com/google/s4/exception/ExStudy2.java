package com.google.s4.exception;

public class ExStudy2 {

	public void ex1() {
		//유치원생 -2자릿수까지 읽기가능
		int num =30;
		int num2=10;
		int num3=num+num2;
		int num4=num2-num;
		
		try {
		
		if(num3 >99) {
			throw new ChildException("3자릿수 몰라요");
		}
		
		if(num4<0) {
			throw new ChildException("그런거 몰라요");
		}
		}catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		System.out.println("Message : "+ e.getMessage());
		//catch(ChildException) {
			
		}
		
	}

}
