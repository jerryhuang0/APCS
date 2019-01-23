
/**
 * Write a description of class MusicTester here.
 *
 * @Gerald Huang (your name)
 * @April 1, 2018 (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
public class MusicTester
{
    public static void printArray(Music[] array)
    {
        System.out.printf("%-30s %5s %20s %n", "Name", "Year", "Artist");
        
        for(Music s : array)
        {
            System.out.printf("%-30s %5d %20s %n", s.getTitle(), s.getYear(), s.getArtist());
        }
    }
    
    public static void searchTitle(Music[] array, String song)
    {
        boolean exists = false;
        List<Music> songs = new ArrayList<Music>();
        for(int i = 0; i < array.length; i++)
        {
            if(song.equalsIgnoreCase(array[i].getTitle()))
            {
                exists = true;
                songs.add(array[i]);
            }
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
        boolean exists = false;
        List<Music> songs = new ArrayList<Music>();
        for(int i = 0; i < array.length; i++)
        {
            if(year == array[i].getYear())
            {
                exists = true;
                songs.add(array[i]);
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
        boolean exists = false;
        List<Music> songs = new ArrayList<Music>();
        for(int i = 0; i < array.length; i++)
        {
            if(artist.equalsIgnoreCase(array[i].getArtist()))
            {
                exists = true;
                songs.add(array[i]);
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
    
    public static void main(String[] args)
    {
        Music[] array = {new Music("Frozen Heart", 2013, "Cast of Frozen"), new Music("Shake It Off", 2014, "Taylor Swift"), 
                         new Music("Counting Stars", 2013, "OneRepublic"), new Music("How Long", 2017, "Charlie Puth"),
                         new Music("In My Blood", 2018, "Shawn Mendes"), new Music("Lost in Japan", 2018, "Shawn Mendes"),
                         new Music("Don't Stop Believin'", 1981, "Journey"), new Music("We Didn't Start the Fire", 1989, "Billy Joel"),
                         new Music("Attention", 2018, "Charlie Puth"), new Music("Thunder", 2017, "Imagine Dragons")};
                         
        printArray(array);
        System.out.println();
        
        System.out.println("Search for the title \"Lost in Japan\"");
        searchTitle(array, "Lost in Japan");
        System.out.println();
        
        System.out.println("Search for the title \"Party in the USA\"");
        searchTitle(array, "Party in the USA");
        System.out.println();
        
        System.out.println("Search for the year \"2013\"");
        searchYear(array, 2013);
        System.out.println();
        
        System.out.println("Search for the year \"1901\"");
        searchYear(array, 1901);
        System.out.println();
        
        System.out.println("Search for the artist \"Charlie Puth\"");
        searchArtist(array, "Charlie Puth");
        System.out.println();
        
        System.out.println("Search for the artist \"Katy Perry\"");
        searchArtist(array, "Katy Perry");
        System.out.println();
    }
}
