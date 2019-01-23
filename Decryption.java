
/**
 * Write a description of class Decryption here.
 *
 * @Gerald Huang (your name)
 * @Feb 13, 2018 (a version number or a date)
 */
public class Decryption
{

static final String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
static int shift = 0;
    
    Decryption()
    {
    }
    
    public static void setShift(int theShift)
    {
        shift = theShift;
    }
    
    public static String decryptMessage(String input)
    {
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
            finalInd = initialInd + 26 - shift;
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
        return alphabet.substring(26 - shift, 52 - shift );
    
    }
    }

