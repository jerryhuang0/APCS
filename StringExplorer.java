/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @Gerald Huang (enter your name)
 * @Jan 23, 2018 (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  The Jags lost. I like the Jags.  ";

        //  Add examples below for the following methods:
        //    trim()
        //    length()
        //    indexOf with one and two parameters
        //    substring() with one and two parameters
        //    compareTo()
        //    any other String methods you'd like to try
        
        //the trim() method
        System.out.println("The initial statement was \"  The Jags lost. I like the Jags.  \". The new statement is: " +sample.trim());
        
        //the length() method
        int lenOfString = sample.length();
        int newLenOfString = (sample.trim()).length();
        System.out.println("The length of the string before trim() was " +lenOfString);
        System.out.println("The length of the string after trim() is " +newLenOfString);
        
        //the indexOf() method
        int indexJags = sample.indexOf("Jags");
        int newIndexJags = (sample.trim()).indexOf("Jags");
        System.out.println("The first occurrence of \"Jags\" before trim() was at " +indexJags);
        System.out.println("The first occurrence of \"Jags\" after trim() is at " +newIndexJags);
        
        int indexTwoJags = sample.indexOf("Jags", 10);
        int newIndexTwoJags = (sample.trim()).indexOf("Jags", 8);
        System.out.println("The second occurrence of \"Jags\" before trim() was at " +indexTwoJags);
        System.out.println("The second occurrence of \"Jags\" after trim() is at " +newIndexTwoJags);
        
        //the substring() method
        String partTwoSample = sample.substring(17);
        String newPartTwoSample = (sample.trim()).substring(15);
        System.out.println("The second sentence before trim() was " +partTwoSample);
        System.out.println("The second sentence after trim() is " +newPartTwoSample);
        
        String partOneSample = sample.substring(0,16);
        String newPartOneSample = (sample.trim()).substring(0,14);
        System.out.println("The first sentence before trim() was " +partOneSample);
        System.out.println("The first sentence after trim() is " +newPartOneSample);
        
        int diff = sample.compareTo("The Jags lost. I like the Jags.");
        System.out.println("The difference between the strings is " +diff);
        
        int diff2 = (sample.trim()).compareTo("The Jags lost. I like the Jags.");
        System.out.println("The difference between the strings is " +diff2);
        
        
        
    }

}
