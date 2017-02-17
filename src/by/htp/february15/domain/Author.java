package by.htp.february15.domain;

import java.util.Date;

public class Author extends Entity{

	private static final long serialVersionUID = 129761996034862690L;
	//private int id;
	private String name;
	private Date date;
	public Author(int id, String name, Date date) {
		super(id);
		this.name = name;
		this.date = date;
	}
	public Author(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
