/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @Gerald Huang 
 * @Feb 2, 2018
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }


    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
    public boolean equals(Object shape)
    {
        if (! (shape instanceof Box4))
            return false;
            
        Box4 t = (Box4) shape;
        
        return t.getLength() == getLength() && t.getHeight() == getHeight() && t.getWidth() == getWidth();
    }
    
}
