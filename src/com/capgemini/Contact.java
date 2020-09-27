package com.capgemini;

public class Contact {
	public static String Fname,Lname,Email,Add,City,State,Pno;
	public static int Zip;
	public String getFname() {
		return Fname;
	}
	public void setFname(String Fname) {
		this.Fname = Fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String Lname) {
		this.Lname = Lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String Add) {
		this.Add = Add;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int Zip) {
		this.Zip = Zip;
	}
	public String getPno() {
		return Pno;
	}
	public void setPno(String Pno) {
		this.Pno = Pno;
	}

	public Contact(String Fname,String Lname,String Email,String Add,String City,String State,int Zip,String Pno) {
		super();
		this.Fname = Fname;
		this.Lname = Lname;
		this.Email=Email;
		this.Add = Add;
		this.City = City;
		this.State = State;
		this.Zip = Zip;
		this.Pno = Pno;
	}
	public void display() {
		System.out.println("Name- "+Fname+" "+Lname);
		System.out.println("Email- "+Email);
		System.out.println("Address- "+Add+" "+City+" "+State);
		System.out.println("Zip- "+Zip);
		System.out.println("Phone no- "+Pno);
		}
}
