
/**
 * Write a description of class CandidateTester here.
 *
 * @Gerald Huang (your name)
 * @March 14, 2018 (a version number or a date)
 */
public class CandidateTesterV1
{
    public static void main(String[] args)
    {
        Candidate [] candidates = new Candidate[5];
        int sum = 0;
        
        String space = "          "; //10 spaces
        
        Candidate AA = new Candidate("Albert Apple", 100);
        Candidate BB = new Candidate("Beatrice Blues", 250);
        Candidate CC = new Candidate("Carly Clements", 115);
        Candidate DD = new Candidate("Dumbledore Drews", 815);
        Candidate EE = new Candidate("Ethan Emblems", 275);
        
        candidates[0] = AA;
        candidates[1] = BB;
        candidates[2] = CC;
        candidates[3] = DD;
        candidates[4] = EE;
        
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
