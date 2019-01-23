
/**
 * Write a description of class MovieTester here.
 *
 * @Gerald Huang (your name)
 * @March 24, 2018 (a version number or a date)
 */
public class MovieTester
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
        Movie[] dest = new Movie[array.length];
        
        if(oneOrTwo == 1)
        {
            for(int i = 0; i < array.length; i++)
            {
                Movie obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getTitle().compareTo(dest[k - 1].getTitle()) > 0)
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
                Movie obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getTitle().compareTo(dest[k - 1].getTitle()) < 0)
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
    
    public static Movie[] sortYear(Movie[] array, int oneOrTwo)
    {
        Movie[] dest = new Movie[array.length];
        if(oneOrTwo == 1)
        {
            for(int i = 0; i < array.length; i++)
            {
                int year = array[i].getYear();
                Movie obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(year - dest[k - 1].getYear() > 0)
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
                int year = array[i].getYear();
                Movie obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(year - dest[k - 1].getYear() < 0)
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
    
    public static Movie[] sortStudio(Movie[] array, int oneOrTwo)
    {
        Movie[] dest = new Movie[array.length];
        if(oneOrTwo == 1)
        {
        
            for(int i = 0; i < array.length; i++)
            {
                String studio = array[i].getStudio();
                Movie obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(studio.compareTo(dest[k - 1].getStudio()) > 0)
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
                String studio = array[i].getStudio();
                Movie obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(studio.compareTo(dest[k - 1].getStudio()) < 0)
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
    
    public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        Movie[] place = new Movie[movies.length];
        
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
        
        place = sortTitle(movies, 1);
        printArray(place);
        
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
