package com.example.java;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        Date dl = gc.getTime();
        System.out.println(dl);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);
    }
}
