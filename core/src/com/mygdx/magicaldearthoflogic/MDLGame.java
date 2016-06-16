package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MDLGame extends Game
{
	public static AssetManager assets;
	
	public void create() 
	{
		assets = new AssetManager();
		assets.load("background.png", Texture.class);
		assets.load("wizardSheet.png", Texture.class);
		assets.finishLoading();
		
		setScreen(new CombatScreen());
	}
}