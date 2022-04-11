package com.company;

import java.util.ArrayList;

import static com.company.Bird.addObservation;
import static com.company.Main.*;

public class Menu {

    //************************************************************************************
    //********************************** MAIN MENU ***************************************
    //************************************************************************************

    public static void menu() {
        System.out.println("****************************");
        System.out.println("*           MENU           *");
        System.out.println("* 0. Quit                  *");
        System.out.println("* 1. Add Bird              *");
        System.out.println("* 2. Modify Bird           *");
        System.out.println("* 3. Add Observation       *");
        System.out.println("* 4. Show Bird             *");
        System.out.println("* 5. Show All Birds        *");
        System.out.println("****************************");
    }

    public static void menuOptions(ArrayList<Bird> birdList){
        while (true) {
            menu();
            int value = Integer.parseInt(ask(scanner, "Choose an option:")); //with the method ask, we give a value to choose
            //the different cases of the switch
            switch (value) {
                case 0 -> {return;}
                case 1 -> addBird();
                case 2 -> search(birdList, 1);
                case 3 -> search(birdList, 2);
                case 4 -> search(birdList, 3);
                case 5 -> showAllBirds();
                default -> System.out.println("Invalid option\n");
            }
        }
    }

    //************************************************************************************
    //********************************** MODIFYING ***************************************
    //************************************************************************************

    public static void modifyMenu() {
        System.out.println("****************************");
        System.out.println("*           MODIFY         *");
        System.out.println("* 0. Return to Search Menu *");
        System.out.println("* 1. Modify Name           *");
        System.out.println("* 2. Modify Latin Name     *");
        System.out.println("* 3. Modify Observation    *");
        System.out.println("* 4. See Bird              *");
        System.out.println("****************************");
    }

    public static void modifyOptions(Bird bird){
        while (true) {
            modifyMenu();
            int value = Integer.parseInt(ask(scanner, "Choose an option:")); //with the method ask, we give a value to choose
                                                                                  //the different cases of the switch
            switch (value) {
                case 0 -> {return;}
                case 1 -> bird.setName(ask(scanner, "New name:"));
                case 2 -> bird.setNameLatin(ask(scanner, "New latin name:"));
                case 3 -> bird.setObservations(Integer.parseInt(ask(scanner, "New number of observations:")));
                case 4 -> System.out.println(bird.toString());
                default -> System.out.println("Invalid option\n");
            }
        }
    }

    //*************************************************************************************
    //*********************************** SEARCHING ***************************************
    //*************************************************************************************

    public static void search(ArrayList<Bird> birdList, int from) {
        while (true) {
            searchMenu();
            int optionSubMenu = Integer.parseInt(ask(scanner, "Choose an option: "));
            switch (optionSubMenu) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    String nameBird = ask(scanner, "Write the bird's name: ");
                    for (Bird bird : birdList) {
                        if (bird.getName().equalsIgnoreCase(nameBird)) {
                            searchSwitch(from, bird);
                            break;
                        }
                    }
                }
                case 2 -> {
                    String latinBird = ask(scanner, "Write the bird's latin name: ");
                    for (Bird bird : birdList) {
                        if (bird.getNameLatin().equalsIgnoreCase(latinBird)) {
                            searchSwitch(from, bird);
                            break;
                        }
                    }
                }
                default -> System.out.println("Invalid option");
            }
        }
    }


    //with the method search we access 3 different methods using a switch case
    public static void searchSwitch(int from, Bird bird){
        switch (from) {
            case 1 -> modifyOptions(bird);
            case 2 -> addObservation(bird);
            case 3 -> showBird(bird);
        }
    }

    public static void searchMenu() {
        System.out.println("********************************");
        System.out.println("*            SEARCH            *");
        System.out.println("* 0. Return to Main Menu       *");
        System.out.println("* 1. Search Bird by Name       *");
        System.out.println("* 2. Search Bird by Latin Name *");
        System.out.println("********************************");
    }

}
