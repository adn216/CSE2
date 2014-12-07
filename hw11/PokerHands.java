// Aimee Denyse Niwenshuti
// HW11 
// Dec 5th 2014
// Poker Hands
import java.util.Scanner;

public class PokerHands{

    public static void main(String [] args){

    Scanner scan=new Scanner(System.in);

    int nsuit=0;

    int ncard=0;
    
    String [] array=new String [5];

    String number1="Clubs: ";

    String number2="Diamonds: ";

    String number3="Hearts: ";

    String number4="Spades: ";

    String suit[]={"Clubs: ", "Diamonds: ", "Hearts:   ",  "Spades:   "};

    String card[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
 
    String hand[]= new String [5];

    String [] [] numberOfCards= new String [4][13];

    for (int i=0; i<4; i++){

         numberOfCards[i][0]="A";

         numberOfCards[i][1]="K";

         numberOfCards[i][2]="Q";

         numberOfCards[i][3]="J";

         numberOfCards[i][4]="10";

         numberOfCards[i][5]="9";

         numberOfCards[i][6]="8";

         numberOfCards[i][7]="7";

         numberOfCards[i][8]="6";

         numberOfCards[i][9]="5";

         numberOfCards[i][10]="4";

         numberOfCards[i][11]="3";

        numberOfCards[i][12]="2";

     }

 System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");

 String answer3=scan.next();

 int count = 0;

  if(answer3.equals("y") || answer3.equals("Y")){

    while(count<5){

 System.out.print("Enter the suit: c, d, h, s: ");

    String answer1= scan.next();

        while(true){

            if(answer1.equals ("c") || answer1.equals ("d") || answer1.equals ("h") || answer1.equals ("s")){

                break;

            }

            else{

                System.out.print("Enter the suit: c, d, h, s: ");

                answer1= scan.next();

            }

        }

        if(answer1.equals ("c")){

            nsuit=0;

        }

        else if(answer1.equals ("d")){

            nsuit=1;

        }

        else if(answer1.equals ("h")){

            nsuit=2;

        }

        else {

            nsuit=3;

        }

    System.out.print("Enter one of A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3, 2: ");

    String answer2=scan.next();
    

    int test=0;

        while(true){

            switch(answer2){

                case "A":

                      test=1;break;

                case "K":test=1;

                  break;

                case "Q":test=1;

                break;

                case "J":test=1;break;

                case "10":test=1;break;

                case "9":test=1;break;

                case "8":test=1;break;

                case "7":test=1;break;

                case "6":test=1;break;

                case "5":test=1;break;

                case "4":test=1;break;

                case "3":test=1;break;

                case "2":test=1;break;

                default: test=0;

                System.out.print("Enter one of A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3, 2: ");

                         answer2=scan.next();break;

            }

            if(test==1){

                break;

            }

        }
        if(answer2.equals ("A")){

            ncard=0;

        }

        else if(answer2.equals ("K")){

            ncard=1;

        }

        else if(answer2.equals ("Q")){

            ncard=2;

        }

        else if(answer2.equals ("J")){

            ncard=3;

        }

        else if(answer2.equals ("10")){

            ncard=4;

        }

        else if(answer2.equals ("9")){

            ncard=5;

        }

        else if(answer2.equals ("8")){

            ncard=6;

        }

        else if(answer2.equals ("7")){

            ncard=7;

        }

        else if(answer2.equals ("6")){

            ncard=8;

        }

        else if(answer2.equals ("5")){

            ncard=9;

        }

        else if(answer2.equals ("4")){

            ncard=10;

        }

        else if(answer2.equals ("3")){

            ncard=11;

        }

        else {

            ncard=12;

        }

        if(numberOfCards[nsuit][ncard].equals("0")){

            System.out.println("You already entered the card");

            System.out.print("Enter one of A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3, 2: ");

            answer2=scan.next();

        }

        else{

          if (nsuit==0){

            number1=number1+" "+ numberOfCards[nsuit][ncard]+" ";
            array[count]=numberOfCards[nsuit][ncard];

        }

        else if (nsuit==1){

            number2=number2+" "+ numberOfCards[nsuit][ncard]+" ";
            array[count]=numberOfCards[nsuit][ncard];
        }

        else if (nsuit==2){

            number3=number3+" "+ numberOfCards[nsuit][ncard]+" ";
            array[count]=numberOfCards[nsuit][ncard];
        }

        else{

            number4=number4+" "+ numberOfCards[nsuit][ncard]+" ";
            
            
            array[count]=numberOfCards[nsuit][ncard];
        }

        numberOfCards[nsuit][ncard]= "0";
        count++;
        }
        

   }

     System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4);
     for(int m=0; m<5; m++){
        System.out.print(array[m]+" ");
     }
    
    if(royalFlush (array)){
        System.out.println("This is a royal flush");
    }
    
    if(straightFlush(array)){
        System.out.println("This is a straight flush");
    }
     
    if(fullHouse(array)){
        System.out.println("This is a full house");
    }
    
    if(twoPair(array)){
        System.out.println("This is a two pair");
    }
    
    if(onePair(array)){
        System.out.println("This is a one pair");
    }
  }

 else{
    System.out.println("You did not enter a valid response");
    

 }


    }
    
  public static boolean royalFlush(String [] array){
    boolean result=false;
      
    if(array[0].equals("A") && array[1].equals("K") && array[2].equals("Q") && array[3].equals("J") && array[4].equals("10")){
          result=true;
    }
    return result;
  }  

  public static boolean straightFlush(String [] array){
      
      boolean result1=false;
      if(array[0].equals(array[1]) && array[0].equals(array[2]) && array[0].equals(array[3]) ){
        result1=true;  
      }
      return result1;
  } 
  
   public static boolean fullHouse(String [] array){
      
      boolean result2=false;
      if(array[0].equals(array[1]) && array[0].equals(array[2]) && array[3].equals(array[4]) ){
        result2=true;  
      }
      return result2;
  } 
  
  public static boolean twoPair(String [] array){
      
      boolean result3=false;
      if(array[0].equals(array[1]) && array[2].equals(array[3]) && !array[0].equals(array[2]) && !array[2].equals(array[4]) ){
        result3=true;  
      }
      return result3;
  }
  
  public static boolean onePair(String [] array){
      
      boolean result4=false;
      if(array[0].equals(array[1]) && !array[0].equals(array[2]) && !array[0].equals(array[3]) && !array[0].equals(array[4]) ){
        result4=true;  
      }
      return result4;
  }
  
}
