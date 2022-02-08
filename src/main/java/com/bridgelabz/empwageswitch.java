package com.bridgelabz;

// If Employee is present then employee wage is calculated per Hr as parttime or fulltime by using switch case .

public class empwageswitch{

      // Constants
     public static final int Fulltime=1;
     public static final int Parttime=2;
     public static final int emp_rate_per_hr=20;

     public static void main(String[] arg) {
     
      // variables
      int emphrs=0;
      int empwage=0;
      // computation
      double empCheck=Math.floor(Math.random()*10)%3;
         emphrs = switch ((int) empCheck) {
             case Fulltime -> 8;
             case Parttime -> 4;
             default -> 0;
         };
      empwage=emphrs*emp_rate_per_hr;
      System.out.println("Employee Wage: " + empwage);
 } 
}

