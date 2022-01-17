package com.google.s5.ex1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("Client 입니다.");
		Socket socket =null;
		try {
			socket = new Socket("192.168.219.1", 8282);
			System.out.println("서버와 접속이 성공 !");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
