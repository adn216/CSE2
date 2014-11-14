
import java.util.Scanner;
public class Rest{
    public static void main (String [] args){
        
        Scanner scan=new Scanner(System.in);
        int number;
        boolean check=false;
        
        //boolean isPrime=true;
        
        do{
            System.out.print("Enter a positive integer: ");
            
            while(!scan.hasNextInt()){
                scan.next();
                System.out.println("You did not enter an integer, try again: ");
            }
            number=scan.nextInt();
            
            if(number==0){
                check=false;
                System.out.println(" GoodBye ");
            }
            else if(number<0){
                check=false;
                System.out.println(" Invalid ");
            }
            else{
                check=true;
                if(isPrime(number)){
                    System.out.println("PRIME! ");
                }
                else{
                    System.out.println("Not PRIME");
                }
            
        } 
        
    }while(check);
}

public static boolean isPrime(int x){
    int divisor;
    for(divisor=2; divisor<=(x/2); divisor++){
        if(x % divisor==0){
            return false;
        }
        
    
    }
    
            return true;
}


}
