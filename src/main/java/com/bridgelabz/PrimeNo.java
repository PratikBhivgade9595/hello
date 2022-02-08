package com.bridgelabz;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i=1; i<=n; i++){

            if (n%i == 0);
            {
                count++;
            }

        }

         if (count==2)
            System.out.println("The Number is Prime Number");

        else
            System.out.println("It is not a prime number");
    }
}
