package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for문
	 * - 끝이 정해져 있는(횟수가 정해져있는) 반복문
	 * - 조건에 따라 한번도 수행되지 않을 수 있음
	 * [작성법]
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행될 코드 
	 * }
	 * - 초기식: for문을 제어하는 용도의 변수 선언
	 * - 조건식: for문의 반복 여부를 지정하는 식. (다음 반복 진행해?)
	 * 			보통 초기식에 사용된 변수를 이용하여 조건식을 작성함
	 * - 증감식: 초기식에 사용된 변수를 for문이 끝날 때마다 증가 or 감소 시켜
	 * 			조건식의 결과를 변화게 하는 식
	 * 
	 */
	
	public void ex1() {
		// 1~10 출력하기
		// 1부터 10까지 1씩 증가하여 출력
		// *반복문은 조건식이 true 일 때만 반복 
		// i = index
		
		for(int i=1; i<11; i++) {
		 // (1)초기식; 2)5)조건식; 4)7)증감식)
			System.out.println("i: " + i);
			// 3)6) 반복 수행될 코드		
		}		
	}

	public void ex2() {
		// 3~7까지 1씩 증가하며 출력
		for(int i = 3; i < 8 ; i++) {
			System.out.println("i: " + i);
		}
		
	}

	public void ex3(){
		//1부터 입력받은 수까지 1씩 증가하며 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++ ) {
			System.out.println("i: " + i);
		}
		
	}

	public void ex4() {
		//1.0부터 입력받은 실수까지 0.5씩 증가하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 입력: ");
		double num = sc.nextDouble();
									// i = i + 0.5
		for(double i = 1.0; i <= num; i += 0.5) {
			System.out.println("i: " + i);
		}
	}
	
	public void ex5() {
		//영어 알파벳 A~Z가지 한줄로 출력
		//**char 자료형은? 유니코드
		
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		
		//for (int i = 'A'; i <= 'Z'; i++) {
		//	System.out.print((char)i);
			
		}	
	}
	
	public void ex6() {
		// 응용 문제
		// 1~10 모든 정수의 합 구하기
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수
					// 0으로 시작하는 이유: 아무것도 더하지 않음으로
					//				정확히 결과를 도출할 수 있기 때문에
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		} // sum = sum + 1;
		
		System.out.println("합계: " + sum);
		
	}

	public void ex7() {
		// 1~20까지 1씩 증가하면서 출력
		// 단, 5의 배수에 ()를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ...
	
		for (int i = 1; i <= 20; i++) {
			if ( i % 5 == 0 ) {
				System.out.print("(" + i + ") ");
			}else { 
				System.out.print(i + " ");
			}	
		}
	}
	
	
//---------중첩 반복문	------------
	
	public void ex8() {
		//구구단 모두 출력하기
		for(int i =  2; i <= 9; i++ ) { //2~9단
			for(int n = 1; n <= 9; n++) { //각 단에 곱해질 1~9 수
				
				System.out.println(i +  "X" + n + "=" + i*n);
				//System.out.printf("%2d X %2d = %2d", i, n, i*n);
			}
			System.out.println();
		}
	}
	
	public void ex9() {
		//구구단 역순 출력
		//9단 ~ 2단 역방향
		for(int i = 9; i >= 2; i--) {
			for(int n = 1; n <= 9; n++) {
			System.out.println(i +  "X" + n + "=" + i*n);
			//System.out.printf("%2d X %2d = %2d", i, n, i*n);
			}
			System.out.println();
		}
	}
	
	public void ex10() {
		for(int i = 1; i <= 5; i++ ) { //단
			for(int n = 1; n <= 5; n++) { //줄
				System.out.print(n);
			}
			System.out.println();
		} 
		System.out.println();
		for(int i = 1; i <= 3; i++) { //단
			for(int n = 5; n >= 1; n--) { //줄
				System.out.print(n);
			}
			System.out.println();
		}
	}

	public void ex11() {
	/* 	for(int a = 1; a <=1; a++) {
			System.out.print(a);
			for(int b = 1; b <=2; b++) {
				System.out.print(b);
				for(int c = 1; c <=3; c++) {
					System.out.print(c);
					for(int d = 1; d <=4; d++) {
						System.out.print(d);
					}
					System.out.println();
				}
			}*/
		
		/*
				1
				12
				123
				1234
				-----------------
				4321
				321
				21
				1  */
		
		for (int x = 1; x <= 4; x++) {
			for(int i = 1; i <= x; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		for(int x = 4; x >= 1; x--) {
			for(int i = x; i >= 1; i--) {
				System.out.print(i);			
			}
			System.out.println();
		}
}
}



