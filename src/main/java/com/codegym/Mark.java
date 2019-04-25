package com.codegym;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your chemistry mark: ");
        float chemistry_mark = scanner.nextFloat();
        System.out.print("enter your physic mark: ");
        float physic_mark = scanner.nextFloat();
        System.out.print("enter your biology mark: ");
        float biology_mark = scanner.nextFloat();
        float sum = chemistry_mark + physic_mark + biology_mark;
        float avg = sum / 3;
        System.out.printf("sumary of marks is %f, avg is %f", sum, avg);
    }
}
