import java.util.Scanner;

//  define a class
public class Rest{

//  add main method
    public static void main (String [ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter the time in seconds: ");
    
    double nSeconds=myScanner.nextDouble();
    
    double rest=nSeconds%60;
    
    System.out.println("The rest is"+rest);
    
    }
    
}