package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int command;

        do {
            System.out.println(" 0 Quit\n 1 Add\n 2 Observation\n 3 Show\n 4 Statistics\n");
            command = ask(scanner);
            switch (command) {
                case 1 -> add(scanner);
                case 2 -> observation(scanner);
                case 3 -> show(scanner);
                case 4 -> statistics(scanner);
                case 0 -> {break;}
                default -> System.out.println("Unknown Option!");

            }
        } while (command != 0);
    }

    public static int ask(Scanner input) {
        return Integer.parseInt(input.nextLine());
    }

    public static void add(Scanner input) {
        String name;
        BirdDatabase bird = new BirdDatabase();
        while (true) {
            System.out.println("Name exit Sale:");
            name = input.nextLine();

            if(name.equals("exit"))
            {
                break;
            }

            System.out.println("Name latin:");
            String nameLatin = input.nextLine();
            System.out.println("Observations:");
            int observations = Integer.parseInt(input.nextLine());

            bird.addBird(new Bird(name, nameLatin, observations));
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