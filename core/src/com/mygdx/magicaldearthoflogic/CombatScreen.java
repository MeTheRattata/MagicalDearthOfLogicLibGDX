package com.mygdx.magicaldearthoflogic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class CombatScreen implements Screen
{
	int WORLD_WIDTH = 672;
	int WORLD_HEIGHT = 480;
	
	public static SpriteBatch batch;
	private OrthographicCamera camera;
	public static Stage stage;
	
	public CombatScreen()
	{
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Viewport viewport = new FitViewport(WORLD_WIDTH, WORLD_HEIGHT, camera);
        stage = new Stage(viewport, batch);
        Image backgroundActor = new Image((MDLGame.assets.get("background.png", Texture.class)));
        backgroundActor.setScale(4);
        
        stage.addActor(backgroundActor);
        stage.addActor(new Entity("wizard"));
        
	}
	
	public void render(float delta) 
	{
		Gdx.gl.glClearColor(10/255.0f, 15/255.0f, 230/255.0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //Gdx.app.log("GameScreen FPS", (1/delta) + "");
        
        stage.draw();
	}
	public void show() {}
	public void resize(int width, int height) {}
	public void pause() {}
	public void resume() {}
	public void hide() {}
	public void dispose() {}
}