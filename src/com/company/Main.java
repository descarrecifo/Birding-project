package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while (true) {
            menu();
            int op = scanner.nextInt();
            String option;

            if (op == 0) {
                break;
            } else {

                option = switch (op) {
                    case 1 -> "Add bird";
                    case 2 -> "Add observation";
                    case 3 -> "Show bird";
                    default -> "Invalid option";
                };

            }
            System.out.println(option);
            System.out.println(" ");
        }

/*
        public static String ask (Scanner input, String option){
            return option;
        }

        public static void add (Scanner input, BirdDatabase db){

        }

        public static void observation (Scanner input, BirdDatabase db){

        }

        public static void show (Scanner input, BirdDatabase db){

        }

        public static void statistics (Scanner input, BirdDatabase db){

        }*/

    }

    private static void menu() {
        System.out.println("MENU");
        System.out.println(" ");
        System.out.println("0. Quit");
        System.out.println("1. Add");
        System.out.println("2. Observation");
        System.out.println("3. Show");
        System.out.println(" ");
        System.out.println("Choose an option:");
    }

}