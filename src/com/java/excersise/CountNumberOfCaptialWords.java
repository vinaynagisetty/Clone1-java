package com.java.excersise;

public class CountNumberOfCaptialWords {
	public static int countCaptaial(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (String.isUpperCase("A")) {
				count++;
			}
		}
		return count;
	}

	private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
