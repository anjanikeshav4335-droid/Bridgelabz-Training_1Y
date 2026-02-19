package com.gla.Polymorphism;

import static java.awt.PageAttributes.MediaType.C2;

public class Runner {
    public static void main(String[] args) {
        Calculator C1 = new Calculator();
        int sum = C1.add(25,54);
        System.out.println("Sum of integer:- "+sum);

        Calculator C2 = new Calculator();
        double sum2 = C2.add(111.222, 222.333);
        System.out.println("Sum of double:- "+sum2);

        Calculator C3 = new Calculator();
        String sum3 = C3.add("Anjani","Keshav");
        System.out.println("Sum of String:- "+sum3);
    }
}
