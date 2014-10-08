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
        
    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
    
    String answer = myScanner.next();
    
    int length=answer.length();
    
    if (length != 1) {
      System.out.println("One single character is expected");
    }
    
    else if (answer.equals ("R") || answer.equals ("r")) {
    
      int roulette= (int) (Math.random()*37)+1;
      switch (roulette) {
        case 38:
            System.out.println("Roulette: 00");
            break;
        default: 
        System.out.println("Roulette: "+roulette);
      }
    }
    
    else if (answer.equals ("C") || answer.equals ("c")) {
    
      int craps1= (int) (Math.random()*6)+1;
      int craps2= (int) (Math.random()*6)+1;
      int sum=craps1+craps2;
      switch (craps1) {
        case 7:
            System.out.println("Craps: 00");
            break;
        default: 
        System.out.println("Craps: "+craps1+" + "+craps2+" = "+sum);
      }
    }
    
    else if (answer.equals ("P") || answer.equals ("p")) {
    
      int suit= (int) (Math.random()*4)+1;
      int card= (int) (Math.random()*12)+1;
      
      switch (suit) {
        case 1:
          switch (card) {
            case 1:
              System.out.println("Ace of hearts");
              break;
            case 11:
              System.out.println("Jack of hearts");
              break;
            case 12:
              System.out.println("Queen of hearts");
              break;
            case 13:
              System.out.println("King of hearts");
              break;
            default: 
              System.out.println(card+" of hearts");
              break;
          }
        break;
          
        case 2:
          switch (card) {
            case 1:
              System.out.println("Ace of diamonds");
              break;
            case 11:
              System.out.println("Jack of diamonds");
              break;
            case 12:
              System.out.println("Queen of diamonds");
              break;
            case 13:
              System.out.println("King of diamonds");
              break;
            default: 
              System.out.println(card+" of diamonds");
              break;
          }
        break;
          
        case 3:
          switch (card) {
            case 1:
              System.out.println("Ace of clubs");
              break;
            case 11:
              System.out.println("Jack of clubs");
              break;
            case 12:
              System.out.println("Queen of clubs");
              break;
            case 13:
              System.out.println("King of clubs");
              break;
            default: 
              System.out.println(card+" of clubs");
              break;
          }
        break;
          
        case 4:
          switch (card) {
            case 1:
              System.out.println("Ace of spades");
              break;
            case 11:
              System.out.println("Jack of spades");
              break;
            case 12:
              System.out.println("Queen of spades");
              break;
            case 13:
              System.out.println("King of spades");
              break;
            default: 
              System.out.println(card+" of spades");
              break;
          }
        break;
      }
    }
    
    else {
      System.out.println("You did not enter R, r, C, c, P, p");
    }
    
  }
}