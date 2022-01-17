package com.google.s1.lang.string.ex1;

public class MemberData {
	
	private String data;
	
	//기본생성자 선언
	public MemberData() { //클래스명과 동일한 이름으로
		this.data="id1-pw1-name1-id1@gmail.com-";
		this.data=this.data+"id2-pw2-name2-name@naver.com-";
		this.data=this.data+"id3-pw3-name3-name@daum.net";
		System.out.println(this.data);
		
	}

}
