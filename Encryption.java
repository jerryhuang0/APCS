
/**
 * Write a description of class Encryption here.
 *
 * @Gerald Huang (your name)
 * @Feb 9, 2018 (a version number or a date)
 */



public class Encryption
{
    
static final String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
static int shift = 0;

Encryption()
    { 
    }
    
    public static void setShift(int setShift)
    {
        shift = setShift;
    }
    
    public static String shiftMessage(String input)
    {
    //String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    
    int i = 0;
    char character;
    String output = "";
    int initialInd = 0;
    
    while(i < input.length())
    {
    int finalInd = 0;   
    character = input.charAt(i);
        if(character != 32)
        {
            initialInd = alphabet.indexOf(character);
            finalInd = initialInd + shift;
            output += alphabet.substring(finalInd, finalInd + 1);
        }
        else
        {
            output += " ";
        }

        i++;
    }

    return output;
    }
    
    public static String displayAlphabet()
    {
        return alphabet.substring(0, 26);
    
    }
    
    public static String displayCaesarAlphabet()
    {
        return alphabet.substring(shift, shift + 26);
    
    }
    
    
    
}
