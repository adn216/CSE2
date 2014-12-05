//Aimee Denyse Niwenshuti
//CSE2-lab12
//elementary Operations for arrays
//Passing arrays to methods
//Nov 2014


public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  
  
   public static double [] addArrays(double [] A, double [] B){
       
       double [] sum=new double[A.length];
       int m;
       int x;
       
    for(int r=0, s=0; r<A.length && s<B.length; r++, s++){
        
        if (A.length==B.length){
           sum[r]=A[r]+B[s];
        }
    }
       
        double [] newArray=new double [A.length];
       
        if (A.length>B.length){
            
            for(m=0; m<A.length; m++){
                if(m<B.length){
                    newArray[m]=B[m];
                } 
                else{
                    newArray[m]=0; 
                }
            }
            
            for(int k=0; k<A.length; k++){
          
            sum[k]=A[k]+newArray[k];
            }
        }
       
       else{
            for(x=0; x<B.length; x++){
                if(x<A.length){
                    newArray[x]=A[x];
                } 
                else{
                    newArray[x]=0; 
                }
            }
            
            for(int l=0; l<B.length; l++){
          
            sum[l]=B[l]+newArray[l];
            }
           
       }
       
   return sum;
  }
  public static boolean equals(double [] a, double [] b){
      boolean result=false;
      
      if(a.length==b.length){
          
        for(int i=0, j=0; i<a.length && j<b.length; i++, j++){
           
                if(a[i]==b[j]){
                    result=true;
                }
        }
        
      }
      else{
          result=false;
      }
      return result;
  }
}
