///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Homework 5: Boola Boola
//This program is meant to display the table of truth
//September 30th, 2014
//
//  First import the scanner class
//  First compile the program
//      javac BoolaBoola.java
//  run the program
//      java BoolaBoola
import java.util.Scanner;

//  define a class
public class BoolaBoola{

//  add main method
    public static void main (String [ ] args) {
        
    Scanner input= new Scanner (System.in);

    boolean value1;
    boolean value2;
    boolean value3;
    
    int val1=(int) (Math.random()*2);
    int val2=(int) (Math.random()*2);
    int val3=(int) (Math.random()*2);
    
    if (val1==0) {
        value1=false;
}  else {
        value1=true;
}

    if (val2==0) {
        value2=false;
}   else {
        value2=true;
}

    if (val3==0) {
        value3=false;
}   else {
        value3=true;
}
    boolean firstExpression=(value1 && value2 && value3);
        System.out.println("Does "+value1+"&&"+value2+"&&"+value3+"have the value true(t/T) or false(f/F "+firstExpression );
        String answer=input.next();
        boolean answerInBoolean=true;
        if (answer.equals ("t") || answer.equals ("T")) { 
            answerInBoolean=true;
    }   else if (answer.equals ("f") || answer.equals ("F")) { 
            answerInBoolean=false;
    }   else {
        System.out.println("You did not enter F, f, T, t");
    }
    
        if (answerInBoolean==firstExpression) {
            System.out.println("correct");
    }   else {
        System.out.println("Wrong, try again");
    }
        
    
    boolean secondExpression=(value1 && value2 || value3);
        System.out.println("Does "+value1+"&&"+value2+"||"+value3+"have the value true(t/T) or false(f/F "+secondExpression );
        String answer1=input.next();
        boolean answerInBoolean1=true;
        if (answer1.equals ("t") || answer1.equals ("T")) { 
            answerInBoolean1=true;
    }   else if (answer1.equals ("f") || answer1.equals ("F")) { 
            answerInBoolean1=false;
    }   else {
        System.out.println("You did not enter F, f, T, t");
    }
    
        if (answerInBoolean1==secondExpression) {
            System.out.println("correct");
    }   else {
        System.out.println("Wrong, try again");
    }
    
    boolean thirdExpression=(value1 || value2 && value3);
        System.out.println("Does "+value1+"||"+value2+"&&"+value3+"have the value true(t/T) or false(f/F "+thirdExpression );
    
        String answer2=input.next();
        boolean answerInBoolean2=true;
        if (answer2.equals ("t") || answer2.equals ("T")) { 
            answerInBoolean2=true;
    }   else if (answer2.equals ("f") || answer2.equals ("F")) { 
            answerInBoolean2=false;
    }   else {
        System.out.println("You did not enter F, f, T, t");
    }
    
        if (answerInBoolean2==thirdExpression) {
            System.out.println("correct");
    }   else {
        System.out.println("Wrong, try again");
    }
    
    boolean fourthExpression=(value1 || value2 || value3);
    System.out.println("Does "+value1+"||"+value2+"||"+value3+"have the value true(t/T) or false(f/F "+fourthExpression );
        String answer3=input.next();
        boolean answerInBoolean3=true;
        if (answer3.equals ("t") || answer3.equals ("T")) { 
            answerInBoolean3=true;
    }   else if (answer3.equals ("f") || answer3.equals ("F")) { 
            answerInBoolean3=false;
    }   else {
        System.out.println("You did not enter F, f, T, t");
    }
    
        if (answerInBoolean3==fourthExpression) {
            System.out.println("correct");
    }   else {
        System.out.println("Wrong, try again");
    }
    }
}
    
    