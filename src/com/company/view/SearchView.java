package com.company.view;

import com.company.utils.Utilities;

import java.util.Scanner;

import static com.company.utils.Utilities.*;

public class SearchView {
    public static void searchMenu() {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                " + ANSI_RESET);
        System.out.print(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.print("            " + BRONZE_UNDERLINED + ANSI_BOLD + "SEARCH" + ANSI_RESET + "            ");
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 0. Return to Main Menu       " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 1. Search Bird by Name       " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 2. Search Bird by Latin Name " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                " + ANSI_RESET);
    }

    public static String searchOption(Scanner reader) {
        return Utilities.ask(reader, "Choose an option: ");
    }

    public static String searchName(Scanner reader, String value) {
        String name = "";
        switch (value) {
            case "1" -> name = Utilities.askOption(reader, "4");
            case "2" -> name = Utilities.askOption(reader, "5");
        }
        return name;

    }
}
