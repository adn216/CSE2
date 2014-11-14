public class Exam{

public static void main( String args[] ){
	int i = 1;
	//int numberOfLines=1;
	int count;
	int digitsInOneLine=1;
	//int count1;
	
	for( i = 6; i>=1; i-- ){
	    if(i>2){
		for(count=i-2; count>=1; count--){
		    for(digitsInOneLine=1; digitsInOneLine<=count; digitsInOneLine++){
		        System.out.print(i);
		    }
		    System.out.println();
		}
	}
	if(i<3){
	    System.out.println(i);
	    
}
}


    
}
}