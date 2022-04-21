package com.company.view;

import static com.company.Menu.ANSI_RESET;
import static com.company.utils.Utilities.*;

public class Modify {

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
}
