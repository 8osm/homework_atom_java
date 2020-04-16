package com.osm8.impl;

import com.osm8.IPlay;
import com.osm8.Program;

public class Game extends Program implements IPlay {

    private int size;
    private String name;
    private String type;

    public Game(int size, String name, String type) {
        super(size, name);
        this.size = size;
        this.name = name;
        this.type = type;
    }

    @Override
    public void play() {
        System.out.printf("Playing game %s of type %s\n", name, type);
    }

    @Override
    public void run() {
        System.out.printf("Starting game %s\n", name);
    }

    public void run(int version){
        System.out.printf("Playing %s v%d\n", name, version);
    }
}
