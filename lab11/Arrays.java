//Aimee Denyse Niwenshuti
//lab 11
//Arrays
//Nov 7th, 2014
import java.util.Scanner;

public class Arrays{

    public static void main(String [] args){
        
        final int NUM_INTS=10;
        
        int [ ] input;
        
        input= new int [NUM_INTS];
        
        Scanner scan=new Scanner( System.in );
        
        System.out.print("Enter 10 integers ");
        
        input[0]=scan.nextInt();
        input[1]=scan.nextInt();
        input[2]=scan.nextInt();
        input[3]=scan.nextInt();
        input[4]=scan.nextInt();
        input[5]=scan.nextInt();
        input[6]=scan.nextInt();
        input[7]=scan.nextInt();
        input[8]=scan.nextInt();
        input[9]=scan.nextInt();

        int min = input[0];
        int max = input[0];;
        
        int i;
        for (i=1; i<10; i++){
	        if (input[i] < min) {
		        min = input[i];
	        }
	        
	        
	        if (input[i] > max) {
		        max = input[i];
	        }
	 
        }
        System.out.println("The lowest input is " +min);
        System.out.println("The lowest input is " +max);
        
        int sum=0;
        
        for(i=0; i<10; i++){
            sum+=input[i];
        }
        System.out.println("The sum is "+sum);
        
        for(i=0; i<10; i++){
            System.out.println(input[i]+"  "+input[9-i]);
            
        }
        
}
}