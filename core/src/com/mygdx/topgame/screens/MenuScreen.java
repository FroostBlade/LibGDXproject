package com.mygdx.topgame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.topgame.Knight;


public class MenuScreen implements Screen {

	Stage stage;
	final Knight knight;
	private Table table;

	public MenuScreen(final Knight knight1) {

		knight = knight1;

		stage = new Stage(new ScreenViewport());

		TextureRegion downRegionStartBut = new TextureRegion(new Texture(Gdx.files.internal("images/Menu-01.png")));
		TextureRegion upRegionStartBut = new TextureRegion(new Texture(Gdx.files.internal("images/Menu-01.png")));
		TextureRegion downRegionExitBut = new TextureRegion(new Texture(Gdx.files.internal("images/Menu-02.png")));
		TextureRegion upRegionExitBut = new TextureRegion(new Texture(Gdx.files.internal("images/Menu-02.png")));
		TextButton.TextButtonStyle styleStartButton = new TextButton.TextButtonStyle();
		styleStartButton.up = new TextureRegionDrawable(downRegionStartBut);
		styleStartButton.down = new TextureRegionDrawable(upRegionStartBut);
		Button StartBut = new Button(styleStartButton);
		//StartBut.setPosition(240, 300);
		TextButton.TextButtonStyle styleExitButton = new TextButton.TextButtonStyle();
		styleExitButton.up = new TextureRegionDrawable(downRegionExitBut);
		styleExitButton.down = new TextureRegionDrawable(upRegionExitBut);
		Button ExitBut = new Button(styleExitButton);
		//ExitBut.setPosition(240,100);

		StartBut.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
				knight.setScreen(new GameScreen(knight));
				dispose();
			}
		});

		ExitBut.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
				Gdx.app.exit();
				dispose();
			}
		});

		stage.addActor(StartBut);
		stage.addActor(ExitBut);

		table = new Table();
		table.setFillParent(true);

		table.add(StartBut);
		table.row();
		table.add(ExitBut);
		stage.addActor(table);

		Gdx.input.setInputProcessor(stage);
		Gdx.input.setCatchBackKey(true);

	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(delta);
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose () {
		stage.dispose();
		knight.dispose();
	}
}
