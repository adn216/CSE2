///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Homework 4: Month
//This program is meant to show the number of days in a specific month of a specific year
//September 23th, 2014
//
//  First import the scanner class
//  First compile the program
//      javac Month.java
//  run the program
//      java Month
import java.util.Scanner;

//  define a class
public class Month{

//  add main method
    public static void main (String [ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter an int giving the number of the month (1-12): ");
    
    int month = myScanner.nextInt(); 
    double year;
    
    if (month == 4 ||month == 6 || month == 9 || month == 11) {
        System.out.println("This month has 30 days");
  } else if (month==1 || month == 3 ||month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        System.out.println("This month has 31 days");
  } else if (month==2) {
        System.out.print("Enter an int giving the year :");
        year = myScanner.nextDouble();
        if (year % 4 == 0){
            System.out.println("This month has 29 days");
      } else {
            System.out.println("This month has 28 days");
      }
     
  } else {
            System.out.println("You did not enter an int between 1 and 12");
  }
    }
}