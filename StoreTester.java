
/**
 * Write a description of class StoreTester here.
 *
 * @Gerald Huang (your name)
 * @March 31, 2018 (a version number or a date)
 */
public class StoreTester
{
    public static void printArray(Store[] array)
    {
        System.out.printf("%-20s %10s %15s %12s %n", "Item Name", "ID", "Price", "In Stock");
        
        for(Store obj : array)
        {
            obj.toString();
        }
    }
    
    public static Store[] sortName(Store[] array, int oneOrTwo) //insertion sort
    {
        Store[] dest = new Store[array.length];
        
        if(oneOrTwo == 1)
        {
            for(int i = 0; i < array.length; i++)
            {
                Store obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getName().compareTo(dest[k - 1].getName()) > 0)
                    {
                        insertInd = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                
                dest[ insertInd ] = obj;
            }
            
            return dest;
        }
        
        else if(oneOrTwo == 2)
        {
            for(int i = 0; i < array.length; i++)
            {
                Store obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getName().compareTo(dest[k - 1].getName()) < 0)
                    {
                        insertInd = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                
                dest[ insertInd ] = obj;
            }
            
            return dest;
        }
        else
        {
            return array;
        }
    }
    
    public static Store[] sortID(Store[] array, int oneOrTwo) //selection sort
    {
    if(oneOrTwo == 1)
    {
        int k;
        Store obj;
        int counter = 0;
        int pos;
        for(int i = array.length - 1; i > 0; i--)
        {
            pos = 0;
                
            for(int j = 1; j <= i; j++)
            {
                if(array[j].getID() < array[pos].getID())
                {
                    pos = j;                 
                }
            }
                
            obj = array[i];
            array[i] = array[pos];
            array[pos] = obj;
        }
            
        return array;
    }
    
        else if(oneOrTwo == 2)
        {
            int k;
            Store obj;
            int counter = 0;
            int pos;
            for(int i = array.length - 1; i > 0; i--)
            {
                pos = 0;
                
                for(int j = 1; j <= i; j++)
                {
                    if(array[j].getID() > array[pos].getID())
                    {
                        pos = j;
                    }
                }
                
                obj = array[i];
                array[i] = array[pos];
                array[pos] = obj;
            }
            
            return array;
        }
        else
        {
            return array;
        }
    }
    
    public static void sortPrice(Store[] array, int low, int high)//merge sort
    {
        if(low == high)
            return;

        int mid = (low + high) / 2;

        sortPrice(array, low, mid);
        sortPrice(array, mid + 1, high);
        
                
        mergePrice(array, low, mid, high);
    }
    
    public static void mergePrice(Store[] array, int low, int mid, int high)//merge sort
    {
        Store[] temp = new Store[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = array[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = array[ i ];
                i++;
            }
            else if( array[ i ].getPrice() > array[j].getPrice())
            {
                temp[ n ] = array[ i ];
                i++;
            }
            else
            {
                temp[ n ] = array[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            array[ k ] = temp[ k - low ];
    }
    
    public static void main(String[] args)
    {
        Store[] array = new Store[10];
        
        array[0] = new Store("WD-40", 215, 8.99, 120);
        array[1] = new Store("Cell Phone", 147, 159.99, 23);
        array[2] = new Store("Glue", 23, 0.99, 89);
        array[3] = new Store("Football", 84, 22.97, 24);
        array[4] = new Store("TV", 51, 128.35, 12);
        array[5] = new Store("Gum", 1, 1.25, 532);
        array[6] = new Store("Candy", 42, 3.99, 235);
        array[7] = new Store("DVD", 55, 9.99, 20);
        array[8] = new Store("Racecar", 32, 5.99, 2);
        array[9] = new Store("Fish", 5, 8.99, 63);
        
        System.out.println("Array before the sort");
        printArray(array);
        
        System.out.println("Array after insertion sort ascending by name");
        array = sortName(array, 1);
        printArray(array);
        
        System.out.println("Array after insertion sort descending by name");
        array = sortName(array, 2);
        printArray(array);
        
        System.out.println("Array after selection sort ascending by ID");
        array = sortID(array, 1);
        printArray(array);
        
        System.out.println("Array after selection sort descending by ID");
        array = sortID(array, 2);
        printArray(array);
        
        System.out.println("Array after merge sort by price");
        sortPrice(array, 0, 9);
        printArray(array);
    }
}
