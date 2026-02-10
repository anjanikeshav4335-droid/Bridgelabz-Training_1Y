package com.gla.Methods;

public class Rectangle {
    public void area(int a, int b){
        System.out.println("Area of Rectangle");
        double area = a*b;
        System.out.println(area);
    }
    public void perimeter(int a, int b){
        System.out.println("Perimeter of Rectangle");
        double perimeter = 2*(a*b);
        System.out.println(perimeter);
    }
}
