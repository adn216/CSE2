//import java.util.Scanner;

public class Exam{

public static void main( String args[] ){
	
	//Scanner scan=new Scanner (System.in);
	
	//System.out.print("Enter the number of integers: ");
	//int n=scan.nextInt();
	
	int [ ] A={1, 2, 48, 65, 34, 5, 9, 7};
	
	int [ ] B={65, 9, 2, 45, 7, 8};
	
	int [ ]	temp;
	
		temp=new int [A.length+1];
	
	
	temp[0]=0;
	
	for(int i=0; i<A.length; i++){
		for(int j=0; j<B.length; j++){
			if(A[i]==B[j]){
				temp[0]++;
				temp[temp[0]]=B[j];
			}
		}
	}
	
	System.out.print("{"+temp[0]+", "+temp[1]+", "+temp[2]+", "+temp[3]+", "+temp[4]+", "+temp[5]+", "+temp[6]+", "+temp[7]+", "+temp[8]+"}");
	
}
}
