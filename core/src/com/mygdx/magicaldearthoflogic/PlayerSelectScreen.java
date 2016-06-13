package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class PlayerSelectScreen implements Screen
{
	int WORLD_WIDTH = 600;
	int WORLD_HEIGHT = 800;
	
	private SpriteBatch batch;
	private OrthographicCamera camera;
	public Stage stage;
	
	public PlayerSelectScreen()
	{
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Viewport viewport = new FitViewport(WORLD_WIDTH, WORLD_HEIGHT, camera);
        stage = new Stage(viewport, batch);
        
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