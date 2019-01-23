
/**
 * Write a description of class Circle2Tester here.
 *Tests the Circle2 class
 *
 * @Gerald Huang (your name)
 * @Feb 1, 2018 (a version number or a date)
 */

import java.util.ArrayList;
public class Circle2Tester
{
    public static String forThis()
    {
        return "For this ";
    }
    
    public static String revealCenter(Circle2 placeholder)
    {
        return placeholder.getCenter();
    }
    
    public static void main (String args[])
    {
        Circle2 circle = new Circle2(2,4,1);
        Circle2 oval = new Oval2(0,0,6,8);
        Circle2 cylinder = new Cylinder2(1,8,3,10);
        Circle2 ovalCylinder = new OvalCylinder2(8,6,5,6,9);
        
        ArrayList<Circle2> array = new ArrayList<Circle2>();
            array.add(circle); array.add(oval); array.add(cylinder);
            array.add(ovalCylinder);
            
        for(Circle2 obj: array)
        {
            System.out.println(forThis() + obj.getName() + " the "+ revealCenter(obj)); 
        }
    
    }
}
