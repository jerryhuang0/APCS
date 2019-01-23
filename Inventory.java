
/**
 * Write a description of class Inventory here.
 *
 * @Gerald Huang (your name)
 * @March 5, 2018 (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
public class Inventory
{

    public static String takeInv(String name, List<Product> products)
    {   
        boolean [] array = new boolean [products.size()];
        
        int q = 0;
        double cost = 0;
        for(boolean b : array)
        {
            b = false;
        }
        
        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getName() == name)
            {
                array[i] = true;
            }
        }
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==true)
            {
                q++;
                cost += products.get(i).getPrice();
            }
        }
        
        return "The name is: " + name + ". The quantity is " + q + ". And the price is: " + cost;
    }
    
    public static void main (String[] args)
    {
        Product blackPen = new BlackPen();
        Product bluePen = new BluePen();
        Product bluePen2 = new BluePen();
        Mowers ridingMower = new Mowers();
        Mowers pushMower = new Mowers();
        Mowers pushMower2 = new Mowers();
        
        blackPen.setPrice(2.25);
        blackPen.setName("Black Pen");
        
        bluePen.setPrice(2.30);
        bluePen.setName("Blue Pen");
        
        bluePen2.setPrice(2.25);
        bluePen2.setName("Blue Pen");
        
        ridingMower.setPrice(499.99);
        ridingMower.setName("Riding Mower");
        
        pushMower.setPrice(130.98);
        pushMower.setName("Push Mower");
        
        pushMower2.setPrice(200.20);
        pushMower2.setName("Push Mower");
        
        List products = new ArrayList<Product>();
        
        products.add(blackPen);
        products.add(bluePen);
        products.add(bluePen2);
        products.add(ridingMower);
        products.add(pushMower);
        products.add(pushMower2);
        
        
        int counter = 1;
        int result = 0;
        
        result = (pushMower).compareTo(pushMower2);
        
        System.out.println("               Inventory              ");
        System.out.println("--------------------------------------");
        System.out.println(takeInv("Black Pen", products));
        System.out.println(takeInv("Blue Pen", products));
        System.out.println(takeInv("Riding Mower", products));    
        System.out.println(takeInv("Push Mower", products));
        
        System.out.printf("%n %n %n ");
        System.out.println("                Compare               ");
        System.out.println("--------------------------------------");
        
        if(pushMower.compareTo(pushMower2) == -1)
        {    
            System.out.println("The first push mower is less expensive");
        }
        
        else if(pushMower.compareTo(pushMower2) == 0)
        {    
            System.out.println("The two are the same price");
        }
        else
        {
            System.out.println("The first push mower is more expensive");
        }
        //for(int i = 0; i < products.size(); i++)
        //{
            //for(int j = counter; j < products.size(); j++)
            //{
                //if(i != j)
                //{
                    
                    
                    //result = (products.get(i)).compareTo((products.get(j)));
                
                //}
                
                
                
            //}
            //counter++;
        //}
        
    }
}
