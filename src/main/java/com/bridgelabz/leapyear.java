package com.bridgelabz;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter four digit year :   ");

        //4 digit nunber leap year or not
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ( year%4==0 )
            System.out.println("The Year is Leap Year");
        else
            System.out.println("The Year Is Not a Leap Year");


    }
}
