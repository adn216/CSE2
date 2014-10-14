//Aimee Denyse Niwenshuti
//CSE 2_lab07
//October 10th, 2014
import java.util.Scanner;

public class LoopTheLoop {
    public static void main (String [ ] args) {
        
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
        
    
    int nStars;    
    
        
    int inputValue=1;
    
    
    while (true) {
        System.out.print("enter an int between 1 and 15: ");
        nStars=myScanner.nextInt();
        if (nStars>1 || nStars<15) {
        
            
            while (inputValue<=nStars) {
                
                int numberOfStars=1;
                while (numberOfStars<=inputValue) {
                    System.out.print("*");
                    
                    numberOfStars++;
                }
            
            System.out.println();
            inputValue++;
            
            }
            inputValue=1;
        }
        
        else {
            System.out.print("The number is out of range");
        }
    System.out.print("Do you want to continue?: ");
    String answer=myScanner.next();
    
    if (answer.equals ("y") || answer.equals ("Y")) {
        
    }
    else {
        break;
        
    }  
    }   
    
    } 
}