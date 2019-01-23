
/**
 * Write a description of class Gradebook here.
 *
 * @Gerald Huang (your name)
 * @April 12, 2018 (a version number or a date)
 */
public class Gradebook
{
    private String firstName, lastName;
    private double[] scores;
    private String grade;
    
    Gradebook(String firstName, String lastName, double[] scores)
    {
        if(firstName.equals("") || lastName.equals(""))
        {
            throw new RuntimeException("First or last name cannot be empty!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        
        if(scores.length == 0)
        {
            throw new IllegalArgumentException("The scores array cannot be empty!");
        }
        this.scores = scores;
        grade = "";
    }
    
    public void setScore(double score, int pos)
    {
        scores[pos] = score;
    }
    
    public double getScore(int pos)
    {
        return scores[pos];
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public String toString()
    {
        String num = "";
        
        for(int i = 0; i < scores.length; i++)
        {
            num = num + scores[i] + "  ";
        }
        return firstName + " " + lastName + " - " + grade + ": " + num;
    }
    
}
