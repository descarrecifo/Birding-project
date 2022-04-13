package com.company;

import java.util.ArrayList;
import java.util.Locale;

import static com.company.Main.*;
import static com.company.Menu.ANSI_RESET;
import static com.company.Menu.YELLOW_BRIGHT;

public class BirdDatabase {

    //************************************************************************************
    //*********************************** ADDING *****************************************
    //************************************************************************************

    public static void addBird(ArrayList<Bird> birdList) {
        //ask(scanner, "How many birds do you want to add?");
        try{
            int quantity = Integer.parseInt(ask(scanner,"How many birds do you want to add?"));
            for (int i = 1; i<=quantity; i++){
                String name =  ask(scanner, "Name of Bird "+YELLOW_BRIGHT+i+ANSI_RESET+": ");
                String nameLatin = ask(scanner, "Latin Name of Bird "+YELLOW_BRIGHT+i+ANSI_RESET+": ");
                int observations = Integer.parseInt(ask(scanner, "Number of Observations of Bird "+YELLOW_BRIGHT+i+ANSI_RESET+": "));
                String nameFirst = name.substring(0, 1).toUpperCase(); //capitalize first letter
                String nameRest = name.substring(1).toLowerCase();    //lowercase the rest of letters
                String nameLatinFirst = nameLatin.substring(0, 1).toUpperCase();
                String nameLatinRest = nameLatin.substring(1).toLowerCase();
                birdList.add(new Bird(nameFirst+nameRest, nameLatinFirst+nameLatinRest, observations));
            }
        }catch (NumberFormatException ex) {
            System.out.println("Incorrect input, you need to enter a number");
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
            if (bird.getObservations() >= qty) {
                qty = bird.getObservations();
                nameBird = bird.getName();
            }
        }
        for (Bird bird : birdList){ //check if more than one bird has the biggest number of observations
            if(bird.getObservations() == qty) statisticsList.add(bird);
        }
        if(birdList.size()==1) System.out.println("The user has seen "+YELLOW_BRIGHT+birdList.size()+ANSI_RESET+" bird.");
        else System.out.println("The user has seen "+YELLOW_BRIGHT+birdList.size()+ANSI_RESET+" birds.");
        if(birdList.size()>0){ //print different messages for different sizes of the bird list and if one or more have the biggest num of observations
            if(statisticsList.size()==1) System.out.println("The bird most seen was "+YELLOW_BRIGHT+nameBird+ANSI_RESET+" with "+qty+" observations.");
            else{
                System.out.print("The birds most seen were ");
                int i = 0;
                while(i<(statisticsList.size()-1)){
                    System.out.print(YELLOW_BRIGHT+statisticsList.get(i).getName()+ANSI_RESET+", ");
                    i++;
                }
                System.out.print(YELLOW_BRIGHT+statisticsList.get(statisticsList.size()-1).getName()+ANSI_RESET);
                System.out.println(" with "+YELLOW_BRIGHT+qty+ANSI_RESET+" observations.");
            }
        }
    }
}


