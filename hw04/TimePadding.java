///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Homework 4: Time Padding
//This program is meant to display time in conventional form
//September 23th, 2014
//
//  First import the scanner class
//  First compile the program
//      javac TimePadding.java
//  run the program
//      java TimePadding
import java.util.Scanner;

//  define a class
public class TimePadding{

//  add main method
    public static void main (String [ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter the time in seconds: ");
    
    double nSeconds=myScanner.nextDouble();
    int nHours= (int) nSeconds/3600;
    int nMin= (int) (nSeconds%3600)/60;
    int seconds=(int) (nSeconds%3600)%60;
    
    System.out.printf("The time is "+nHours+":"+nMin+":"+seconds+"");
    
    }
    
}
    