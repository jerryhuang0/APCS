
/**
 * Write a description of class IBTheoryOfKnowledge here.
 *
 * @Gerald Huang (your name)
 * @Feb 23, 2018 (a version number or a date)
 */
public class IBTheoryOfKnowledge extends Homework
{
    //private int numPage;
    //private String hwType;
    
    public IBTheoryOfKnowledge()
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
        return getHwType() + " - read " +getNumPage() + " pages";
    }
}
