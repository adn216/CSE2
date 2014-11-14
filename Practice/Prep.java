import java.util.Scanner;

public class Prep{
    public static void main (String [] args){
        Scanner scan=new Scanner(System.in);
        
int x = 3;
int y = 3;
do {
	x += 1;
	do {
		System.out.println( "[" + y + "]" );
		y -= 1;
	} while( y > 0 );
} while(x < 5);  

int a=3;
int b=3;

while(a<5){
    while(b>0){
      System.out.println("[" +b+ "]" );
      b-=1;
    }
    x +=1;
}

    
}
}

