package com.bridgelabz;

import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {


        int N, result = 1;
        System.out.println("Enter the power :  ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        if (N < 31)
            for (int i = 1; i <= N; i++) {
                result = 2 * result;
                System.out.println("result  :" + result);
            }
        else
            System.out.println("over flow as int");

    }
}
