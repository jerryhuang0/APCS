
 /**
 * This class defines a basic Terrain.
 *
 * @Gerald Huang (enter your name)
 * @Jan 30, 2018 (enter today's date)
 */

public class Terrain
{
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize()
    {
        return "has dimensions " + length + " X " + width;
    }
    
    public String getTerrainSize2()
    {
        return "Land " +getTerrainSize();
    }
}
