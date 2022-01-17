package com.google.s4.exception;

import java.util.InputMismatchException;

public class ExceptionMain3 {

	public static void main(String[] args) {
		ExStudy1 e1 = new ExStudy1();
		
		try {
		e1.ex1();
		}catch (InputMismatchException e) {
			
		}catch(ArithmeticException e) {
			
		}catch(Exception e) {
			
		}finally {           //예외가 발생하든 안하든 무조건 실행되는 영역
			
		}
		
	}

}
