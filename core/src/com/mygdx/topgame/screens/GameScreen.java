package com.mygdx.topgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
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
    CloudActor BackGroud_Cloud_1;
    CloudActor BackGroud_Cloud_2;
    Stage stage;
    TextureAtlas backgroundObj;

    public GameScreen(final StartGame startGame1) {
        stage = new Stage(new ScreenViewport());
        startGame = startGame1;
        backgroundObj = new TextureAtlas(Gdx.files.internal("images/Background/BackGround.atlas"));

        background = new BackgroundActor();
        background.setPosition(0, 0);
        stage.addActor(background);

        BackGroud_Cloud_1 = new CloudActor(backgroundObj, "LandScreen_cloud1");
        BackGroud_Cloud_1.setPosition(100,340);
        BackGroud_Cloud_1.setRotation(40);
        BackGroud_Cloud_1.addAction(Actions.forever(Actions.sequence(
                    Actions.moveTo(100, 330, 1),
                    Actions.moveTo(100, 340, 1)
                ))
        );
        stage.addActor(BackGroud_Cloud_1);

        BackGroud_Cloud_2 = new CloudActor(backgroundObj, "LandScreen_cloud2");
        BackGroud_Cloud_2.setPosition(610,380);
        BackGroud_Cloud_2.addAction(Actions.sequence(Actions.fadeOut(0.15f), Actions.fadeIn(0.15f)));
        stage.addActor(BackGroud_Cloud_2);



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
