package com.company.utilities;

import java.util.Scanner;

    public class Utilities {
    public static String ask(Scanner scanner , String text) {
        System.out.println(text);
        return scanner.next();
    }
}
