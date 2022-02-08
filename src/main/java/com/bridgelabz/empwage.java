package com.bridgelabz;

// Employee is present or not problem.

public class empwage{
    public static void main(String[] arg) {
      // Constants
      int Fulltime=1;
      // Computation
      double empCheck=Math.floor(Math.random()*10)%2;
      if (empCheck==Fulltime)
         System.out.println("Employee is present");
      else
         System.out.println("Empolyee is Absent");
   }
}

