
/**
 * Write a description of class WinterMountain here.
 *
 * @Gerald Huang (your name)
 * @Jan 31, 2018 (a version number or a date)
 */
public class WinterMountain extends Mountain
{
    private double myTemp;
    
    public WinterMountain(int l, int w, int mountains, double temp)
    {
        super(l,w,mountains);
        
        myTemp = temp;
    }
    
    public String getWinterMountain()
    {
        return "Winter mountain " +getTerrainSize() +" and is " +myTemp +" degrees";
    }
}
