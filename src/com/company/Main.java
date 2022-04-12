package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int command;
        BirdDatabase bird = new BirdDatabase();
        do {
            menuMain();
            command = Integer.parseInt(ask(scanner, "Option? "));
            switch (command) {
                case 1 -> add(scanner, bird);
                case 2 -> observation(scanner);
                case 3 -> showList(bird);
                case 4 -> showBirt(scanner);
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
            String observations = ask(input, "Observate this birt: ");
            bird.addBird(new Bird(name, nameLatin, Integer.parseInt(observations)));
        }


    }

    public static void observation(Scanner input, BirdDatabase bird) {
        // Scan birt for search
        String name =  ask(input, "Name: ");
        // Check this birt exist
        if(checkBirtExistByName(bird,  name) != -1) String observations = ask(input, "Observate this birt: ");
        // cahngue de observation
    }

    public static void showList(BirdDatabase bird) {
        // Check if is empty array of birt
        // Show array list of birt
        if(checkBirtListEmpty(bird) > 0) bird.sowList();
        else System.out.println("The list Birt is empty");
    }

    public static void showBirt(Scanner input) {
        // Scan birt for search
        // Check this birt exist
        // Show birt
    }

    public static void menuMain(){
        System.out.println(" 0 Quit\n 1 Add\n 2 Observation\n 3 Show\n 4 Statistics\n");
    }

    public static void inputBirt(){

    }

    public static int checkBirtExistByName(BirdDatabase bird, String name){
        return bird.getBirdByName(name);
    }

    public static int checkBirtListEmpty(BirdDatabase bird){
        return bird.sizeOfBirtArray();
    }

    public static void changeObservation(){

    }


}