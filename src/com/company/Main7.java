package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String q = null;
            System.out.println("Input year ");
            int year = scanner.nextInt();
            if (findLeapYear(year) == true) {
                System.out.println(year + " is leap year and have 366 days");
            } else {
                System.out.println(year + " is not leap year and have 365 days");
            }
        }
    }

    public static boolean findLeapYear(int y) {
        String q;
        if (y % 4 == 0 && y % 100 != 0 || y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            return true;
        }
        return false;
    }
}
