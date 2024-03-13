package com.java.beginner;

public class MuliplicatinTable {
	void print() {
		print(6);
	}

	void print(int tableNumber) {
		print(tableNumber, 1, 10);
	}

	void print(int tablenumber, int from, int last) {
		for (int i = from; i <= last; i++) {
			System.out.printf("%d *%d =%d", tablenumber, i, tablenumber * i).println();
		}
	}

}
