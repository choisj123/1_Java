package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	//기본생성자
	public SnackController(){
		
	}
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setFlavor(flavor);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다."; 
		//+ "\n저장한 정보를 확인하시겠습니까? (y/n) : ";
		
	}
	
	public String confirmData() {
		return s.information();}
	
	
}
