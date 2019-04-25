package com.codegym;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the year when you born: ");
        int year = scanner.nextInt();
        System.out.println("your age is: " + (2019 - year));
    }
}
