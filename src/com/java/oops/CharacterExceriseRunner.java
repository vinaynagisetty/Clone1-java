package com.java.oops;

public class CharacterExceriseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterExcerise out = new CharacterExcerise('j');
		System.out.println(out.isVowel());
		System.out.println(out.isDigit());
		System.out.println(out.isAlphabet());
		System.out.println(out.isConsonent());
		CharacterExcerise.printLowerCase();
	}

}
