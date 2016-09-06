package com.v5ent.game;

import com.badlogic.gdx.Game;

/**
 * 游戏入口<tt>游戏就是管理<b>Screen</b>并切换它们</tt>
 * 
 * @author Mignet
 * 
 */
public class MyRpgGame extends Game {

	/**主游戏画面*/
	public static final MainGameScreen mainGameScreen = new MainGameScreen();

	@Override
	public void create() {
		setScreen(mainGameScreen);
	}

	@Override
	public void dispose() {
		mainGameScreen.dispose();
	}
}
