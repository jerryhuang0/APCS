
/**
 * Write a description of class RidingMower here.
 *
 * @Gerald Huang (your name)
 * @March 5, 2018 (a version number or a date)
 */
public class RidingMower extends Mowers
{
    private int gas;
    
    RidingMower()
    {
        super();
        gas = 1;
    }
    
    public int mow(int gasAmount)
    {
        gas -= gasAmount;
        return gas;
    }

}
