
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @Gerald Huang
 * @Feb 2, 2018
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    public String toString()
    {
        return "The rectangle's dimensions are " + length + " X " + width;
    }
    
    public boolean equals(Object shape)
    {
        if (! (shape instanceof Rectangle4))
            return false;
            
        Rectangle4 t = (Rectangle4) shape;
        
        return t.getLength() == getLength() && t.getWidth() == getWidth();
    }
}
