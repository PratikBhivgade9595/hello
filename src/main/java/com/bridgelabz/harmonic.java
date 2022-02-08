package com.bridgelabz;

import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        System.out.println("Enter Number for Harmonic Sum :");
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        double sum = 0.0;

        while ( H>0 )
        {
            sum+= (1.0)/H ;
            H-- ;
            System.out.println(sum);

        }
        System.out.println("Harmonic sum is :" +sum);
    }
}
