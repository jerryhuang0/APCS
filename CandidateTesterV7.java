
/**
 * Write a description of class CandidateTesterV7 here.
 *
 * @Gerald Huang (your name)
 * @March 16, 2018 (a version number or a date)
 */
public class CandidateTesterV7
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
    
    public static void addCandidate(Candidate[] array, int pos, String name, int votes)
    {
        for(int i = array.length - 1; i > pos; i--)
        {
            array[i] = array[i - 1];
        }
        
        array[pos] = new Candidate(name, votes);
        //Candidate[] newArray = new Candidate[array.length + 1];
        
        //Candidate temp = new Candidate(name, votes);
        
        //for(int i = 0; i < array.length; i++)
        //{
            //if(i == pos)
            //{
                //newArray[i] = temp;
            //}
            //else if(i < pos)
            //{
                //newArray[i] = array[i];
            //}
            //else if(i > pos)
            //{
                //newArray[i + 1] = array[i];
            //}
            //else;
        //}
        
        //return newArray;
    }
    
    public static void addBeforeCandidate(Candidate[] array, String findName, String replaceName, int votes)
    {
        Candidate[] newArray = new Candidate[array.length + 1];
        int placeholder = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(findName.equals(array[i].getName()))
            {
                placeholder = i;
            }
        }
        
        for(int i = array.length - 1; i > placeholder; i--)
        {
            array[i] = array[i - 1];
        }
        
        array[placeholder] = new Candidate(replaceName, votes);
        
        //for(int i = array.length - 1; i > placeholder; i--)
        //{
            //if(findName.equals((array[i]).getName()))
            //{
                //newArray[i] = new Candidate(replaceName, votes);
                //placeholder = i;
            //}
            //else if(i < placeholder)
            //{
                //newArray[i] = array[i];
            //}
            //else if(i > placeholder)
            //{
                //newArray[i + 1] = array[i];
            //}
            //else;
        //}
        
        //return newArray;
    }
    
    public static void deleteCandidateByPosition(Candidate[] array, int pos)
    {
        
        for(int i = pos; i < array.length - 1; i++)
        {
            
            array[i] = array[i + 1];
            
        }
    
        array[array.length - 1] = new Candidate("", 0);
    }
    
    public static void deleteCandidateByName(Candidate[] array, String name)
    {
        int pos = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(name.equals(array[i].getName()))
            {
                pos = i;
            }
            
        }
        
        
        for(int i = pos; i < array.length - 1; i++)
        {
            
            array[i] = array[i + 1];
            
        }
    
        array[array.length - 1] = new Candidate("", 0);
    }
    
    public static void main(String[] args)
    {
        Candidate [] candidates = new Candidate[5];
        int sum = 0;
        
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
        
        System.out.println("<< Inserting Fred Flintstone at position 1 (2nd entry in array) with 125 votes >>");
        addCandidate(candidates, 1, "Fred Flintstone", 125);
        
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
        
        System.out.println("<< Adding Gilbert Grape after Dumbledore Drews, with 535 votes >>");
        addBeforeCandidate(candidates, "Dumbledore Drews", "Gilbert Grape", 535);
        
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
        
        System.out.println("<< Deleting position 2 >>");
        deleteCandidateByPosition(candidates, 2);
        
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
        
        System.out.println("<< Deleting Albert Apple >>");
        deleteCandidateByName(candidates, "Albert Apple");
        
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
    }
}
