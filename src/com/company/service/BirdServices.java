package com.company.service;

import com.company.model.Bird;

import java.util.ArrayList;
import java.util.HashMap;

import static com.company.Menu.ANSI_RESET;
import static com.company.Menu.YELLOW_BRIGHT;

public class BirdServices {

    //************************************************************************************
    //*********************************** ADDING *****************************************
    //************************************************************************************

    public static Bird unpackHashmapBird(HashMap<String, String> dataToAddBird) {

        String name = dataToAddBird.get("name");
        String latinName = dataToAddBird.get("nameLatin");
        int observations = Integer.parseInt(dataToAddBird.get("observations"));

        return new Bird(name, latinName, observations);
    }

    //************************************************************************************
    //******************************** STATISTICS ****************************************
    //************************************************************************************

    public static void statistics(ArrayList<Bird> birdList) {
        int qty = 0;
        String nameBird = "";
        ArrayList<Bird> statisticsList = new ArrayList<>();
        for (Bird bird : birdList) { //check if the bird's number of observations is the biggest
            if (bird.getObservations() >= qty) {
                qty = bird.getObservations();
                nameBird = bird.getName();
            }
        }
        for (Bird bird : birdList) { //check if more than one bird has the biggest number of observations
            if (bird.getObservations() == qty) statisticsList.add(bird);
        }
        if (birdList.size() == 1)
            System.out.println("The user has seen " + YELLOW_BRIGHT + birdList.size() + ANSI_RESET + " bird.");
        else System.out.println("The user has seen " + YELLOW_BRIGHT + birdList.size() + ANSI_RESET + " birds.");
        if (birdList.size() > 0) { //print different messages for different sizes of the bird list and if one or more have the biggest num of observations
            if (statisticsList.size() == 1)
                System.out.println("The bird most seen was " + YELLOW_BRIGHT + nameBird + ANSI_RESET + " with " + qty + " observations.");
            else {
                System.out.print("The birds most seen were ");
                int i = 0;
                while (i < (statisticsList.size() - 1)) {
                    System.out.print(YELLOW_BRIGHT + statisticsList.get(i).getName() + ANSI_RESET + ", ");
                    i++;
                }
                System.out.print(YELLOW_BRIGHT + statisticsList.get(statisticsList.size() - 1).getName() + ANSI_RESET);
                System.out.println(" with " + YELLOW_BRIGHT + qty + ANSI_RESET + " observations.");
            }
        }
    }


}
