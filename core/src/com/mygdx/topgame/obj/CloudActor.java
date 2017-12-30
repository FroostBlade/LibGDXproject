package com.mygdx.topgame.obj;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Dmitry on 30.12.2017.
 */

public class CloudActor extends Actor {
    private TextureAtlas textureAtlas;
    private Animation animation;
    private float x = 0;
    private boolean upDown = true;

    public CloudActor(TextureAtlas textureAtlas) {
        this.textureAtlas = textureAtlas;
    }

    public void act (float delta){
        super.act(delta);
    }

    public void draw (Batch batch, float parentAlpha){
        super.draw(batch, parentAlpha);
        x += Gdx.graphics.getDeltaTime();
        //batch.draw((TextureRegion) animation.getKeyFrame(stateTime, true), 10, 10);
        batch.draw(textureAtlas.findRegion("LandScreen_black_cloud1"), x*5, 0, 263, 36);


//        if (upDown) {
//            x++;
//            if (x==500) upDown = false;
//        }
//        if (upDown = false) {
//            x--;
//            if (x==0) upDown = true;
//        }
    }
}
