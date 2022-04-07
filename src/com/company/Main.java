package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int command;
        BirdDatabase bird = new BirdDatabase();
        do {
            System.out.println(" 0 Quit\n 1 Add\n 2 Observation\n 3 Show\n 4 Statistics\n");
            command = Integer.parseInt(ask(scanner, "Option? "));
            switch (command) {
                case 1 -> add(scanner, bird);
                case 2 -> observation(scanner);
                case 3 -> show(scanner);
                case 4 -> statistics(scanner);
                case 0 -> {break;}
                default -> System.out.println("Unknown Option!");

            }
        } while (command != 0);
    }

    public static String ask(Scanner input, String option) {
        System.out.println(option);
        return input.nextLine();
    }

    public static void add(Scanner input, BirdDatabase bird) {
        String name;

        while (true) {
            name =  ask(input, "Name: ");

            if(name.equals("exit"))
            {
                break;
            }


            String nameLatin = ask(input, "Name latin: ");
            String observations = ask(input, "Name latin: ");
            bird.addBird(new Bird(name, nameLatin, Integer.parseInt(observations)));
        }

        bird.sowList();
    }

    public static void observation(Scanner input) {

    }

    public static void show(Scanner input) {

    }

    public static void statistics(Scanner input) {

    }

}