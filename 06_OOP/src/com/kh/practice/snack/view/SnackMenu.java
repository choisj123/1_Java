package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		System.out.print(scr.saveData(kind, name, flavor, numOf, price));
		//saveData는 return만 하기 때문
		
		
		//System.out.println("저장 완료되었습니다.");
		System.out.print("저장한 정보를 확인하시겠습니까? (y/n) : ");
		String check = sc.next();
		
		if (check.equals("y") || check.equals("Y") ) {
			System.out.println(scr.confirmData());
			//System.out.printf("%s(%s - %s) %d개 %d원", kind, name, flavor, numOf, price);
			
		} else {
			
		}
		
		
	}
}
