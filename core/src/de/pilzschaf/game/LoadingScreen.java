package de.pilzschaf.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class LoadingScreen extends ScreenAdapter {

	public LoadingScreen() {

	}

	@Override
	public void render(float delta) {
		if(TutorialGame.INSTANCE.assetManager.update()) {
			TutorialGame.INSTANCE.setScreen(new GameScreen());
		}

		Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
}
