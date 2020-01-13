package com.java.utilities;

import java.util.Scanner;

public class InputHelper {
    public static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
