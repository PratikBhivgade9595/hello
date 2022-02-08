package com.bridgelabz;

import java.util.Scanner;

public class headtail {
    public static void main(String[] args) {
        System.out.println("Give a Number :  ");
        Scanner sc = new Scanner(System.in);

        int headcount=0;
        int tailcount=0;

        int count = sc.nextInt();

        for ( int i=0; i<count; i++ ){
            double random = Math.random();
            if (random < 0.5)
                tailcount++;
            else
                headcount++;
        }

        System.out.println("percentage of tails ("+ tailcount +"):"+ (tailcount*100.0 / (tailcount+headcount)));
        System.out.println("percentage of heads ("+ headcount +"):"+ (headcount*100.0 / (tailcount+headcount)));

    }
}
