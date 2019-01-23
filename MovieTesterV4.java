
/**
 * Write a description of class MovieTester4 here.
 *
 * @Gerald Huang (your name)
 * @March 29, 2018 (a version number or a date)
 */
public class MovieTesterV4
{
    public static void printArray(Movie[] array)
    {
        System.out.printf("%-20s %4s %10s %n %n", "Movie Name", "Year", "Studio");
        for(Movie movie : array)
        {
            System.out.printf("%-20s %4d %10s %n", movie.getTitle(), movie.getYear(), movie.getStudio()); 
        }
        System.out.printf("%n%n");
    }
    
    public static void sortTitle(Movie[] array, int low, int high)
    {
        if(low == high)
            return;

        int mid = (low + high) / 2;

        sortTitle(array, low, mid);
        sortTitle(array, mid + 1, high);
        
                
        mergeTitle(array, low, mid, high);
    }

    public static void sortYear(Movie[] array, int low, int high)
    {
        if(low == high)
            return;

        int mid = (low + high) / 2;

        sortYear(array, low, mid);
        sortYear(array, mid + 1, high);
        
                
        mergeYear(array, low, mid, high);
    }
    
    public static void sortStudio(Movie[] array, int low, int high)
    {
        if(low == high)
            return;

        int mid = (low + high) / 2;

        sortStudio(array, low, mid);
        sortStudio(array, mid + 1, high);
        
                
        mergeStudio(array, low, mid, high);
    }
    
    public static void mergeTitle(Movie[] array, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

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
            else if( array[ i ].getTitle().compareTo(array[ j ].getTitle()) < 0)
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
    
    public static void mergeYear(Movie[] array, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

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
            else if( array[ i ].getYear() > array[j].getYear())
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
    
    public static void mergeStudio(Movie[] array, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

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
            else if( array[ i ].getStudio().compareTo(array[ j ].getStudio()) < 0)
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
        Movie[] movies = new Movie[10];
        
        movies[0] = new Movie("The Lion King", 1994, "Disney");
        movies[1] = new Movie("Toy Story", 1995, "Disney");
        movies[2] = new Movie("Shrek", 2001, "Dreamworks");
        movies[3] = new Movie("Finding Nemo", 2003, "Pixar");
        movies[4] = new Movie("Monsters, Inc.", 2001, "Pixar");
        movies[5] = new Movie("WALL-E", 2008, "Pixar");
        movies[6] = new Movie("Rango", 2011, "Paramount");
        movies[7] = new Movie("Cars", 2006, "Disney");
        movies[8] = new Movie("Mulan", 1998, "Disney");
        movies[9] = new Movie("Kung Fu Panda", 2008, "Paramount");
        
        printArray(movies);
        
        
        System.out.println("Sort by title ascending");
        
        sortTitle(movies,0,9);
        printArray(movies);
        
        //System.out.println("Sort by title descending");        
        //sortTitle(movies, 2);
        //printArray(movies);
        
        System.out.println("Sort by year ascending");        
        sortYear(movies,0,9);
        printArray(movies);
        
        //System.out.println("Sort by year descending");        
        //movies = sortYear(movies, 2);
        //printArray(movies);
        
        System.out.println("Sort by studio ascending");        
        sortStudio(movies,0,9);
        printArray(movies);
        
        //System.out.println("Sort by studio descending");        
        //movies = sortStudio(movies, 2);
        //printArray(movies);
    }
}
