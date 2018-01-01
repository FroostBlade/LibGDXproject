package com.mygdx.topgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.topgame.StartGame;


public class MenuScreen implements Screen {

	private Stage stage;
	private final StartGame startGame;

	public MenuScreen(final StartGame startGame1) {

		startGame = startGame1;
		stage = new Stage(new ScreenViewport());

		Texture but = new Texture("images/Buttons/Menu_Button1.png");


		TextureRegion button = new TextureRegion(new Texture(Gdx.files.internal("images/Buttons/Menu_Button1.png")));
		TextureRegion buttonBright = new TextureRegion(new Texture(Gdx.files.internal("images/Buttons/Menu_ButtonDown1.png")));
		TextureRegion buttonDown = new TextureRegion(new Texture(Gdx.files.internal("images/Buttons/Menu_ButtonDown2.png")));

		TextButton.TextButtonStyle styleStartButton = new TextButton.TextButtonStyle();
		styleStartButton.up = new TextureRegionDrawable(button);
		styleStartButton.down = new TextureRegionDrawable(buttonDown);
		styleStartButton.over = new TextureRegionDrawable(buttonBright);

		styleStartButton.font = new BitmapFont();

		TextButton startBut = new TextButton("Играть", styleStartButton);
		TextButton extButton = new TextButton("Выход", styleStartButton);

		startBut.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
				startGame.setScreen(new GameScreen(startGame));
				dispose();
			}
		});

		extButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
				Gdx.app.exit();
				dispose();
			}
		});

		Table table = new Table();
		table.setFillParent(true);

		table.add(startBut);
		table.row();
		table.add(extButton);
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
		startGame.dispose();
	}
}
