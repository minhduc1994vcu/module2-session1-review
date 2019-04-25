package com.codegym;

import java.util.Scanner;

public class CelciusConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter celcius: ");
        float cel = scanner.nextFloat();
        float fah = 9 * cel / 5 + 32;
        System.out.println("Fahrenheit is: " + fah);

    }
}
