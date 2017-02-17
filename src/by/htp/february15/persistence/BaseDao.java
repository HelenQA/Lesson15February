package by.htp.february15.persistence;

import java.util.List;

import by.htp.february15.domain.Book;

public interface BaseDao {
	
	public static final String URL = "jdbc:mysql://mkdev.setplex.net:3306/qa_test";
	public static final String LOGIN = "qa_user";
	public static final String PASS = "";
	int create(Book book);

	List<Book> findAll();

	Book findById(int id);

	boolean update(Book book);

	boolean delete(int id);
	Book fetchByTitle();
}
