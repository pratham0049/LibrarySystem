package com.Library.book.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	static Connection co;
	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/lib";
		String username ="root";
		String pass= "Pratham@123";
		
		try {
			co = DriverManager.getConnection(url,username,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return co;
		
	}
}
