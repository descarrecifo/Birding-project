package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int command;
        BirdDatabase birdDatabase = new BirdDatabase();
        Bird bird = new Bird();
        do {
            menuMain();
            command = Integer.parseInt(ask(scanner, "Option? "));
            switch (command) {
                case 1 -> add(scanner, birdDatabase);
                case 2 -> observation(scanner, birdDatabase, bird);
                case 3 -> showList(birdDatabase);
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
            String observations = ask(input, "Observatory this birt: ");
            // TODO check que sea type integer observation
            // TODO check name must bi unique
            bird.addBird(new Bird(name, nameLatin, Integer.parseInt(observations)));
        }
    }

    public static void observation(Scanner input, BirdDatabase birdDatabase, Bird bird) {
        // Scan birt for search into array
        String name =  ask(input, "Name: ");
        String observation;
        // Check this birt exist
        int index = checkBirtExistByName(birdDatabase,  name);
        if( index == -1)  System.out.println("Bird not found");
        else{
            observation = ask(input, "Observatory this birt: ");
            // change de observation
            changeObservation(index, observation, birdDatabase, bird);
        }
    }

    public static void showList(BirdDatabase bird) {
        // Check if is empty array of birds
        int birdsCount = checkBirtListEmpty(bird);
        // Show array list of birt
        if(birdsCount > 0) bird.sowList();
        else System.out.println("The list Birt is empty");
    }

    public static void showBirt(Scanner input) {

        // TODO Scan birt for search
        // TODO Check this birt exist
        // TODO format data to natural show
        // TODO Show birt
    }

    public static void menuMain(){
        System.out.println(" 0 Quit\n 1 Add\n 2 Observation\n 3 Show\n 4 Statistics\n");
    }

    public static int checkBirtExistByName(BirdDatabase birdDatabase, String name){
        return birdDatabase.getBirdByName(name);
    }

    public static int checkBirtListEmpty(BirdDatabase bird){
        return bird.sizeOfBirtArray();
    }

    public static void changeObservation(int index, String observation, BirdDatabase birdDatabase, Bird bird){
        // Get Object from array of bert
        Bird elementBirtOfArray = birdDatabase.birdArray.get(index);
        // Set observation to birt object
        elementBirtOfArray.setObservations(Integer.parseInt(observation));
        // Update array bird
        birdDatabase.birdArray.set(index, elementBirtOfArray);
    }
}