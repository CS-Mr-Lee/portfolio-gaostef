package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mydgx.game.screens.GameScreen;
import com.mydgx.game.screens.MenuScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.SpriteCache;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20;
import com.badlogic.gdx.math.Vector3;

public class MyGdxGame extends Game {

	
	public static final int PPM = 0;
	public static final int V_WIDTH = 0;
	public static final int V_HEIGHT = 0;
	public SpriteBatch batch;

	
	@Override
	public void create () {
		
		//launches the menu screen
		batch = new SpriteBatch();
		this.setScreen(new MenuScreen(this));

	
	}

	@Override
	public void render () {
//		camera.update();
		super.render();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		
	}
}
