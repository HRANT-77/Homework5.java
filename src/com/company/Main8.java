package com.company;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password ");
        String str = scanner.nextLine();

        if (checkValid(str)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Not valid password");
        }
    }

    public static boolean check10Characters(String str) {
        return str.length() > 10;
    }

    public static boolean check2Digits(String str) {
        String num = "0123456789";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                if (str.charAt(i) == num.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count >= 2;
    }

    public static boolean checkLettersNumbers(String str) {
        String abc = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789";
        for (int i = 0; i < str.length(); i++) {
            boolean ans = false;
            for (int j = 0; j < abc.length(); j++) {
                if (abc.charAt(j) == str.charAt(i)) {
                    ans = true;
                    break;
                }
            }
            if (!ans) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkValid(String str) {
        if (check10Characters(str)) {
            if (check2Digits(str)) {
                if (checkLettersNumbers(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
