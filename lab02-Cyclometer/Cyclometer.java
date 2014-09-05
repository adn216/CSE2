///////////////////////////////////////////////////////////////////
//Aimee Denyse Niwenshuti
//Lab02-Cyclometer
//This program is meant to measure my bicycle's speed, distance, etc.
//September 5th, 2014
//
//  First compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{

//  add main method
  public static void main (String [ ] args) {
      
//  our input data
    int secsTrip1=480; 
    int secsTrip2=3220; 
    int countsTrip1=1561; 
    int countsTrip2=9037; 

//  our intermediate variables and output data
    double wheeldiameter=27.0;
    double PI=3.14159;
    double feetPerMile=5280;
    double inchesPerFoot=12;
    double secondsPerMinute=60;
    double distanceTrip1;
    double distanceTrip2;
    double totalDistance;
    
//  print the store number of seconds and the counts
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes and had "+countsTrip1+" counts.");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
        " minutes and had "+countsTrip2+" counts.");
        
//  compute the values for the distances
    distanceTrip1=countsTrip1*wheeldiameter*PI/inchesPerFoot/feetPerMile;
    // Above gives distance in inches
    // (for each count, a rotation of the wheel travels 
    // the diameter in inches times PI)
    //distanceTrip1/inchesPerFoot/feetPerMile gives distance in miles
    distanceTrip2=countsTrip2*wheeldiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
// print out the distances
    // print out data output
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles" );
    System.out.println("The total distance was "+ totalDistance +" miles" );

  }  //end of main method
}  //end of class