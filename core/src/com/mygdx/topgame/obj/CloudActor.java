package com.mygdx.topgame.obj;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by Dmitry on 30.12.2017.
 */

public class CloudActor extends Image {
    TextureRegion texture;

    public CloudActor(TextureAtlas textureAtlas, String name) {
        texture = textureAtlas.findRegion(name);
    }

//    public void act (float delta){
////        super.act(delta);
////    }

    public void draw (Batch batch, float parentAlpha){
        super.draw(batch, parentAlpha);
        //batch.setColor(this.getColor());
//        ((TextureRegionDrawable)getDrawable()).draw(batch,
//                this.getX(), this.getY(),
//                this.getOriginX(), this.getOriginY(),
//                this.getWidth(), this.getHeight(),
//                this.getScaleX(), this.getScaleY(),
//                this.getRotation()
//        );
        batch.draw(texture, this.getX(), this.getY(),
                this.getOriginX(), this.getOriginY(),
                this.getWidth(), this.getHeight(),
                this.getScaleX(), this.getScaleY(),
                this.getRotation());
    }
}
