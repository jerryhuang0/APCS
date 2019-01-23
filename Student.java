
/**
 * Write a description of class Student here.
 *
 * @Gerald Huang (your name)
 * @March 16, 2018 (a version number or a date)
 */
public class Student
{
    private String name;
    private int[] quiz = new int[5];
    
    Student(String name, int[] scores)
    {
        this.name = name;
        
        for(int i = 0; i < scores.length; i++)
        {
            quiz[i] = scores[i];
        }
    }
    
    public int getQuiz(int qNum)
    {
        return quiz[qNum - 1];
    }
    
    public void setQuiz(int qNum, int score)
    {
        quiz[qNum - 1] = score;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        String scores = "";
        for(int i : quiz)
        {
            scores += i + " ";
        }
        return name + " scored " + scores;
    }
}