package com.mygdx.topgame.obj;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by Dmitry on 30.12.2017.
 */

public class ImageActor extends Image {
    TextureRegion texture;

    public ImageActor(String name) {
        texture = new TextureRegion(new Texture(name));
    }

    public ImageActor(TextureAtlas textureAtlas, String name) {
        texture = textureAtlas.findRegion(name);
    }

    public void draw (Batch batch, float parentAlpha){
        super.draw(batch, parentAlpha);
        batch.draw(texture, this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
