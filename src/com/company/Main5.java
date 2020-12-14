package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input string ");
            String a = scanner.nextLine();
            String b = findMiddleStr(a);
            System.out.println(b);
        }
    }

    public static String findMiddleStr(String x) {
        String y = null;
        if (x.length() % 2 == 0) {
            y = x.substring(x.length() / 2 - 1, x.length() / 2 + 1);
        }
        if (x.length() % 2 != 0) {
            y = x.substring(x.length() / 2, x.length() / 2 + 1);
        }
        return y;
    }
}
