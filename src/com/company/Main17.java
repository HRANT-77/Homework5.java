package com.company;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Innput number ");
        int num = scanner.nextInt();
        int fact_num = calculateFactorial(num);
        System.out.print("Factorial is ");
        System.out.println(fact_num);
    }

    public static int calculateFactorial(int a) {
        int ans = 1;
        for (int i = 2; i < a + 1; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
