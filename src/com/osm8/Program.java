package com.osm8;

public class Program {
    int size;
    String name;

    public Program(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public void run(){
        System.out.printf("Running %s", name);
    }
}
