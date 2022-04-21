package com.company.controller;

import com.company.model.Bird;
import com.company.utils.Utilities;
import com.company.view.IOView;
import com.company.view.SearchView;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchController {
    public static void search(ArrayList<Bird> birds, int from) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            SearchView.searchMenu();
            String optionSubMenu = SearchView.searchOption(reader);
            switch (optionSubMenu) {
                case "0" -> {
                    return;
                }
                case "1" -> {
                    String nameBird = SearchView.searchName(reader, "1");
                    for (Bird bird : birds) {
                        if (bird.getName().equalsIgnoreCase(nameBird)) {
                            searchSwitch(from, bird, birds, reader);
                            return;
                        }
                    }
                    System.out.println("Bird not found");
                }
                case "2" -> {
                    String latinBird = SearchView.searchName(reader, "2");
                    for (Bird bird : birds) {
                        if (bird.getNameLatin().equalsIgnoreCase(latinBird)) {
                            searchSwitch(from, bird, birds, reader);
                            return;
                        }
                    }
                    System.out.println("Bird not found");
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void searchSwitch(int from, Bird bird, ArrayList<Bird> birdList, Scanner reader){
        switch (from) {
            case 1 -> BirdController.modifyOptions(bird, reader);
            case 2 -> BirdController.deleteBird(bird, birdList);
            case 3 -> IOView.addObservation(bird, reader);
            case 4 -> BirdController.showBird(bird);
        }
    }
}
