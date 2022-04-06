package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdModel = new BirdDatabase();
        int command;
        System.out.println("0 Quit\n 1 Add\n 2 Observation\n 3 Show\n 4 Statistics\n");
        do {
            command = ask(scanner);
            switch (command) {
                case 1 -> add(scanner, birdModel);
                case 2 -> observation(scanner, birdModel);
                case 3 -> show(scanner, birdModel);
                case 4 -> statistics(scanner, birdModel);
                default -> {
                    if(command == 0 ){
                        System.out.println("Hasta la proxima");
                    }
                    else{
                        System.out.println("Unknown Option!");
                    }
                }
            }
        } while (command != 0);
    }

    public static int ask(Scanner input) {
        return Integer.parseInt(input.nextLine());
    }

    public static void add(Scanner input, BirdDatabase birdModel) {
        System.out.println("Name:");
        String name = input.nextLine();
        System.out.println("Name latin:");
        String nameLatin = input.nextLine();
        System.out.println("Observations:");
        String observations = input.nextLine();
    }

    public static void observation(Scanner input, BirdDatabase birdModel) {

    }

    public static void show(Scanner input, BirdDatabase birdModel) {

    }

    public static void statistics(Scanner input, BirdDatabase birdModel) {

    }

}