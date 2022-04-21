package com.company.frontcontroller;

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
//            case "2" -> Search.search(birdList, 1);  //add bird
//            case "3" -> Search.search(birdList, 2); //modify bird
//            case "4" -> Search.search(birdList, 3); //delete bird
//            case "5" -> Search.search(birdList, 4); //add observation
//            case "6" -> BirdController.showAllBirds(birdList);
//            case "7" -> statistics(birdList);
            default -> System.out.println("Invalid option\n");
        }

    }
}
