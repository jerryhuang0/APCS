
/**
 * Write a description of class Fibonnaci here.
 *This is my main recursive method to calculate the Fibonacci number on the nth term.
 *
 * @author Gerald Huang
 * @version 1/16/2018
 */
public class Fibonacci
{
    Fibonacci()
    {}
    
    public int fib(int n)
    {
    if(n == 0)
    {
    return 0;
    }
    else if (n == 1)
    {
        return 1;
    }
    else
    {
        return fib(n-1) + fib(n-2);
    }
}
}