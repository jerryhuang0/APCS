
/**
 * Write a description of class Homework here.
 *
 * @Gerald Huang (your name)
 * @Feb 23, 2018 (a version number or a date)
 */
public abstract class Homework
{
    private int numPage;
    private String hwType;
    
    public Homework()
    {
        this.numPage = 0;
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
    
    public abstract void createAssn(int numPage, String hwType);
    
    
}
