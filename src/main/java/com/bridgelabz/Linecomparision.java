package com.bridgelabz;

public class Linecomparision {
    public static void main(String[] args) {

        int x1, y1, x2, y2, x3, y3, x4, y4 ;

        x1=10;
        x2=20;
        y1=15;
        y2=20;
        x3=30;
        x4=40;
        y3=25;
        y4=35;

        int data1= (int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        int data2= (int) Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));

        Integer linelength1 = new Integer(data1);
        Integer linelength2 = new Integer(data2);

        int result = linelength1.compareTo(linelength2);

        if (result>0)
        {
            System.out.println("line1 is greater than line2");

        }
        else if (result<0)
        {
            System.out.println("line1 is less than line2");
        }
        else
            System.out.println("line1 is equal to line2");
    }
}
