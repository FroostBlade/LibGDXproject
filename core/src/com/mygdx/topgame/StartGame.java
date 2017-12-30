package com.mygdx.topgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.mygdx.topgame.screens.MenuScreen;
import com.mygdx.topgame.utils.XMLparse;

import java.util.HashMap;

/**
 * Created by Dmitry on 25.12.2017.
 */


public class StartGame extends Game {

    private static final String FONT_CHARACTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;,{}\"´`'<>";
    public BitmapFont font, levels;
    public HashMap<String, String> langStr = new HashMap<String, String>();

    @Override
    public void create() {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/russoone.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter param = new FreeTypeFontGenerator.FreeTypeFontParameter();
        param.size = Gdx.graphics.getHeight() / 18;
        param.characters = FONT_CHARACTERS;
        font = generator.generateFont(param);
        param.size = Gdx.graphics.getHeight() / 20;
        levels = generator.generateFont(param);
        font.setColor(Color.WHITE);
        levels.setColor(Color.WHITE);
        generator.dispose();

        /*
        background texture
         */

//        XMLparse xmlParse = new XMLparse();
//        String locale = java.util.Locale.getDefault().toString().split("_")[0];
//        langStr = xmlParse.XMLparseLangs(locale);
//
        this.setScreen(new MenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }
}
