package com.java.array;

import java.util.Arrays;

public class varibleArguments {

	public static void print(int... values) {
		System.out.println(Arrays.toString(values));
	}

	public static int sum(int... values) {
		int sum = 0;
		for (int mark : values) {
			sum += mark;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(1, 2, 3, 7);
		System.out.println(sum(10, 20, 70));

	}

}
