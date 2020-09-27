package com.capgemini;

public class AddressBook {
	public static String Fname,Lname,Email,Add,City,State,Pno;
	public static long Zip;
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
		AddressBook c1= new AddressBook("Mohd Kashif","Ansari","matrixkashif@gmail.com","Meer Anees Lane, Chowk,","Lucknow,","Uttar Pradesh",226003,"9598252500");
		c1.display();
	}
}
