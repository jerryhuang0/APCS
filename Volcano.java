
/**
 * Write a description of class Volcano here.
 *
 * @Gerald Huang (your name)
 * @Jan 31, 2018 (a version number or a date)
 */
public class Volcano extends Terrain
{
    private double myProbErupt;
    
    public Volcano(int l, int w, double prob)
    {
        super(l,w);
        myProbErupt = prob;
    }
    
    public String getVolcano()
    {
        return "Volcano " +getTerrainSize() +" and a " +myProbErupt +" chance of eruption";
    }
}
