/**
 * Name: Stefany Gao
 * Date: june 22 2022
 * Description: this class is the first screen that pops up which will ask the user whether they want to
 * exit the game or start the game. If pressed start it switches to the game screen. If not it closes
 * the application.
 */
//importing GDX stuff
package com.mydgx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.MyGdxGame;

public class MenuScreen implements Screen {

	/* Attributes */
	// declaring the exit and play button sizes
	private static final int EXIT_BUTTON_WIDTH = 114;
	private static final int EXIT_BUTTON_HEIGHT = 64;
	private static final int PLAY_BUTTON_WIDTH = 120;
	private static final int PLAY_BUTTON_HEIGHT = 64;
	private static final int EXIT_BUTTON_Y = 40;
	private static final int PLAY_BUTTON_Y = 100;

	// making the texture sprite things so I can draw them
	Texture startUnactive;
	Texture startActive;
	Texture exitUnactive;
	Texture exitActive;
	Texture menu;

	MyGdxGame game;

	/* Constructor */
	/**
	 * name: MenuScreen 
	 * description: constructor for menu screen
	 * 
	 * @param MyGdxGame game - the game name but I didn't know how to rename it so
	 *                  it is the default
	 */
	public MenuScreen(final MyGdxGame game) {
		this.game = game;

		// declearing the textures
		startUnactive = new Texture("startUnactive.png");
		startActive = new Texture("startActive.png");
		exitUnactive = new Texture("exitUnactive.png");
		exitActive = new Texture("exitActive.png");
		menu = new Texture("menu.png");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	// rendering the assets, visuals, and input
	@Override
	public void render(float delta) {
		// clearing the screen
		ScreenUtils.clear(1, 0, 0, 1);
		// begin drawing the background and buttons for the menu
		game.batch.begin();
		game.batch.draw(menu, 0, 0);

		// exit button
		int x = 90;
		// setting the parameters
		if (Gdx.input.getX() < x + EXIT_BUTTON_WIDTH && Gdx.input.getX() > x
				&& 400 - Gdx.input.getY() < EXIT_BUTTON_Y + EXIT_BUTTON_HEIGHT
				&& 400 - Gdx.input.getY() > EXIT_BUTTON_Y) {
			game.batch.draw(exitActive, x, 20, EXIT_BUTTON_WIDTH, EXIT_BUTTON_HEIGHT); // changes the text to yellow
			if (Gdx.input.isTouched()) {
				Gdx.app.exit(); // closes the application
			}

		} else {
			game.batch.draw(exitUnactive, x, 20, EXIT_BUTTON_WIDTH, EXIT_BUTTON_HEIGHT); // default text
		}

		// Play game button
		// setting the parameters
		if (Gdx.input.getX() < x + PLAY_BUTTON_WIDTH && Gdx.input.getX() > x
				&& 400 - Gdx.input.getY() < PLAY_BUTTON_Y + PLAY_BUTTON_HEIGHT
				&& 400 - Gdx.input.getY() > PLAY_BUTTON_Y) {
			game.batch.draw(startActive, x, 90, PLAY_BUTTON_WIDTH, PLAY_BUTTON_HEIGHT); // changes the text to yellow
			if (Gdx.input.isTouched()) {
				this.dispose();
				game.setScreen(new GameScreen(game));
			}
		} else {
			game.batch.draw(startUnactive, x, 90, PLAY_BUTTON_WIDTH, PLAY_BUTTON_HEIGHT); // default text
		}

		// end drawing
		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
