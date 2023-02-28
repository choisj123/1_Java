package edu.kh.test;

public class Overloading {
	//public void test() {} //매개변수가 없어서 오버로딩 적용 불가
	//public void test(String str) {} 
	//public void test(int i) {}
	//public void test(String s) {}
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i, String str) {}
	//private void test(int i) {}
	//public int test() {return 0;} //매개변수가 없어서 오버로딩 적용 불가
	
	// 5,7번 매개변수 개수,타입 일치하여 오버로딩 적용 불가, 매개변수 이름은 조건과 무관
	// 6,11번 매개변수 개수, 타입 일치하여 오버로딩 적용 불가, 매개변수 이름은 조건과 무관
	// 11번 접근제한자는 오버로딩 조건과 무관
	
}
