package com.bridgelabz;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.print("Enter the limit : ");
        int lim = sc.nextInt();
        if(lim > 0)
        {
            int a = 0, b = 1, c;
            //display starting two numbers of series
            System.out.print("Fibonacci Series : "+a+"  "+b+"  ");
            //perform iterations till the limit entered by the user
            while(b <= lim)
            {
                c=a+b;
                a=b;
                b=c;
                //condition for forcing b that it should not be printed when its value is greater than limit
                if(b <= lim)
                    System.out.print(b+"  ");
            }
        }
        else
            System.out.print("Wrong Input");
        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
}


