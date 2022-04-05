package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdModel = new BirdDatabase();
        boolean option = true;
        while (option) {
            System.out.println("0 Quit\n 1 Add\n 2 Observation\n 3 Show\n 4 Statistics\n");
            String command = ask(scanner);
            switch (command){
                case  "0" :
                    option = false;
                    break;
                case "1" :
                    add(scanner,birdModel);
                    break;
                case "2" :
                    observation(scanner,birdModel);
                    break;
                case "3":
                    show(scanner,birdModel);
                    break;
                case "4" :
                    statistics(scanner,birdModel);
                    break;
                default:
                    System.out.println("Unknown Option!");
            }
        }
    }

    public static String ask(Scanner input) {
        String option = input.nextLine();
        return option;
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