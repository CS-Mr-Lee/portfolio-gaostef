/**
 * name: Stefany Gao
 * date: june 06 2022
 * description: the game part. Press space to shoot bullets. You can move around with arrow keys.
 *  			There's no death because Pietro is just too strong to die, clown powers
 */
package com.mydgx.game.screens;

import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.entities.Bullet;
import com.mygdx.entities.Monster;
import com.mygdx.game.MyGdxGame;
import com.mygdx.tools.CollisionRect;

public class GameScreen implements Screen{
	Texture background;
	Texture monster;
	Texture player;
	Texture menuIconInactive;
	SpriteBatch batch;
	Texture menuIcon;
	//Texture npc1;
	float x;
	float y;
	private OrthographicCamera camera;
	private Viewport port;
	private TmxMapLoader maploader;
	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	private FitViewport viewport;
	ArrayList<Bullet> bullets;
	CollisionRect playerRect;
	float shootTimer;
	public static final float SHOOT_WAIT_TIME = 0.3f;
	ArrayList<Monster> monsters;
	public static final float MIN_SPAWN_TIME = 0.8f;
	public static final float MAX_SPAWN_TIME = 2.0f;
	private static final int MENU_BUTTON_WIDTH = 80;
	private static final int MENU_BUTTON_HEIGHT = 80;
	MyGdxGame game; 
	float spawnTimer;
	Random random;
	
	public GameScreen (MyGdxGame game) {
		this.game = game;
		playerRect = new CollisionRect(0, 0, 80, 80);
		bullets = new ArrayList<Bullet>();
		monsters = new ArrayList<Monster>();
		OrthographicCamera gamecam = new OrthographicCamera();
		random = new Random();
		spawnTimer = random.nextFloat() * (MAX_SPAWN_TIME - MIN_SPAWN_TIME) + MIN_SPAWN_TIME;
		
	}
	@Override
	public void show() {
		menuIconInactive = new Texture("menuIconinactive.png");
		background = new Texture("background.png");
		player = new Texture("pietro.png");
		menuIcon = new Texture("MenuIcon.png");
		monster = new Texture ("monster.png");
	}

	@Override
	public void render(float delta) {
		//drawing the background
		ScreenUtils.clear(1, 0, 0, 1);
		game.batch.begin();
		game.batch.draw(background, 0, 0);
		
		if (Gdx.input.getX()< 610 + MENU_BUTTON_WIDTH && Gdx.input.getX() > 610 && 400 - Gdx.input.getY() < 310 + MENU_BUTTON_HEIGHT && 400 - Gdx.input.getY() > 700) {
			game.batch.draw(menuIconInactive, 610, 310, MENU_BUTTON_WIDTH,MENU_BUTTON_HEIGHT);
			if (Gdx.input.isTouched()) {
				Gdx.app.exit();
			}
			
		} else {
			game.batch.draw(menuIcon, 610, 310, MENU_BUTTON_WIDTH,MENU_BUTTON_HEIGHT);
		}
		game.batch.end();
		
		shootTimer += delta;
		if (Gdx.input.isKeyJustPressed(Keys.SPACE)) {
			bullets.add(new Bullet(x+40));
			
		}
		
		ArrayList<Bullet> bulletsToRemove = new ArrayList<Bullet>();
		for (Bullet bullet : bullets) {
			bullet.update(delta);
			if (bullet.remove)
				bulletsToRemove.add(bullet);
		}
		spawnTimer -= delta;
		if (spawnTimer <= 0) {
			spawnTimer = random.nextFloat() * (MAX_SPAWN_TIME - MIN_SPAWN_TIME) + MIN_SPAWN_TIME;
			monsters.add(new Monster(random.nextInt(700 - 32)));
		}
		ArrayList<Monster> monstersToRemove = new ArrayList<Monster>();
		for (Monster monster : monsters) {
			monster.update(delta);
			if (monster.remove)
				monstersToRemove.add(monster);
		}
		

		//movement
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			y = y + 8;
			if (y + 80 > 400) {
				y = 400 - 80;
			}
		} 
		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			y = y-8;
			if (y<0) {
				y=0;
			}
		} 
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x = x + 8;
			if (x + 80 > 700) {
				x = 700 - 80;
			}
		}
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			x = x-8;
			if (x < 0) {
				x = 0;
			}
		}
		
		
		
		
		//After player moves, update collision
				playerRect.move(x, y);
				
				//check for collisions
				for (Bullet bullet : bullets) {
					for (Monster monster : monsters) {
						if (bullet.getCollisionRect().collidesWith(monster.getCollisionRect())) {//Collision occured
							bulletsToRemove.add(bullet);
							monstersToRemove.add(monster);
							
						}
					}
				}
				bullets.removeAll(bulletsToRemove);
				monsters.removeAll(monstersToRemove);
				
				for (Monster monster : monsters) {
					if (monster.getCollisionRect().collidesWith(playerRect)) {
						monstersToRemove.add(monster);
					}
				}
				
				game.batch.begin();

				for (Bullet bullet : bullets) {
					bullet.render(game.batch);
				}
				for (Monster monster : monsters) {
					monster.render(game.batch);
				}
				game.batch.draw(player, x, y);
				game.batch.end();
	}
	

	private boolean isLeft() {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean isRight() {
		// TODO Auto-generated method stub
		return false;
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
		
		
	}

}
