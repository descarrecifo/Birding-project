package com.company.view;

import com.company.FrontController.FrontController;
import com.company.controller.Controller;
import com.company.utilities.Utilities;
import java.util.HashMap;
import java.util.Scanner;

public class IOView {
    static Scanner scanner = new Scanner(System.in);



    public static void mainLoopView() {


        while (true) {
            View.mainMenu();
            int valueScanner = Integer.parseInt(Utilities.ask(scanner , "Choose an option:"));
            boolean exit = false;

            //with the method ask, we give a value to choose


            //the different cases of the switch
            switch (valueScanner) {
                case 0 -> exit = true;
                case 1 -> {
                    System.out.println("Chosen Option 1");
                    addBird();
                }
                case 2 -> {
                    System.out.println("Chosen Option 2");
                    Controller.modifyBird();
                }
                case 3 -> {
                    System.out.println("Chosen Option 3");
                    Controller.addObservation();
                }

                case 4 -> {
                    System.out.println("Chosen Option 4");
                    Controller.showBirds();
                }

                case 5 -> {
                    System.out.println("Chosen Option 5");
                    Controller.searchBird();
                }

                default -> System.out.println("Invalid option chosen. Please try again\n");
            }
            if (exit) break;
        }
    }
    public static void addBird() {

        HashMap<String,String> hashMapBird = new HashMap<>();

        System.out.println("Add bird");
        System.out.print("Name: ");
        String nameBird = scanner.nextLine();
        System.out.print("NameLatin: ");
        String nameLatinBird = scanner.nextLine();
        System.out.print("Observations: ");
        String obervationsBird= scanner.nextLine();


        hashMapBird.put("operation","addbird");
        hashMapBird.put("name",nameBird);
        hashMapBird.put("namelatin",nameLatinBird);
        hashMapBird.put("obervations",obervationsBird);

        FrontController.mainLoopController(hashMapBird);

    }

}







