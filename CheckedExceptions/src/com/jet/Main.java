package com.jet;

public class Main {
    public static void main(String[] args) {

        try {
            String welcome = "Welcome!";
            char[] chars = welcome.toCharArray();
            char lastchar = chars[chars.length];
            System.out.println("Last Character : "+lastchar);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Code Ran Successfully");
        try {
            doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Inside doSomething");
    }
}
