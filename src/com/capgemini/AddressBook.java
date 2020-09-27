package com.capgemini;

import java.util.Scanner;
import java.util.*;

public class AddressBook {
	public static Contact contact;
	Scanner sc=new Scanner(System.in);
	ArrayList<Contact> Addbook;
	public AddressBook() {
		Addbook = new ArrayList<Contact>();
	}
	public void addContact() {
		Addbook.add(contact);
	}
	public void editContact(String key) {
		for (Contact con : Addbook) {
			if (con.getFname().equals(key)) {
				System.out.println("Enter the field you want to edit: ");
				System.out.println("1.First Name\t2.Last Name\t3.Email\t4.Address\t5.City\t6.State\t7.Zip\t8.Phone Number");
				int ch = Integer.parseInt(sc.nextLine());
				switch (ch) {
				case 1:
					System.out.println("New first name: ");
					con.setFname(sc.nextLine());
					break;
				case 2:
					System.out.println("New last name: ");
					con.setLname(sc.nextLine());
					break;
				case 3:
					System.out.println("New email: ");
					con.setEmail(sc.nextLine());
					break;
				case 4:
					System.out.println("New address: ");
					con.setAdd(sc.nextLine());
					break;
				case 5:
					System.out.println("New city: ");
					con.setCity(sc.nextLine());
					break;
				case 6:
					System.out.println("New state: ");
					con.setState(sc.nextLine());
					break;
				case 7:
					System.out.println("New Zip: ");
					con.setZip(Integer.parseInt(sc.nextLine()));
					break;
				case 8:
					System.out.println("New phone no.: ");
					con.setPno(sc.nextLine());
					break;
				default:
					System.out.println("No contact found !");
					break;
				}
				System.out.println("Updated contact-");
				con.display();
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook b = new AddressBook();
		boolean choice = true;
		while (choice) {
			System.out.println("Enter contact details- ");
			System.out.print("Enter first name: ");
			String fname = sc.nextLine();
			System.out.print("Enter last name: ");
			String lname = sc.nextLine();
			System.out.print("Enter Address: ");
			String add = sc.nextLine();
			System.out.print("Enter email: ");
			String email = sc.nextLine();
			System.out.print("Enter State: ");
			String state = sc.nextLine();
			System.out.print("Enter city: ");
			String city = sc.nextLine();
			System.out.print("Enter ZIP: ");
			int zip = Integer.parseInt(sc.nextLine());
			System.out.print("Enter phone no: ");
			String phone = sc.nextLine();
			contact = new Contact(fname, lname, email, add, state, city, zip, phone);
			b.addContact();
			System.out.println("Add new contact? 1-yes 2-no ");
			int bin = Integer.parseInt(sc.nextLine());
			if (bin==1) {
				choice = true;
			} else {
				choice = false;
				break;
			}
		}
		System.out.println("First name of the contact you wnat to edit: ");
		String name = sc.nextLine();
		b.editContact(name);
	}
}