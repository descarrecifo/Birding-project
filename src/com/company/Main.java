package com.company;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Bird testBird = new Bird("Test", "Test1", 4);

    public static void main(String[] args) {

        //BirdDatabase db = new BirdDatabase();
        menuOptions();

    }

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

    public static void menuOptions(){
        while (true) {
            boolean exit = false; //the variable exit is used to break the while loop
            menu();
            int value = Integer.parseInt(ask(scanner, "Choose an option:")); //with the method ask, we give a value to choose
                                                                                 //the different cases of the switch
            switch (value) {
                case 0 -> exit = true;
                case 1 -> addBird();
                case 2 -> modifyBird();
                case 3 -> addObservation();
                case 4 -> showBirds();
                case 5 -> searchBird();
                default -> System.out.println("Invalid option\n");
            }
            if (exit) break;
        }
    }

    public static String ask(Scanner scanner, String text) {    //this method receives the scanner and a String and returns
        System.out.println(text);                               //the output of the scanner inserted by the user
        return scanner.next();
    }

    public static void addBird(){
        System.out.println("Add bird\n");
    }

    public static void modifyBird(){

        modifyMenu();
        modifyOptions();

    }

    public static void modifyMenu() {
        System.out.println("****************************");
        System.out.println("*           MODIFY         *");
        System.out.println("* 0. Return to main menu   *");
        System.out.println("* 1. Modify Name           *");
        System.out.println("* 2. Modify Latin Name     *");
        System.out.println("* 3. Modify Observation    *");
        System.out.println("* 4. See Bird              *");
        System.out.println("****************************");
    }

    public static void modifyOptions(){
        while (true) {
            boolean exit = false; //the variable exit is used to break the while loop
            modifyMenu();
            int value = Integer.parseInt(ask(scanner, "Choose an option:")); //with the method ask, we give a value to choose
            //the different cases of the switch
            switch (value) {
                case 0 -> exit = true;
                case 1 -> testBird.setName(ask(scanner, "New name:"));
                case 2 -> testBird.setNameLatin(ask(scanner, "New latin name:"));
                case 3 -> testBird.setObservations(Integer.parseInt(ask(scanner, "New number of observations:")));
                case 4 -> System.out.println(testBird.toString());
                default -> System.out.println("Invalid option\n");
            }
            if (exit) break;
        }
    }

    public static void addObservation(){
        int observations = Integer.parseInt(ask(scanner, "How many observations to this bird do you want to add?"));
        int oldObservations = testBird.getObservations();
        testBird.setObservations(oldObservations+observations);
    }

    public static void showBirds(){
        System.out.println("Show all birds\n");
    }

    public static void searchBird(){
        System.out.println("Search bird\n");
    }

}