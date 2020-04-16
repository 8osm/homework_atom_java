package com.osm8;

import com.osm8.impl.Game;
import com.osm8.impl.Music;

public class Main {

    public static void main(String[] args) {
	    IPlay game = new Game(5, "Flappy Bird", "Mobile Game");
	    IPlay song = new Music("Industrial metal", "Sonne");
	    
	    game.play();
	    song.play();

	    game.stop();
	    song.stop();
    }
}
