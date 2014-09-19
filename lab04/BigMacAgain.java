////////////////////////////////////////////////////////////////////////////////////////////
// Aimee Denyse Niwenshuti
// CSE 2
// lab04-a program that computes the cost of buying some Big Macs
// Sept 19th, 2014
//
//  First import the scanner class
//  compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain//
import java.util.Scanner;

//  define a class
public class BigMacAgain {
    
//  add main method 
  public static void main(String[ ] args) {
    
    double bigMac$=2.22;
    double frenchFries$=2.15;
    
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
        
    System.out.print("Enter the number of Big Macs(an integer > 0): ");
    
    int nBigMacs = myScanner.nextInt();
    double nBigMacsCost$=nBigMacs*bigMac$;
    
    
    if (nBigMacs>0) {
      System.out.printf("You ordered "+nBigMacs+" Big Macs for a cost of $ %.2f",nBigMacsCost$);
      
    } else{
          System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                //the program terminates
    }
    
    System.out.print("Do you want an order of french fries?"); 
    
    String answer = myScanner.next();
    double totalCost$= nBigMacsCost$+frenchFries$;
    
    if (answer.equals("Y") || answer.equals("y")) {
      System.out.printf("The total cost of the meal is $ %.2f",totalCost$);
      
    } else if (answer.equals("N") || answer.equals("n")) {
        System.out.printf("The total cost of the meal is $ %.2f",nBigMacsCost$);
    }
    
       else{
        System.out.printf("You did not enter one of 'y', 'Y', 'N', 'n'");
    }
        }  //end of main method   
  } //end of class