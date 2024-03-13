package com.java.oops.level2;

public class Address {
	private String street;
	private String village;
	private String zip;

	// creation
	public Address(String street, String village, String zip) {
		super();
		this.street = street;
		this.village = village;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "street=" + street + ", village=" + village + ", zip=" + zip;
	}

}
