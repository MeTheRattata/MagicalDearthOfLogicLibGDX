package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Entity extends Actor
{
	int scale;
	int width;
	int height;
	int health;
	int maxHealth;
	int textureRegionX;
	int textureRegionY;
	int damageFrames;
	
	private TextureRegion textureRegion;
	private TextureRegion[][] textures;
	
	public Entity(String name)
	{
		super();
		textureRegion = new TextureRegion((MDLGame.assets.get(name + ".png", Texture.class)));
		scale = 4;
		width = 32;
		height = 32;
		textures = textureRegion.split(width, height);
		textureRegionX = 0;
		textureRegionY = 0;
	}
	/**
	 * Decrements health based on the damage taken, then returns a boolean of whether the Entity has died or not
	 * @param damage: damage dealt to the Entity, negative if damage, positive if healing
	 * @return: true if dead, false if not dead
	 */
	public boolean takeDamage(int damage)
	{
		health += damage;
		if(health > maxHealth)
			health = maxHealth;
		if(damage < 0) //If is damage taken and not healing
		{
			damageFrames += 30;
			textureRegionX++;
			
		}
		if(health <= 0)
			return true;
		else
			return false;
	}
	public void draw(Batch batch, float parentAlpha)
	{
		batch.draw(textures[textureRegionX][textureRegionY], getX(), getY(), width*scale, height*scale);
		if(damageFrames != 0)
		{
			damageFrames--;
			if(damageFrames == 0)
				textureRegionX--;
		}
	}
}