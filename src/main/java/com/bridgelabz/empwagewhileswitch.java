package com.bridgelabz;

// If Employee is present then employee wage is calculated per Hr as parttime or fulltime by using switch case Assuming No.of working days in months.
// Using while condition for calculating max working hrs.

public class empwagewhileswitch{

      // Constants
     public static final int Fulltime=1;
     public static final int Parttime=2;
     public static final int emp_rate_per_hr=20;
     public static final int No_of_working_days=2;
     public static final int Max_hrs_in_month=10;

     public static void main(String[] arg) {

      // variables
      int totalemphrs=0;
      int totalworkingdays=0;
      int totalempwage=0;

      // computation
      while (totalemphrs<=Max_hrs_in_month &&
             totalworkingdays<No_of_working_days) {
           int emphrs=0;
           totalworkingdays++;
       int empCheck= (int)Math.floor(Math.random()*10)%3;
       switch (empCheck) {
         case Fulltime:
            emphrs=8;
            break;
         case Parttime:
            emphrs=4;
            break;
         default:
            emphrs=0;
      }
      totalemphrs  += emphrs;
      int empwage=emphrs*emp_rate_per_hr;
      totalempwage += empwage;
      System.out.println("Employee Wage: " + empwage);
   }
      System.out.println("TotalEmployee Wage: " + totalempwage);
      System.out.println("TotalEmployee Hrs: " + totalemphrs);

 } 
}

