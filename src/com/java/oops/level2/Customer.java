package com.java.oops.level2;

public class Customer {
	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;

//constructor
	public Customer(String name, Address homeAddress) {
		this.homeAddress = homeAddress;
		this.name = name;
	}

//operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format(" name- %s homeAdrees [%s] workAdrees [%s]", name, homeAddress, workAddress);
	}

}
