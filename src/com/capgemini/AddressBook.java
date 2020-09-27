package com.capgemini;

import java.util.*;

public class AddressBook {
	public static String Fname,Lname,Email,Add,City,State,Pno;
	public static long Zip;
	public AddressBook() {
		
	}
	public AddressBook(String fname,String lname,String email,String add,String city,String state,long zip,String pno) {
		Fname = fname;
		Lname = lname;
		Email = email;
		Add = add;
		City = city;
		State = state;
		Zip = zip;
		Pno = pno;
	}
	public void display() {
		System.out.println("Name- "+Fname+" "+Lname);
		System.out.println("Email- "+Email);
		System.out.println("Address- "+Add+" "+City+" "+State);
		System.out.println("Zip- "+Zip);
		System.out.println("Phone no- "+Pno);
		}
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
		Scanner sc= new Scanner(System.in);
		System.out.println("First contact's details-");
		AddressBook c1= new AddressBook("Mohd Kashif","Ansari","matrixkashif@gmail.com","Meer Anees Lane, Chowk,","Lucknow,","Uttar Pradesh",226003,"9598252500");
		c1.display();
		AddressBook c2= new AddressBook();
		System.out.println("Enter second contact's details:-");
		System.out.println("First name- ");
		c2.Fname = sc.nextLine();
		System.out.println("Enter the last name:");
		c2.Lname = sc.nextLine();
		System.out.println("Enter the Email:");
		c2.Email = sc.nextLine();
		System.out.println("Enter the address:");
		c2.Add = sc.nextLine();
		System.out.println("Enter the city:");
		c2.City = sc.nextLine();
		System.out.println("Enter the state:");
		c2.State = sc.nextLine();
		System.out.println("Enter the zip:");
		c2.Zip = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Phone Number:");
		c2.Pno = sc.nextLine();
		sc.close();
		System.out.println("Second contact's details-");
		c2.display();
	}
}
