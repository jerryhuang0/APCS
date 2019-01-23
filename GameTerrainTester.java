
/**
 * Write a description of class GameTerrainTester here.
 *
 * @Gerald Huang (your name)
 * @Jan 31, 2018 (a version number or a date)
 */
public class GameTerrainTester
{
    public static void main (String[] args)
    {
        Terrain land = new Terrain(450, 600);
        
        Mountain mountain = new Mountain(200, 300, 23);
        
        WinterMountain winterMountain = new WinterMountain(620, 580, 26, 10.6);
        
        Forest forest = new Forest(360, 880, 96);
        
        WinterForest winterForest = new WinterForest(440, 990, 56, 5.6);
        
        Volcano volcano = new Volcano(550, 300, 98.3);
        
        System.out.println(land.getTerrainSize2());
        
        System.out.println(mountain.getMountain());
        
        System.out.println(winterMountain.getWinterMountain());
        
        System.out.println(forest.getForest());
        
        System.out.println(winterForest.getWinterForest());
        
        System.out.println(volcano.getVolcano());
    }
}
