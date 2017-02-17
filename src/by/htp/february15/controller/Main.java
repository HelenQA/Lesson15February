package by.htp.february15.controller;

import by.htp.february15.domain.Book;
import by.htp.february15.domain.Catalog;
import by.htp.february15.persistence.BookDao;
import by.htp.february15.service.BookService;
import by.htp.february15.service.BookServiceImpl;

public class Main {


private static void chooseItem(int item){
	
	BookServiceImpl service = new BookServiceImpl();
	//BookServiceImpl bs = new BookServiceImpl();
	switch(1){
	case 2:
		Catalog catalog = service.viewCatalog();
		System.out.println(catalog);
		break;
		
	case 1:
		Book book = service.findBookByTitle();
		System.out.println(book);
		break;
	}
}
	public static void main(String[] args) {
		chooseItem(1);

	}

}
