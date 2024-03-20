package com.java.oops.interfaces;

public class MarioGame implements GammingConsole {

	@Override
	public void up() {
		System.out.println("jump");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("knee down");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("move left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move right");

	}

}
