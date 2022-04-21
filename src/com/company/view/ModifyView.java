package com.company.view;

import com.company.model.Bird;
import com.company.utils.Utilities;

import java.util.Scanner;

import static com.company.utils.Utilities.*;

public class ModifyView {

    public static void modifyMenu() {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                            "+ANSI_RESET);
        System.out.print(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.print("          "+BRONZE_UNDERLINED+ANSI_BOLD+"MODIFY"+ANSI_RESET+"          ");
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 0. Return to Search Menu "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1. Modify Name           "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2. Modify Latin Name     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 3. Modify Observation    "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 4. Show Bird             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                            "+ANSI_RESET);
    }

    public static void modifyName(Bird bird, Scanner reader) {
        String name = Utilities.askOption(reader, "2");
        String nameFirst = name.substring(0, 1).toUpperCase(); //capitalize first letter
        String nameRest = name.substring(1).toLowerCase();    //lowercase the rest of letters
        bird.setName(nameFirst + nameRest);
    }

    public static void modifyLatinName(Bird bird, Scanner reader) {
        String nameLatin = Utilities.askOption(reader, "3");
        String nameLatinFirst = nameLatin.substring(0, 1).toUpperCase();
        String nameLatinRest = nameLatin.substring(1).toLowerCase();
        bird.setNameLatin(nameLatinFirst + nameLatinRest);
    }
}
