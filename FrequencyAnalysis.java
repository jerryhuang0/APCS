
/**
 * Write a description of class FrequencyAnalysis here.
 *
 * @Gerald Huang (your name)
 * @Feb 19, 2018 (a version number or a date)
 */

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class FrequencyAnalysis
{
    private File fileName;
    private int numChar = 0;
    private int[] count = new int[26];
    private double[] prop = new double[26];
    private File outputFile;
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    
    public FrequencyAnalysis(File fileName, File outputFile)
    {
        this.fileName = fileName;
        this.outputFile = outputFile;
    }
    
    
    public void charFreq(String input)
    {
        int i = 0;
        char character;

        
        while( i < input.length())
        {
            character = input.charAt(i);
            
            if((character >= 97) && (character <= 122))
            {
                count[character - 97]++;
                numChar++;
            }
            else if((character >= 65) && (character <= 90))
            {
                count[character - 65]++;
                numChar++;
            }
            
            i++;
        }
    }
    
    public void setFreq() throws IOException
    {
        Scanner inFile = new Scanner(fileName);
        int i = 0;
        String input = "";
        
        while(inFile.hasNext())
        {
            input = inFile.next();
            charFreq(input);
        }
    
        while(i < ALPHABET.length())
        {
            prop[i] = (double) count[i] / numChar;
            i++;
        }
        
        inFile.close();
    }
    
    
    public void printResults() throws IOException
    {
        PrintWriter results = new PrintWriter(outputFile);
        
        results.printf("%5s %10s %15s %n", "letter", "count", "proportion");
        for(int counter = 0; counter < ALPHABET.length(); counter++)
        {
            results.printf("%5s %10d %10.2f %n", ALPHABET.substring(counter, counter+1), count[counter], prop[counter]);
        
        }
    
        results.printf("Total characters scanned: " +numChar);
        
        results.close();
    }
    
    public void printString()
    {
        System.out.printf("%5s %10s %15s %n", "letter", "count", "proportion");
        for(int counter = 0; counter < ALPHABET.length(); counter++)
        {
            System.out.printf("%5s %10d %10.2f %n", ALPHABET.substring(counter, counter+1), count[counter], prop[counter]);
        
        }
    
        System.out.printf( "%n", "Total characters scanned: " +numChar);

    }
    
}
