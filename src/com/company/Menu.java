package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

import static com.company.Bird.addObservation;
import static com.company.BirdDatabase.*;
import static com.company.BirdDatabase.showBird;
import static com.company.Main.*;

public class Menu {

    //************************************************************************************
    //************************************ COLOURS ***************************************
    //************************************************************************************

    // Declaring ANSI_RESET so that we can reset the declarations
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration

    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String YELLOW_BRIGHT = "\033[0;93m";

    // Declaring the color background
    // Custom declaration
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    // Declaring the font type
    // Custom declaration
    public static final String ANSI_BOLD = "\u001B[1m";

    //************************************************************************************
    //********************************** MAIN MENU ***************************************
    //************************************************************************************

    public static void menu() {
        System.out.println(ANSI_YELLOW_BACKGROUND+"                            "+ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.print("           "+YELLOW_UNDERLINED+ANSI_BOLD+"MENU"+ANSI_RESET+"           ");
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 0. Quit                  "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 1. Add Bird              "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 2. Modify Bird           "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 3. Delete Bird           "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 4. Add Observation       "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 5. Show Bird             "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 6. Show All Birds        "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 7. User Statistics       "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+"                            "+ANSI_RESET);
    }

    public static void menuOptions(ArrayList<Bird> birdList){
        while (true) {
            menu();
            String value = ask(scanner, "Choose an option:"); //with the method ask, we give a value to choose
                                                                                  //the different cases of the switch
            switch (value) {
                case "0" -> {return;}
                case "1" -> addBird(birdList);
                case "2" -> search(birdList, 1);
                case "3" -> search(birdList, 2); //delete
                case "4" -> search(birdList, 3); //add
                case "5" -> search(birdList, 4);
                case "6" -> showAllBirds(birdList);
                case "7" -> statistics(birdList);
                default -> System.out.println("Invalid option\n");
            }
        }
    }

    //************************************************************************************
    //********************************** MODIFYING ***************************************
    //************************************************************************************

    public static void modifyMenu() {
        System.out.println(ANSI_YELLOW_BACKGROUND+"                            "+ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.print("          "+YELLOW_UNDERLINED+ANSI_BOLD+"MODIFY"+ANSI_RESET+"          ");
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 0. Return to Search Menu "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 1. Modify Name           "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 2. Modify Latin Name     "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 3. Modify Observation    "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 4. Show Bird             "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+"                            "+ANSI_RESET);
    }

    public static void modifyOptions(Bird bird){
        while (true) {
            modifyMenu();
            String value = ask(scanner, "Choose an option:"); //with the method ask, we give a value to choose
                                                                                  //the different cases of the switch
            switch (value) {
                case "0" -> {return;}
                case "1" -> bird.setName(ask(scanner, "New name:"));
                case "2" -> bird.setNameLatin(ask(scanner, "New latin name:"));
                case "3" -> bird.setObservations(Integer.parseInt(ask(scanner, "New number of observations:")));
                case "4" -> System.out.println(bird.toString());
                default -> System.out.println("Invalid option\n");
            }
        }
    }

    //*************************************************************************************
    //*********************************** DELETING ****************************************
    //*************************************************************************************

    public static void deleteBird(Bird bird, ArrayList<Bird> birdList){
        System.out.println("The bird has been deleted");
        birdList.remove(bird);
    }

    //*************************************************************************************
    //*********************************** SEARCHING ***************************************
    //*************************************************************************************

    public static void search(ArrayList<Bird> birdList, int from) {
        while (true) {
            searchMenu();
            String optionSubMenu = ask(scanner, "Choose an option: ");
            switch (optionSubMenu) {
                case "0" -> {
                    return;
                }
                case "1" -> {
                    String nameBird = ask(scanner, "Write the bird's name: ");
                    for (Bird bird : birdList) {
                        if (bird.getName().equalsIgnoreCase(nameBird)) {
                            searchSwitch(from, bird, birdList);
                            return;
                        }
                    }
                    System.out.println("Bird not found");
                }
                case "2" -> {
                    String latinBird = ask(scanner, "Write the bird's latin name: ");
                    for (Bird bird : birdList) {
                        if (bird.getNameLatin().equalsIgnoreCase(latinBird)) {
                            searchSwitch(from, bird, birdList);
                            return;
                        }
                    }
                    System.out.println("Bird not found");
                }
                default -> System.out.println("Invalid option");
            }
        }
    }


    //with the method search we access 4 different methods using a switch case
    public static void searchSwitch(int from, Bird bird, ArrayList<Bird> birdList){
        switch (from) {
            case 1 -> modifyOptions(bird);
            case 2 -> deleteBird(bird, birdList);
            case 3 -> addObservation(bird);
            case 4 -> showBird(bird);
        }
    }

    public static void searchMenu() {
        System.out.println(ANSI_YELLOW_BACKGROUND+"                                "+ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.print("            "+YELLOW_UNDERLINED+ANSI_BOLD+"SEARCH"+ANSI_RESET+"            ");
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 0. Return to Main Menu       "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 1. Search Bird by Name       "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET+" 2. Search Bird by Latin Name "+ANSI_YELLOW_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+"                                "+ANSI_RESET);
    }

}
