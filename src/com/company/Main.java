package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Menu.*;


public class Main {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        Bird testBird = new Bird("Test1", "latinTest1", 4);

        Bird testBird2 = new Bird("Test2", "latinTest2", 7);

        ArrayList<Bird> birdList = new ArrayList<>();
        birdList.add(testBird);
        birdList.add(testBird2);
        birdList.add(new Bird("Test3", "latinTest3", 2));


        menuOptions(birdList);

    }


    public static String ask(Scanner scanner, String text) {    //this method receives the scanner and a String and returns
        System.out.println(text);                               //the output of the scanner inserted by the user
        return scanner.next();
    }

    public static void addBird(){
        System.out.println("Add bird\n");
    }

    public static void addObservation(Bird bird){
        int ObsNum = Integer.parseInt(ask(scanner, "How many observations to "+bird.getName()+" do you want to add?"));
        bird.setObservations(bird.getObservations()+ObsNum);
    }

    public static void showBirds(){
        System.out.println("Show all birds\n");
    }

    public static void searchBird(){
        System.out.println("Search bird\n");
    }

}