
/**
 * Write a description of class Cube4 here.
 *
 * @Gerald Huang (your name)
 * @Feb 2, 2018 (a version number or a date)
 */
public class Cube4 extends Box4
{
    private int side;
    
    public Cube4(int s)
    {
        super(s,s,s);
        side = s;
    }
    
    public String toString()
    {
        return "The cube's dimensions are " +getLength() +" X " +getWidth() +" X " + getHeight();
    }
    
    //public boolean equals(Object shape)
    //{
        //if (! (shape instanceof Cube4))
            //return false;
            
        //Cube4 t = (Cube4) shape;
        
        //return t.getLength() == getLength() && t.getHeight() == getHeight() && t.getWidth() == getWidth();
    //}
    
}