package com.company;

import java.util.Random;

public class Main13 {
    public static void main(String[] args) {


        int[] arr = new int[10];
        initializeArr(arr);
        System.out.println("Not sorted array ");
        printArr(arr);
        sortArr(arr);
        System.out.println("\nSorted array ");
        printArr(arr);
    }

    public static int[] initializeArr(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99);
        }
        return a;
    }

    public static void sortArr(int[] a) {
        int t;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
