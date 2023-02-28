package edu.kh.test.testProject;

public class HelloWorld {
	public static void main(String[] args) {
		/***package 명명 규칙 : 
-최소 3레벨 이상
-package:관련된 코드들의 묶음
-.은 폴더
-프로젝트 주소의 기반( 도메인 거꾸로)*/
//: 한 줄 주석
/*: 범위주석- 주석 안에 쓰여진 코드는 컴파일러가 해석하지 않음 */

		System.out.println("Hello, World!");
		System.out.println("최수진");
		System.out.println("1234");
		System.out.println("1+2=");//" ": 문자열, 안에 작성된 텍스트(코드)는 단순 문자열로 인식
		System.out.println(1+2); // "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println("14*19=" + 266); //""(문자열) +숫자
		//숫자와 숫자끼리의 덧셈은 실제 덧셈 연산결과
		//문자열과 숫자 or 문자열과 문자열의 덧셈은 이어쓰기
		System.out.println("20*19=" + 20*19);
		
		//notice! 자바는 사칙연산의 우선순위를 그대로 따른다 ex) 우선 계산을 원하면 ()괄호 사용
		System.out.println("성공?");
	}

}
 