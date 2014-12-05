// Aimee Denyse Niwenshuti
// Dec 5th, 2014
// Ragged Arrays and Sorting
// lab13

public class RaggedArrays{
    public static void main (String [ ] args){
        
        int [][] array= new int [5][];
        array[0]=new int[5];
        array[1]=new int[8];
        array[2]=new int[11];
        array[3]=new int[14];
        array[4]=new int[17];
        
        System.out.println("The array before sorting");
        System.out.println();
        
        for(int i=0; i<5; i++){
            for(int j=0; j<array[i].length; j++){
            array[i][j]=(int) (Math.random()*40);
            System.out.print(array[i][j]+" ");
            }
        System.out.println();
        }
        
        System.out.println();
        System.out.println("The array after sorting");
        System.out.println();
        
        for (int a=0; a<5; a++){
            for(int b=0; b<array[a].length; b++){
                int currentMin=array[a][b];
                int currentMinIndex=b;
                
                for(int m=b+1; m<array[a].length; m++){
                    if(currentMin>array[a][m]){
                        currentMin=array[a][m];
                        currentMinIndex=m;
                    }
                }
            if(currentMinIndex!=b){
                array[a][currentMinIndex]=array[a][b];
                array[a][b]=currentMin;
            }
            System.out.print(array[a][b]+" ");
            }
            System.out.println();
            
        }
   
        
    }
  
} 