package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

public class MDLGame extends Game
{
	public AssetManager manager;
	
	public void create() 
	{
		
		setScreen(new GameScreen());
	}

}