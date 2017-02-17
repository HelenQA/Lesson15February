package by.htp.february15.domain;

public class Book extends Entity{
/**
	 * 
	 */
	private static final long serialVersionUID = 3510871492751402663L;
//private int id;
private String brief;
private int publishYear;
private Author author;

public Book(int id, String brief, int publishYear, Author author) {
	super(id);
	this.brief = brief;
	this.publishYear = publishYear;
	this.author = author;
}
public Book(){
	
}
public Book(int id){
super(id);	
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}


@Override
public String toString() {
	return "Book brief: " + brief + "" + super.toString() + "," + " " + "year: " + publishYear;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}
