package by.htp.february15.service;

import java.util.List;

import by.htp.february15.domain.Book;
import by.htp.february15.domain.Catalog;
import by.htp.february15.persistence.BookDao;
import by.htp.february15.persistence.BookDaoImpl;

public class BookServiceImpl implements BookService {

	
	private BookDao dao = new BookDaoImpl();
	@Override
	public Catalog viewCatalog() {
		List<Book> books = dao.findAll();
		Catalog catalog = new Catalog (books);
		return catalog;
	}
	
	public Book findBookByTitle(){
		//String title = book.getTitle();
		Book book = dao.fetchByTitle();
		return book;
		
	}

	

}
