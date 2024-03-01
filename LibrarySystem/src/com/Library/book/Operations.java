package com.Library.book;

import java.util.Scanner;

public class Operations {
	static Scanner sc= new Scanner(System.in);
	static MultipleBooks mb = new MultipleBooks();
	public static void setData() {
		int ch =1;
		while(ch==1) {
			Book bk = new Book();
			System.out.println("Enter Book Name:: ");
			String bname = sc.next();
			System.out.println("Enter Author Name:: ");
			String aname = sc.next();
			bk.setbName(bname);
			bk.setaName(aname);
			mb.setToList(bk);
			System.out.print("Enter 1 to add more books and 2 to save to database:: ");
			ch = sc.nextInt();
			if(ch==2) {
				mb.saveData();
			}
		}
	}
	public static void getDataFromDb() {
		mb.display();
	}
}
