package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input first number ");
            int a = scanner.nextInt();
            System.out.print("Input second number ");
            int b = scanner.nextInt();
            System.out.print("Input third number ");
            int c = scanner.nextInt();
            int min = findMinEl(a, b, c);
            System.out.println("Min element is " + min);
        }
    }

    public static int findMinEl(int x, int y, int z) {
        int min = x;
        if (min > y) {
            min = y;
        }
        if (min > z) {
            min = z;
        }
        return min;
    }
}

