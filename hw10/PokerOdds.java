//Aimee Denyse Niwenshuti
//CSE 2 hwk10
//This program randomly generates hand of 5 cards 
//Nov. 18th, 2014


import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
public static void showHands(){
    Scanner scan=new Scanner(System.in);
    String answer="";
    
    /*String number1="Clubs: ";
    String number2="Diamonds: ";
    String number3="Hearts: ";
    String number4="Spades: ";*/
    String[] suits={"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks={"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    int random1=0;
    int random2=1;
    
  do {
    String number1="Clubs: ";
    String number2="Diamonds: ";
    String number3="Hearts: ";
    String number4="Spades: ";
    
    for (int i=0; i<5; i++){
      random1=(int) (Math.random()*4);
      random2=(int) (Math.random()*13);
      if (random1==0){
        number1=number1+" "+ ranks[random2]+" ";
      }
      else if (random1==1){
        number2=number2+" "+ ranks[random2]+" ";
      }
      
      else if (random1==2){
        number3=number3+" "+ ranks[random2]+" ";
      }
      else{
        number4=number4+" "+ ranks[random2]+" ";
      }
    }
    System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4);
    
    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("y") || answer.equals("Y"));
    
  }  
  
  public static void simulateOdds(){
    String[] ranks={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    int [] counts=new int [13];
    int [] pairs=new int[13];
    int [] notPairs=new int [13];
    for (int m=0; m<13; m++){
      counts[m]=0;
      pairs[m]=0;
      notPairs[m]=0;
    }
    
    for(int k=0; k<10000; k++){
      for (int l=0; l<5; l++){
        int randomRank=(int) (Math.random()*13);
          if (randomRank==0){
            counts[0]++;
          }
          else if (randomRank==1){
            counts[1]++;
          }
          else if (randomRank==2){
            counts[2]++;
          }
          else if (randomRank==3){
            counts[3]++;
          }
          else if (randomRank==4){
            counts[4]++;
          }
          else if (randomRank==5){
            counts[5]++;
          }
          else if (randomRank==6){
            counts[6]++;
          }
          else if (randomRank==7){
            counts[7]++;
          }
          else if (randomRank==8){
            counts[8]++;
          }
          else if (randomRank==9){
            counts[9]++;
          }
          else if (randomRank==10){
            counts[10]++;
          }
          else if (randomRank==11){
            counts[11]++;
          }
          else {
            counts[12]++;
          }
      }
      
      for(int y=0; y<13; y++){
        if(counts[y]==2){
          pairs[y]++;
        }
        else if (counts[y]>2){
          notPairs[y]++;
        }
          
        }
      }
      
    for (int s=0; s<13; s++){
      System.out.println(ranks[s]+"  "+pairs[s]);
      
      
      
      
      
    }
    System.out.println("-------------");
    
    int result=0;
    for (int b=0; b<13; b++){
        result+=notPairs[b];
        
      }
    System.out.println("Total not exactly one pair: "+result);
      
    }
    
  }
