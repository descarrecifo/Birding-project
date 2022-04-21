package com.company.controller;

import com.company.model.Bird;
import com.company.service.BirdServices;
import com.company.utils.Utilities;
import com.company.view.IOView;
import com.company.view.ModifyView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.YELLOW_BRIGHT;

public class BirdController {

    public static void addBird(HashMap<String, String> dataToAddBird, ArrayList<Bird> birds) {

        birds.add(BirdServices.unpackHashmapBird(dataToAddBird));

        HashMap<String, ArrayList<Bird>> birdList = new HashMap<>();
        birdList.put("birdList", birds);
    }

    public static void deleteBird(Bird bird, ArrayList<Bird> birdList){
        System.out.println(YELLOW_BRIGHT+bird.getName()+ANSI_RESET+" has been deleted");
        birdList.remove(bird);
    }

    public static void showBird(Bird bird){
        System.out.println(bird.toString());
    }

    public static void showAllBirds(ArrayList<Bird> birds){
        for (Bird bird : birds) {
            showBird(bird);
        }
    }

    public static void statistics(ArrayList<Bird> birds){
            IOView.statistics(birds);
    }

    public static void modifyOptions(Bird bird, Scanner reader){
        while (true) {
            ModifyView.modifyMenu();
            String value = Utilities.menuOption(reader);
            switch (value) {
                case "0" -> {return;}
                case "1" -> ModifyView.modifyName(bird, reader);
                case "2" -> ModifyView.modifyLatinName(bird, reader);
                case "3" -> bird.setObservations(Integer.parseInt(Utilities.askOption(reader, "7")));
                case "4" -> System.out.println(bird.toString());
                default -> System.out.println("Invalid option\n");
            }
        }
    }
}
