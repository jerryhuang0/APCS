
/**
 * Write a description of class PushMower here.
 *
 * @Gerald Huang (your name)
 * @March 5, 2018 (a version number or a date)
 */
public class PushMower extends Mowers
{
    private int gas;
    
    PushMower()
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
