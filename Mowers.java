
/**
 * Write a description of class Mowers here.
 *
 * @Gerald Huang (your name)
 * @March 5, 2018 (a version number or a date)
 */

public class Mowers implements Product, Comparable<Mowers>
{
    private String name;
    private double price;
    
    Mowers()
    {
        this.name = "";
        this.price = 0;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int compareTo(Mowers obj)
    {
        if(price < obj.getPrice())
        {
            return -1;
        }
        
        else if(price == obj.getPrice())
        {
            return 0;
        }
        
        else
        {
            return 1;
        }
    }
    

}
