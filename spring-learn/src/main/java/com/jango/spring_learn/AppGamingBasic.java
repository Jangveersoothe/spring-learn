package com.jango.spring_learn;

import com.jango.spring_learn.game.gameRunner;
import com.jango.spring_learn.game.marioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame = new marioGame();
		var gameRunner = new gameRunner(marioGame);
		gameRunner.run();
	}

}
