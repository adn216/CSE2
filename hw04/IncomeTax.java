///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Homework 3: Income taxes
//This program is meant to compute tax on different incomes
//September 23th, 2014
//
//  First import the scanner class
//  First compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax
import java.util.Scanner;

//  define a class
public class IncomeTax{

//  add main method
    public static void main (String [ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter an int giving the number of thousands (an integer > 0): ");
    
    int income = myScanner.nextInt(); 
    int incomeThousands=income*1000;
    
    if (income>0 & income<20) {
        double incomeTax=income*0.145*1000;
        int tax= (int) incomeTax;
        System.out.println("The tax rate on $"+incomeThousands+" is 14.5%, and the income tax is $"+tax);
  } else if (income>=20 & income<40) {
        double incomeTax=income*0.07*1000;
        int tax= (int) incomeTax;
        System.out.println("The tax rate on $"+incomeThousands+" is 7%, and the income tax is $"+tax);
  } else if (income>=40 & income<78) {
        double incomeTax=income*0.12*1000;
        int tax= (int) incomeTax;
        System.out.println("The tax rate on $"+incomeThousands+" is 12%, and the income tax is $"+tax);
  } else if (income>78) {
        double incomeTax=income*0.14*1000;
        int tax= (int) incomeTax;
        System.out.println("The tax rate on $"+incomeThousands+" is 14%, and the income tax is $"+tax);
  } else if (income<0) {
        System.out.println("You did not enter a positive number");
  } else{
        System.out.printf("You did not enter an integer");
  }
  
    }
    
}
        