package com.Library.book;

public class Book {
//	private int Book_id;
	private String bName;
	private String aName;
	public Book() {}
	public Book(int book_id, String bName, String aName) {
		super();
//		Book_id = book_id;
		this.bName = bName;
		this.aName = aName;
	}
//	public int getBook_id() {
//		return Book_id;
//	}
	public String getbName() {
		return bName;
	}

	public String getaName() {
		return aName;}
//	}
//	public void setBook_id(int book_id) {
//		Book_id = book_id;
//	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
}
