package com.example.java.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> states = new ArrayList<String>();
        //ArrayList is a resizable array
        states.add("Kelate");
        states.add("Nisimblan");
        states.add("Melakeee");

        for (String st :
                states) {
            System.out.println(st);
        }

        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(2);
        ints.add(1);

        for (Integer anInt:
             ints) {
            System.out.println(anInt);
        }

        states.remove(1);
        for (String state:
             states) {
            System.out.println(state);
        }

        int x = states.indexOf("Melakeee");
        System.out.println(x);
    }
}
