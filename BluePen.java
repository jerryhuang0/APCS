
/**
 * Write a description of class BluePrn here.
 *
 * @Gerald Huang (your name)
 * @March 5, 2018 (a version number or a date)
 */
public class BluePen extends Pens
{
    private int ink;
    
    BluePen()
    {
        super();
        ink = 1;
    }
    
    public int write(int inkAmount)
    {
        ink -= inkAmount;
        return ink;
    }

}
