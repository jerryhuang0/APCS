/**
 * This is a class that tests the Card class.
 *
 *  Gerald Huang< Your Name >
 *  April 1, 2018< Today's Date >
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card fiveSpades = new Card("five", "spades", 5);
      Card fiveSpades2 = new Card("five", "spades", 5);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      
      
      // Test card 2
      System.out.println("**** Tests Card 2: five of spades ****");
      System.out.println("  rank: " + fiveSpades.rank());
      System.out.println("  suit: " + fiveSpades.suit());
      System.out.println("  pointValue: " + fiveSpades.pointValue());
      System.out.println("  toString: " + fiveSpades.toString());
      System.out.println();
      
      // Test card 3
      System.out.println("**** Tests Card 3: five of spades ****");
      System.out.println("  rank: " + fiveSpades2.rank());
      System.out.println("  suit: " + fiveSpades2.suit());
      System.out.println("  pointValue: " + fiveSpades2.pointValue());
      System.out.println("  toString: " + fiveSpades2.toString());
      System.out.println();
      
      
      // Test matches() method
      System.out.println("Does card 1 match card 2?");
      System.out.println(aceHearts.matches(fiveSpades));
      
      System.out.println("Does card 2 match card 3?");
      System.out.println(fiveSpades.matches(fiveSpades2));
   }
}
