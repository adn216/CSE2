///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Homework 4: Course number
//This program is meant to show the semester during which a course was offered at Lehigh
//September 23th, 2014
//
//  First import the scanner class
//  First compile the program
//      javac CourseNumber.java
//  run the program
//      CourseNumber
import java.util.Scanner;

//  define a class
public class CourseNumber{

//  add main method
    public static void main (String [ ] args) {
    Scanner myScanner;                         //declare an instance of the Scanner object
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter a six digit number giving the course semester: ");
    
    int courseNumber = myScanner.nextInt(); 
    
    int year= (int) courseNumber/100;
    int semester= courseNumber-(year*100);
    
    if (courseNumber < 1865010 || courseNumber > 201440) {
        System.out.println("The number was outside the range [186510,201440]");
    }
    else if (semester==10) {
        System.out.println("The course was offered in Spring of " +year);
    }
    else if (semester==20) {
        System.out.println("The course was offered in Summer 1 of " +year);
    }
    else if (semester==30) {
        System.out.println("The course was offered in Summer 2 of " +year);
    }
    else if (semester==40) {
        System.out.println("The course was offered in Fall of " +year);
    } 
     else if (semester!=10 || semester!=20 || semester!=30 || semester!=40) {
        System.out.println(""+semester+" is not a legitimate semester");
    }
    
   
    else {
        System.out.println("no answer");
    }
    }
}
