
/**
 * Write a description of class WinterForest here.
 *
 * @Gerald Huang (your name)
 * @Jan 31, 2018 (a version number or a date)
 */
public class WinterForest extends Forest
{
    private double myTemp;
    
    public WinterForest(int l, int w, int trees, double temp)
    {
        super(l,w,trees);
        myTemp = temp;
    }
    
    public String getWinterForest()
    {
        return "Winter forest " +getTerrainSize() +" and " +myTemp +" degrees";
    }
}
