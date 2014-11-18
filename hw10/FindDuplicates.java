//Aimee Denyse Niwenshuti
//CSE [2] hw 10
//Checking how many duplicates are in an array
//Nov 18th, 2014

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //asking the user if they want to enter another array
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }


    public static boolean hasDups(int [] myList){
    
        boolean result=false;
        int count=0;
        int k=0;
    
        for(int i=0; i<myList.length; i++){     //comparing each number in the array 
            for(k=i+1; k<myList.length; k++){   //with the rest of the numbers
                if (myList[i]==myList[k]){      //looking for duplcates
                    count++;                    //counting duplicates
                }
            
            }
        }
        
        
        if(count>0){                            //True when we have one or more duplicates
            result=true;
            return result;
        }   
        
        else{                                   //False when there is no duplicate
            result=false;
            return result;
        }
            
        
    }
    
    public static boolean exactlyOneDup(int [] myList1){
        boolean result1=false;
        int count1=0;
        int r=0;
    
        for(int l=0; l<myList1.length; l++){                  //Comparing each number in the array
            for(r=l+1; r<myList1.length; r++){                //with the rest of the numbers
                if (myList1[l]==myList1[r]){                  //checking for dublicates
                    count1++;                                 //counting duplicates
                }
            
            }
        }
        
        if(count1==1){                                        //True when there is exactly one duplicate
            result1=true;
            return result1;
        }   
        
        else{                                                 //False when there are more than one duplicate
            result1=false;
            return result1;
        }
          
    }
}