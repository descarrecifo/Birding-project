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

        birdList.add(new Bird("Test3", "latinTest3", 7));

        menuOptions(birdList);
    }

    public static String ask(Scanner scanner, String text) {    //this method receives the scanner and a String and returns
        System.out.println(text);                               //the output of the scanner inserted by the user
        return scanner.next();
    }



}