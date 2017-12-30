package com.mygdx.topgame.obj;

import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by Dmitry on 30.12.2017.
 */

public class ImageActor extends Image {
    TextureRegion texture;

    public ImageActor(TextureAtlas textureAtlas, String name) {
        texture = textureAtlas.findRegion(name);
    }

    public void draw (Batch batch, float parentAlpha){
        super.draw(batch, parentAlpha);
        batch.draw(texture, this.getX(), this.getY(),
                this.getOriginX(), this.getOriginY(),
                this.getWidth(), this.getHeight(),
                this.getScaleX(), this.getScaleY(),
                this.getRotation());
    }
}
