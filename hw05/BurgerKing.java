///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Homework 5: Burger King
//This program is meant to display an order
//September 30th, 2014
//
//  First import the scanner class
//  First compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing
import java.util.Scanner;

//  define a class
public class BurgerKing{

//  add main method
    public static void main (String [ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter a letter to indicate a choice of Burger (B or b) Soda (S or s) Fries (F or f) ): ");
    
    String choice= myScanner.next();
    
    if (choice.length()==1) {
    
    switch (choice) {
        case "B":
        
        case "b" :
            System.out.print("Enter A or a for all the fixins, C or c for cheese, N or n for none of the above c: ");
            String fixins=myScanner.next();
            
            if (fixins.equals ("A") || fixins.equals ("a")) {
                System.out.println("You ordered a burger with all the fixins");
                
        }   else if (fixins.equals ("C") || fixins.equals ("c")) {
                System.out.println("You ordered a burger with  cheese");
        }   else if (fixins.equals ("N") || fixins.equals ("n")) {
                System.out.println("You ordered a burger with no cheese nor other fixins");
        }   else {
                System.out.println("You did not enter A, a, C, c, N, n");
        }; break;
        
        case "S":
        
        case "s":
            System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m): ");
            String soda= myScanner.next();
            
            if (soda.equals ("P") || soda.equals ("p") ) {
                System.out.println("You ordered a pepsi");
        }   else if (soda.equals ("C") || soda.equals ("s") ) {
                System.out.println("You ordered coke");
        }   else if (soda.equals ("M") || soda.equals ("m") ) {
                System.out.println("You ordered Mountain Dew");
        }   else if (soda.equals ("S") || soda.equals ("s") ) {
                System.out.println("You ordered Sprite");
        }  else {
                System.out.println("You did not enter P, p, C, c, M, m, S, s");
        }; break;
        
        case "F":
            
        case "f":
            System.out.println("Do you want a large or small order of fries (l,L,s, or S): ");
            String fries=myScanner.next();
            
            if (fries.equals ("L") || fries.equals ("l")) {
                System.out.println("You ordered large fries");
        }   else if (fries.equals ("S") || fries.equals ("s")) {
                System.out.println("You ordered small fries");
        }   else {
                System.out.println("You did not enter L, l, S, s");
        }; break;
        
        default:
            System.out.println("You did not enter a choice of Burger (B or b) Soda (S or s) Fries (F or f)");
        break;
        
    }
    }
    else {
        System.out.println("a single character expected");
    }
    }
}
        
                
            
            
            
        
        
        