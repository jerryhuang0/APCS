
/**
 * Write a description of class Homework3 here.
 *
 * @Gerald Huang (your name)
 * @version (a version number or a date)
 */
public abstract class Homework3 implements Processing
{
    private int numPage;
    private String hwType;
    private int hwLeft;
    
    public Homework3()
    {
        this.numPage = 0;
        this.hwLeft = 0;
        this.hwType = "none";
    }
    
    public int getNumPage()
    {
        return this.numPage;
    }
    
    public String getHwType()
    {
        return this.hwType;
    }
    
    public void setNumPage(int numPage)
    {
        this.numPage = numPage;
    }
    
    public void setHwType(String hwType)
    {
        this.hwType = hwType;
    }
    
    public void setHwLeft(int hw)
    {
        this.hwLeft = hw;
    }
    
    public int getHwLeft()
    {
        return hwLeft;
    }
    
    public abstract void createAssn(int numPage, String hwType);
    
    public abstract void doHw(int done);

}
