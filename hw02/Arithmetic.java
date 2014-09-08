//////////////////////////////////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//hw02-Arithmetic
//The purpose of this program is to compute the price of items I bought at Walmart
//Sept 9th, 2014
//
//  First compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic

//  define a class
 public class Arithmetic {
 
//  add main method
    public static void main (String [ ] args) {
        
//  my input data and variables
    int nSocks=3;                      //Number of pairs of socks
                                       //(‘$’ is part of the variable name)
    double sockCost$=2.58;             //Cost per pair of socks
    int nGlasses=6;                    //Number of drinking glasses
    double glassCost$=2.29;            //Cost per glass
    int nEnvelopes=1;                  //Number of boxes of envelopes
    double envelopeCost$=3.25;         //cost per box of envelopes
    double taxPercent=0.06;            //PA sales percent
    double totalSockCost$;             //total cost of socks
    double totalGlassCost$;            //total cost of glasses
    double totalEnvelopeCost$;         //total cost of envelopes
    double totalSockSalesTax$;         //total sales tax of socks
    double totalGlassSalesTax$;        //total sales tax of glasses
    double totalEnvelopeSalesTax$;     //total sales tax of envelopes
    double totalCost$;                 //total cost of all the items(before tax)
    double totalSalesTax$;             //total sales tax on all the items
    double totalFinalCost$;            //total cost of items including taxes
    
//  compute the values for the total costs of each item
    totalSockCost$=nSocks*sockCost$;
    totalGlassCost$=nGlasses*glassCost$;
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    
//  Print out the total cost for each item
    System.out.println("The total cost of socks was $"+totalSockCost$+"");
    System.out.println("The total cost of glasses was $"+totalGlassCost$+"");
    System.out.println("The total cost of envelopes was $"+totalEnvelopeCost$+"");
    
//  Compute the values for the total sales tax for each item
    totalSockSalesTax$=totalSockCost$*taxPercent;
    totalGlassSalesTax$=totalGlassCost$*taxPercent;
    totalEnvelopeSalesTax$=totalEnvelopeCost$*taxPercent;
    
//  print out the total sales tax for each item
    System.out.println("The total sales tax of socks was $"+totalSockSalesTax$+"");
    System.out.println("The total sales tax of glasses was $"+totalGlassSalesTax$+"");
    System.out.println("The total sales tax of envelopes was $"+totalEnvelopeSalesTax$+"");
    
//  compute total cost and sales tax for all the items
    totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
    totalSalesTax$=totalSockSalesTax$+totalGlassSalesTax$+totalEnvelopeSalesTax$;
    
//  print out the total cost and sales tax for all the items
    System.out.println("The total cost of all the items was $"+totalCost$+"");
    System.out.println("The total sales tax for all the items was $"+totalSalesTax$+"");
    
//  compute the final cost after taxes
    totalFinalCost$=totalCost$+totalSalesTax$;
    
//  print out the final cost after taxes
    System.out.println("The final cost after taxes was $"+totalFinalCost$+"");
    
    }   // end of main method
}       // end of class