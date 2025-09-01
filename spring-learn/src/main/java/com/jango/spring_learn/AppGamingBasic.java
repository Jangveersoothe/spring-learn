package com.jango.spring_learn;

import com.jango.spring_learn.game.GameRunner;
import com.jango.spring_learn.game.PacmanGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		var game = new SuperMarioGame();
//		var game = new MarioGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
