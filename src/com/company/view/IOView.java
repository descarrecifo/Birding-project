package com.company.view;

//import com.company.controller.SearchController;
import com.company.controller.SearchController;
import com.company.frontcontroller.FrontController;
import com.company.controller.BirdController;
import com.company.model.Bird;
import com.company.utils.Utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.company.Menu.ANSI_RESET;
import static com.company.Menu.YELLOW_BRIGHT;

public class IOView {

    public static void mainLoopView(ArrayList<Bird> birds) {
        //just scanner object to manage io
        Scanner reader = new Scanner(System.in);
        while (true) {
//            //print main menu
            Menu.mainMenu();
            String value = Utilities.ask(reader, "Choose an option:"); //with the method ask, we give a value to choose
            //the different cases of the switch
            HashMap dataFromViewToController = null;
            switch (value) {
                case "0" -> {
                    return;
                }
                case "1" -> addBird(reader, birds);
                case "2" -> FrontController.mainLoopController(dataFromViewToController, "2", birds);
                case "3" -> FrontController.mainLoopController(dataFromViewToController, "3", birds);
                case "4" -> FrontController.mainLoopController(dataFromViewToController, "4", birds);
                case "5" -> FrontController.mainLoopController(dataFromViewToController, "5", birds);
                case "6" -> FrontController.mainLoopController(dataFromViewToController, "6", birds);
                case "7" -> FrontController.mainLoopController(dataFromViewToController, "7", birds);
                default -> System.out.println("Invalid option\n");
            }
        }
    }

    //************************************************************************************
    //*********************************** ADDING *****************************************
    //************************************************************************************

    public static void addBird(Scanner reader, ArrayList<Bird> birds) {
        try {
            int quantity = Integer.parseInt(Utilities.ask(reader, "How many birds do you want to add?"));
            for (int i = 1; i <= quantity; i++) {
                String name = Utilities.ask(reader, "Name of Bird " + YELLOW_BRIGHT + i + ANSI_RESET + ": ");
                String nameLatin = Utilities.ask(reader, "Latin Name of Bird " + YELLOW_BRIGHT + i + ANSI_RESET + ": ");
                String observations = Utilities.ask(reader, "Number of Observations of Bird " + YELLOW_BRIGHT + i + ANSI_RESET + ": ");
                String nameFirst = name.substring(0, 1).toUpperCase(); //capitalize first letter
                String nameRest = name.substring(1).toLowerCase();    //lowercase the rest of letters
                String nameLatinFirst = nameLatin.substring(0, 1).toUpperCase();
                String nameLatinRest = nameLatin.substring(1).toLowerCase();
                //create hashmap to send data to controller
                HashMap<String, String> dataFromViewToController = new HashMap<>();
                //fill data hashmap object
                dataFromViewToController.put("operation", "addBird");
                dataFromViewToController.put("name", nameFirst + nameRest);
                dataFromViewToController.put("nameLatin", nameLatinFirst + nameLatinRest);
                dataFromViewToController.put("observations", observations);
                //send data to controller
                FrontController.mainLoopController(dataFromViewToController, "1", birds);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect input, you need to enter a number");
        }

    }

    //************************************************************************************
    //********************************** MODIFYING ***************************************
    //************************************************************************************

    public static void modifyName(Bird bird, Scanner reader) {

        String name = Utilities.ask(reader, "New name:");
        String nameFirst = name.substring(0, 1).toUpperCase(); //capitalize first letter
        String nameRest = name.substring(1).toLowerCase();    //lowercase the rest of letters
        bird.setName(nameFirst + nameRest);

    }

    public static void modifyLatinName(Bird bird, Scanner reader) {
        String nameLatin = Utilities.ask(reader, "New latin name:");
        String nameLatinFirst = nameLatin.substring(0, 1).toUpperCase();
        String nameLatinRest = nameLatin.substring(1).toLowerCase();
        bird.setNameLatin(nameLatinFirst + nameLatinRest);
    }

    //*************************************************************************************
    //******************************* ADD OBSERVATION *************************************
    //*************************************************************************************

    public static void addObservation(Bird bird, Scanner reader){
        int ObsNum = Integer.parseInt(Utilities.ask(reader, "How many observations to "+YELLOW_BRIGHT+bird.getName()+ANSI_RESET+" do you want to add?"));
        bird.setObservations(bird.getObservations()+ObsNum);
    }

}
