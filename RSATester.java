
/**
 * Write a description of class RSATester here.
 *
 * @Gerald Huang (your name)
 * @Feb 19, 2018 (a version number or a date)
 */

import java.util.Scanner;

public class RSATester
{
    
public static void main (String[] args)
{
    int lowerBound = 0;
    int upperBound = 0;
    int numInBounds = 0;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Welcome to the prime number program");
    System.out.println("What is the lower bound on your search for prime numbers (inclusive)?");
    lowerBound = in.nextInt();
    
    while(lowerBound <= 0)
    {
        System.out.println("Please enter a positive number greater than zero");
        lowerBound = in.nextInt();
    }
    
    System.out.println("What is the upper bound on your search for prime numbers (exclusive)?");
    upperBound = in.nextInt();
    
    while(upperBound < lowerBound)
    {
        System.out.println("Your upper bound has to be less than your lower bound");
        upperBound = in.nextInt();
    }
    
    RSA prime = new RSA(lowerBound, upperBound);
    
    prime.calcPrimes();
    
    prime.printPrimes();
    
}

}
