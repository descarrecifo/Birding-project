package com.company.view;

import com.company.frontcontroller.FrontController;

import com.company.model.Bird;
import com.company.utils.Utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.YELLOW_BRIGHT;


public class IOView {

    public static void mainLoopView(ArrayList<Bird> birds) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            MenuView.mainMenu();
            String value = Utilities.menuOption(reader);
            switch (value) {
                case "0" -> {
                    return;
                }
                case "1" -> addBird(reader, birds);
                case "2" -> FrontController.mainLoopController(null, "2", birds);
                case "3" -> FrontController.mainLoopController(null, "3", birds);
                case "4" -> FrontController.mainLoopController(null, "4", birds);
                case "5" -> FrontController.mainLoopController(null, "5", birds);
                case "6" -> FrontController.mainLoopController(null, "6", birds);
                case "7" -> FrontController.mainLoopController(null, "7", birds);
                default -> System.out.println("Invalid option\n");
            }
        }
    }

    //************************************************************************************
    //*********************************** ADDING *****************************************
    //************************************************************************************

    public static void addBird(Scanner reader, ArrayList<Bird> birds) {
        try {
            int quantity = Integer.parseInt(Utilities.askOption(reader, "6", null, null));
            for (int i = 1; i <= quantity; i++) {
                String name = Utilities.askOption(reader, "9", null, i);
                String nameLatin = Utilities.askOption(reader, "10", null, i);
                String observations = Utilities.askOption(reader, "11", null, i);
                String nameFirst = name.substring(0, 1).toUpperCase(); //capitalize first letter
                String nameRest = name.substring(1).toLowerCase();    //lowercase the rest of letters
                String nameLatinFirst = nameLatin.substring(0, 1).toUpperCase();
                String nameLatinRest = nameLatin.substring(1).toLowerCase();
                //create hashmap to send data to controller
                HashMap<String, String> dataFromViewToController = new HashMap<>();
                //fill data hashmap object
                dataFromViewToController.put("operation", "addBird");
                dataFromViewToController.put("name", nameFirst + nameRest);
                dataFromViewToController.put("nameLatin", nameLatinFirst + nameLatinRest);
                dataFromViewToController.put("observations", observations);
                //send data to controller
                FrontController.mainLoopController(dataFromViewToController, "1", birds);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect input, you need to enter a number");
        }

    }


    //*************************************************************************************
    //******************************* ADD OBSERVATION *************************************
    //*************************************************************************************

    public static void addObservation(Bird bird, Scanner reader){
        int ObsNum = Integer.parseInt(Utilities.askOption(reader, "8", bird, null));
        bird.setObservations(bird.getObservations()+ObsNum);
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
