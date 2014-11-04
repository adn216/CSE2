/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

//import java.util.Scanner;
public class Exam{
  public static void main(String [] arg){
  
  //Scanner input= new Scanner(System.in);
  int i=1;
  while(i<=6){
    method1(i, 2);
    i++;
  }
  
 }
 
public static void method1(int i, int num){
  for(int j=1; j<=i; j++){
    System.out.println(num +" ");
    num *=2;
  }
}

}