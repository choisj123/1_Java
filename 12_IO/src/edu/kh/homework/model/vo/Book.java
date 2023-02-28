package edu.kh.homework.model.vo;

import java.util.Objects;

public class Book {
	//필드
	
	private int bookNum; // 도서등록번호 
	private String bookName; // 도서
	private String authorName; // 작가 이름
	private int bookPrice; // 가격
	private String publisher; // 출판사 
	
	// 생성자
	public Book() {} // 기본 생성자

	// 매개변수 생성자
	public Book(int bookNum, String bookName, String authorName, int bookPrice, String publisher) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.publisher = publisher;
	}
	

	
	public Book(String bookName, String authorName, int bookPrice, String publisher) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.publisher = publisher;
	}

	//메소
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, bookName, bookNum, bookPrice, publisher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && Objects.equals(bookName, other.bookName)
				&& bookNum == other.bookNum && bookPrice == other.bookPrice
				&& Objects.equals(publisher, other.publisher);
	}

	@Override
	public String toString() {
		return bookName + " \t " + authorName + " \t " +
				+ bookPrice + " \t " + publisher ;
	}
	
	
	
	
}
