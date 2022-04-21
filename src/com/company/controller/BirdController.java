package com.company.controller;

import com.company.model.Bird;
import com.company.service.BirdServices;
import com.company.utils.Utilities;
import com.company.view.IOView;
import com.company.view.Modify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.company.Menu.ANSI_RESET;
import static com.company.Menu.YELLOW_BRIGHT;

public class BirdController {

    public static void addBird(HashMap<String, String> dataToAddBird, ArrayList<Bird> birds) {

        birds.add(BirdServices.unpackHashmapBird(dataToAddBird));

        HashMap<String, ArrayList<Bird>> birdList = new HashMap<>();
        birdList.put("birdList", birds);
    }

    //*************************************************************************************
    //*********************************** DELETING ****************************************
    //*************************************************************************************

    public static void deleteBird(Bird bird, ArrayList<Bird> birdList){
        System.out.println(YELLOW_BRIGHT+bird.getName()+ANSI_RESET+" has been deleted");
        birdList.remove(bird);
    }


    //************************************************************************************
    //************************************ SHOWING  **************************************
    //************************************************************************************

    public static void showBird(Bird bird){
        System.out.println(bird.toString());
    }

    public static void showAllBirds(ArrayList<Bird> birds){
        for (Bird bird : birds) {
            showBird(bird);
        }
    }

    //************************************************************************************
    //******************************** STATISTICS ****************************************
    //************************************************************************************

    public static void statistics(ArrayList<Bird> birds){
            BirdServices.statistics(birds);
    }

    //************************************************************************************
    //********************************** MODIFYING ***************************************
    //************************************************************************************

    public static void modifyOptions(Bird bird, Scanner reader){
        while (true) {
            Modify.modifyMenu();
            String value = Utilities.ask(reader, "Choose an option:"); //with the method ask, we give a value to choose
            //the different cases of the switch
            switch (value) {
                case "0" -> {return;}
                case "1" -> IOView.modifyName(bird, reader);
                case "2" -> IOView.modifyLatinName(bird, reader);
                case "3" -> bird.setObservations(Integer.parseInt(Utilities.ask(reader, "New number of observations:")));
                case "4" -> System.out.println(bird.toString());
                default -> System.out.println("Invalid option\n");
            }
        }
    }
}
