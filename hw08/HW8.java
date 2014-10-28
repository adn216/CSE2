// Aimee Denyse Niwenshuti
// CSE 2 hw08
// This homework has the objective of giving you practice in writing methods,
// overloading methods, and in forcing the user to enter good input.
// October 28th, 2014

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	String input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=" "){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  } 
  
  public static String getInput(Scanner scan, String string ){
      String userInput1="abc";
      int numberOfCharacters1;
      int status1=0;
      System.out.print("Enter a character ");//force the use to enter a character
  
      while (true){
          userInput1=scan.next();
          if(userInput1.length()==1) { //check if it is one character
             for(numberOfCharacters1=0; numberOfCharacters1<string.length(); numberOfCharacters1++ ){
                if (userInput1.equals(string.charAt(numberOfCharacters1)+"")) { //check if the userInput(specific character) corresponds to the string
                status1=1;
                break;
                }
                else {
                status1=0;
                }
            
                } 
              if(status1==1){
                return userInput1;
                
                }
                else{
                System.out.print("You did not enter a character from the list " +string+ " ;try this again- ");
                 }   
          }
          else{
              System.out.print("You should enter exactly one character ");
          }
       
      }
  }
  

  
  public static String getInput(Scanner scan, String word , int count){
      String userInput="xyz";
      int numberOfCharacters;
      int status=0;
      System.out.print("Enter a character:"); //force the user to enter a character
      for (int number=1; number<=count; number++){
        userInput=scan.next();
        for(numberOfCharacters=0; numberOfCharacters<word.length(); numberOfCharacters++ ){
           if (userInput.equals(word.charAt(numberOfCharacters)+"")) { //check if the userInput(specific character) corresponds to the word
               status=1;
               break;
           }
           else {
               status=0;
           }
            
        }
        if (status==1) {
            break;  
        }
        System.out.print("You did not enter a character from the list '"+word+"'; try again- ");  
      }
      if (status==1){
          return userInput;
      }
      else{
          
          return "You failed after " +count+ " tries";
      }
          
  }
  
    public static String getInput(Scanner scan, String digit, String numbers){
      
      digit="123";
      int numberOfCharacters2;
      int status2=0;
      System.out.print("Choose a digit ");// force the user to choose a digit
       while (true){
          digit=scan.next();
          if(digit.length()==1) {// check that the digit chosen is one character
             for(numberOfCharacters2=0; numberOfCharacters2<numbers.length(); numberOfCharacters2++ ){
                if (digit.equals(numbers.charAt(numberOfCharacters2)+"")) {//check if the digit corresponds to any of the numbers
                status2=1;
                break;
                }
                else {
                status2=0;
                }
            
                } 
              if(status2==1){
                return digit;
                //break;
                }
                else{
                System.out.print("You did not enter an acceptable character ");
                 }   
          }
          else{
              System.out.print("Enter exactly one character ");
          }
       
      }
  }
}
/*SAMPLE RUNS:
Enter 'C' or 'c' to continue, anything else to quit- 7
You did not enter a character from the list 'Cc'; try again- ths
You should enter exactly one character- c
You entered 'c'
Enter 'y', 'Y', 'n', or 'N'- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again-
You failed after 5 tries
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- yu
Enter exactly one character
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- u
You did not enter an acceptable character
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 2
You entered '2’
-----------------------
Enter 'C' or 'c' to continue, anything else to quit- c
You entered 'c'
Enter 'y', 'Y', 'n', or 'N'- N
You entered 'N'
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 9
You entered '9’*/
