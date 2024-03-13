package com.java.excersise;

import java.util.Scanner;

public class cubeOfNumberorginal {

	public void printCube() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = -1;
		do {
			if (i != -1) {
				System.out.println("cube is" + i * i * i);
			}
			System.out.println("Enter a number");
			i = sc.nextInt();

		} while (i > 0);
		System.out.println("Thank you");

//		while (i > 0) {
//
//		}
//		System.out.println(i * i * i + " ");
	}
}
