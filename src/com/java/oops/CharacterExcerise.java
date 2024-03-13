package com.java.oops;

public class CharacterExcerise {

	private char ch;

	public CharacterExcerise(char ch) {

		this.ch = ch;
	}

	public boolean isVowel() {
		if (this.ch == 'a' || this.ch == 'A' || this.ch == 'e' || this.ch == 'E' || this.ch == 'i' || this.ch == 'I'
				|| this.ch == 'o' || this.ch == 'O' || this.ch == 'u' || this.ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isDigit() {
		// TODO Auto-generated method stub
		if (ch >= 48 && ch <= 57) {
			return true;

		}
		return false;
	}

	public boolean isAlphabet() {
		if ((this.ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
			return true;
		}

		return false;
	}

	public boolean isConsonent() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;
	}

	public static void printLowerCase() {
		// TODO Auto-generated method stub
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
		for (int ch = 97; ch <= 122; ch++) {
			System.out.print((char) ch);
		}
	}

}
