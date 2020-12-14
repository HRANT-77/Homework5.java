package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inpu n ");
        int n = scanner.nextInt();
        nxnMatrix(n);
    }

    public static void nxnMatrix(int a) {
        Random random = new Random();
        String[][] matrix = new String[a][a];
        int t;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                t = random.nextInt(2);
                if (t == 0) {
                    matrix[i][j] = "-";
                }
                if (t == 1) {
                    matrix[i][j] = "+";
                }
            }
        }
    }
}


