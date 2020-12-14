package com.company;

import java.util.Random;

public class Main11 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        initializeArr(arr);
        printArr(arr);
    }

    public static int[] initializeArr(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99);
        }
        return a;
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
