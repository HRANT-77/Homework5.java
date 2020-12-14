package com.company;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number ");
        int a = scanner.nextInt();
        System.out.print("Input second number ");
        int b = scanner.nextInt();

        int prod = calculateProduct(a, b);
        System.out.println("Product of this number " + prod);
        int cube = calculateCube(calculateProduct(a, b));
        System.out.println("Cube of product this numbers is " + cube);
    }

    public static int calculateProduct(int x, int y) {
        return x * y;
    }

    public static int calculateCube(int x) {
        return x * x * x;
    }
}
