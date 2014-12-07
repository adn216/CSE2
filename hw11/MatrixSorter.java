// Aimee Denyse Niwenshuti
// CSE 2 
// Dec 5th
//Matrix sorter: Printing a 3d matrix, finding the min number, and sorting the last slab

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    //findMin(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
  	
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
  public static int [] [] [] buildMat3d(){ //building the 3d array
      
        int [][][] mat3d= new int [3][][];
        
        mat3d[0]=new int[3][];
        mat3d[1]=new int[5][];
        mat3d[2]=new int[7][];
        
        mat3d[0][0]=new int[1];
        mat3d[0][1]=new int[2];
        mat3d[0][2]=new int[3];
        
        mat3d[1][0]=new int[2];
        mat3d[1][1]=new int[3];
        mat3d[1][2]=new int[4];
        mat3d[1][3]=new int[5];
        mat3d[1][4]=new int[6];
        
        mat3d[2][0]=new int[3];
        mat3d[2][1]=new int[4];
        mat3d[2][2]=new int[5];
        mat3d[2][3]=new int[6];
        mat3d[2][4]=new int[7];
        mat3d[2][5]=new int[8];
        mat3d[2][6]=new int[9];
        
        for(int i=0; i<3; i++){ //attributing a random number to each spot
           for(int j=0; j<mat3d[i].length; j++){
               for(int k=0; k<mat3d[i][j].length; k++){
                    mat3d[i][j][k]=(int) (Math.random()*100);
              }
          }
        
        }
        return mat3d;    
  }
   
   
  public static void show(int [] [] [] mat3d){ //printing the 3d array
      System.out.println("-----------------------slab1");
      
      for (int m=0; m<mat3d[0].length; m++){
          for(int n=0; n<mat3d[0][m].length; n++){
              System.out.print(mat3d[0][m][n]+" ");
          }
          System.out.println();
      }
      
      System.out.println("------------------------slab2");
      
      for (int r=0; r<mat3d[1].length; r++){
          for(int s=0; s<mat3d[1][r].length; s++){
              System.out.print(mat3d[1][r][s]+" ");
          }
          System.out.println();
      }
      
      System.out.println("------------------------slab3");
      
      for (int x=0; x<mat3d[2].length; x++){
          for(int y=0; y<mat3d[2][x].length; y++){
              System.out.print(mat3d[2][x][y]+" ");
          }
          System.out.println();
      }
      
  }
  
  public static int findMin(int [] [] [] mat3d){ //finding the min numnber in the 3d array
    
    
    int currentMinIndex=0;
    int currentMin=0;
    currentMin=mat3d[0][0][0];
    for(int i=0; i<3; i++){
        for(int j=0; j<mat3d[i].length; j++){
            for(int k=0; k<mat3d[i][j].length-1; k++){
                  
                     if(currentMin>mat3d[i][j][k+1]){
                       currentMin=mat3d[i][j][k+1];
                       
            }
            }
            
            
        }
       
    }
  return currentMin;
  }
  
  public static int[][] sort(int [] [] array){ //sorting the last 2d slab
    
     for(int a = 0; a<array.length;a++){
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
       
     }
  }
  
  
  return array;
}

}