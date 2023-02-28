package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { //기능 정의용 클래스
	public void ex1() {
	
		// if문
		// - 조건식이 true일 때만 내부 코드 수행
		/* [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드
		 * }		
		 * 
		 * if-else문
		 * - 조건식 결과가 true면 if문, false이면 else문이 수행됨
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드
		 * } else{
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 *  
		 * */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int input = sc.nextInt();
		
		//입력된 정수가 양수인지 검사
		
		if (input > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수가 아닙니다.");	
		}
	}
		/*if (input <=0) {
			System.out.println("양수가 아닙니다.");
		}*/
	
	public void ex2() {
		//홀짝 검사
		//입력받은 값이 홀인지 짝인 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int input =sc.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else { 
			System.out.println("홀수입니다.");	
		}
		
	}
		
	public void ex3() {
		//달(month)를 입력받아 해당 달에 맞는 계절 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();

		
		System.out.print("온도 입력: ");
		int temperature = sc.nextInt();
		
		String season; //선언만 (공간 할달) 초기화x 
		
		
		//봄 :3,4,5
		//여름 :6,7,8
		//가을: 9,10,11
		//겨울: 12,1,2
				
		if(month == 3 || month == 4 || month == 5) {
			season = "봄 ";
		}else if(month >= 6 && month <= 8) {
			season = "여름 ";					
			if(temperature >= 35) {
				season += "폭염 경보";
			}else if(temperature >= 33) {
				season += "폭염주의보";
			}
			//		= 여름 + 폭염주의보
			//season = season + "";
			
		}else if(month >= 9 && month <= 11) {
			season = "가을 ";
		}else if(month == 12 || month == 1 || month == 2) {
			season = "겨울 ";
		}else {
			season = "해당되는 계절이 없습니다. ";
		}
		System.out.println(season);
		
		

	}
	
	public void ex4() {
		//나이를 입력 받아 
		//13세 이하면 "어린이 입니다."
		//13세 초과 19세 이하면 "청소년 입니다."
		//19세 초과 시 "성인입니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age > 13 && age <= 19) {
			System.out.println("청소년 입니다.");
		} else if(age > 19) {
			System.out.println("성인입니다.");
		}
		
		/* 쌤이 푼 코드
		if (age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age > 19) {
			System.out.println("성인입니다."); 
		} else {
			System.out.println("청소년 입니다.");
		} 
		*/
	}

	public void ex5() {
		//점수(100점 만점)을 입력받아
		//90점 이상: A score >= 90
		//80점 이상 90점 미만: B score >= 80 && score < 90
		//70점 이상 80점 미만: C score >= 70 && score < 80
		//60점 이상 70점 미만: D score >= 60 && score < 70
		//60점 미만: F score <60
		//0점 미만 100 초과: "잘못 입력하셨습니다." score <0 && score > 100
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80 && score < 90 ) {
			System.out.println("B");
		}else if (score >= 70 && score < 80) {
			System.out.println("C");
		}else if (score >= 60 && score < 70) {
			System.out.println("D");
		}else if (score < 60) {
			System.out.println("F");
		}else if (score < 0 && score > 100) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	/* 쌤 코드
	 * Scanner sc = new Scanner(System.in);
	   System.out.print("점수를 입력하세요: ");
	   int score = sc.nextInt();
	   
	   String result; //결과를 담을 String 변수 선언
	   
	   if(score < 0 || score >100) {
	   		result = "잘못 입력"; 		
	   }else if(score >= 90){
	    	result = "A";
	   }else if(score >= 80){
	   		result = "B";
	   }else if{score >= 70){
	   		result = "C";
	   }else if{score >= 60){
	   		result = "D";
	   }else {
	   		result = "F";
	   }
	   
	   System.out.println(result);
		
	 */

	public void ex6() {
		//놀이기구 탑승 제한 검사 프로그램
		//조건 - 나이: 12세 이상
		//	  - 키: 140.0cm 이상
		//나이를 0~100세 사이로 입력x:"나이를 잘못 입력하셨습니다."
		//키를 0~250.0cm 사이로 입력x:"키를 잘못 입력하셨습니다."
		//-->입력어 되자마자 검사를 진행하여 잘못된 경우 프로그램 종료
		
		//나이 o, 키 x: "나이는 적절하나 키가 적절치 않음"
		//나이 x, 키 o "키는 적절하나 나이가 적절치 않음"
		//나이 x, 키 x "나이와 키 모두 적절치 않음
		//나이 o, 키 o "탑승 가능"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력: ");
		int age = sc.nextInt();
		
		String result; // 결과 담을 변수 선언 , 초기화 X
		
		if(age < 0 || age > 100) {
			result = "나이 잘못 입력";
		} else {			
			System.out.print("키를 입력: ");
			double height = sc.nextDouble();		
			if(height < 0 || height > 250.0) {
				result = "키 잘못 입력";
			} else {  //키를 잘 입력한 경우
				if(age < 12 && height >= 140.0) { //나이 x 키 o
					result = "키는 적절하나 나이는 적절치 않음";
				} else if (age >= 12 && height < 140.0) { //나이 o 키 x
					result = "나이는 적절하나 키는 적절치 않음";
				} else if (age < 12 && height <140.0) {
					result = "나이와 키 모두 적절치 않음";
				} else {
						result = "탑승 가능";					
				}
			}
		} 
		
		System.out.println(result);		
	}
}
			
			
	/*	if () {
			
		}else {
			if() {
				
			}else {
				if() {
					
				}else if() {
					
				}else if() {
					
				}else if() {
					
				}else {
					
				}
			}
		}          */

	

