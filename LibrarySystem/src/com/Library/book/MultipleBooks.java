package com.Library.book;

import java.util.ArrayList;

import com.Library.book.Db.Database;

public class MultipleBooks {
	private ArrayList<Book> list;
	public MultipleBooks() {
		this.list = new ArrayList<Book>();
	}
	public void setToList(Book b) {
		list.add(b);
	}
	
	public void display() {
		Database.getDataFromDb();
	}
	
	public void saveData() {
		Database.save(list);
	}
	
}
