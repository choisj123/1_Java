package edu.kh.network.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerHome {
	public void serverStart() {

//	1. 서버의 포트번호 정함
		int port = 8500;
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		PrintWriter pw = null;
		
		try {
			
//	2. 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			System.out.println("[Server]");
			System.out.println("클라이언트 요청을 기다리고 있습니다....");
			
			
//	3. 클라이언트 쪽에서 접속 요청이 오길 기다림
		clientSocket = serverSocket.accept();
		
//	4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		String clientIP = clientSocket.getInetAddress().getHostAddress();
		System.out.println(clientIP );
//	5. 연결된 클라이언트와 입출력 스트림 생성
		is = clientSocket.getInputStream();
		os = clientSocket.getOutputStream();
		
		
//	6. 보조 스트림을 통해 성능 개선
		br = new BufferedReader(new InputStreamReader(is));
		pw = new PrintWriter(os);
		
		
//	7. 스트림을 통해 읽고 쓰기
		
		pw.println("[서버 접속 성공]");
		pw.flush();
		
		String message = br.readLine();
		System.out.println(clientIP + "가 보낸 메시지 : " + message);
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
//	8. 통신 종료
			
			try {
				if(pw != null) pw.close();
				if(br != null) pw.close();
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		

	
	}
}
