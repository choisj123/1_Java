package edu.kh.control.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionPracticeHome {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		try {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if(input % 2 ==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력해주세요.");
			//e.printStackTrace();
		}
		
	}

	public void practice2() {
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		
		double avg = (korean + math + english) / 3;
		
		if ( (korean >= 40 && math >= 40 && english >= 40 ) && avg >= 60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + (korean + math + english));
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
			
		}else {
			System.out.println("불합격입니다.");
		}
		
	}

	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		// 1 3 5 7 8 10 12- 31
		// 2 - 28
		// 4 6 9 1- 30
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12: System.out.println(month + "월은 31일까지 있습니다."); break;
		case 4, 6, 9, 11: System.out.println(month + "월은 30일까지 있습니다."); break;
		case 2: System.out.println(month + "월은 28일까지 있습니다."); break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
			
			
		}
	}

	public void practice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " +bmi);
		//18.5 미만 저체중
		// 18.5 ~ 23 정상체중
		// 23 ~ 25 과체중
		// 25 ~ 30 비만
		// 30 ~ 고도 비만
		if( bmi >= 30) {
			System.out.println("고도 비만");
		} else if (bmi >= 25) {
			System.out.println("비만");
		} else if (bmi >= 23) {
			System.out.println("과체중");
		} else if (bmi >= 18.5) {
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}
		
	}

	public void practice5() {
		System.out.print("중간 고사 점수 : ");
		int midTest = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalTest = sc.nextInt();
		System.out.print("과제 점수 : ");
		int assignment = sc.nextInt();
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt();
		
		double mid = midTest * 0.2;
		double finalT = finalTest * 0.3;
		double assign = assignment * 0.3;
		double all = (mid + finalT + assign + attendance);
		
		System.out.println("=====결과=====");

		if(attendance <= 14 ) {
			System.out.println("Fail [출석 횟수 부족 (" + (int)attendance + "/20)]");
			
		} else if (all < 70) {
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " + finalT);
			System.out.println("과제 점수		 (30) : " +  assign);
			System.out.println("출석 점수		 (20) : " + attendance);
			System.out.println("총점 : " + all);
			System.out.println("Fail [점수 미달]");
			
		} else {
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " + finalT);
			System.out.println("과제 점수		 (30) : " +  assign);
			System.out.println("출석 점수		 (20) : " + attendance);
			System.out.println("총점 : " + all);
			System.out.println("PASS");
		}
	}
}
