package com.capgemini;

import java.util.Scanner;
import java.util.*;

public class AddressBook {
	public static String Fname,Lname,Email,Add,City,State,Pno;
	public static int Zip;
	public AddressBook(String fname,String lname,String email,String add,String city,String state, int zip,String pno) {
		Fname = fname;
		Lname = lname;
		Email = email;
		Add = add;
		City = city;
		State = state;
		Zip = zip;
		Pno = pno;
	}
	public String toString() {
		return Fname+" " +Lname+" "+Email+" "+Add+" "+City+" "+State+" "+Zip+" "+Pno;
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of AddressBooks you want to add: ");
		HashMap<String, ArrayList<AddressBook>> dictionary = new HashMap<String, ArrayList<AddressBook>>();
		int n = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < n; j++) {
			String bname;
			while(true) {
			System.out.println("Name of the Address book:");
			bname = sc.nextLine();
			int flag = 0;
				for (Map.Entry<String, ArrayList<AddressBook>> e : dictionary.entrySet()) {
					if(e.getKey().equals(bname)) {
						flag++;
					}
				}
				if(flag == 0) {
					break;
				}
				else {
					System.out.println("ERROR !! AddressBook already exists. Can't create AddressBook of same name");
				}
			}
			ArrayList<AddressBook> book = new ArrayList<AddressBook>();
			System.out.println("Number of persons you want to add in Addressbook: ");
			int number = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < number; i++) {
				System.out.println("Enter the details of contact " +(i + 1)+ ": ");
				System.out.println("Enter the first name:");
				String fname = sc.nextLine();
				System.out.println("Enter the last name:");
				String lname = sc.nextLine();
				System.out.println("Enter the Email:");
				String email = sc.nextLine();
				System.out.println("Enter the Address:");
				String add = sc.nextLine();
				System.out.println("Enter the City:");
				String city = sc.nextLine();
				System.out.println("Enter the State:");
				String state = sc.nextLine();
				System.out.println("Enter the Zip:");
				int zip = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the phone number:");
				String pno = sc.nextLine();
				AddressBook contact = new AddressBook(fname, lname, email, add, city, state, zip, pno);
				book.add(contact);
			}
			dictionary.put(bname, book);
		}
		for (Map.Entry<String, ArrayList<AddressBook>> e : dictionary.entrySet()) {
			System.out.println("The details of AddressBook '" +e.getKey()+"' is: ");
			System.out.println(e.getValue());
		}
	}
}