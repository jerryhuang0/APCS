
/**
 * Write a description of class DeleteMeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.File;
import java.io.IOException;

/**
 * Tests the FrequencyAnalysis Class.
 *
 * @author Tushaar Kamat
 * @version 12/01/2016
 */
public class DeleteMeTester {

    public static void main(String args[]) throws IOException {
        //set desired files here
        File inFile = new File("deleteme.txt");
        File outFile = new File("deleteme2.txt");

        DeleteMe freqTest = new DeleteMe(inFile, outFile);
        freqTest.readTextFile();
        freqTest.writeTextFile();
        System.out.println(freqTest);
    }
}