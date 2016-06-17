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
	int attackPower;
	int attackTarget;
	
	private TextureRegion textureRegion;
	private TextureRegion[][] textures;
	
	public Entity(String name)
	{
		super();
		textureRegion = new TextureRegion((MDLGame.assets.get(name + "Sheet.png", Texture.class)));
		setPosition(100, 100);
		scale = 4;
		width = 32;
		height = 32;
		textures = textureRegion.split(width, height);
		textureRegionX = 0;
		textureRegionY = 0;
		health = 50;
		maxHealth = 100;
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
			textureRegionY++;
			
		}
		if(health <= 0)
			return true;
		else
			return false;
	}
	public void updateImage(String name)
	{
		textureRegion = new TextureRegion((MDLGame.assets.get(name + ".png", Texture.class)));
	}
	public void setRandomAttackTarget()
	{
		attackTarget = (int) Math.random();
	}
	
	public void draw(Batch batch, float parentAlpha)
	{
		batch.draw(textures[textureRegionY][textureRegionX], getX(), getY(), width*scale, height*scale);
		if(damageFrames != 0)
		{
			damageFrames--;
			if(damageFrames == 0)
				textureRegionY--;
		}
		
		float healthPercentage = (float) ((double) health / (double) maxHealth);
		batch.draw(MDLGame.assets.get("redBar.png", Texture.class), getX(), getY() - 8, 32 * scale, 2 * scale);
		batch.draw(MDLGame.assets.get("greenBar.png", Texture.class), getX(), getY() - 8, healthPercentage * 32 * scale, 2 * scale);
	}
}