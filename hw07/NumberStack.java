// Aimee Denyse Niwenshuti
// CSE 2 Homework 07
// Write a program that forces the user to enter an integer between 1 and 9
// inclusive, and then prints out displays that depend on the value entered
// October 21st, 2014

import java.util.Scanner;

public class NumberStack {
    public static void main ( String [ ] arg) {
        
        Scanner input=  new Scanner( System.in );  //declare an instance of the Scanner object
     
        System.out.print("Enter an integer between 1 and 9: ");
        
        int i=input.nextInt();
        
        int numberOfLines=1;
        
        int digitsInOneLine=1;
        
        int count=0;
        
        int numberOfDash=0;
        
        if (i>9 && i<1){
            System.out.println("The integer must be between 1 and 9");
        }
        
    // Program using for loops
        if (i<10 && i>0){
            System.out.println("Using for loops: ");
            for (int inputValue=1; inputValue<=i; inputValue++ ) {
                for (numberOfLines=1; numberOfLines<=inputValue; numberOfLines++ ) {
                    digitsInOneLine=(inputValue*2)-1;
                    for (count=0;count<digitsInOneLine; count++ ){
                        System.out.print(" "+inputValue+" " );
                    }
                    System.out.println();
                } 
                
                for (numberOfDash=0; numberOfDash<digitsInOneLine; numberOfDash++ ){
                    System.out.print( " _ " );
                }
                System.out.println();
                System.out.println();
            }
        }
        
    // Program using while loops  
    
    numberOfLines=1;
        
    digitsInOneLine=1;
        
    count=0;
        
    numberOfDash=0;
        
        if (i<10 && i>0){
            System.out.println("Using while loops: ");
            int inputValue=1;
            while (inputValue<=i){
                while (numberOfLines<=inputValue) {
                    digitsInOneLine=(inputValue*2)-1;
                    while (count<digitsInOneLine) {
                       System.out.print(" "+inputValue+" " );
                       count++;
                    }
                count=0;
                System.out.println();
                numberOfLines++;   
                }
                
                
                numberOfLines=1;
            
            inputValue++;
            
            
            while(numberOfDash<digitsInOneLine) {
                System.out.print( " _ " );
                numberOfDash++;
            }
            System.out.println();
            numberOfDash=0;
            System.out.println();
            }
            
        }
        
        
    // Program using do while loops  
    
    numberOfLines=1;
        
    digitsInOneLine=1;
        
    count=0;
        
    numberOfDash=0;
    
    if (i<10 && i>0){
        System.out.println("Using do while loops: ");
        int inputValue=1;
        
        do {System.out.println();
            numberOfDash=0;
            //System.out.println();
            
            numberOfLines=1;
            do{ 
                count=0;
                digitsInOneLine=(inputValue*2)-1;
                do { System.out.print(" "+inputValue+" " );
                     count++;
                } while (count<digitsInOneLine);
                numberOfLines++;
                System.out.println();
            }
            while (numberOfLines<=inputValue);
            
            do { System.out.print( " _ " );
                numberOfDash++;
                
            } while (numberOfDash<digitsInOneLine);
            System.out.println();
            inputValue++;
        } 
        while (inputValue<=i);
    }
    
        
    }
}