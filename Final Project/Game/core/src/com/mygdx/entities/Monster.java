/**
 * name: Stefany Gao
 * date: june 06 2022
 * description: coding how a monster will act, look like, move.
 */
package com.mygdx.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
import com.mygdx.tools.CollisionRect;

public class Monster {

	public static final int SPEED = 250;
	public static final int WIDTH = 80;
	public static final int HEIGHT = 80;
	private static Texture texture;

	float x, y;
	CollisionRect rect;
	public boolean remove = false;

	public Monster(float x) {
		this.x = x;
		this.y = 400;
		this.rect = new CollisionRect(x, y, WIDTH, HEIGHT);

		if (texture == null)
			texture = new Texture("monster.png");
	}

	public void update(float deltaTime) {
		y -= SPEED * deltaTime;
		if (y < -HEIGHT)
			remove = true;

		rect.move(x, y);
	}

	public void render(SpriteBatch batch) {
		batch.draw(texture, x, y, WIDTH, HEIGHT);
	}

	public CollisionRect getCollisionRect() {
		return rect;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

}