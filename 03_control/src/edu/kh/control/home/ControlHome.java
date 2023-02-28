package edu.kh.control.home;

import java.util.Scanner;

public class ControlHome {
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		if (input > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수가 아닙니다.");
		}	
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int input = sc.nextInt();
		
		if (input % 2 ==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
	}

	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		
		String season;
		
		if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <=8) {
			season = "여름";
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else if ( month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else {
			season = "해당되는 계절이 없습니다."; 		
		}
		System.out.println(season);
		
		
		
		
		
	}

	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();
			
		String season;
		
		if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <=8) {
			System.out.print("온도 입력: ");
			int temp = sc.nextInt();	
			season = "여름";
			if (temp >= 35) {
				season += " 폭염경보";
			}else if (temp >= 33) {
				season += " 폭염주의보";
			}		
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else if ( month == 12 || month == 1 || month == 2) {
			System.out.print("온도 입력: ");
			int temp = sc.nextInt();
			season = "겨울";
			if (temp < -5) {
				season += " 한파 경보";
			} else if (temp < 0) {
				season += " 한파 주의보";
			}
		} else {
			season = "해당되는 계절이 없습니다."; 		
		}
		System.out.println(season);
	}

	public void ex5() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.println("어린이 입니다.");
		}else if (age > 19) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("청소년 입니다.");
		}
	}

	public void ex6() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("점수 입력: ");
	int score = sc.nextInt();
	
	String result;
	
	if (score < 0 || score > 100) {
		result = "잘못 입력하셨습니다.";
	} else if (score >= 90) {
		result = "A";
	} else if (score >= 80) {
		result = "B";
	} else if (score >= 70) {
		result = "C";
	} else if (score >= 60) {
		result = "D";
	} else {
		result = "F";
	}
	System.out.println(result);
	
	}

	public void ex7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력: ");
		int age = sc.nextInt();
		
		String result;
		
		if (age < 0 || age > 100) {
			result = "나이 잘못 입력";
		} else {
			System.out.print("키를 입력: ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250.0) {
				result = "키를 잘못 입력";
			} else {
				if (age < 12 && height >= 140.0) {
					result = "키는 적절하나 나이가 적절치 않음";
				} else if (age >= 12 && height < 140.0) {
					result = "나이는 적절하나 키가 적절치 않음";
				} else if (age < 12 && height < 140.0) {
					result = "나이와 키 모두 적절치 않음";
				} else {
					result = "탑승 가능";
				}
			}
		} 
		
		System.out.println(result);
		
		
	}

	public void ex8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		String result;
		
/*		if (input ==1) {
			result = "빨강";
		} else if (input == 2) {
			result = "주황";
		} else if (input ==3) {
			result = "노랑";
		} else if (input == 4) {
			result = "초록";
		}else {
			result = "흰색";
		}
		System.out.println(result); */
		
		switch(input) {
		case 1: result ="빨강";  break;
		case 2: result ="주황";  break;
		case 3: result ="노랑";  break;
		case 4: result ="초록";  break;
		default: result ="흰색";
		}
		System.out.println(result);
	}

	public void ex9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case 3: case 4: case 5: result = "봄"; break;
		case 6: case 7: case 8: result = "여름"; break;
		case 9: case 10: case 11: result = "가을"; break;
		case 12: case 1: case 2: result = "겨울"; break;
		default : result  = "해당 계절 없음";
		}
		System.out.println(result);
	}
	
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		
		
		
		
	}

	public void ex11() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("i: " + i);
		}
		
	}

	public void ex12() {
		for(int i = 3; i < 8; i++) {
			System.out.println("i: " + i);
		}
		
	}

	public void ex13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			System.out.println("i: " + i);
		}
		
		
		
	}

	public void ex14() {
		for (int i =2; i <=9; i++) {
			System.out.println("====" + i + "단====");
			for(int n = 1; n <=9; n++ ) {
				System.out.printf("%d X %d = %d\n", i, n, i*n);
			}
			System.out.println();
		}
	}

	public void ex15() {
		for(int i = 9; i >= 1; i--) {
			System.out.println("====" + i + "단====");
			for(int n = 9; n >= 1; n--) {
				System.out.printf("%d X %d = %d\n", i, n, i*n);
			}
		}
	}

	public void ex16() {
		for(int i =1; i <=5; i++) {
			for(int n =1; n <=5; n++) {
				System.out.println(n);
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= 3; i++) {
			for(int n = 5; n >= 1; n--) {
				System.out.println(n);
			}
			System.out.println();
		}
	}

	public void ex17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num ;i++) {
			for(int n = 1; n <= i; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
		System.out.println("==========");
		
		//4321
		//321
		//21
		//1
		for(int i = num; i >= 1; i--) {
			for(int x = i; x >= 1; x--) {
				System.out.print(x);	
			}
			System.out.println();
		}
	}

	public void ex18() {
		Scanner sc = new Scanner(System.in);
		int input = 999;
		int sum = 0;
		
		while(input != 0) {
			System.out.print("정수 입력: ");
			input = sc.nextInt();
			
			sum += input;
			
		}System.out.println("합계: " + sum);
		
		
		
	}

/*	public void ex19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		if ( input < 0) {
			System.out.println("1이상의 숫자를 입력하세요.");
		}else {
			int i =1;
			while(i <= input) {
				sum += i;
				i++;
			}syso
		}
		
		
		
	}*/

}
	
	