package com.mygdx.topgame.obj;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Dmitry on 25.12.2017.
 */

public class BackgroundActor extends Actor {
    private Texture backgroundTexture;
    private Sprite backgroundSprite;

    public BackgroundActor() {
        backgroundTexture = new Texture("images/Background/LandScreen_main.png");
        backgroundSprite = new Sprite(backgroundTexture);
        backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    @Override
    public void draw(Batch batch, float alpha) {
        backgroundSprite.draw(batch);
    }
}