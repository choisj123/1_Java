package edu.kh.homework.model.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.homework.model.vo.Book;

public class BookService {
	
	private Scanner sc = new Scanner(System.in);  
	
	private List<Book> bookList = new ArrayList<Book>();
	List<Book> favoritesList = new ArrayList<Book>();
	
	public BookService() {
		bookList.add(new Book(0, "용의자 X의 헌신", "히라시노게이고", 15120, "재인 출판사"));
		bookList.add(new Book(1, "용의자 X의 헌신", "히라시노게이고", 15120, "재인 출판사"));
		bookList.add(new Book(2, "용의자 X의 헌신", "히라시노게이고", 15120, "재인 출판사"));
		bookList.add(new Book(3, "용의자 X의 헌신", "히라시노게이고", 15120, "재인 출판사"));
	}
	

	/**메뉴 출력용 메서드 
	 * @author sujinchoi
	 */
	public void displayMenu() {
		
	int menuNum = -1;

	do {
		System.out.println("\n=========도서 관리 프로그램==========\n");
		System.out.println("1. 도서 정보 추가"); // addBook
		System.out.println("2. 도서 전체 조회"); // selectAll
		System.out.println("3. 도서 정보 수정"); // updateBook
		System.out.println("4. 도서 정보 삭제 "); // removeBook
		System.out.println("5. 즐겨찾기 추가 "); // favoritesAdd
		System.out.println("6. 즐겨찾기 삭제"); // favoriteDelete
		System.out.println();
		System.out.println("0. 프로그램 종료 "); 
		
		System.out.print("\n메뉴 번호 선택 >> ");
	
	try {
		menuNum = sc.nextInt();
		System.out.println();
		
		switch(menuNum) {
		
		case 1 : System.out.println( addBook() );break;
		case 2 : selectAll(); break;
		case 3 : System.out.println( updateBook() );break;
		case 4 : System.out.println( removeBook() );break;
		case 5 : favoritesAdd();  break;
		case 6 : favoritesDelete(); break;
		case 0 : System.out.println("프로그램 종료 ..... "); break;
		default : System.out.println("메뉴에 작성된 번호만 입력해주세요.");
		}
		
	}catch(Exception e) {
		System.out.println("\nerror : 입력 형식이 유효하지 않습니다. 다시 시도해주세요!");
		sc.nextLine();
		
	}
		
	}while(menuNum != 0);


	}
	
	/** 1. 도서 정보 추가 
	 * 
	 */
	public String addBook() throws Exception{
		System.out.println("\n=========도서 정보 추가==========\n");
		
		//int bookNum;
		//for (int i = 0; i < bookList.size(); i++ ) {
		//	bookNum = i+1;
		//}
		System.out.print("도서 등록 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
	
		System.out.print("도서명 : ");
		String bookName = sc.nextLine();
		
		System.out.print("작가 이름 : ");
		String authorName = sc.next();
		
		System.out.print("가격 : ");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		
		// Book 객체 생성 후 List 추가 
		if (bookList.add( new Book(bookNum,bookName, authorName, bookPrice, publisher))) {
			return "성공!!!!";
		}else {
			return " 실패...";
		}
	
		
	}
	
	/**  2. 도서 전체 조회
	 * 
	 */
	public void selectAll() {
		System.out.println("\n=========4조 도서 목록 ==========\n");
		
		if(bookList.isEmpty()) {
			System.out.println("학생 정보가 없습니다. ");
		
			return;
		}
		
		//int index = 0;
		for(Book b : bookList) {
			//System.out.print((index++) + "번: ");
			System.out.println(b);
		}
		
		
	}
	
	/**  3. 도서 정보 수정 
	 * 
	 */
	public String updateBook() throws Exception{
		
	
		System.out.println("\n=========도서 정보 수정==========\n");
		
		System.out.print("인덱스 번호 입력: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (bookList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";
		}else if (index <0) {
			return "음수는 입력할 수 없습니다.";
		
		}else if (index >= bookList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		
		}else {
			System.out.println("\n" + index + "번째 인덱스에 저장된 도서 정보");
			System.out.println(bookList.get(index));
			
			System.out.print("도서 등록 번호 : ");
			int bookNum = sc.nextInt();
			sc.nextLine();
		
			System.out.print("도서명 : ");
			String bookName = sc.nextLine();
			
			System.out.print("작가 이름 : ");
			String authorName = sc.next();
			
			System.out.print("가격 : ");
			int bookPrice = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			Book temp = bookList.set(index, new Book(bookNum, bookName, authorName, bookPrice, publisher));
			return "\n" +  temp.getBookName() + "의 정보가 변경되었습니다.";
		}
	}
	
	
	
	/**  4. 도서 정보 삭제
	 * 
	 */
	public String removeBook() throws Exception{
		System.out.println("\n=========도서 정보 삭제==========\n");
		System.out.print("인덱스 번호 입력: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (bookList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";
		}else if (index <0) {
			return "음수는 입력할 수 없습니다.";
		
		}else if (index >= bookList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		
		}else {
			System.out.print("정말 삭제 하시겠습니다? (Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if (ch == 'Y') {
				Book temp = bookList.remove(index);
				return temp.getBookName() + "의 정보가 삭제되었습니다.";
			} else {
				return "취소되었습니다.";
			}
		}
	}

	/**  5.  즐겨찾기 추가
	 * 
	 */
	public void favoritesAdd() {
		
		System.out.print("즐겨찾기에 추가할 도서 인덱스를 입력하세요 : ");
		int index = sc.nextInt();
		
		if(bookList.isEmpty()) {
			System.out.println("등록된 책이 없습니다.");
		}else if (index > bookList.size() ) {
			System.out.println("범위 내의 번호를 입력해주세요.");
		}
		
		
		favoritesList.add(bookList.get(index));
		System.out.println("\n<" + favoritesList.get(index).getBookName()+ "> 책이 즐겨찾기 되었습니다!");
		
		FileWriter fw = null;

		try { 
			
			fw = new FileWriter("favorites.txt");

	
			fw.write("=========4조 즐겨찾기 목록==========\n\n");
		
			//for (int i = 0; i < favoritesList.size(); i ++) {
			//	fw.write(favoritesList.get(index).getBookNum()+ "\t\t" + favoritesList.get(index).getBookName() + "\t\t" + favoritesList.get(index).getAuthorName() + "\t\t");
			
			for(Book book : favoritesList) {
				fw.write(book.getBookNum() + "\t\t" + book.getBookName() + "\t\t" + book.getAuthorName() + "\n");
				System.out.println();
		
			}
	
		}catch(IOException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
			
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	/** 6. 즐겨찾기 삭제
	 * 
	 */
	public void favoritesDelete() {
		System.out.println("\n=========즐겨찾기 삭제==========\n");
		
		System.out.print("즐겨찾기에서 삭제할 도서 인덱스를 입력하세요 : ");
		int index = sc.nextInt();
		
		System.out.print("정말 삭제 하시겠습니다? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if (ch == 'Y') {
			Book temp = favoritesList.remove(index);
			System.out.println( "\n<" + temp.getBookName() + "> 의 정보가 삭제되었습니다.");
			
			FileWriter fw = null;
			
			try { 
				
				fw = new FileWriter("favorites.txt");
					
				String str = "=========삭제 후 4조 즐겨찾기 목록==========\n\n";
				fw.write(str);
				
				for(Book book : favoritesList) {
					fw.write(book.getBookNum() + "\t\t" + book.getBookName() + "\t\t" + book.getAuthorName() + "\n");
					System.out.println();
			
				}
	

		}catch(IOException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
			
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		}
	}
		
	
	
}
