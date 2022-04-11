package com.company;

import static com.company.Main.*;

public class Menu {

    public static void menu() {
        System.out.println("**********************");
        System.out.println("*        MENU        *");
        System.out.println("* 0. Quit            *");
        System.out.println("* 1. Add Bird        *");
        System.out.println("* 2. Modify Bird     *");
        System.out.println("* 3. Add Observation *");
        System.out.println("* 4. Show All        *");
        System.out.println("* 5. Search Bird     *");
        System.out.println("**********************");
    }

    public static void menuOptions(Bird testBird){
        while (true) {
            menu();
            int value = Integer.parseInt(ask(scanner, "Choose an option:")); //with the method ask, we give a value to choose
            //the different cases of the switch
            switch (value) {
                case 0 -> {return;}
                case 1 -> addBird();
                case 2 -> modifyBird(testBird);
                case 3 -> addObservation(testBird);
                case 4 -> showBirds();
                case 5 -> searchBird();
                default -> System.out.println("Invalid option\n");
            }
        }
    }

    public static void modifyMenu() {
        System.out.println("****************************");
        System.out.println("*           MODIFY         *");
        System.out.println("* 0. Return to Main Menu   *");
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
}
