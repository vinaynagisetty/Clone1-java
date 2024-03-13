package com.java.excersise;

public class whileImple {

	private int value;

	public whileImple(int value) {
		this.value = value;
		// TODO Auto-generated constructor stub
	}

	public void printSquareUptoNumber() {
		int i = 1;
		while (i * i <= value) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();

	}

	public void printCubesUptoNumber() {
		int i = 1;
		while (i * i * i <= value) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

}
