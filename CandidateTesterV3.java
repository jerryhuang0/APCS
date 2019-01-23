
/**
 * Write a description of class CandidateTesterV3 here.
 *
 * @Gerald Huang (your name)
 * @March 15, 2018 (a version number or a date)
 */
public class CandidateTesterV3
{
    public static void changeName(Candidate[] array, String findName, String replaceName)
    {
        for(Candidate c : array)
        {
            if(findName.equals(c.getName()))
            {
                
                c.setName(replaceName);
                
            }
            
        }
    
    }
    
    public static void changeVotes(Candidate[] array, String findName, int replaceVotes)
    {
        for(Candidate c : array)
        {
            if(findName.equals(c.getName()))
            {
                
                c.setVotes(replaceVotes);
                
            }
            
        }
    
    }
    
    public static void changeNameAndVotes(Candidate[] array, String findName, String replaceName, int replaceVotes)
    {
        for(Candidate c : array)
        {
            if(findName.equals(c.getName()))
            {
                
                c.setName(replaceName);
                c.setVotes(replaceVotes);
                
            }
            
        }
    
    }
    
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
        System.out.printf("%n %n");
        
        System.out.println("<< Changing Albert Apple to Alfred Armadillo >>");
        changeName(candidates, "Albert Apple", "Alfred Armadillo");
        
        System.out.printf("%n %n");
        
        System.out.println("Election Results");
        System.out.println();
        System.out.println("Candidate         Votes Received         % of Total Votes");
        System.out.println("-----------------------------------------------------");
        
        sum = 0;
        
        for(Candidate c : candidates)
        {
            //System.out.println(c.getName() + " received " + c.getVotes() + " votes.");
            
            sum += c.getVotes();
        }
        
        for(Candidate c : candidates)
        {
            System.out.printf("%-20s %10d %20.2f %n", c.getName(), c.getVotes(), ( (double) c.getVotes() / sum) * 100);
            //System.out.print(space.substring(0, space.length() - 3) + c.getVotes());
            //System.out.printf("%10.2f %n", ( (double) c.getVotes() / sum) * 100);
        }
        
        System.out.printf("%n");
        System.out.println("Total votes cast: " +sum);
        System.out.printf("%n %n");
        
        System.out.println("<< Changing Beatrice Blues votes to 350 >>");
        changeVotes(candidates, "Beatrice Blues", 350);
        
        System.out.printf("%n %n");
        
        System.out.println("Election Results");
        System.out.println();
        System.out.println("Candidate         Votes Received         % of Total Votes");
        System.out.println("-----------------------------------------------------");
        
        sum = 0;
        
        for(Candidate c : candidates)
        {
            //System.out.println(c.getName() + " received " + c.getVotes() + " votes.");
            
            sum += c.getVotes();
        }
        
        for(Candidate c : candidates)
        {
            System.out.printf("%-20s %10d %20.2f %n", c.getName(), c.getVotes(), ( (double) c.getVotes() / sum) * 100);
            //System.out.print(space.substring(0, space.length() - 3) + c.getVotes());
            //System.out.printf("%10.2f %n", ( (double) c.getVotes() / sum) * 100);
        }
        
        System.out.printf("%n");
        System.out.println("Total votes cast: " +sum);
        System.out.printf("%n %n");
        
        System.out.println("<< Changing Carly Clements to Clara Clearwater and votes to 315 >>");
        changeNameAndVotes(candidates, "Carly Clements", "Clara Clearwater", 315);
        
        System.out.printf("%n %n");
        
        System.out.println("Election Results");
        System.out.println();
        System.out.println("Candidate         Votes Received         % of Total Votes");
        System.out.println("-----------------------------------------------------");
        
        sum = 0;
        
        for(Candidate c : candidates)
        {
            //System.out.println(c.getName() + " received " + c.getVotes() + " votes.");
            
            sum += c.getVotes();
        }
        
        for(Candidate c : candidates)
        {
            System.out.printf("%-20s %10d %20.2f %n", c.getName(), c.getVotes(), ( (double) c.getVotes() / sum) * 100);
            //System.out.print(space.substring(0, space.length() - 3) + c.getVotes());
            //System.out.printf("%10.2f %n", ( (double) c.getVotes() / sum) * 100);
        }
        
        System.out.printf("%n");
        System.out.println("Total votes cast: " +sum);
        System.out.println();
        
    }
}
