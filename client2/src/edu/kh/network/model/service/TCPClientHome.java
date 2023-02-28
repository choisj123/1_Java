package edu.kh.network.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientHome {
	public void clientStart() {
//		1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		String serverIP = "127.0.0.1";
		int port = 8500;
		
		Socket clientSocket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
//		2. 서버와의 입출력 스트림 오픈
		try {
			System.out.println("client");
			clientSocket = new Socket(serverIP, port);
			
//		3. 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			pw = new PrintWriter(clientSocket.getOutputStream())	;
			
//		4. 스트림을 통해 읽고 쓰기
			String message = br.readLine();
			System.out.println(message);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 :");
			String input = sc.nextLine();
			
			pw.println(input); 
			pw.flush(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null) pw.close();
				if(br != null) br.close();
				if(clientSocket != null) clientSocket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
//		5. 통신 종료

		
		
}
}