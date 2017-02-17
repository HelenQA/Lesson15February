package by.htp.february15.service;

import by.htp.february15.domain.Book;
import by.htp.february15.domain.Catalog;

public interface BookService {
	
Catalog viewCatalog();
Book findBookByTitle();
}
