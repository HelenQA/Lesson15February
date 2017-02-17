package by.htp.february15.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.february15.domain.Book;
import by.htp.february15.domain.Author;

public class BookDaoImpl implements BookDao {
	
	List<Book> books = new ArrayList<Book>();
	Book book1 = new Book();
	@Override
	public int create(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Book> findAll(){
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL,LOGIN,PASS);
			st = conn.createStatement();
			
			rs = st.executeQuery("select id, brief from Book");
			
			while (rs.next()){
				
				int id = rs.getInt("id");
				String brief = rs.getString("brief");
				int publishYear = rs.getInt("publishYear");
				Book book = new Book(id, brief, publishYear, new Author()); // avtor budet pustoy
				books.add(book);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (conn!=null){
				try{
					conn.close();}
					catch (SQLException e){
						e.printStackTrace();
					}
				}
			}
		
		return books;
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book fetchByTitle() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		System.out.println("enter the title of the book you are looking for:");
		Scanner sc = new Scanner(System.in);
	    String brief = sc.nextLine();
		try {
			conn = DriverManager.getConnection(URL,LOGIN,PASS);
			st = conn.createStatement();
			
		String query = "select * from Book where brief =" + "'" + brief +"'";
			rs = st.executeQuery(query);
			if (rs.next()){
				
				int id = rs.getInt("id");
				String brief1 = rs.getString("brief");
				int publishYear = rs.getInt("publishYear");
				Book book = new Book(id, brief1, publishYear, new Author()); // avtor budet pustoy
				book1 = book;
				
			}
			else {System.out.println("no such book: f" + brief);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (conn!=null){
				try{
					conn.close();}
					catch (SQLException e){
						e.printStackTrace();
					}
				}
			}
		
		return book1;
	}

}
