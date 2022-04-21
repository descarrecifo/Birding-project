package com.company.frontcontroller;

import com.company.controller.SearchController;
import com.company.model.Bird;
import com.company.controller.BirdController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FrontController {

    private static HashMap dataFromView;
    private static String value;
    private static ArrayList<Bird> birds;
    //just scanner object to manage io
    Scanner reader = new Scanner(System.in);

    public static void mainLoopController(HashMap dataFromView, String value, ArrayList<Bird> birds) {

        switch (value) {
            case "1" -> BirdController.addBird(dataFromView, birds);
            case "2" -> SearchController.search(birds, 1);  //add bird
            case "3" -> SearchController.search(birds, 2); //modify bird
            case "4" -> SearchController.search(birds, 3); //delete bird
            case "5" -> SearchController.search(birds, 4); //add observation
            case "6" -> BirdController.showAllBirds(birds);
            case "7" -> BirdController.statistics(birds);
            default -> System.out.println("Invalid option\n");
        }

    }
}
