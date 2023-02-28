package edu.kh.poly.model.vo;

public class Tesla extends Car{ //전기차
	// Car를 상속받을 수 있도록 
	
	private int batteryCapacity; //배터리 용량
	 
	public Tesla() {
		super(); //car
	}
	//ctrl + space + enter 기본생성자 자동완성
	
	
	//alt shift s --> o --> 드롭박스 --> 매개변수
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}


	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	
	//car.toString()의 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
			// super 참조변수
		
	}
	
	
	
	
	
	
}
