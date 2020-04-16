package com.osm8;

public interface IPlay {

    default void stop(){
        System.out.println("Stopped");
    }

    void play();
}
