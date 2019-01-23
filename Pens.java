
/**
 * Write a description of class Pens here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Pens implements Product
{
    private String name;
    private double price;
    
    Pens()
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
    
    //public int compareTo(Product obj)
    //{
        //if(price < obj.getPrice())
        //{
            //return -1;
        //}
        
        //else if(price == obj.getPrice())
        //{
            //return 0;
        //}
        
        //else
        //{
            //return 1;
        //}
    //}
    
    public abstract int write(int inkAmount);
    
}
