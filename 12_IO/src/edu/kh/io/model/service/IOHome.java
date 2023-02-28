package edu.kh.io.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOHome {

	// 바이트 기반
	public void output1() {
		FileOutputStream fos = null;
		
		//FileNotFoundException
		
		try {
			fos = new FileOutputStream("test1.txt");
			String str = "Hello!";
			
			for (int i = 0;  i < str.length(); i++) {
				fos.write(str.charAt(i));
			}
		
		}catch(IOException e) {
		
			System.out.println("예외 발생");
			e.printStackTrace();
		
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
		}
	
	public void input1() {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("text1.txt");
			
			while(true) {
				int data = fis.read();
				
				if (data == -1) {
					break;
				}
				
				System.out.println((char)data);
			}
			
			
			
		}catch(IOException e) {
			System.out.println("예외발생");
			e.printStackTrace();
			
		}finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	//문자 기반
	public void output2(){
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text1.txt");
			String str = "안녕아녕 나는 최수진 Hello 1234(*&^%$#";
			fw.write(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
	
	public void input2() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("test1.txt");
			
			while(true) {
				int data = fr.read();
				
				if(data == -1) {
					break;
				}
				System.out.println((char)data);
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
