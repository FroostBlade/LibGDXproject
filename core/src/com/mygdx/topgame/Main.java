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


public class Main extends Game {

	SpriteBatch batch;
	Texture ExtBut;
	Texture StartBut;
	Stage stage;

	@Override
	public void create () {
		batch = new SpriteBatch();
		ExtBut = new Texture(Gdx.files.internal("Menu-02.png"));
		StartBut = new Texture(Gdx.files.internal("Menu-01.png"));
		stage = new Stage();

		Gdx.input.setInputProcessor(stage);
		TextureRegion downRegion = new TextureRegion(StartBut);
		TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
		style.down = new TextureRegionDrawable(downRegion);
		style.up = new TextureRegionDrawable(downRegion);
		Button but1 = new Button(style);
		but1.addListener(new ClickListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				Gdx.app.exit();
				return true;
			}
		});
		stage.addActor(but1);
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
		ExtBut.dispose();
		StartBut.dispose();
	}
}
