package com.mygdx.topgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.topgame.StartGame;
import com.mygdx.topgame.obj.ImageActor;

/**
 * Created by Dmitry on 24.12.2017.
 */

class GameScreen implements Screen {

    private final StartGame startGame;
    private Stage stage;

    public GameScreen(final StartGame startGame1) {
        stage = new Stage(new ScreenViewport());
        startGame = startGame1;
        TextureAtlas backgroundObj = new TextureAtlas(Gdx.files.internal("images/Background/BackGround.atlas"));

        ImageActor background = new ImageActor("images/Background/LandScreen_main.png");
        background.setPosition(0, 0);
        background.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        stage.addActor(background);

        ImageActor BackGroud_Black_Cloud_1 = new ImageActor(backgroundObj, "LandScreen_black_cloud1");
        BackGroud_Black_Cloud_1.setPosition(30,370);
        BackGroud_Black_Cloud_1.setSize(370, 70);
        BackGroud_Black_Cloud_1.addAction(Actions.forever(
                Actions.sequence(
                        Actions.moveTo(50, 370, 2.3f),
                        Actions.moveTo(30, 370, 2.3f)
                )
        ));
        stage.addActor(BackGroud_Black_Cloud_1);

        ImageActor BackGroud_Black_Cloud_2 = new ImageActor(backgroundObj, "LandScreen_black_cloud2");
        BackGroud_Black_Cloud_2.setPosition(120,30);
        BackGroud_Black_Cloud_2.setSize(500, 54);
        BackGroud_Black_Cloud_2.addAction(Actions.forever(
                Actions.sequence(
                        Actions.moveTo(150, 30, 3f),
                        Actions.moveTo(120, 30, 3f)
                )
        ));
        stage.addActor(BackGroud_Black_Cloud_2);

        ImageActor BackGroud_Black_Cloud_3 = new ImageActor(backgroundObj, "LandScreen_black_cloud3");
        BackGroud_Black_Cloud_3.setPosition(500,376);
        BackGroud_Black_Cloud_3.setSize(270, 78);
        BackGroud_Black_Cloud_3.addAction(Actions.forever(
                Actions.sequence(
                        Actions.moveTo(530, 376, 2.4f),
                        Actions.moveTo(500, 376, 2.4f)
                )
        ));
        stage.addActor(BackGroud_Black_Cloud_3);

        ImageActor BackGroud_Cloud_1 = new ImageActor(backgroundObj, "LandScreen_cloud1");
        BackGroud_Cloud_1.setPosition(80,340);
        BackGroud_Cloud_1.setSize(155, 83);
        BackGroud_Cloud_1.addAction(Actions.forever(
                Actions.sequence(
                        Actions.moveTo(75, 338, 0.8f),
                        Actions.moveTo(70, 330, 0.8f),
                        Actions.moveTo(60, 333, 1f),
                        Actions.parallel(
                                Actions.moveTo(62, 333, 0.5f),
                                Actions.alpha(0.7f, 0.5f)
                        ),
                        Actions.moveTo(65, 336, 0.3f),
                        Actions.moveTo(70, 339, 0.3f),
                        Actions.moveTo(75, 341, 0.3f),
                        Actions.parallel(
                                Actions.moveTo(80, 340, 0.3f),
                                Actions.alpha(1f, 0.3f)
                        )
                )
        ));
        stage.addActor(BackGroud_Cloud_1);

        ImageActor BackGroud_Cloud_2 = new ImageActor(backgroundObj, "LandScreen_cloud2");
        BackGroud_Cloud_2.setPosition(325,375);
        BackGroud_Cloud_2.setSize(165, 89);
        BackGroud_Cloud_2.addAction(Actions.forever(
                Actions.sequence(
                        Actions.parallel(
                                Actions.moveTo(320, 365, 1.2f),
                                Actions.alpha(0.5f, 1.2f)
                        ),
                        Actions.parallel(
                                Actions.moveTo(325, 375,1.2f),
                                Actions.alpha(0.9f,1.2f)
                        )
                )
        ));
        stage.addActor(BackGroud_Cloud_2);

        ImageActor BackGroud_Cloud_3 = new ImageActor(backgroundObj, "LandScreen_cloud3");
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
        //stage.getActors().items[0].setSize(width, height);
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
