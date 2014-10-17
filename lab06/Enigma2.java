//Aimee Denyse Niwenshuti
//October 8th, 2014
//lab 06

import java.util.Scanner;
public class Enigma2{
  public static void main(String [ ] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/2;
    }
    System.out.println(out);
  }
}

/*import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}*/

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * In the terminal, java.lang exception shows that there is an error (/ by zero)
 * on the 13th line because a integer was divided by 0 which is impossible.
 * 
 * I replaced zero by 2.
 * 
 */