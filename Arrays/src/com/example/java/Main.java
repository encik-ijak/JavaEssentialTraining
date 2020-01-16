package com.example.java;

import com.example.java.model.ClothingItem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Arrays of primitive");

        int[] ints = {3,2,1};
//        for (int i = 0; i < ints.length; i++) {
//            System.out.print(ints[i]+" ");
//        }

        for (int i : ints
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Array of Strings");
        String[] colors = {"red", "yellow", "blue"};
        for (String str : colors
             ) {
            System.out.print(str+" ");
        }

        ClothingItem[] items = new ClothingItem[3];
        System.out.println();
        System.out.println();
        items[0] = new ClothingItem("Shirt", "L", 22.5);
        items[1] = new ClothingItem("Jeans", "M", 20.0);
        items[2] = new ClothingItem("Baju", "S", 47.5);

        for (ClothingItem item: items
             ) {
            System.out.println(item);
        }
    }
}
