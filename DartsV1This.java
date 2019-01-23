
/**
 * Write a description of class DartsV1 here.
 * Method class. Contains private variables. Has methods
 * for simulating trials and assigning the results to private
 * variables, returning the number of darts used, trials performed, 
 * hits achieved, and the estimate of pi. Also has a method to print
 * the results.
 *
 * @author Gerald Huang
 * @version 12/1/2017
 */

import java.io.IOException;
import java.util.Random;

public class DartsV1This
{
    //initialize private variables 
    private int dartNum;
    private int trialNum;
    private int hits;
    private double pi;
    
    //constructor and takes two parameters and sets them equal to two private variables
    //@param int dartNum
    //@param int trialNum
    DartsV1This(int dartNum, int trialNum)
    {
    this.dartNum = dartNum;
    this.trialNum = trialNum;
    this.hits = 0;
    this.pi = 0.0;
    }
    
    //method to simulate trials for each object
    public void simTrials()
    {
    int counter = 0;
    double piApprox;
    double x;
    double y;
    int hitCounter = 0;
    while(counter < this.dartNum)
    {
    x = Math.random();
    y = Math.random();
        if(Math.pow(x, 2) + Math.pow(y, 2) <= 1)
        {
        hitCounter++;
        }
        else if(Math.pow(x, 2) + Math.pow(y, 2) >= 1);
        
    counter++;    
    }
    this.hits = hitCounter;
    piApprox = 4.0 * hitCounter / counter;
    this.pi = piApprox;
    }
    
    //method to return myDartNum for each object
    public int getDartNum()
    {
    return this.dartNum;
    }
    
    //method to return myTrialNum for each object
    public int getTrialNum()
    {
    return this.trialNum;    
    }
    
    //method to return myPi for each object
    public double getPi()
    {
    return this.pi;
    }
    
    //method to return myHits for each object 
    public int getHits()
    {
    return this.hits;
    }
    
    //method to return a formatted string to display darts, trials, hits, and pi for each method
    public String toString()
    {
    
    return String.format("%17d %18d %19d %20.2f %n", this.dartNum, this.trialNum, this,hits, this.pi);
    }
    
    
    /**
     * Everything below this statement is to be disregarded
     * 
     * 
     */
    
    
    //public void askDartNum()
    //{
    //System.out.println("What is the number of darts per trial?");
    //Scanner darts = new Scanner(System.in);
    //int scannerTemp = darts.nextInt();
    
    //while(scannerTemp <= 0)
    //{
    //System.out.println("Please enter in a valid number: ");
    //scannerTemp = darts.nextInt();
    //}
    //int dartNum = scannerTemp;
    //myDartNum = dartNum; 
    //}
    
    //public void askTrialNum()
    //{
    //int trialNum;
    //System.out.println("What is the number of trials?");
    //Scanner trials = new Scanner(System.in);
    //trialNum = trials.nextInt();
    //String response;
    //while(trialNum <= 0)
    //{
    //System.out.println("Please enter in a valid number of trials: ");
    //trialNum = trials.nextInt();
    //}
    
    //if(trialNum >= 10000)
    //{
    //System.out.println("Warning: this will take a long time. Are you sure you want to go through with this (Y or N)?");
    //response = trials.next();
    //if(response.equals("N") || response.equals("n"))
    //{
    //System.out.println("Please change your selection: ");
    //trialNum = trials.nextInt();
        //while(trialNum <= 0)
            //{
            //System.out.println("Please enter a valid selection: ");
            //trialNum = trials.nextInt();
            
            //}
    //}
    //else if(response.equals("Y") || response.equals("y"));
    //else
    //{
    //System.out.println("Please enter a valid selection: ");
    //response = trials.next();
    //}
    
    //}
    
    //myTrialNum = trialNum;
    //}
    //public void printEverything()
    //{
    //double[] arrays = new double[myTrialNum];
    //int counter = 0;
    //double sumPiTrials = 0;
    
    //while(counter < myTrialNum)
    //{
    //arrays[counter] = simTrials();
    //System.out.printf("%5s %1s", "Trial", "[");
    //System.out.printf("%2d", (counter + 1)); 
    //System.out.printf("%1s %1.4f %n", "]: pi =", arrays[counter]);
    //sumPiTrials += arrays[counter];
    //counter++;
    //}
    
    //double piAverage = estimatePi(sumPiTrials, trialNum);
    //System.out.printf("%-1s %1.4f", "Estimate of pi =", piAverage);
    
    //}
    
    //public static void main(String args[]) throws IOException
    //{
    //int dartNum = askDartNum();
    //int trialNum = askTrialNum();
    //double[] arrays = new double[trialNum];
    
    //printEverything(dartNum, trialNum);
    //}
}
