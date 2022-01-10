package com.google.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		
		ObjectStudy1 os = new ObjectStudy1();
		
		os.study1();
		
	Car car =new Car();
	car.toString();
	
	
	Object obj =car;
	
	FireCar fc =new FireCar();
	fc.toString();
	obj=fc;
	
	boolean check = car.equals(fc);
	System.out.println(check);
	
		
	}

}
