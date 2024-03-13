package com.java.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeaddress = new Address("nagisetty street", "gogulapalle", "524315");
		Customer customer = new Customer("vinay", homeaddress);
		System.out.println(homeaddress);
		System.out.println(customer);
		Address workAddress = new Address("nagisetty street1", "gogulapalle1", "5243151");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
		// hi

	}

}
