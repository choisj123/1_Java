package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice { //기능정의용 클래스
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");		
		int num = sc.nextInt();
		
		/*if (num <= 0) {
			System.out.println("양수만 입력해주세요.");		
			}else if (num > 0 && num % 2 ==0) {
				System.out.println("짝수입니다.");
			}else if (num > 0 && num % 2 !=0) {
				System.out.println("홀수입니다.");
			}*/
	
		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		}else {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}
		
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");		
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");		
		int eng = sc.nextInt();
		System.out.print("영어점수 : ");		
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		if ((kor >= 40 && eng >= 40 && math >= 40) && (avg>=60)){
			System.out.println("국어: " + kor);
			System.out.println("수학: " + math);
			System.out.println("영어: " + eng);
			System.out.println("합계: " + sum);
			System.out.printf("평균: %.2f\n" , avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");		
			}
		
		
		
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");		
		int month = sc.nextInt();
		
		int result ;
		
		
		switch (month) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12: result = 31; break;
		case 2 : result = 28; break;
		case 4 : case 6: case 9: case 11: result = 30; break;
		default : result = 0;	
		}
		
		if (result == 0) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		} else {
			System.out.printf("%d월은 %d일까지 있습니다.", month, result);
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요: ");		
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요: ");		
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("BMI 지수: " + bmi);
		
		if (bmi >= 30) {
			System.out.println("고도 비만");
		}else if (bmi <= 18.5 || bmi > 23) {
			System.out.println("정상체중");
		}else if (bmi <= 23 || bmi > 25) {
			System.out.println("과체중");
		}else if (bmi <= 25 || bmi >30){
			System.out.println("비만");	
		}else {
			System.out.println("저체중");
		}
		

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");		
		double midTest = sc.nextInt();
		System.out.print("기말 고사 점수 : ");		
		double finalTest = sc.nextInt();
		System.out.print("과제 점수 : ");		
		double homework = sc.nextInt();
		System.out.print("출석 횟수 : ");		
		double attend = sc.nextInt();
		
		midTest *= 0.2;
		finalTest *= 0.3;
		homework *= 0.3;
		attend *= 1;
		
		System.out.println("==================결과==============");
		
		if (attend <= 20 * (1-0.3)) {
			System.out.println("Fail [출석 횟수 부족] (" + (int)attend + "/20");
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f \n",midTest);
			System.out.printf("기말 고사 점수(30) : %.1f \n",finalTest);
			System.out.printf("과제 점수    (30) : %.1f \n",homework);
			System.out.printf("출석 점수    (20) : %.1f \n",attend);
		
		double sum = midTest + finalTest + homework + attend;
		
		System.out.printf("총점 : %.1f \n", sum);
		
		if (sum >= 70.0) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail [점수 미달]");
		}	
		
		}
		
		
	}

}





