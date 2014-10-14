
//Aimee Denyse Niwenshuti
//CSE 2 Hwk6
//October 14th, 2014
//This program estimates the square root of a number
import java.util.Scanner;

public class Root {
    public static void main (String [ ] args) {
        
    Scanner myScanner= new Scanner( System.in );  //declare an instance of the Scanner object
     
    System.out.print("Enter a double that is greater than zero: ");
    
    double x= myScanner.nextDouble();
    
    double low=0.0;
    double high=1+x;
    double middle=0.0;
        
    if (x<0){
        System.out.println("A positive double is expected");
        return;
    }
    
    while ((high-low)>0.0000001*(1+x)) {
        
        middle=(high+low)/2;
        
        if (Math.pow(middle, 2)>x) {
        high=middle;
         }
        else {
        low=middle;
        }
        
    }
    System.out.println("The square root of "+x+" is between ["+low+","+high+"]");
    
    }
}