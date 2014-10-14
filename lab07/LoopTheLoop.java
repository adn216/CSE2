//Aimee Denyse Niwenshuti
//CSE 2_lab07
//October 10th, 2014
import java.util.Scanner;

public class LoopTheLoop {
    public static void main (String [ ] args) {
        
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
        
    System.out.print("enter an int between 1 and 15: ");
        
    int nStars=myScanner.nextInt();
        
    int inputValue=1;
    
    while (true) {
    
        while (nStars<1 || nStars>15) {
        
            
            while (inputValue<=nStars) {
                int numberOfStars=1;
                while (numberOfStars<=inputValue) {
                    System.out.print("*");
                    
                    numberOfStars++;
                }
            System.out.println();
            inputValue++;
            break;
            
            System.out.print("Do you want to continue (Y, y): ");
        
    
            String answer=myScanner.next();
            
            
                if (answer.equals ("Y") || answer.equals ("y")) { 
                    continue;
        
                 }
        
            }
            
        System.out.println("Your integer was not in range [1,15]"); 
        break;
        
        }
    
   break;
    }
    
    } 
}