package com.osm8.impl;

import com.osm8.IPlay;

public class Music implements IPlay {

    String genre;
    String name;

    public Music(String genre, String name) {
        this.genre = genre;
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf("Playing song %s of genre %s\n", name, genre);
    }
}
