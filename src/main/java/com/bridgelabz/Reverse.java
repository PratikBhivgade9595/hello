package com.bridgelabz;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        int n = in.nextInt();
        int n1 = n, rev = 0, d;
        while (n > 0) {
            d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        System.out.println(n1 + " in Reversed order is " + rev);
    }
}
