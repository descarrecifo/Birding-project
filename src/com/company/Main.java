package com.company;

import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BirdDatabase db = new BirdDatabase();
        menuOptions();

    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println(" ");
        System.out.println("0. Quit");
        System.out.println("1. Add");
        System.out.println("2. Observation");
        System.out.println("3. Show");
        System.out.println("4. Statistics");
        System.out.println(" ");
        System.out.println("Choose an option:");
    }

    public static void menuOptions(){
        while (true) {
            boolean exit = false;
            menu();
            int value = scanner.nextInt();

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

    public static void addBird(){
        System.out.println("Add bird");
        System.out.println(" ");
    }


    public static void addObservation(){
        System.out.println("Add observation");
        System.out.println(" ");
    }

    public static void showBirds(){
        System.out.println("Show birds");
        System.out.println(" ");
    }

    public static void statistics(){
        System.out.println("Statistics");
        System.out.println(" ");
    }

}