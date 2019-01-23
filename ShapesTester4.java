
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @Gerald Huang 
 * @Feb 2, 2018
 */
import java.util.*;
public class ShapesTester4
{
    
    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r.toString());
    }

    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(8, 8);
        Rectangle4 two = new Box4(5, 5, 5);
        Rectangle4 three = new Cube4(5);
        Rectangle4 four = new Rectangle4(2,5);
        Rectangle4 five = new Box4(8,9,3);
        Rectangle4 six = new Cube4(1);
        
        String is = "IS";
        String isNot = "IS NOT";
        
        
        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add( five );
        shapes.add( six );
        
        for(Rectangle4 rect: shapes)
        {
            showEffectBoth(rect);
            //showEffectBoth(rect);
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println("Test for equality");
        System.out.println();
        
        System.out.println("Box " + two.getLength() + " X " + two.getWidth() + " X " + ((Box4)two).getHeight() + " vs. " + "Cube " +
            three.getLength() + " X " + three.getWidth() + " X " + ((Cube4)three).getHeight());
        System.out.println();
        
        System.out.print("The box ");
        
        if(two.equals(three))
        {
            System.out.print(is);
        }
        else
            System.out.print(isNot);
            
        System.out.print(" the same as the cube.");
        System.out.println();
        System.out.println();
        
        
        System.out.println("Rectangle " + four.getLength() + " X " + four.getWidth() + " vs. " + "Cube " +
            six.getLength() + " X " + six.getWidth() + " X " + ((Cube4)six).getHeight());
        System.out.println();
        
        System.out.print("The rectangle ");
        
        if(four.equals(six))
        {
            System.out.print(is);
        }
        else
            System.out.print(isNot);
            
        System.out.print(" the same as the cube.");
        
        
        
    }

    
}
