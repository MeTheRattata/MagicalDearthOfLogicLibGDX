package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Entity extends Actor
{
	private String name;
	int scale;
	int width;
	int height;
	int health;
	int maxHealth;
	
	private TextureRegion textureRegion;
	private TextureRegion[][] textures;
	
	public Entity(String newName)
	{
		super();
		textureRegion = new TextureRegion((MDLGame.assets.get(newName + ".png", Texture.class)));
		//region set to default
		//textureRegion.setRegion(0, 0, 32, 32);
		setPosition(0, 0);
		scale = 4;
		width = 32;
		height = 32;
		
		textures = textureRegion.split(32,32);
		name = newName;
	}
	
	public void draw(Batch batch, float parentAlpha)
	{
		batch.draw(textures[0][0], getX(), getY(), width*scale, height*scale);
	}
}