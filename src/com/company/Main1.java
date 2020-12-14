package com.company;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(99);
        System.out.println("First generated number " + a);
        int b = random.nextInt(99);
        System.out.println("Second generated number " + b);
        int sum = calculateSum(a, b);
        System.out.println("Sum of this number " + sum);
    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }
}
