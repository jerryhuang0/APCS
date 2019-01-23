
/**
 * Write a description of class RSA here.
 *
 * @Gerald Huang (your name)
 * @Feb 14, 2018 (a version number or a date)
 */
public class RSA
{
    private int lowerBound;
    private int upperBound;
    private int numPrimes;
    private boolean[] checkPrime;
    
    
    RSA(int lowerBound, int upperBound)
    {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        
        int numPrimes = upperBound - lowerBound;
        
        this.numPrimes = numPrimes;
        checkPrime = new boolean[numPrimes];
    }
    
    public  void calcPrimes()
    {
        int variable = lowerBound;
        int divisor = 2;
        
        for(int i = 0; i < checkPrime.length; i++)
        {
           checkPrime[i] = true;
        }
    
        while(variable < upperBound)
        {
            while((divisor < Math.pow(upperBound, 0.5)) && (checkPrime[variable - lowerBound]))
            {
                if((variable % divisor == 0) && (variable != divisor))
                {
                    checkPrime[variable - lowerBound] = false;
                }
                else if(variable == 1)
                {
                    checkPrime[variable - lowerBound] = false;
                }
                
                divisor++;
            }
            divisor = 2;
            
            variable++;
        }
    }
    
    public void printPrimes()
    {
        int counter = 0;
        System.out.println("The primes are: ");
        
        for(int i = 0; i < checkPrime.length; i++)
        {
            if(checkPrime[i] == true)
            {
                System.out.print(i + lowerBound + " ");
                counter++;
            }
            
        }
        
        System.out.println();
        System.out.println("The total number of primes is: " +counter);
    }
    

    }

