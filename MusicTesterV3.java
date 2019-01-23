
/**
 * Write a description of class MusicTesterV3 here.
 *
 * @Gerald Huang (your name)
 * @April 2, 2018 (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;

public class MusicTesterV3
{
    public static void printArray(Music[] array)
    {
        System.out.printf("%-30s %5s %20s %n", "Name", "Year", "Artist");
        
        for(Music s : array)
        {
            System.out.printf("%-30s %5d %20s %n", s.getTitle(), s.getYear(), s.getArtist());
        }
    }
    
    public static Music[] sortTitle(Music[] array)
    {
        Music[] dest = new Music[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                Music obj = array[i];
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
    
    public static Music[] sortYear(Music[] array)
    {   
        Music[] dest = new Music[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                int year = array[i].getYear();
                Music obj = array[i];
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
    
    public static Music[] sortArtist(Music[] array)
    {
        Music[] dest = new Music[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                Music obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getArtist().compareTo(dest[k - 1].getArtist()) > 0)
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
    
    public static void searchTitle(Music[] array, String title)
    {
        int high = array.length;
        int low = -1;
        int probe;
        String target = title;
        List<Music> songs = new ArrayList<Music>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getTitle().compareTo(target) > 0)
                high = probe;
            //else if(array[probe].getTitle().equals(target))
            //{
                //songs.add(array[probe]);
                //exists = true;
            //}
            else
            {
                low = probe;
                if(array[low].getTitle().equalsIgnoreCase(title))
                {
                    songs.add(array[low]);
                    exists = true;
                }
            }
        }
        
        if((low != -1) && array[low].getTitle().equals(title))
        {
            exists = true;
            songs.add(array[low]);
        }
        
        if(exists)
        {
            System.out.println("The title matches the title for at least one of the songs in the array");
            System.out.printf("%-30s %5s %20s %n", "Name", "Year", "Artist");
            for(Music s : songs)
            {
                System.out.printf("%-30s %5d %20s %n", s.getTitle(), s.getYear(), s.getArtist());
            }
        }
        else
        {
            System.out.println("The title does not match the title for any song in the array");
        }
    }
    
    public static void searchYear(Music[] array, int year)
    {
        int high = array.length;
        int low = -1;
        int probe;
        int target = year;
        List<Music> songs = new ArrayList<Music>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getYear() > target )
            high = probe;
            //else if(array[probe].getYear() == target)
            //{
                //songs.add(array[probe]);
                //exists = true;
            //}
            else
            {
                low = probe;
                if(array[low].getYear() == year)
                {
                    songs.add(array[low]);
                    exists = true;
                }
            }
        }
        
        if(exists)
        {
            System.out.println("The year matches the year for at least one of the songs in the array");
            System.out.printf("%-30s %5s %20s %n", "Name", "Year", "Artist");
            for(Music s : songs)
            {
                System.out.printf("%-30s %5d %20s %n", s.getTitle(), s.getYear(), s.getArtist());
            }
        }
        else
        {
            System.out.println("The year does not match the year for any song in the array");
        }
    }
    
    public static void searchArtist(Music[] array, String artist)
    {
        int high = array.length;
        int low = -1;
        int probe;
        String target = artist;
        List<Music> songs = new ArrayList<Music>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getArtist().compareTo(target) > 0 )
            high = probe;
            //else if(array[probe].getArtist().equals(target))
            //{
                //songs.add(array[probe]);
                //exists = true;
            //}
            else
            {
                low = probe;
                if(array[low].getArtist().equalsIgnoreCase(artist))
                {
                    songs.add(array[low]);
                    exists = true;
                }
            }
        }
        
        if(exists)
        {
            System.out.println("The artist matches the artist for at least one of the songs in the array");
            System.out.printf("%-30s %5s %20s %n", "Name", "Year", "Artist");
            for(Music s : songs)
            {
                System.out.printf("%-30s %5d %20s %n", s.getTitle(), s.getYear(), s.getArtist());
            }
        }
        else
        {
            System.out.println("The artist does not match the artist for any song in the array");
        }
    }
    
    public static void main (String[] args)
    {            
        Music[] array = {new Music("Frozen Heart", 2013, "Cast of Frozen"), new Music("Shake It Off", 2014, "Taylor Swift"), 
                         new Music("Counting Stars", 2013, "OneRepublic"), new Music("How Long", 2017, "Charlie Puth"),
                         new Music("In My Blood", 2018, "Shawn Mendes"), new Music("Lost in Japan", 2018, "Shawn Mendes"),
                         new Music("Don't Stop Believin'", 1981, "Journey"), new Music("We Didn't Start the Fire", 1989, "Billy Joel"),
                         new Music("Attention", 2018, "Charlie Puth"), new Music("Thunder", 2017, "Imagine Dragons")};
                         
        printArray(array);
        System.out.println();
        
        array = sortTitle(array);
        System.out.println("Search for the title \"Lost in Japan\"");
        searchTitle(array, "Lost in Japan");
        System.out.println();
        
        System.out.println("Search for the title \"Party in the USA\"");
        searchTitle(array, "Party in the USA");
        System.out.println();
        
        array = sortYear(array);
        System.out.println("Search for the year \"2013\"");
        searchYear(array, 2013);
        System.out.println();
        
        System.out.println("Search for the year \"1901\"");
        searchYear(array, 1901);
        System.out.println();
        
        array = sortArtist(array);
        System.out.println("Search for the artist \"Charlie Puth\"");
        searchArtist(array, "Charlie Puth");
        System.out.println();
        
        System.out.println("Search for the artist \"Katy Perry\"");
        searchArtist(array, "Katy Perry");
        System.out.println();
    }
    }

