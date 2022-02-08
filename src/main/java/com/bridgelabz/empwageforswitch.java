package com.bridgelabz;

// If Employee is present then employee wage is calculated per Hr as parttime or fulltime by using switch case Assuming No.of working days in months as 20 .

public class empwageforswitch{

      // Constants
     public static final int Fulltime=1;
     public static final int Parttime=2;
     public static final int emp_rate_per_hr=20;
     public static final int No_of_working_days=20;

     public static void main(String[] arg) {

      // variables
      int emphrs=0;
      int empwage=0;
      int totalempwage=0;
      // computation
      for (int day=0; day<No_of_working_days; day++) {
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
      empwage=emphrs*emp_rate_per_hr;
      totalempwage += empwage;
      System.out.println("Employee Wage: " + empwage);
   }
      System.out.println("TotalEmployee Wage: " + totalempwage);
 } 
}

