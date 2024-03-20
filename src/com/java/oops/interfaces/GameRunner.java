package com.java.oops.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GammingConsole game = new MarioGame();
		GammingConsole game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
