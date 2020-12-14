package com.company;

public class Main14 {
    public static void main(String[] args) {
        findPrimeNum();
    }

    public static void findPrimeNum() {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (i == j + 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
