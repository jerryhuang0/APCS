
/**
 * Write a description of class Store here.
 *
 * @Gerald Huang (your name)
 * @March 31, 2018 (a version number or a date)
 */
public class Store
{
    private String name;
    private int id,supply;
    private double price;
    public Store(String name, int id, double price, int supply)
    {
        this.name = name;
        this.id = id;
        this.price = price;
        this.supply = supply;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return id;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getDollars()
    {
        return "$" + price;
    }
    
    public int getSupply()
    {
        return supply;
    }
    
    public String toString()
    {
        System.out.printf("%-20s %10d %8s %6.2f %10d %n", name, id, "$", price, supply);
        return "";
    }
}
