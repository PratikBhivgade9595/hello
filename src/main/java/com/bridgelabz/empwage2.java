package com.bridgelabz;

// If Employee is present then employee wage is calculated per Hr.

public class empwage2{
    public static void main(String[] arg) {
      // Constants
      int Fulltime=1;
      int emp_rate_per_hr=20;
      // variables
      int emphrs=0;
      int empwage=0;
      // computation
      double empCheck=Math.floor(Math.random()*10)%2;
      if (empCheck==Fulltime)
          emphrs=8;
      empwage=emphrs*emp_rate_per_hr;
      System.out.println("Employee Wage: " + empwage);
   }
}

