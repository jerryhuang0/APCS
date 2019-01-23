
/**
 * Write a description of class MovieTesterV3 here.
 *
 * @Gerald Huang (your name)
 * @March 29, 2018 (a version number or a date)
 */
public class MovieTesterV3
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
    
    public static Movie[] sortTitle(Movie[] array, int oneOrTwo)
    {
        if(oneOrTwo == 1)
        {
            int k;
            Movie obj;
            int counter = 0;
            int pos;
            for(int i = array.length - 1; i > 0; i--)
            {
                pos = 0;
                
                for(int j = 1; j <= i; j++)
                {
                    if(array[j].getTitle().compareTo(array[pos].getTitle()) > 0)
                    {
                        pos = j;
                    }
                }
                
                obj = array[i];
                array[i] = array[pos];
                array[pos] = obj;
            }
            
            return array;
            
            //for(int j = 0; j < array.length - counter; j++)
            //{
            //for(int i = 0; i < array.length; i++)
            //{
                //if((i != 0) && (array[i].getTitle().compareTo(array[i - 1].getTitle()) < 0))
                //{
                    //k = i;
                //}
                //else
                //{
                    //k = i - 1;
                //}
            //}
            
            //obj = array[array.length - 1];
            //array[array.length - 1] = array[k];
            //array[k] = obj;
            //counter++;
        
            
        }
        else if(oneOrTwo == 2)
        {
            int k;
            Movie obj;
            int counter = 0;
            int pos;
            for(int i = array.length - 1; i > 0; i--)
            {
                pos = 0;
                
                for(int j = 1; j <= i; j++)
                {
                    if(array[j].getTitle().compareTo(array[pos].getTitle()) < 0)
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
    
    
    public static Movie[] sortYear(Movie[] array, int oneOrTwo)
    {
        if(oneOrTwo == 1)
        {
            int k;
            Movie obj;
            int counter = 0;
            int pos;
            for(int i = array.length - 1; i > 0; i--)
            {
                pos = 0;
                
                for(int j = 1; j <= i; j++)
                {
                    if(array[j].getYear() < array[pos].getYear())
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
            Movie obj;
            int counter = 0;
            int pos;
            for(int i = array.length - 1; i > 0; i--)
            {
                pos = 0;
                
                for(int j = 1; j <= i; j++)
                {
                    if(array[j].getYear() > array[pos].getYear())
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
    
    public static Movie[] sortStudio(Movie[] array, int oneOrTwo)
    {
        if(oneOrTwo == 1)
        {
            int k;
            Movie obj;
            int counter = 0;
            int pos;
            for(int i = array.length - 1; i > 0; i--)
            {
                pos = 0;
                
                for(int j = 1; j <= i; j++)
                {
                    if(array[j].getStudio().compareTo(array[pos].getStudio()) > 0)
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
            Movie obj;
            int counter = 0;
            int pos;
            for(int i = array.length - 1; i > 0; i--)
            {
                pos = 0;
                
                for(int j = 1; j <= i; j++)
                {
                    if(array[j].getStudio().compareTo(array[pos].getStudio()) < 0)
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
        
        movies = sortTitle(movies, 1);
        printArray(movies);
        
        System.out.println("Sort by title descending");        
        movies = sortTitle(movies, 2);
        printArray(movies);
        
        System.out.println("Sort by year ascending");        
        movies = sortYear(movies, 1);
        printArray(movies);
        
        System.out.println("Sort by year descending");        
        movies = sortYear(movies, 2);
        printArray(movies);
        
        System.out.println("Sort by studio ascending");        
        movies = sortStudio(movies, 1);
        printArray(movies);
        
        System.out.println("Sort by studio descending");        
        movies = sortStudio(movies, 2);
        printArray(movies);
        //movies = sortYear(movies, 1);
    }
}
