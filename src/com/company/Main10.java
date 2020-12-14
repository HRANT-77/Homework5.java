package com.company;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input first side ");
            double a_side = scanner.nextDouble();
            System.out.println("Input second side ");
            double b_side = scanner.nextDouble();
            System.out.println("Input third side ");
            double c_side = scanner.nextDouble();
            System.out.println(a_side);
            if (findValidTriangle(a_side, b_side, c_side) == true) {
                System.out.println("Perimeter of this triangle is " + calculatePerimOfTriangle(a_side, b_side, c_side));
                System.out.println("Area of this triangle is " + calculateAreaTriangle(a_side, b_side, c_side));
            } else {
                System.out.println("Not valid triangle");
            }
        }
    }

    public static boolean findValidTriangle(double x, double y, double z) {
        if (x + y > z && x + z > y && y + z > x) {
            return true;
        }
        return false;
    }

    public static double calculatePerimOfTriangle(double x, double y, double z) {
        return x + y + z;
    }

    public static double calculateAreaTriangle(double x, double y, double z) {
        double p_2 = (x + y + z) / 2;
        return Math.sqrt(p_2 * (p_2 - x) * (p_2 - y) * (p_2 - z));
    }
}
