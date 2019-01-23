
/**
 * Write a description of class WaterBottleV7 here.
 * This project will calculate the volume and surface area of a cylinder-
 * shaped water bottle
 *
 * @author Gerald Huang
 * @version 11/27/2017
 */
public class WaterBottleV7
{
    private String myName;
    private int myRadius;
    private int myHeight;
    private double myVolume;
    private double mySA;
    
    public WaterBottleV7(String name, int radius, int height)
    {
        //the constructor
        myName = name;
        myRadius = radius;
        myHeight = height;
        myVolume = 0.0;
        mySA = 0.0;
    }
    
    public void calcVolOrSA(int radius, int height)
    {
        //will return the volume (if given two ints)
    myVolume = Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double getVolume()
    {
    return myVolume;
    }
    
    public void calcVolOrSA(int radius, double volume)
    {
        //will return the surface area (if given an int and a double)
    mySA = (2 * volume / radius);
    }
    
    public double calcVol()
    {
        //calculates the volume of the class WaterBottleV7
    return Math.PI * Math.pow(myRadius, 2) * myHeight;
    
    }
    
    public double calcSA()
    {
        //calculates the surface area of the class WaterBottleV7
    return 2 * Math.PI * myRadius * myHeight + 2 * Math.PI * Math.pow(myRadius, 2);
        
    }
    
    public double convertToCMCube()
    {
        //converts the volume of the class WaterBottleV7 to centimeters cubed
    return myVolume * Math.pow(2.54, 3);
    }
    
    public double convertToCMSquare()
    {
        //converts the surface area of the class WaterBottleV7 to centimeters squared
    return mySA * Math.pow(2.54, 2);
    
    }
    
    public void printHeader()
    {
        //prints the categories
    System.out.printf("%50s %n", "Water Bottle Dimensions");
    System.out.printf("%5s %12s %12s %15s %20s %n", "Name", "Radius (in)", "Height (in)", "Volume (in^3)", "Surface Area (in^2)");
    System.out.println("__________________________________________________________________");
    }
    
    public void printEverything()
    {
        //prints out the info for each object in the array
    System.out.printf("%-5s %10d %10d %15.2f %20.2f %n", myName, myRadius, myHeight, myVolume, mySA);
    }
    
    
}