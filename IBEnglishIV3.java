
/**
 * Write a description of class IBEnglishIV3 here.
 *
 * @Gerald Huang (your name)
 * @March 1, 2018 (a version number or a date)
 */
public class IBEnglishIV3 extends Homework3 implements Processing
{
    //private int numPage;
    //private String hwType;
    
    public IBEnglishIV3()
    {
        super();
    }
    
    public void createAssn(int numPage, String hwType)
    {
        setNumPage(numPage);
        setHwType(hwType);;
    }
    
    public String toString()
    {
        return getHwType() + " - read " +getNumPage() + " pages. After: read " +getHwLeft() + " pages." ;
    }
     
    public void doHw(int done)
    {
        setHwLeft( getNumPage() - done );
    }
}