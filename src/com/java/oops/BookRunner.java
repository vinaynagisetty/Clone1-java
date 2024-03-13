package com.java.oops;

import java.math.BigDecimal;

public class BookRunner {
	static int a = 21;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book cp = new Book(a);
		BigDecimal number1 = new BigDecimal(456.45466);
		BigDecimal number2 = new BigDecimal(46.45466);
		System.out.println(number1.add(number2));
//		cp.numOfPages();
		System.out.println(cp.getNoOfCopies());

		cp.setNoOfCopies(150);
		cp.increaseNoOfCopies(300);
		cp.decreaseNoOfCopies(500);

		System.out.println(cp.getNoOfCopies());
	}

}
