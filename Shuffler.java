/**
 * This class provides a convenient way to test shuffling methods.
 *
 *
 *  < Gerald Huang >
 *  < 4/9/2018 >
 */

import java.util.Random;

public class Shuffler
{

   /**
    * The number of consecutive shuffle steps to be performed in each call
    * to each sorting procedure. Change this value to your code.
    */
   private static final int SHUFFLE_COUNT = 5;


   /**
    * Tests shuffling methods.
    * @param args is not used.
    */
   public static void main(String[] args)
   {
      System.out.println("Results of " + SHUFFLE_COUNT +
                         " consecutive perfect shuffles:");
      int[] values1 = {0, 1, 2, 3};
      for (int j = 1; j <= SHUFFLE_COUNT; j++)
      {
         perfectShuffle(values1);
         System.out.print("  " + j + ":");
         for (int k = 0; k < values1.length; k++)
         {
            System.out.print(" " + values1[k]);
         }
         System.out.println();
      }
      System.out.println();

      System.out.println("Results of " + SHUFFLE_COUNT +
                         " consecutive efficient selection shuffles:");
      int[] values2 = {0, 1, 2, 3};
      for (int j = 1; j <= SHUFFLE_COUNT; j++)
      {
         selectionShuffle(values2);
         System.out.print("  " + j + ":");
         for (int k = 0; k < values2.length; k++)
         {
            System.out.print(" " + values2[k]);
         }
         System.out.println();
      }
      System.out.println();
   }


   /**
    * Apply a "perfect shuffle" to the argument.
    * The perfect shuffle algorithm splits the deck in half, then interleaves
    * the cards in one half with the cards in the other.
    * @param values is an array of integers simulating cards to be shuffled.
    */
   public static void perfectShuffle(int[] values)
   {
      int[] shuffled = new int[values.length];
      
      int k = 0;
      
      for(int i = 0; i < values.length / 2; i++)
      {
          shuffled[k] = values[i];
          k += 2;
      }
       
      k = 1;
      
      for(int i = values.length / 2; i < values.length; i++)
      {
          shuffled[k] = values[i];
          k += 2;
      }
      
      for(int i = 0; i < values.length; i++)
      {
          values[i] = shuffled[i];
      }
      //int[] shuffled1 = new int[(values.length + 1) / 2];
      //int[] shuffled2 = new int[values.length - shuffled1.length];
      //int[] last = new int[values.length];
      //int k = 1;
      
      //for(int i = 0; i < shuffled1.length; i++)
      //{
          //shuffled1[i] = values[i];
      //}
      
      //int j = 0;
      //for(int i = shuffled2.length; i < values.length; i++)
      //{
          //shuffled2[j] = values[i];
          //j++;
      //}
      
      //int m = 0;
      //int n = 0;
      
      //for(int i = 0; i < values.length; i++)
      //{
          //if(k > 0)
          //{
              //last[i] = shuffled1[m];
              //m++;
          //}
          //else if(k < 0)
          //{
              //last[i] = shuffled2[n];
              //n++;
          //}
          //else;
          
          //k *= -1;
      //}
      
      //values = last;
   }

   /**
    * Apply an "efficient selection shuffle" to the argument.
    * The selection shuffle algorithm conceptually maintains two sequences
    * of cards: the selected cards (initially empty) and the not-yet-selected
    * cards (initially the entire deck). It repeatedly does the following until
    * all cards have been selected: randomly remove a card from those not yet
    * selected and add it to the selected cards.
    * An efficient version of this algorithm makes use of arrays to avoid
    * searching for an as-yet-unselected card.
    * @param values is an array of integers simulating cards to be shuffled.
    */
   public static void selectionShuffle(int[] values)
   {
      //int[] shuffled = new int[values.length];
      int k = values.length;
      
      int randomInt = (int)(Math.random() * k);
      int temp;
      
      for(int i = 0; i < values.length; i++)
      {
          temp = values[i];
          values[i] = values[randomInt];
          values[randomInt] = temp;
          k--;
          randomInt = (int)(Math.random() * k);
      }
   }
}
