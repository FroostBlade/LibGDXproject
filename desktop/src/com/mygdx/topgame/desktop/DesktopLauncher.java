package com.mygdx.topgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.topgame.StartGame;

public class DesktopLauncher {

	private static DesktopLauncher desktopLauncher;

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Knights";
		config.width = 800; // x
		config.height = 480; // y
		if (desktopLauncher == null) desktopLauncher = new DesktopLauncher();
		new LwjglApplication(new StartGame(), config);
	}
}
