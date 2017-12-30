package com.mygdx.topgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.topgame.StartGame;
import com.mygdx.topgame.obj.BackgroundActor;
import com.mygdx.topgame.obj.CloudActor;

/**
 * Created by Dmitry on 24.12.2017.
 */

class GameScreen implements Screen {

    final StartGame startGame;
    BackgroundActor background;
    CloudActor cloudActor;
    Stage stage;
    TextureAtlas backgroundObj;

    public GameScreen(final StartGame startGame1) {
        stage = new Stage(new ScreenViewport());
        startGame = startGame1;
        backgroundObj = new TextureAtlas(Gdx.files.internal("images/Background/BackGround.atlas"));
        background = new BackgroundActor();
        background.setPosition(0, 0);

        cloudActor = new CloudActor(backgroundObj);
        cloudActor.setPosition(20,100);
        //cloudActor.addAction(Actions.color(Color.BLACK, 2));
        //cloudActor.addAction(Actions.moveTo(100, 100, 1));

        stage.addActor(background);
        stage.addActor(cloudActor);

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
    public void dispose() {
        startGame.dispose();
        stage.dispose();
    }

}
