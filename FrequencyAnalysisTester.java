
/**
 * Write a description of class FrequencyAnalysisTester here.
 *
 * @Gerald Huang (your name)
 * @Feb 19, 2018 (a version number or a date)
 */
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class FrequencyAnalysisTester 
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String input = "";
        String output = "";
        
        System.out.println("What is the name of your input file (no spaces and no .txt file extension)?");
        input = in.next() + ".txt";
        
        System.out.println("What is the name of your output file (no spaces and no .txt file extension)?");
        output = in.next() + ".txt";
        
        File inputFile = new File(input);
        File outputFile = new File(output);
        //File inputFile = File("cipherText.txt");
        //File outputFile = File("cipherTextFreq.txt");

        FrequencyAnalysis freq = new FrequencyAnalysis(inputFile, outputFile);
        
        freq.setFreq();
        
        freq.printResults();
        
        freq.printString();
    }
}
