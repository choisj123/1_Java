package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPracticeAnswer {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				for (int i = 1; i <=num; i++) {
					System.out.println(i + " ");
				
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for(int i = num; i > 0 ;i--) {
				System.out.print(i + " ");
			}
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();	
		
		int sum = 0;
		for(int i = 1; i <= num; i ++) {	
			if (i != num) {
				sum += i;
				System.out.print(i + " + ");
			}else {
				sum += i;
				System.out.print(i + " = " + sum);
			}
		}
			
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();	
		
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();	
		
		if (num1 <= 0 || num2 <= 0) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}else if (num1  > num2 ) {
			for(int i = num2; i <= num1 ; i++) {
				System.out.print(i + " ");
			}
		}else if (num2 > num1) {
			for(int i = num1; i <= num2 ; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();	
		
		switch(num) {
		case 1: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(1 +" * "+ i + " = " + 1 * i);
			}; break;
		case 2: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(2 +" * "+ i + " = " + 2*i);
			}; break;
		case 3: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(3 +" * "+ i + " = " + 3*i);
			}; break;
		case 4: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(4 +" * "+ i + " = " + 4*i);
			}; break;
		case 5: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(5 +" * "+ i + " = " + 5*i);
			}; break;
		case 6: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(6 +" * "+ i + " = " + 6*i);
			}; break;
		case 7: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(7 +" * "+ i + " = " + 7*i);
			}; break;
		case 8: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(8 +" * "+ i + " = " + 8*i);
			}; break;
		case 9: 
			for (int i = 1; i <= 9; i++ ) {
				System.out.println(9 +" * "+ i + " = " + 9*i);
			}; break;
		} */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1; i <= 9 ; i++) {		
			System.out.printf("%d * %d = %d\n", num,i,i*num);
		}
		
	}
		
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();	
		
		
		if (num < 2 || num > 10) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
		for(int i = num ; i <= 9; i++) {
			System.out.println("===== " + i + "단 =====");
			for(int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d\n", i,n,i*n);
			} 				
		}
		}
		
	}

	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();		
		
		for(int i = 1; i <= num; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();		
		
		for(int i = num; i >= 1; i--) {
			for (int x = i; x >= 1; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() { //쌤 풀이 O
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();		
		
		for(int i = 1; i <= num; i++) { //row
			for (int x = 1; x <= num; x++) {  //col	//int x =4; x <= num-1; x--
				if(x <= num - i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void practice10() { //모르겠다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();		
		
		for(int i = 1; i <= num; i++) {
			for (int x = 1; x <= i; x++) {
				
				System.out.printf("%5s", "*");
			}
			System.out.println();
		}
		
	} 

	public void practice11() { //쌤 풀이 O
	/*
		 *
		***
       *****
      ******* : input * 2 - 1
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();		
		
		for(int row = 1; row <= input; row++) {
			for (int col = 1; col <= input * 2 - 1; col++) {
				//마지막 줄의 별 갯구: input * 2 -1
				//	row  col
				//1) 4 -1 >= 1  || 4 + 1 <= 1 true
				//2) 4 -1 >= 2  || 4 + 1 <= 2 true 
				//3) 4 -1 >= 3  || 4 + 1 <= 3 true 
				//4) 4 -1 >= 4  || 4 + 1 <= 4 true 
				if(input - row >= col || input + row <= col) {
					System.out.print(" ");
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice12() { //썜 풀이 O --> 다시
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();		
		
		for(int row = 1; row <= input; row++) {
			for (int col = 1; col <= input; col++) {
				
				//첫번째 / 마지막줄,칸일때만 * 출력
				//입력한 인풋의 길이만큼 행열 깉이 지정
				if(row ==1 || row == input || col ==1 || col == input) {
				System.out.print("*");
			}else {
				System.out.println(" ");
			}
			
		
			}
		}
	}
	
	
	public void practice13() { //쌤 풀이 O 
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요: ");
		int num = sc.nextInt();		
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if (i % 2 ==0 || i % 3 ==0) {
				System.out.print(i + " ");
				
				if (i % 2 ==0 && i % 3 ==0) {
					count ++;
				}
			
			}
		}
		System.out.println("\ncount: " + count);
		
	}



} //public class
