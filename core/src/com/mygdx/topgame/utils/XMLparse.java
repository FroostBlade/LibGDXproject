package com.mygdx.topgame.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.XmlReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitry on 25.12.2017.
 */

public class XMLparse {

    public HashMap<String, String> XMLparseLangs(String lang) {
        HashMap<String, String> langs = new HashMap<String, String>();
        XmlReader.Element root = new XmlReader().parse(Gdx.files.internal("xml/langs.xml"));
        Array<XmlReader.Element> xml_langs = root.getChildrenByName("lang");

        for (XmlReader.Element el : xml_langs) {
            if (el.getAttribute("key").equals(lang)) {
                Array<XmlReader.Element> xml_strings = el.getChildrenByName("string");
                for (XmlReader.Element e : xml_strings) {
                    langs.put(e.getAttribute("key"), e.getText());
                }
            } else if (el.getAttribute("key").equals("en")) {
                Array<XmlReader.Element> xml_strings = el.getChildrenByName("string");
                for (XmlReader.Element e : xml_strings) {
                    langs.put(e.getAttribute("key"), e.getText());
                }
            }
        }
        return langs;
    }
}
