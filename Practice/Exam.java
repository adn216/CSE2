//import java.util.Scanner;

public class Exam{

public static void main( String args[] ){
	
	//Scanner scan=new Scanner (System.in);
	
	int [ ] deck=new int [52];
	
	String [] suits={"Spades", "Hearts", "Diamonds", "Clubs"};
	String [] ranks={"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	for (int i=0; i<52; i++){
		deck[i]=i;
	}
	
	for (int i=0; i<52; i++){
		int index= (int) (Math.random()*52);
		
		int temp=deck[i];
		deck[i]=deck[index];
		deck[index]=temp;
	}
	
	for (int i=0; i<4; i++){
		String suit=suits[deck[i]/13];
		String rank=ranks[deck[i]%13];
		System.out.println("Card number "+deck[i]+": "+rank+" of "+suit);
	}
}
}
