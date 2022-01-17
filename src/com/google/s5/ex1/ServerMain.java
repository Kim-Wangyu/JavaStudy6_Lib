package com.google.s5.ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server입니다.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			System.out.println("클라이언트 접속을 기다리는 중");
			serverSocket = new ServerSocket(8282); //클라이언트와 접속준비
			socket = serverSocket.accept();  //client
			System.out.println("접속한 client와 1:1 연결 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
