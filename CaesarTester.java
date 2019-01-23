
/**
 * Write a description of class CaesarTester here.
 *
 * @Gerald Huang (your name)
 * @Feb 9, 2018 (a version number or a date)
 */

import java.util.Scanner;

public class CaesarTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int shift = 0;
        String message = "";
        String choice = "";
        Encryption caesar = new Encryption();
        Decryption decrypt = new Decryption();
        
        while(!choice.equalsIgnoreCase("q"))
            {
            System.out.println("Please enter \"E\" for encrypt, \"D\" for decrypt, and \"Q\" to quit");
            choice = in.next();
                
            if(choice.equalsIgnoreCase("e"))
            {
            System.out.println("Thank you for choosing encryption");    
                
            System.out.println("What is your Caesar shift? Please enter a number between 0-25 inclusive");
            shift = in.nextInt();
            while( (shift < 0) || (shift > 25))
            {
                System.out.println("Please try again; that was not a valid input. Enter in numbers between 0-25 inclusive.");
                shift = in.nextInt();
            }
            
            caesar.setShift(shift);
            
            System.out.println("This is your regular alphabet: " +caesar.displayAlphabet());
            System.out.println("This is your encrypted alphabet: " +caesar.displayCaesarAlphabet());
            
            System.out.println("What is the message that you want to encode?");
            in.nextLine();
            message = in.nextLine();
            System.out.println(caesar.shiftMessage(message));
            //while( message != "q" )
            //{
                //System.out.println(caesar.shiftMessage(message));
                //System.out.println("Please enter in another message: ");
                //message = in.nextLine();
            //}
            }
            //System.out.println("You are finished with your encryption stage. You are now entering the decryption stage");
            
            //decryption stage
            
            
            else if(choice.equalsIgnoreCase("d"))
            {
            System.out.println("Thank you for choosing decryption");
            System.out.println("What is your Caesar shift? Please enter a number between 0-25 inclusive");
            shift = in.nextInt();
            while( (shift < 0) || (shift > 25))
            {
                System.out.println("Please try again; that was not a valid input. Enter in numbers between 0-25 inclusive.");
                shift = in.nextInt();
            }        
        
            decrypt.setShift(shift);
        
            System.out.println("This is your regular alphabet: " +decrypt.displayAlphabet());
            System.out.println("This is your decrypted alphabet: " +decrypt.displayCaesarAlphabet());
            
            System.out.println("Enter in the message you want to decrypt: ");
            in.nextLine();
            message = in.nextLine();
            System.out.println(decrypt.decryptMessage(message));
            
            
            //while(message != "q")
            //{
                //System.out.println(decrypt.decryptMessage(message));
                //System.out.println("Please enter in another message: ");
                //message = in.nextLine();
            //}
            }
        }
        System.out.println("Thank you for using the CaesarTester program");
    }
}
