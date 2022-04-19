package com.company.view;
import com.company.controller.Controller;

import java.util.Scanner;

public class View {


    //this method receives the scanner and a String and returns
    //the output of the scanner inserted by the user
    public static void mainMenu() {

        System.out.println("**********************");
        System.out.println("*        MENU        *");
        System.out.println("* 0. Quit            *");
        System.out.println("* 1. Add Bird        *");
        System.out.println("* 2. Modify Bird     *");
        System.out.println("* 3. Add Observation *");
        System.out.println("* 4. Show All        *");
        System.out.println("* 5. Search Bird     *");
        System.out.println("**********************");

    }

}
