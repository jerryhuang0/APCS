
/**
 * Write a description of class APComputerScience3 here.
 *
 * @Gerald Huang (your name)
 * @March 1, 2018 (a version number or a date)
 */
public class APComputerScience4 extends Homework4
{
    //private int numPage;
    //private String hwType;
    
    public APComputerScience4()
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
        return getHwType() + " - read " +getNumPage() + " pages.";
    }
    
    public String toCompare()
    {
        return getHwType() + " is ";
    }
    
    //public void doHw(int done)
    //{
        //setHwLeft( getNumPage() - done );
    //}
}

