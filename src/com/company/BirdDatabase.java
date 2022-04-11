package com.company;

import java.util.ArrayList;

import static com.company.Main.*;

public class BirdDatabase {

    public static void addBird(ArrayList<Bird> birdList) {
        int quantity = Integer.parseInt(ask(scanner,"How many birds do you want to add?"));

        for (int i = 0; i<quantity; i++){
            String name =  ask(scanner, "Name of Bird "+i+": ");
            String nameLatin = ask(scanner, "Latin Name of Bird "+i+": ");
            int observations = Integer.parseInt(ask(scanner, "Number of Observations of Bird "+i+": "));
            birdList.add(new Bird(name, nameLatin, observations));
        }
    }

    //************************************************************************************
    //****************************** SHOWING METHODS *************************************
    //************************************************************************************

    public static void showBird(Bird bird){
        System.out.println(bird.toString());
    }

    public static void showAllBirds(ArrayList<Bird> birdList){
        for (Bird bird : birdList) {
            showBird(bird);
        }
    }

}


