package de.pilzschaf.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.pilzschaf.game.TutorialGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Tutorial Game";
		config.width = 800;
		config.height = 480;
		config.addIcon("data/ic_launcher.png", Files.FileType.Internal);




		new LwjglApplication(new TutorialGame(), config);
	}
}
