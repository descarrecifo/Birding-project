package com.company;


import com.company.model.Bird;
import com.company.view.IOView;
import com.company.view.View;


import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {
//        ArrayList<Bird> birdArray = new ArrayList<Bird>();
//        Bird testBird1 = new Bird("Test1" , "Test1" , 4);
//        Bird testBird2 = new Bird("Test2" , "Test2" , 1);
//        Bird testBird3 = new Bird("Test3" , "Test3" , 2);
//
//        birdArray.add(testBird1);
//        birdArray.add(testBird2);
//        birdArray.add(testBird3);

        //BirdDatabase db = new BirdDatabase();
//        menuOptions(birdArray);

        System.out.println("Starting Birding, hello!\n");

//        View.menuOptions();
        IOView.mainLoopView();

    }}