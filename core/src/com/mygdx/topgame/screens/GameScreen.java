package com.mygdx.topgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.topgame.Knight;
import com.mygdx.topgame.obj.BackgroundActor;

/**
 * Created by Dmitry on 24.12.2017.
 */

class GameScreen implements Screen {

    final Knight knight;
    BackgroundActor background;
    Stage stage;

    public GameScreen(final Knight knight1) {
        stage = new Stage(new ScreenViewport());
        knight = knight1;
        background = new BackgroundActor();
        background.setPosition(0, 0);

        stage.addActor(background);

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
        knight.dispose();
        stage.dispose();
    }
}
