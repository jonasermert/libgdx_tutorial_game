package de.pilzschaf.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

public class TutorialGame extends Game {

	public static TutorialGame INSTANCE;
	public final AssetManager assetManager = new AssetManager();

	public TutorialGame() {
		assert(TutorialGame.INSTANCE == null);
		TutorialGame.INSTANCE = this;
	}

	@Override
	public void create () {
		setScreen(new LoadingScreen());
	}
}
