package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        Bird testBird = new Bird("Test1", "latinTest1", 4);

        Bird testBird2 = new Bird("Test2", "latinTest2", 7);

        /*ArrayList<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird("Test1", "latinTest1", 4));*/

        menuOptions(testBird);

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

    public static String ask(Scanner scanner, String text) {    //this method receives the scanner and a String and returns
        System.out.println(text);                               //the output of the scanner inserted by the user
        return scanner.next();
    }

    public static void addBird(){
        System.out.println("Add bird\n");
    }

    public static void modifyBird(Bird testBird){
        modifyMenu();
        modifyOptions(testBird);
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

    public static void addObservation(Bird bird){
        int ObsNum = Integer.parseInt(ask(scanner, "How many observations to this bird do you want to add?"));
        bird.setObservations(bird.getObservations()+ObsNum);
    }

    public static void showBirds(){
        System.out.println("Show all birds\n");
    }

    public static void searchBird(){
        System.out.println("Search bird\n");
    }

}