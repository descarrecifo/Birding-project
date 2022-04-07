package com.company;

import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

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
            boolean exit = false;
            menu();
            int value = Integer.parseInt(ask(scanner, "Choose an option:"));

            switch (value) {
                case 0 -> exit = true;
                case 1 -> addBird();
                case 2 -> addObservation();
                case 3 -> showBirds();
                case 4 -> statistics();
                default -> System.out.println("Invalid option\n");
            }
            if (exit) break;
        }
    }

    public static String ask(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.next();
    }

    public static void addBird(){
        System.out.println("Add bird\n");
    }


    public static void addObservation(){
        System.out.println("Add observation\n");
    }

    public static void showBirds(){
        System.out.println("Show birds\n");
    }

    public static void statistics(){
        System.out.println("Statistics\n");
    }

}