////////////////////////////////////////////////////////////////////////////////////////////
// Aimee Denyse Niwenshuti
// CSE 2
// hw03-a program that computes the cube root of a number 
// Sept 15th, 2014
//
//  First import the scanner class
//  compile the program
//      javac Root.java
//  run the program
//      java Root
import java.util.Scanner;

//  define a class
public class Root {
    
//  add main method 
  public static void main(String[ ] args) {
        Scanner myScanner;                         //declare an instance of the Scanner object
        myScanner = new Scanner( System.in );
         
        System.out.print("Enter a double");
    
        double x = myScanner.nextDouble(); 
        
        //computation of my guesses
        double guess1=x/3;
        double guess2=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5=(2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        double guess6=(2*guess5*guess5*guess5+x)/(3*guess5*guess5);
        
        //print out the cubic root
        System.out.println("The cubic root is "+guess6);
        
        //compute the cube of the cubic root to check if it is close to x
        double xCube=guess6*guess6*guess6;
        
        //print out the cube of the cubic root
        System.out.println("the sample number is close to "+xCube);
        
  } //end of main method
} //end of class