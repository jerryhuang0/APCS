
/**
 * Write a description of class Homework3 here.
 *
 * @Gerald Huang (your name)
 * @March 1, 2018 (a version number or a date)
 */
public abstract class Homework4 implements Comparable<Homework4>
{
    private int numPage;
    private String hwType;
    private int hwLeft;
    
    public Homework4()
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
    
    public int compareTo(Homework4 obj)
    {
        if(numPage < obj.getNumPage())
        {
            return -1;
        }
        
        else if(numPage == obj.getNumPage())
        {
            return 0;
        }
        
        else
        {
            return 1;
        }
    }
    
    public String setup()
    {
        return "The homework for ";
    }
    
    public String printMore()
    {
        return " is MORE THAN ";
    }
    
    public String printLess()
    {
        return " is LESS THAN ";
    }
    
    public String printEqual()
    {
        return " is EQUAL TO ";
    }
    }
