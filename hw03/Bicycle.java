///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Homework 3: Bicyle
//This program is meant to measure my bicycle's distance, average mph etc.
//September 15th, 2014
//
//  First import the scanner class
//  First compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle
import java.util.Scanner;

//  define a class
public class Bicycle{

//  add main method
    public static void main (String [ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter the number of counts (an integer > 0): ");
    
    int nCounts = myScanner.nextInt(); 
    
    System.out.print("Enter the number of seconds (an integer > 0): ");
    
    int nSeconds = myScanner.nextInt(); 


//  our intermediate variables and output data
    double wheeldiameter=27.0;
    double PI=3.14159;
    double feetPerMile=5280;
    double inchesPerFoot=12;
    double secondsPerMinute=60;
    double totalDistance;
    double totalTime;
    double averageMph;
        
//  compute the values for the total distance
    totalDistance=nCounts*wheeldiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=((int)(totalDistance*100))/100.0;
    // Above gives distance in inches
    // (for each count, a rotation of the wheel travels 
    // the diameter in inches times PI)
    //totalDistance/inchesPerFoot/feetPerMile gives distance in miles
    totalTime=nSeconds/secondsPerMinute;
    totalTime=((int)(totalTime*100))/100.0;
    //Above gives time in minutes
    
// print out the total distance
    System.out.println("The total distance was "+ totalDistance +" miles and took "+totalTime+"" );
    
//  compute the average miles per hour
    averageMph= totalDistance*60/totalTime ;
    averageMph= ((int)(averageMph*100))/100.0;
    
    
//print out the average miles per hour
    System.out.println("The average mph was "+averageMph+" ");
    
  }  //end of main method
}  //end of class