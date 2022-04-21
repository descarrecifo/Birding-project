package com.company.model;

import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birds;

    public BirdList(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    public static ArrayList<Bird> newBirdsArray() {
        return new ArrayList<>();
    }
}
