
/**
 * Write a description of class Mountain here.
 *
 * @Gerald Huang (your name)
 * @Jan 30, 2018 (a version number or a date)
 */
public class Mountain extends Terrain
{
    private int myMountainNum;
    
    public Mountain(int l, int w, int mountains)
    {
         super(l, w);
         myMountainNum = mountains;
    }
    
    public String getMountain()
    {
        return "Mountain " +getTerrainSize() +" and " +myMountainNum +" mountains";
    }
}
