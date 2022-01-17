package com.google.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		
		int num1 =0;
		int num2 =10;
		int result=0;
		
		try {
		 result = num2/num1;
	} catch (Exception exception) { //가장 큰 부모클래스(Throwa~)로 예외 잡으면 세부적인 컨트롤 작성 어려움
		
		exception.printStackTrace();
		System.out.println("예외발생");
		
			System.out.println("0이 들어옴");
			num1=1; //
		}
		result = num2/num1;
		System.out.println(result);
	}

}
