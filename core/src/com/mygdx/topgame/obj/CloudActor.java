package com.mygdx.topgame.obj;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Dmitry on 30.12.2017.
 */

public class CloudActor extends Actor {
    TextureRegion texture;

    public CloudActor(TextureAtlas textureAtlas, String name) {
        texture = textureAtlas.findRegion(name);
    }

    public void act (float delta){
        super.act(delta);
    }

    public void draw (Batch batch, float parentAlpha){
        super.draw(batch, parentAlpha);
        batch.draw(texture, this.getX(), this.getY(), 250, 135);
    }
}
