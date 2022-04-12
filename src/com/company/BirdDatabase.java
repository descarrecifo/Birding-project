package com.company;

import java.util.ArrayList;

import static com.company.Main.*;

public class BirdDatabase {

    //************************************************************************************
    //*********************************** ADDING *****************************************
    //************************************************************************************

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
    //************************************ SHOWING  **************************************
    //************************************************************************************

    public static void showBird(Bird bird){
        System.out.println(bird.toString());
    }

    public static void showAllBirds(ArrayList<Bird> birdList){
        for (Bird bird : birdList) {
            showBird(bird);
        }
    }

    //************************************************************************************
    //******************************** STATISTICS ****************************************
    //************************************************************************************

    public static void statistics(ArrayList<Bird> birdList){
        int qty = 0;
        String nameBird = "";
        ArrayList<Bird> statisticsList = new ArrayList<>();
        for (Bird bird : birdList){ //check if the bird's number of observations is the biggest
            if (bird.getObservations() >= qty) qty = bird.getObservations();
        }
        for (Bird bird : birdList){ //check if more than one bird has the biggest number of observations
            if(bird.getObservations() == qty) statisticsList.add(bird);
        }
        if(birdList.size()==1) System.out.println("The user has seen "+birdList.size()+" bird.");
        else System.out.println("The user has seen "+birdList.size()+" birds.");
        if(birdList.size()>0){ //print different messages for different sizes of the bird list and if one or more have the biggest num of observations
            if(statisticsList.size()==1) System.out.println("The bird most seen was "+nameBird+" with "+qty+" observations.");
            else{
                System.out.print("The birds most seen were ");
                int i = 0;
                while(i<(statisticsList.size()-1)){
                    System.out.print(statisticsList.get(i).getName()+", ");
                    i++;
                }
                System.out.print(statisticsList.get(statisticsList.size()-1).getName());
                System.out.println(" with "+qty+" observations.");
            }
        }
    }
}


