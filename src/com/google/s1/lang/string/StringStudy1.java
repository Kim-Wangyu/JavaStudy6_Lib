package com.google.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	
	public void subStringEx1() {
		//키보드로부터 업로드할 파일명 입력
		//a.txt,b.pdf,iu.jpg
		//jpg, gif, png ->이미지 파일입니다 출력
		//txt, pdf, hwp -> 문서 파일입니다 출력
		//mp3, wav, ogg -> 음원 파일 입니다 출력
		//나머지는 알 수 없는 파일 입니다 출력
		Scanner sc= new Scanner(System.in);
		
	
		
		boolean flag = true;
			while(flag) {
					System.out.println("파일명을 입력하세요.");
		String name = sc.next();
		String result = name.substring(name.lastIndexOf(".")+1);
		System.out.println(result);
				
		if(result.equals("jpg")||result.equals("gif")||result.equals("png")) {
			System.out.println("이미지 파일입니다.");
		}else if(result.equals("txt")||result.equals("pdf")||result.equals("hwp")) {
			System.out.println("문서파일입니다.");
			
		}else if(result.equals("mp3")||result.equals("wav")||result.equals("ogg")) {
			System.out.println("음원 파일입니다.");
		}else {
			System.out.println("알 수 없는 파일입니다.");
		}
		if(name.equals("d")) {
			break;
		}
			}
	}
	
	
	public void subStringTest() {
		
		String title = "West Side Story";
		String result = title.substring(title.indexOf("S"));
		String result1 = title.substring(5);
		System.out.println(result);
		System.out.println(result1);
	}

	public void lengthTest() {
		int count = 0;
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);
		String find = "S";
//		for (int i = 0; i < title.length(); i++) {
//			char num = title.charAt(i);
//			System.out.println(num);
//			String find = "S";
//			boolean check = find.equals(num);
//			System.out.println(check); //찾았나 확인
//			if (check == true) {
//				count++;
//			}
// 		오류		char 타입과string타입은 equals에서 다름
//		}
		for (int i = 0; i < title.length(); i++) {
			int index = title.indexOf(find,i);
			if (index>=0) {
				count++;
				i=index;
			}else {
				break;
			}
		
			
			
	
		}
		System.out.println("=====S총 갯수는 :" + count);

	}

	public void indexOfTest() {

		String msg = "Hello World";
		// indexOf호출
		int num = msg.indexOf('l', 4);
		System.out.println(num);

	}

	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		System.out.println("str" + str);
		System.out.println("str2" + str2);
		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println("===========");

		System.out.println(str.equals(str2)); // 실제 내용이 같은지 비교를 함
		System.out.println(str.equals(str4));
		System.out.println(str.equals(str3));

	}

	public void study1() {

		String name = "hello";

		String name2 = new String("hello2");

		char ch = name.charAt(3);

		System.out.println(name);
		System.out.println(ch);

	}

}
