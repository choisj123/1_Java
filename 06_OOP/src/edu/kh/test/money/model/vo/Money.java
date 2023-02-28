package edu.kh.test.money.model.vo;

public class Money {
	
	//필드
	public static final String UNIT = "원";
	private int money;
	
	
	//기본생성자
	public Money() {
		
	}
	
	//매개변수를 이용한 생성자
	public Money(int money) {
		this.money = money;
	}

	
	//getter setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static String getUnit() {
		return UNIT;
	}
	
	
	//print()
	public void print() {
		System.out.print(money + UNIT);
	}
	

	
	
	
}
