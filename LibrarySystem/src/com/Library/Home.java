package com.Library;

import java.util.Scanner;

import com.Library.book.Operations;

public class Home {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean exit =true;
	while(exit) {
	System.out.println("############################### Library ##################################");
	System.out.println("Enter 1 For Books.\nEnter 2 to check Database.\nEnter 3 to Exit.");
	System.out.print("Enter Your Choice:: ");
	int choice = sc.nextInt();
	switch(choice) {
	case 1:
		Operations.setData();
		break;
	case 2:
		Operations.getDataFromDb();
		break;
	case 3:
		System.out.println("PLease Visit Us Again!!!");
		exit = false;
		break;
	}}
}
}
