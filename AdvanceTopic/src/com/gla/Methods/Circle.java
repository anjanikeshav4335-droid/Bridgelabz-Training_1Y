package com.gla.Methods;

public class Circle {
    public void area(int radius){
        System.out.println("Area of Circle");
        double area = Math.PI*Math.pow(radius,2);
        System.out.println(area);
    }
    public void perimeter(int radius){
        System.out.println("Perimeter of Circle");
        double perimeter = 2*Math.PI*radius;
        System.out.println(perimeter);
    }
}


