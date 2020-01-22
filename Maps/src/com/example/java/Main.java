package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Kota Bharu", "Kelate");
        map.put("kolo berang", "ganu");
        map.put("bahau", "nisimblan");

        System.out.println(map);
        System.out.println(map.get("bahau"));
    }
}
