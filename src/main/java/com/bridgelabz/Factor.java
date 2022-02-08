package com.bridgelabz;

import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {
        System.out.println("Enter Number To Find Factor");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1 ; i <= number ; i++)
        {
            if(number % i == 0)

                System.out.print(i+"	");
        }


    }
}
