package com.mygdx.topgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.topgame.StartGame;
import com.mygdx.topgame.obj.BackgroundActor;
import com.mygdx.topgame.obj.ImageActor;

/**
 * Created by Dmitry on 24.12.2017.
 */

class GameScreen implements Screen {

    final StartGame startGame;
    BackgroundActor background;
    ImageActor BackGroud_Cloud_1;
    ImageActor BackGroud_Cloud_2;
    ImageActor BackGroud_Cloud_3;
    ImageActor BackGroud_Black_Cloud_1;
    ImageActor BackGroud_Black_Cloud_2;
    ImageActor BackGroud_Black_Cloud_3;
    Stage stage;
    TextureAtlas backgroundObj;

    public GameScreen(final StartGame startGame1) {
        stage = new Stage(new ScreenViewport());
        startGame = startGame1;
        backgroundObj = new TextureAtlas(Gdx.files.internal("images/Background/BackGround.atlas"));

        background = new BackgroundActor();
        background.setPosition(0, 0);
        stage.addActor(background);

        BackGroud_Black_Cloud_1 = new ImageActor(backgroundObj, "LandScreen_black_cloud1");
        BackGroud_Black_Cloud_1.setPosition(30,370);
        BackGroud_Black_Cloud_1.setSize(370, 70);
        BackGroud_Black_Cloud_1.addAction(Actions.forever(
                Actions.sequence(
                        Actions.moveTo(50, 370, 2.3f),
                        Actions.moveTo(30, 370, 2.3f)
                )
        ));
        stage.addActor(BackGroud_Black_Cloud_1);

        BackGroud_Black_Cloud_2 = new ImageActor(backgroundObj, "LandScreen_black_cloud2");
        BackGroud_Black_Cloud_2.setPosition(120,30);
        BackGroud_Black_Cloud_2.setSize(500, 54);
        BackGroud_Black_Cloud_2.addAction(Actions.forever(
                Actions.sequence(
                        Actions.moveTo(150, 30, 3f),
                        Actions.moveTo(120, 30, 3f)
                )
        ));
        stage.addActor(BackGroud_Black_Cloud_2);

        BackGroud_Black_Cloud_3 = new ImageActor(backgroundObj, "LandScreen_black_cloud3");
        BackGroud_Black_Cloud_3.setPosition(500,376);
        BackGroud_Black_Cloud_3.setSize(270, 78);
        BackGroud_Black_Cloud_3.addAction(Actions.forever(
                Actions.sequence(
                        Actions.moveTo(530, 376, 2.4f),
                        Actions.moveTo(500, 376, 2.4f)
                )
        ));
        stage.addActor(BackGroud_Black_Cloud_3);

        BackGroud_Cloud_1 = new ImageActor(backgroundObj, "LandScreen_cloud1");
        BackGroud_Cloud_1.setPosition(80,340);
        BackGroud_Cloud_1.setSize(155, 83);
        BackGroud_Cloud_1.addAction(Actions.forever(
                Actions.sequence(

                )
        ));
        stage.addActor(BackGroud_Cloud_1);

        BackGroud_Cloud_2 = new ImageActor(backgroundObj, "LandScreen_cloud2");
        BackGroud_Cloud_2.setPosition(320,360);
        BackGroud_Cloud_2.setSize(165, 89);
        stage.addActor(BackGroud_Cloud_2);

        BackGroud_Cloud_3 = new ImageActor(backgroundObj, "LandScreen_cloud3");
        BackGroud_Cloud_3.setPosition(620,320);
        BackGroud_Cloud_3.setSize(130, 70);
        BackGroud_Cloud_3.addAction(Actions.forever(
                Actions.sequence(

                )
        ));
        stage.addActor(BackGroud_Cloud_3);

        Gdx.input.setInputProcessor(stage);
        Gdx.input.setCatchBackKey(true);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        //Gdx.gl.glClearColor(0, 0, 0, 1);
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
