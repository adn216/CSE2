//Aimee Denyse Niwenshuti
//CSE 2 Hwk6
//October 14th, 2014
//Aimee Denyse Niwenshuti
//CSE 2 Hwk6
//October 14th, 2014
import java.util.Scanner;

public class Root {
    public static void main (String [ ] args) {
        
    Scanner myScanner= new Scanner( System.in );  //declare an instance of the Scanner object
     
    System.out.print("Enter a double that is greater than zero: ");
    
    double x= myScanner.nextDouble();
    
    double low=0.0;
    double high=1+x;
    double middle;
    
    while (low<high) {
        middle=(1+x)/2;
        while (Math.pow(middle,2)>high) {
        System.out.print("["+low+" , "+Math.pow(middle,2)+"]");
        
            middle=(1+Math.pow(middle,2))/2;
            while (Math.pow(middle,2)<high){
            System.out.print("["+Math.pow(middle,2)+" , "+high+"]");
            
        middle++;
        
            }
        middle++;
        
        }
    
    System.out.println();
    x++;
    break;
      
    }   
        
    }
}