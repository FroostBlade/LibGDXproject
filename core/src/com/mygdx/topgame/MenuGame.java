package com.mygdx.topgame;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import java.awt.Font;

import static com.badlogic.gdx.Gdx.app;


public class MenuGame extends Game {

	SpriteBatch batch;
	Stage stage;

	@Override
	public void create () {
		batch = new SpriteBatch();
		stage = new Stage();

		Gdx.input.setInputProcessor(stage);
		TextureRegion downRegionStartBut = new TextureRegion(new Texture(Gdx.files.internal("Menu-01.png")));
		TextureRegion upRegionStartBut = new TextureRegion(new Texture(Gdx.files.internal("Menu-01.png")));
		TextureRegion downRegionExitBut = new TextureRegion(new Texture(Gdx.files.internal("Menu-02.png")));
		TextureRegion upRegionExitBut = new TextureRegion(new Texture(Gdx.files.internal("Menu-02.png")));
		TextButton.TextButtonStyle styleStartButton = new TextButton.TextButtonStyle();
		styleStartButton.up = new TextureRegionDrawable(downRegionStartBut);
		styleStartButton.down = new TextureRegionDrawable(upRegionStartBut);
		Button StartBut = new Button(styleStartButton);
		StartBut.setPosition(240, 300);
		TextButton.TextButtonStyle styleExitButton = new TextButton.TextButtonStyle();
		styleExitButton.up = new TextureRegionDrawable(downRegionExitBut);
		styleExitButton.down = new TextureRegionDrawable(upRegionExitBut);
		Button ExitBut = new Button(styleExitButton);
		ExitBut.setPosition(240,100);

		StartBut.addListener(new ClickListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				new GameScreen();
				return true;
			}
		});

		ExitBut.addListener(new ClickListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				Gdx.app.exit();
				return true;
			}
		});

		stage.addActor(StartBut);
		stage.addActor(ExitBut);
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
		batch.begin();
		batch.end();
	}

	@Override
	public void dispose () {
		stage.dispose();
	}
}
