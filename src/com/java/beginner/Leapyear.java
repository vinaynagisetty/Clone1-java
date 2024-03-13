package com.java.beginner;

public class Leapyear {

	public void leapYear(int year) {
		if (year < 1) {
			System.out.println("Negative number");
		}
		if (year % 4 == 0) {
			if ((year % 4 == 0) && (year % 100 != 0)) {
				System.out.println("Leap year");
			} else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
				System.out.println("leap year");

			} else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0)) {
				System.out.println("Not a leap year");

			}
		} else {
			System.out.println("Not a leap year");
		}

	}

	public static void main(String[] args) {
		Leapyear ot = new Leapyear();
		ot.leapYear(2401);

	}

}
