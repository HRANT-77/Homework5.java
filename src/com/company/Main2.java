package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number ");
        int a = scanner.nextInt();
        System.out.print("Input second number ");
        int b = scanner.nextInt();
        int prod = calculateProduct(a, b);
        System.out.println("Product of this number " + prod);
    }

    public static int calculateProduct(int x, int y) {
        return x * y;
    }
}

