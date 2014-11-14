// Aimee Denyse Niwenshuti
// CSE 2 lab10
// Methods Calling Methods
// Oct 31th, 2014

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    } 
    
    public static int addDigit(int a, int digit){
        
        String aString=a+"";
        
        int length=aString.length();
        
        double number=digit*Math.pow(10,length)+a;
        int result=(int) number;
        
    if(a>0){    
        
        if (digit<=9 || digit >=0  ){
        
        return result;
        }
        
        else{
            return a;
        }

    }  
    
    else {
        int absValue= Math.abs(a);
        String absString=absValue+"";
        
        int length1=absString.length();
        
        double number1=digit*Math.pow(10,length1)+absValue;
        int result1=(int) number1;
        return -result1;
    }
    
}
    
    public static int join(int a, int b){
        
        if (a>0 && b>0){
            String bString=b+"";
            int length2=bString.length();
            double number2=a*Math.pow(10,length2)+b;
            int result2=(int) number2;
            return result2;
        }
        
        
        else{
            int absValue1= Math.abs(a);
            int absValue2= Math.abs(b);
            String bString1=absValue2+"";
            int length3=bString1.length();
            double number3=absValue1*Math.pow(10,length3)+absValue2;
            int result3=(int) number3;
            return result3;
        }
        
        
    }

}
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/