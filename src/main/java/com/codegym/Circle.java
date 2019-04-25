package com.codegym;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter radius of circle: ");
        double radius = scanner.nextFloat();
        double circumference = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;
        System.out.println("circumference of circle is: " + circumference);
        System.out.println(" area of circle is: " + area);

    }
}
