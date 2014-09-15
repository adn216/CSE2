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
         
        System.out.print("Enter a myDouble: ");
        
        double myDouble = myScanner.nextInt();
        
        int fourDigits;
        
        fourDigits=(int)(myDouble*10000)%10000;
        
        System.out.println("The four digits to the right of the decimal point are "+fourDigits+"");
        
  }  //end of main method   
} //end of class