
/**
 * Write a description of class Forest here.
 *
 * @Gerald Huang (your name)
 * @Jan 31, 2018 (a version number or a date)
 */
public class Forest extends Terrain
{
    private int myTrees;
    
    public Forest(int l, int w, int trees)
    {
        super(l,w);
        myTrees = trees;
    }
    
    public String getForest()
    {
    
        return "Forest " +getTerrainSize() +" and has " +myTrees + " trees";
        
    }
}
