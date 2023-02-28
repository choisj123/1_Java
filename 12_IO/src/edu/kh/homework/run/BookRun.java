package edu.kh.homework.run;

import edu.kh.homework.model.service.BookService;
import edu.kh.homework.model.service.BookServiceMap;

public class BookRun {

	public static void main(String[] args) {
	BookService service = new BookService();
	
	BookServiceMap map = new BookServiceMap();
	
	service.displayMenu();
	//map.displayMenu();

	}

}
