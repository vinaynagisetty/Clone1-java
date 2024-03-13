package com.java.beginner;

import java.util.Scanner;

public class SwitchRunner {
	public static void main(String[] args) {
		System.out.println("enter numberrs");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String choice = sc.next();
		performOperatiousingSwitch(n1, n2, choice);
	}

	private static void performOperatiousingSwitch(int n1, int n2, String choice) {
		switch (choice) {
		case "add":
			System.out.println(n1 + n2);
			break;

		case "sub":
			System.out.println(n1 - n2);
			break;
		case "mul":
			System.out.println(n1 * n2);
			break;
		case "div":
			System.out.println(n1 / n2);
			break;
		default:
			System.out.println("invalid");
		}

	}
}
