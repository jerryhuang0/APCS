
/**
 * Write a description of class WaterBottleV7 here.
 * This project will calculate the volume and surface area of a cylinder-
 * shaped water bottle
 *
 * @author Gerald Huang
 * @version 11/27/2017
 */
public class WaterBottleV8This
{
    private String name;
    private int radius;
    private int height;
    private double volume;
    private double sA;
    private double averageVolume;
    private double averageSA;
    private double minVolume;
    private double maxVolume;
    private double minSA;
    private double maxSA;
    
    public WaterBottleV8This(String name, int radius, int height)
    {
        //sets the name, radius, and height. These are the only necessary 
        //variables right now
        this.name = name;
        this.radius = radius;
        this.height = height;
        this.volume = 0.0;
        this.sA = 0.0;
        this.averageVolume = 0.0;
        this.averageSA = 0.0;
        this.minVolume = 0.0;
        this.maxVolume = 0.0;
        this.minSA = 0.0;
        this.maxSA = 0.0;
    }
    
    public void setVol()
    {
        //will return the volume (if given two ints)
    this.volume = Math.PI * Math.pow(this.radius, 2) * this.height;
    }
    
    public double getVolume()
    {
        //gets the volume
    return this.volume;
    }
    
    public void setSA()
    {
        //will return the surface area (if given an int and a double)
    this.sA = (2 * this.volume / this.radius);
    }
    
    public double getSA()
    {
        //gets the surface area
    return this.sA;
    }
    
    public double calcVol()
    {
        //calculates the volume of the class WaterBottleV8
    return Math.PI * Math.pow(this.radius, 2) * this.height;
    
    }
    
    public double calcSA()
    {
        //calculates the surface area of the class WaterBottleV8
    return 2 * Math.PI * this.radius * this.height + 2 * Math.PI * Math.pow(this.radius, 2);
        
    }
    
    //public double convertToCMCube()
    //{
        //converts the volume of the class WaterBottleV8 to centimeters cubed
    //return myVolume * Math.pow(2.54, 3);
    //}
    
    //public double convertToCMSquare()
    //{
        //converts the surface area of the class WaterBottleV8 to centimeters squared
    //return mySA * Math.pow(2.54, 2);
    
    //}
    
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
    System.out.printf("%-5s %10d %10d %15.2f %20.2f %n", this.name, this.radius, this.height, this.volume, this.sA);
    //prints everything specified to each object
    //System.out.printf("%15s %1s", "Volume and Surface Area of", myName);
    //System.out.println("'s Water Bottle");
    //System.out.println("--------------------------------------------------------");
    //System.out.printf("The radius was (in inches): %25d %n", myRadius);
    //System.out.printf("The height was (in inches): %25d %n", myHeight);
    //System.out.printf("The volume of the water bottle is (in in^3): %11.2f %n", myVolume);
    //System.out.printf("The surface area is (in in^2): %25.2f %n", mySA);
    //System.out.printf("The volume in cm^3 is: %33.2f %n", convertToCMCube());
    //System.out.printf("The surface area in cm^2 is: %27.2f %n", convertToCMSquare());
    //System.out.println();
    }
    
    public void printEndDashes()
    {
        //does nothing but print the dashes
    System.out.println("__________________________________________________________________");
    
    }
    
    public void mutateAverageSA(double SA)
    {
        //sets the average surface area
    this.averageSA = SA;
    }
    
    public void mutateAverageVolume(double volume)
    {
        //sets the average volume
    this.averageVolume = volume;
    }
    
    public void mutateMinVolume(double volume)
    {
        //sets the minimum volume
    this.minVolume = volume;
    }
    
    public void mutateMaxVolume(double volume)
    {
        //sets the maximum volume
    this.maxVolume = volume;
    }
    
    public void mutateMinSA(double SA)
    {
        //sets the minimum surface area
    this.minSA = SA;
    }
    
    public void mutateMaxSA(double SA)
    {
        //sets the maximum surface area
    this.maxSA = SA;
    }
    
    public void printMin()
    {
        //prints out the minimums section
    System.out.printf("%37s %5.2f %20.2f %n", "Minimum:", this.minVolume, this.minSA);
    }
    
    public void printMax()
    {
        //prints out the maximums section
    System.out.printf("%37s %5.2f %19.2f %n", "Maximum:", this.maxVolume, this.maxSA);
    }
    
    public void printAverages()
    {
        //prints out the averages section
    System.out.printf("%37s %5.2f %20.2f", "Average:", this.averageVolume, this.averageSA);
    }
    
    public String toString()
    {
    //the toString method
    return String.format("%-1d %-1d %-1.2f %-1.2f",
    this.radius, this.height, this.volume, this.sA);
        
    }
}