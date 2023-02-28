package edd.kh.oarr.model.service;

import java.util.Scanner;

import edd.kh.oarr.model.service.vo.Member;

public class MemberServiceHome {
	Scanner sc = new Scanner(System.in);
	
	// Member 5칸짜리 객체 배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	private Member loginMember = null;
	
	// 현재 로그인한 회원의 정보를 저장할 변수 선언
	
	//기본 생성자
	//MemberArr 배열 0,1,2, 인덱스 초기화
	public MemberServiceHome() {
		memberArr[0] = new Member("user01", "pass01", "sujin", 30, "seoul");
	}
	
	// 메뉴 출력용 메서드
	public void displayMenu() {
	int menuNum = 0;
	
	do {
		System.out.println("\n=======회원 정보 관리 프로그램 v2 home======");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원 정보 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 검색(지역)");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("\n메뉴 입력>>>");
		menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1: System.out.println(signUp()); break;
		case 2: login(); break;
		case 3: selectMember(); break;
		case 4: break;
		case 5: break;
		case 0: System.out.println("프로그램을 종료합니다...."); break;
	    default :  System.out.println("잘못 입력하셨습니다.");

		}
		
		
	}while(menuNum != 0);
	
	}
	//회원가입 메서드
	public String signUp() {
		System.out.println("\n===회원가입===\n");
		
		//객체 배열(memberArr)에 가입한 회원 정보를 저장할 예정
		// --> 새로운 회원 정보를 저장할 공간이 있는지 확인하고
		//		빈 공간의 인덱스 번호를 얻어오기 --> 새로운 매서드 작성
		int index = emptyIndex();
		
		System.out.println("현재 회원 수 :   " + index );
		
		if(index == -1) {
			return "\n회원가입이 불가능합니다.(인원 수 초과)";
		}
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
			
		System.out.print("비밀번호: ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인: ");
		String memberPw2 = sc.next();
		
		System.out.print("이름: ");
		String memberName = sc.next();
		
		System.out.print("나이: ");
		int memberAge = sc.nextInt();
		
		System.out.print("지역: ");
		String memberRegion = sc.next();
		
		
		
		if(memberPw.equals(memberPw2)) {
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, memberRegion);
			
			return "\n회원 가입 성공!!";
	
		}else {
			return "\n회원 가입 실패(비밀번호 불일치)";
		}
	}
	
	public int emptyIndex() {
		for(int i = 0;  i  < memberArr.length; i++) {
			if(memberArr[i] == null) {
				return i;
			}
		}
		return -1;
		
	}
	//로그인 메서드
	public void login() {
	System.out.println("\n===로그인===\n");

	System.out.print("아이디 입력 : ");
	String memberId = sc.next();
	
	System.out.print("비밀번호 입력 : ");
	String memberPw = sc.next();
	
	for (int i = 0; i < memberArr.length; i ++) {
		if(memberArr[i] != null) {
			if(memberArr[i].getMemberId().equals(memberId) &&
				memberArr[i].getMemberPw().equals(memberPw)) {
				loginMember = memberArr[i];
				
				break;
			}
			
		}
	}
	if (loginMember == null) {
		System.out.println("\n아이디 또는 비밀번호가 일치하지 않습니다.");
		
	}else {
		System.out.println("\n" + loginMember.getMemberName() + "님 환영합니다!");
	}
	
	}
	
	
	//회원 정보 조회 메서드
	public void selectMember() {
		System.out.println("\n===회원 정보 조회===\n");
	
		if (loginMember == null) {
			System.out.println("로그인 후 이용해주세요.");
		}
		
		System.out.println("이름 :  " + loginMember.getMemberName() + "\n" +
				"아이디 : " + loginMember.getMemberId() + "\n" +
				"나이 : " + loginMember.getMemberAge() + "\n" +
				"지역 : " + loginMember.getRegion());
		
	}
	
	
	//회원 정보 수정 메서드
	
	//회원정보 검색(지역)

}
