package de.pilzschaf.game;

import com.badlogic.gdx.Game;

public class TutorialGame extends Game {

	public static TutorialGame INSTANCE;

	public TutorialGame() {
		assert(TutorialGame.INSTANCE == null);
		TutorialGame.INSTANCE = this;
	}

	@Override
	public void create () {
		setScreen(new GameScreen());
	}
}
