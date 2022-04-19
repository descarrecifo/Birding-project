package com.company.controller;

import com.company.model.Bird;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Bird> birdArrayList = new ArrayList<Bird>();

     public static void addArrayBird(HashMap <String,String> datafromView) {
         String name= datafromView.get("name");
         String nameLatin = datafromView.get("nameLatin");
         String obervations = datafromView.get("obervations");





     }





    public static void modifyBird() {
//        System.out.println("Modify bird\n");
//        System.out.print("Bird name to modify : ");
//        String valueScanner= scanner.nextLine();
//
//        String name= hashMapBird.get("name");
//        if(name.equals(valueScanner)) {
//            System.out.println("Si");
        }

    }

    public static void addObservation() {
        System.out.println("Add bird\n");
    }

    public static void showBirds() {
        System.out.println("Add bird\n");
    }

    public static void searchBird() {
    }
}


