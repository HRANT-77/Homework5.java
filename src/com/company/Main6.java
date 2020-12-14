package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input string ");
            String a = scanner.nextLine();
            int counter = findWordCount(a);
            System.out.println(counter);
        }
    }

    public static int findWordCount(String x) {
        int count = 0;
        String noll = " ";
        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i) == noll.charAt(0) && x.charAt(i + 1) != noll.charAt(0)) {
                count += 1;
            }
        }
        return count + 1;
    }
}
