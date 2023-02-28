package edu.kh.exception.test;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int a = 99.9; 
		//컴파일 에러 : 개발자가 코드 잘못 쓴 경우! 코드 수정으로 해결 가능
		//Type mismatch: cannot convert from double to int
		int a = (int)99.9; //강제 형변환 
		double a1 = 99.9; //자료형 바꾸기 --> 변수 자료형을 double로
		int a2 = 99; //값 바꾸기 --> 99 또는 100 정수형으로
		
		while(true) {
			
			// 0입력 시 종료되도록 함
			System.out.print("정수 입력(0 입력 시 종료): ");
			int input = sc.nextInt();
			
			// 탈출 구문
			if (input == 0) {
				break;
			}
		}
		
		//0.5 입력시
		//런타임 에러 : 프로그램 수행 중 발생하는 에러
		//Exception in thread "main" java.util.InputMismatchException		
		//주로 if문으로 처리 가능
		
		System.out.println("=========================");
		
		 int[] arr = new int[4]; //길이 3: 인덱스는 0,1,2까지
		 
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 
		 if (3 >= arr.length ) {
			 System.out.println("배열 범위를 초과하였습니다.");
		 } else {
			 arr[3] = 40;
		 }
	}
		 //										★☆★☆
		 //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 배열 범위 초과 예외
		 //Index 3 out of bounds for length 3
		 // ==> 배열에서 부적절한 인덱스에 접근하려고 할 때 발생될 수 있는 예외
		 
		 //										★☆★☆
		 //Exception in thread "main" java.lang.NegativeArraySizeException: -1 : 배열이 음수의 크기일 때 발생하는 예외 
		 // 배열의 크기로 음수를 제시했을 때 발생될 수 있는 예외
	
		
		
		/* public void method() {
			 BufferedReader br = null;

			 try {
			 br = new BufferedReader(new InputStreamReader(System.in));
			 System.out.print("입력 : ");
			 String str = br.readLine();
			 System.out.println("입력된 문자열 : " + str);
			 } catch (IOException e) {
			 	e.printStackTrace();
			 } finally {
			 try {
			 System.out.println("BufferedReader 반환");
			 br.close();
			 } catch (IOException e) {
			 e.printStackTrace();
			 	}
			 }		
		
	} */

}
