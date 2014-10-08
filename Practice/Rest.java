

//  define a class
public class Rest{

//  add main method
    public static void main (String [ ] args) {
      int i = 3;
int k =2; //[line1]
switch(i){
	case 1:
	case 2:
	case 3:
		//  [line2]
		switch(k){
			case 1:
				System.out.println("Good Morning!");
				break;
			case 2:				
				System.out.println("Good Afternoon!");
				break;
		}
	case 4:
		switch(k){
			case 1:
				System.out.println("Good Day!");
				break;
			case 2:				
				System.out.println("Good Night!");
		}
		break;
	case 5:
		System.out.println("testing!");
		break;
	default: 
		System.out.println("default!");
		break;
}
    
    }
    
}