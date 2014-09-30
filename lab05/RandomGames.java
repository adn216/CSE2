////////////////////////////////////////////////////////////////////////////////////////////
// Aimee Denyse Niwenshuti
// CSE 2
// lab05-a program that 
// Sept 26th, 2014
//
//  First import the scanner class
//  compile the program
//      javac RandomGames.java
//  run the program
//      java RandomGames//
import java.util.Scanner;

//  define a class
public class RandomGames {
    
//  add main method 
  public static void main(String[ ] args) {
    
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
        
    System.out.print("Enter one of the three choices for a game chance: ");
    
    String R = myScanner.next();
    
    if (R.equals ("R") || R.equals ("r")); {
    
    int roulette= (int) (Math.random()*37)+1;
    switch (roulette) {
        case 38:
            System.out.println("Roulette: 00");
            break;
        default: 
        System.out.println("Roulette: "+roulette);
    }
}   
  }
}