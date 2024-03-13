package com.java.beginner;

public class Sum {
	int temp1 = 0;

	public static void main(String[] args) {
		Sum ot = new Sum();
		ot.sumOfSqure(5);
		// TODO Auto-generated method stub

	}

	public void sumOfSqure(int n) {
		for (int i = 1; i <= n; i++) {
			int temp = i * i;
			temp1 = temp;
		}
		System.out.println(temp1);

	}

}
