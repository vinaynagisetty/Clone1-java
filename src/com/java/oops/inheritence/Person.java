package com.java.oops.inheritence;

public class Person extends Object {
	private String name;
	private int phoneNumber;
	private String emailID;

	public Person(String name) {
		this.name = name;
		System.out.println("Person constructor");
	}

//	public Person() {
//
//		// TODO Auto-generated constructor stub
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + ", emailID=" + emailID + "]";
	}

}
