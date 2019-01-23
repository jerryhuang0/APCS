
/**
 * Write a description of class CandidateTesterV2 here.
 *
 * @Gerald Huang (your name)
 * @March 14, 2018 (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

public class CandidateTesterV2
{
    public static void main(String[] args)
    {
        List<Candidate> candidates = new ArrayList<Candidate>();
        int sum = 0;
        
        String space = "          "; //10 spaces
        
        candidates.add(new Candidate("Albert Apple", 100));
        candidates.add(new Candidate("Beatrice Blues", 250));
        candidates.add(new Candidate("Carly Clements", 115));
        candidates.add(new Candidate("Dumbledore Drews", 815));
        candidates.add(new Candidate("Ethan Emblems", 275));
        
        System.out.println("Raw Election Data");
        System.out.println();
        
        for(Candidate c : candidates)
        {
            System.out.println(c.getName() + " received " + c.getVotes() + " votes.");
            
            sum += c.getVotes();
        }
        
        System.out.printf("%n %n");
        
        System.out.println("Election Results");
        System.out.println();
        System.out.println("Candidate         Votes Received         % of Total Votes");
        System.out.println("-----------------------------------------------------");
        
        for(Candidate c : candidates)
        {
            System.out.printf("%-20s %10d %20.2f %n", c.getName(), c.getVotes(), ( (double) c.getVotes() / sum) * 100);
            //System.out.print(space.substring(0, space.length() - 3) + c.getVotes());
            //System.out.printf("%10.2f %n", ( (double) c.getVotes() / sum) * 100);
        }
        
        System.out.printf("%n");
        System.out.println("Total votes cast: " +sum);
}
}
