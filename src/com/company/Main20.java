package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array ");
        int n = scanner.nextInt();
        int[][] k = createMatrix(n);
        printMatrix(k);
        do {
            System.out.println();
            System.out.println("———————- MENU —————-\n" +
                    "For rotating 90*   input 1\n" +
                    "For rotating 180*  input 2\n" +
                    "For rotating 270*  input 3\n" +
                    "For Exit           input 4\n" +
                    "————————————————");
            int num = scanner.nextInt();
            if (num == 1) {
                printMatrix(rotate90Matrix(k));
            }
            if (num == 2) {
                printMatrix(rotate90Matrix(rotate90Matrix(k)));
            }
            if (num == 3) {
                printMatrix(rotate90Matrix(rotate90Matrix(rotate90Matrix(k))));
            }
            if (num != 4 && num != 1 && num != 2 && num != 3) {
                System.out.println("Wrong number, please try again");
            }
            if (num == 4) {
                break;
            }
        }
        while (true);
    }

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51) + 27;
            }
        }
        return matrix;
    }

    public static int[][] rotate90Matrix(int[][] l) {
        int[][] matrix_90 = new int[l.length][l.length];
        for (int i = 0; i < matrix_90.length; i++) {
            int z_90 = l.length - 1;
            for (int j = 0; j < matrix_90[i].length; j++) {
                matrix_90[i][j] = l[z_90][i];
                z_90--;
            }
        }
        return matrix_90;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



