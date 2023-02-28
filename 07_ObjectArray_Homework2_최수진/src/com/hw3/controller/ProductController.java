package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product pro[] = new Product[10];
	
	public int count; //현재 추가된 객체
	
	Scanner sc = new Scanner(System.in);
	
	int menuInput = 0;
	
	public void mainMenu() {
		do {
			System.out.println("=====제품 관리 메뉴=====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 >>> ");
			menuInput = sc.nextInt();
			sc.nextLine();
			
			switch(menuInput) {
			//case 1 : System.out.println( productInput() );break;
			//case 2 : System.out.println( productPrint() );break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}while(menuInput != 0);
		
		
	}
	
	//제품 정보 추가
	public void productInput() {
		System.out.print("제품 번호 :");
		
		System.out.print("제품명 :");
		System.out.print("제품 가격 :");
		System.out.print("제품 세금 :");
		
		
	}
	
	//제품 전체 조회
	public void productPrint() {
		
	}
	
	
	
	
}
