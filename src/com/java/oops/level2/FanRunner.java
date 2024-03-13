package com.java.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan crompton = new Fan("crompton", 0.35448, "Red");
		crompton.setSpeed((byte) 3);
		System.out.println(crompton);
//		crompton.isOn(true);
//		crompton.setSpeed((byte) 5);
		crompton.switchOn();

		System.out.println(crompton);
		crompton.switchOff();

		System.out.println(crompton);
	}

}
