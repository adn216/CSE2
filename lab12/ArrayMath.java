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
       
    for(int r=0, s=0; r<A.length && s<B.length; r++, s++){
        
        if (A.length==B.length){
           sum[r]=A[r]+B[s];
        }
       
        else if (A.length>B.length){
            while(s>B.length-1 && s<A.length-1){
                    B[s]=0;
            }   
            sum[s]=A[r]+B[s];
        }
       
       else{
            while(r>A.length-1 && r<B.length-1){
                    A[r]=0;
            }
            sum[r]=A[r]+B[s];
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

//output:

/*OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}*/