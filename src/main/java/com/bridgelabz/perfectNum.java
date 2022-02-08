package com.bridgelabz;

import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number");

        int number = sc.nextInt();
        //declare a variable to store sum of factors
        int sum = 0;
        for(int i = 1 ; i < number ; i++)
        {
            if(number % i == 0)
                sum = sum + i;
        }
        //comparing whether the sum is equal to the given number or not
        if(sum == number)
            System.out.println("Perfect Number");
        else
            System.out.println("Not an Perfect Number");
    }

}
