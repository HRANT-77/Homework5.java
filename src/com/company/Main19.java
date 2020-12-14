package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array ");
        int n = scanner.nextInt();
        int[][] k = createMatrix(n);
        System.out.println("Not rotated matrix");
        System.out.println();
        printMatrix(k);
        System.out.println("90 rotated matrix");
        System.out.println();
        printMatrix(rotate90Matrix(k));
        System.out.println("180 rotated matrix");
        System.out.println();
        printMatrix(rotate180Matrix(k));
        System.out.println("270 rotated matrix");
        System.out.println();
        printMatrix(rotate270Matrix(k));
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


    public static int[][] rotate180Matrix(int[][] l) {
        int z_180 = l.length - 1;
        int[][] matrix_180 = new int[l.length][l.length];
        for (int i = 0; i < matrix_180.length; i++) {
            int p_180 = l.length - 1;
            for (int j = 0; j < matrix_180[i].length; j++) {
                matrix_180[i][j] = l[z_180][p_180];
                p_180--;
            }
            z_180--;
        }
        return matrix_180;
    }


    public static int[][] rotate270Matrix(int[][] l) {
        int p_270 = l.length - 1;
        int[][] matrix_270 = new int[l.length][l.length];
        for (int i = 0; i < matrix_270.length; i++) {
            int z_270 = 0;
            for (int j = 0; j < matrix_270[i].length; j++) {
                matrix_270[i][j] = l[z_270][p_270];
                z_270++;
            }
            p_270--;
        }
        return matrix_270;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
