package com.company;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input word ");
            String word = scanner.nextLine();
            System.out.print("This word is ");
            findPolindrom(word);
        }
    }

    public static void findPolindrom(String w) {
        int t = w.length() - 1;
        int count = 0;
        for (int i = 0; i < w.length() / 2; i++) {
            if (w.charAt(i) == (w.charAt(t))) {
                count += 1;
            }
            t--;
        }

        if (count == w.length() / 2) {
            System.out.println("polindrom");
        } else {
            System.out.println("not polindrom");
        }
    }
}
