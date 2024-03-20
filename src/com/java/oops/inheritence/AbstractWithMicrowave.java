package com.java.oops.inheritence;

public class AbstractWithMicrowave extends AbstractRecipee {

	@Override
	public void prepare() {
		System.out.println("preparing AbstractWithMicrowave");

	}

	@Override
	public void doDish() {
		System.out.println("dooing AbstractWithMicrowave");

	}

	@Override
	public void cleanUp() {
		System.out.println("cleanUp");

	}

}
