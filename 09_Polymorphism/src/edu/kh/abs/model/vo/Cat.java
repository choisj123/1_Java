package edu.kh.abs.model.vo;

public class Cat extends TypeMammalia {

	@Override
	public void breastfeed() {
		System.out.println("고양이가 수유를 한다");
		
	}
	@Override
	public void eat() {
		System.out.println("고양이가 밥을 먹는디");
		
	}

	@Override
	public void cry() {
		System.out.println("고양이가 야옹하고 운다");
		
	}

	@Override
	public void move() {
		System.out.println("고양이가 살금살금 움직인다");
		
	}


}
