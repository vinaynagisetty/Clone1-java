package com.java.excersise;

public class LoopExcersise {
	private int value;

	public LoopExcersise(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
//		int count = 0;
//		for (int i = 1; i <= value; i++) {  //one of prime number
//			if (value % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			return true;
//		}
//		return false;

		if (value < 2) {
			return false;
		}
		for (int i = 2; i <= (value - 1); i++) {
			if (value % i == 0) {
				return false;
			}
		}

		return true;

	}

	public int sumUptoN() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= value; i++) {
			sum += i;

		}

		return sum;
	}

	public int sumOfDivisior() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				sum += i;

			}
		}
		return sum;
	}

	public void printTraingle() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
