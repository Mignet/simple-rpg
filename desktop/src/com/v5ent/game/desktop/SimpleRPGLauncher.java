package com.v5ent.game.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.v5ent.game.MyRpgGame;

public class SimpleRPGLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Simple RPG";
		config.useGL30 = false;
		config.width = 800;
		config.height = 600;
		Application app = new LwjglApplication(new MyRpgGame(), config);
		Gdx.app = app;
		// Gdx.app.setLogLevel(Application.LOG_INFO);
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		// Gdx.app.setLogLevel(Application.LOG_ERROR);
		// Gdx.app.setLogLevel(Application.LOG_NONE);
	}
}
