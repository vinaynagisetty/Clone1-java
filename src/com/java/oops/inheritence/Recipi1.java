package com.java.oops.inheritence;

public class Recipi1 extends AbstractRecipee {

	@Override
	public void prepare() {
		System.out.println("preparing recipe1");

	}

	@Override
	public void doDish() {
		System.out.println("dooing recipe1");

	}

	@Override
	public void cleanUp() {
		System.out.println("cleanUp");

	}

}
