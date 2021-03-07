package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Launcher;

import utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Constants.GAME_TITLE;
	    config.width = Constants.WINDOW_WIDTH;
	    config.height = Constants.WINDOW_HEIGH;
		new LwjglApplication(new Launcher(), config);
	}
}
