package edu.kh.inter.model.vo;

public abstract class Animal {
	// abstract가 붙는 순간, 객체화(인스턴스화)가 안되는 클래스
	// 단, 타입으로서의 의미는 그대로
	// 
	
	public abstract void eat(); //중괄호{} 쓰면 에러
	//추상 메서드
	//먹기라는 메서드는 있지만, 어떻게 동작할지 정의하지 않아야 한다
	//+추상메소드가 있다면, 추상클래스여야 함
	
	public abstract void cry();
	
	public abstract void move();

	}
	