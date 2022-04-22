package com.company.utils;

import com.company.model.Bird;

import java.util.Scanner;

public class Utilities {
    //************************************************************************************
    //************************************ COLOURS ***************************************
    //************************************************************************************

    // Declaring ANSI_RESET so that we can reset the declarations
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration

    public static final String YELLOW_BRIGHT = "\033[0;93m", BRONZE_UNDERLINED = "\033[4;38;2;205;127;50m";

    //For create any colour:

    //  \033[38;2;<r>;<g>;<b>m     #Select RGB foreground color
    //  \033[48;2;<r>;<g>;<b>m     #Select RGB background color

    // Declaring the color background
    // Custom declaration
    public static final String ANSI_BRONZE_BACKGROUND = "\033[48;2;205;127;50m";

    // Declaring the font type
    // Custom declaration
    public static final String ANSI_BOLD = "\u001B[1m";

    //************************************************************************************
    //************************************ SCANNER ***************************************
    //************************************************************************************

    public static String ask(Scanner scanner, String text) {    //this method receives the scanner and a String,
        System.out.println(text);                               //and returns the output of the scanner inserted by the user
        return scanner.next();
    }
    public static String menuOption(Scanner reader) {
        return Utilities.askOption(reader, "1", null, null);
    }

    public static String askOption(Scanner reader, String value, Bird bird, Integer i) {
        String text = switch (value){
            case "1" -> "Choose an option: ";
            case "2" -> "New name";
            case "3" -> "New latin name";
            case "4" -> "Write the bird's name: ";
            case "5" -> "Write the bird's latin name: ";
            case "6" -> "How many birds do you want to add?";
            case "7" -> "New number of observations: ";
            case "8" -> "How many observations to "+YELLOW_BRIGHT+bird.getName()+ANSI_RESET+" do you want to add?";
            case "9" -> "Name of Bird " + YELLOW_BRIGHT + i + ANSI_RESET + ": ";
            case "10" -> "Latin Name of Bird " + YELLOW_BRIGHT + i + ANSI_RESET + ": ";
            case "11" -> "Number of Observations of Bird " + YELLOW_BRIGHT + i + ANSI_RESET + ": ";
            default -> "";
        };
        return Utilities.ask(reader, text);
    }
}
