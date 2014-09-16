////////////////////////////////////////////////////////////////////////////////////////////
// Aimee Denyse Niwenshuti
// CSE 2
// hw03-a program that prints out the first four digits to the right
//of the decimal point of a double
// Sept 15th, 2014
//
//  First import the scanner class
//  compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits
import java.util.Scanner;

//  define a class
public class FourDigits{
    
//  add main method 
    public static void main(String[ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
         
    System.out.print("Enter a double: ");
        
    double myDouble = myScanner.nextDouble();
    
    //computation for the 4 digits after the decimal point    
    int number1= (int) myDouble*10000;
    int number2= (int) (myDouble*10000);
        
    int fourDigits= number2-number1;
    //for instance if 23.4567 is the double
    //number 1 would give 230000
    //number 2 would give 234567
    //therefore the difference between them (4567) consists of the 4 digits after the decimal point
        
    //Print out the four digits to the right of the decimal point  
    System.out.printf("The four digits to the right of the decimal point are %04d",fourDigits);
        
  }  //end of main method   
} //end of class