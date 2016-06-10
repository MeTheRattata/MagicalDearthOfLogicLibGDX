package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen implements Screen
{
	public GameScreen()
	{
		
	}
	
	public void render(float delta) 
	{
		Gdx.gl.glClearColor(10/255.0f, 15/255.0f, 230/255.0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.app.log("GameScreen FPS", (1/delta) + "");
	}
	public void show() {}
	public void resize(int width, int height) {}
	public void pause() {}
	public void resume() {}
	public void hide() {}
	public void dispose() {}
	
}