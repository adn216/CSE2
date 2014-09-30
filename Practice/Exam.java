// Aimee Denyse Niwenshuti
// Exam prep
// Sept 24th
import java.util.Scanner;

public class Exam {
   
    public static void main (String [ ] args) {
    
    Scanner input= new Scanner (System.in);
    
    System.out.print("Enter a year: ");
    
    int year= input.nextInt();
    
    boolean isLeapYear=(year%4==0 && year%100 !=0) || (year%400==0);
        
    System.out.println(year+" is leap year? "+ isLeapYear);
  
    }
}
 