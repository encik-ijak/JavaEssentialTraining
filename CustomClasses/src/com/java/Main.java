package com.java;

import com.java.utilities.MathHelper;

public class Main {
    public static void main(String[] args) {
        //InputHelper inputHelper = new InputHelper();
//        String input = InputHelper.getInput("Enter Value 1 : ");
//        System.out.println("Value 1 : "+input);
//        input = InputHelper.getInput("Enter Value 2 : ");
//        System.out.println("Value 2 : "+input);

        MathHelper helper = new MathHelper();

        try {
            while(true) {
                int input = helper.addNumber("Enter a number : ");
                int total = helper.getTotal();
                String message = String.format(
                        "Entered : %d, total = %d", input, total
                );
                System.out.println(message);

            }
        } catch (NumberFormatException e) {
            System.out.println("All done!");
        }
    }
}
