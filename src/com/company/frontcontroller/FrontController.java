package com.company.frontcontroller;

import com.company.controller.SearchController;
import com.company.model.Bird;
import com.company.controller.BirdController;

import java.util.ArrayList;
import java.util.HashMap;

public class FrontController {

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