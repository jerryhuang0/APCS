
/**
 * Write a description of class FibonacciTester here.
 * Purpose of this tester class is to implement the public methods in Fibonacci.
 * 
 *
 * @author Gerald Huang
 * @version 1/16/2018
 */

import java.util.Scanner;
public class FibonacciTester
{
    public static void main(String[] args)
    {
    Fibonacci var = new Fibonacci();
    Scanner in = new Scanner(System.in);

    System.out.println("Welcome to the Fibonacci Calculator");
    System.out.println("What is the term of the Fibonacci series that you want to calculate?");
    System.out.println("If you want to quit, please enter \"q\"");
    String input = in.next();
    while(!input.equals("q") && !input.equals("Q"))
    {
    int num = Integer.parseInt(input);
    System.out.println(var.fib(num));
    input = in.next();
    }
    
    System.out.println("Thank you for using the Fibonacci Calculator");
    }
}
