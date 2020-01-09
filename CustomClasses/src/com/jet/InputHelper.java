package com.jet;

import java.util.Scanner;

public class InputHelper {
    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
