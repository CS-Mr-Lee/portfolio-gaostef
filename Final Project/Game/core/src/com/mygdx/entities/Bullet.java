/**
 * name: Stefany Gao
 * date: june 06 2022
 * description: coding how a bullet will act, look like, move.
 */
package com.mygdx.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.mygdx.tools.CollisionRect;

public class Bullet {
	
	public static final int SPEED = 500;
	public static final int DEFAULT_Y = 40;
	public static final int WIDTH = 20;
	public static final int HEIGHT = 20;
	private static Texture texture;
	
	float x, y;
	CollisionRect rect;
	public boolean remove = false;
	
	public Bullet (float x) {
		this.x = x;
		this.y = DEFAULT_Y;
		this.rect = new CollisionRect(x, y, 18, 19);
		
		if (texture == null)
			texture = new Texture("bullet.png");
	}
	
	public void update (float deltaTime) {
		y += SPEED * deltaTime;
		if (y > 400)
			remove = true;
		
		rect.move(x, y);
	}
	
	public void render (SpriteBatch batch) {
		batch.draw(texture, x, y);
	}
	
	public CollisionRect getCollisionRect () {
		return rect;
	}
	
}