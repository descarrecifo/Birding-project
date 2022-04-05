package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while (true) {
            System.out.println("MENU");
            System.out.println(" ");
            System.out.println("0. Quit");
            System.out.println("1. Add");
            System.out.println("2. Observation");
            System.out.println("3. Show");
            System.out.println(" ");
            System.out.println("Choose an option:");
            int op = scanner.nextInt();
            String option;


            if (op == 0) {
                break;
            } else {

                switch (op) {
                    case 1:
                        option = "Add bird";
                        break;
                    case 2:
                        option = "Add observation";
                        break;
                    case 3:
                        option = "Show bird";
                        break;
                    default:
                        option = "Invalid option";
                }

            }
            System.out.println(option);

            /*
            String command = ask(scanner, "Option?");
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
               add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }
        }*/

            System.out.println("Exit while");
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

}