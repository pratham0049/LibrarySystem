package com.Library.book.Db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import com.Library.book.Book;

public class Database {
	public static void save(ArrayList<Book> list) {
		Connection co = Connect.getConnect();
		try {
			PreparedStatement ps = co.prepareStatement("INSERT INTO book (bname,author,issueDate) VALUES (?,?,?);");
			int ab= 0;
			for(Book bk: list) {
				LocalDate date = LocalDate.now();
//				int bid = bk.getBook_id();
				String bname = bk.getbName();
				String aname = bk.getaName();
				Date date1 = Date.valueOf(date);
//				ps.setInt(1, bid);
				ps.setString(1, bname);
				ps.setString(2,aname);
				ps.setDate(3,date1);
				int data = ps.executeUpdate();
				ab = ab+data;
				
			}
			System.out.println(ab+ " Inserted.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getDataFromDb() {
		Connection co = Connect.getConnect();
		try {
			Statement stm = co.createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM book;");
			while(res.next()) {
				int bid = res.getInt("id");
				String bname = res.getString("bname");
				String author = res.getString("author");
				Date date =res.getDate("issueDate");
				System.out.println("Book Id:: "+ bid +", Book Name:: "+bname+", Author:: "+author+", IssueDate:: "+ date);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
