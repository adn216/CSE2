//Aimee Denyse Niwenshuti
//CSE 2 Hwk6
//October 14th, 2014


public class Roulette {
    public static void main (String [ ] args) {
        
        
        int bettingNumber=(int) (Math.random()*38)+1;
        
        int spin=1;
        
        int session=1;
        
        int roulettenumber=0;
         
        int winningCounts=0;
        
        int counts=0;
        
        int wonSession=0;
        
        int loseCounts=0;
        
        while (session<=1000) {
            
            while (spin<=100){
            
                roulettenumber= (int) (Math.random()*38)+1;
            
                if(bettingNumber==roulettenumber) {
                counts=counts+1;
                winningCounts= winningCounts+1;
                
                }
                spin++;
            }
            
            if (counts>=3){
                wonSession=wonSession+1;
            }
            
            if (counts==0){
                loseCounts=loseCounts+1;
            }
           session++;
           counts=0;
           spin=0;
        }
        
       System.out.println("The betting number was: "+bettingNumber);
       System.out.println("The number of times I lose everything: "+loseCounts);
       System.out.println("The total winning were: "+winningCounts);
       System.out.println("Number of times I walked away with a profit : "+wonSession);
    }
}