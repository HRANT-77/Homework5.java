package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input radius ");
            double r = scanner.nextInt();
            double circle_perimeter = calculatePerimeter(r);
            System.out.println(circle_perimeter);
            double circle_area = calculateArea(r);
            System.out.println(circle_area);
        }
    }

    public static double calculatePerimeter(double r) {
        double perim = 2 * Math.PI * r;
        return perim;
    }

    public static double calculateArea(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
}
