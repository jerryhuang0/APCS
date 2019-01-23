
/**
 * Write a description of class BlackPen here.
 *
 * @Gerald Huang (your name)
 * @March 5, 2018 (a version number or a date)
 */
public class BlackPen extends Pens
{
    private int ink;
    
    BlackPen()
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
