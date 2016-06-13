package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Entity extends Image
{
	private String name;
	int width;
	int height;
	
	public Entity(String newName)
	{
		super(MDLGame.assets.get(newName + ".png", Texture.class));
		setOrigin(0, 0);
		setScale(4);
		name = newName;
	}
	
	public void act()
	{
		
	}
}