package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class MDLGame extends Game
{
	public static AssetManager assets;
	
	public void create() 
	{
		assets = new AssetManager();
		assets.load("background.png", Texture.class);
		assets.load("redBar.png", Texture.class);
		assets.load("greenBar.png", Texture.class);
		assets.load("wizardSheet.png", Texture.class);
		assets.load("companionSheet.png", Texture.class);
		assets.load("smallSlimeSheet.png", Texture.class);
		assets.load("mediumSlimeSheet.png", Texture.class);
		assets.load("largeSlimeSheet.png", Texture.class);
		assets.finishLoading();
		
		setScreen(new CombatScreen());
	}
}