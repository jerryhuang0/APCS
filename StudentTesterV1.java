
/**
 * Write a description of class StudentTesterV1 here.
 *
 * @Gerald Huang (your name)
 * @March 20, 2018 (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class StudentTesterV1
{
    public static void printArray(List<Student> array)
    {
        System.out.printf("%-20s %20s %n %n", "Name", "Quiz Scores");
        
        for(Student c : array)
        {
            System.out.printf("%-20s %5d %5d %5d %5d %5d %n", c.getName(), c.getQuiz(1), c.getQuiz(2), c.getQuiz(3), c.getQuiz(4), c.getQuiz(5));
        }
    }
    
    public static void replaceName(List<Student> array, String findName, String replaceName)
    {
        int index = 0;
        
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).getName().equals(findName))
            {
                index = i;
            }
        }
        
        array.get(index).setName(replaceName);
    }
    
    public static void replaceQuiz(List<Student> array, String name, int quizNum, int score)
    {
        int index = 0;
        
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).getName().equals(name))
            {
                array.get(i).setQuiz(quizNum, score);
            }
        }
        
    }
    
    public static void replaceEntireStudent(List<Student> array, String findName, String replaceName, int[] scores)
    {
        int index = 0;
        
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).getName().equals(findName))
            {
                index = i;
            }
        }
        
        array.get(index).setName(replaceName);
        
        for(int i = 0; i < 5; i++)
        {
            array.get(index).setQuiz(i + 1, scores[i]);
        }
        //array.get(index).setQuiz(1, q1);
        //array.get(index).setQuiz(2, q2);
        //array.get(index).setQuiz(3, q3);
        //array.get(index).setQuiz(4, q4);
        //array.get(index).setQuiz(5, q5);
    }
    
    public static void insertBefore(List<Student> array, String findName, String replaceName, int[] scores)
    {
        int index = 0;
        int[] scoresTemp = new int[5];
        
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).getName().equals(findName))
            {
                index = i;
            }
        }
        
        for(int i = 0; i < 5; i++)
        {
            scoresTemp[i] = array.get(array.size() - 1).getQuiz(i + 1);
        }
        
        array.add(new Student(array.get(array.size() - 1).getName(), scoresTemp));
        
        for(int i = array.size() - 1; i > index; i--)
        {
            array.get(i).setName(array.get(i - 1).getName());
            array.get(i).setQuiz(1, array.get(i - 1).getQuiz(1));
            array.get(i).setQuiz(2, array.get(i - 1).getQuiz(2));
            array.get(i).setQuiz(3, array.get(i - 1).getQuiz(3));
            array.get(i).setQuiz(4, array.get(i - 1).getQuiz(4));
            array.get(i).setQuiz(5, array.get(i - 1).getQuiz(5));
        }
        
        array.get(index).setName(replaceName);
        
        for(int i = 0; i < 5; i++)
        {
            array.get(index).setQuiz(i + 1, scores[i]);
        }
        
        //array.get(index).setQuiz(1, q1);
        //array.get(index).setQuiz(2, q2);
        //array.get(index).setQuiz(3, q3);
        //array.get(index).setQuiz(4, q4);
        //array.get(index).setQuiz(5, q5);
    }
    
    public static void deleteStudent(List<Student> array, String findName)
    {
        int index = 0;
        
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).getName().equals(findName))
            {
                index = i;
            }
        }
        
        for(int i = index; i < array.size() - 1; i++)
        {
            array.get(i).setName(array.get(i + 1).getName());
            array.get(i).setQuiz(1, array.get(i + 1).getQuiz(1));
            array.get(i).setQuiz(2, array.get(i + 1).getQuiz(2));
            array.get(i).setQuiz(3, array.get(i + 1).getQuiz(3));
            array.get(i).setQuiz(4, array.get(i + 1).getQuiz(4));
            array.get(i).setQuiz(5, array.get(i + 1).getQuiz(5));
        }
        
        array.remove(array.size() - 1);
    }
    
    public static void main(String[] args)
    {
        List<Student> array = new ArrayList<Student>();
        int[] albertScore = {95,85,68,77,93};
        int[] beatriceScore = {92,84,76,98,100};
        int[] charlieScore = {78,84,63,96,88};
        int[] dylanScore = {89,65,97,21,56};
        int[] elizaScore = {75,68,85,78,98};
        
        
        array.add(new Student ("Albert Apple", albertScore));
        array.add(new Student ("Beatrice Barke", beatriceScore));
        array.add(new Student ("Charlie Cortes", charlieScore));
        array.add(new Student ("Dylan Drews", dylanScore));
        array.add(new Student ("Eliza Eli", elizaScore));
        
        printArray(array);
        System.out.println();
        //we're done setting things up
        
        
        //now I'll go replace a name
        System.out.println("Replacing Albert Apple with Alfred Allen");
        replaceName(array, "Albert Apple", "Alfred Allen");
        
        printArray(array);
        System.out.println();
        //done replacing a name
        
        
        //now we'll replace a specific quiz score
        System.out.println("Replacing Beatrice Barke's second test score (index position of 1) with a 86");
        replaceQuiz(array, "Beatrice Barke", 2, 86);
        
        printArray(array);
        System.out.println();
        //done replacing quiz score
        
        
        //now we'll replace an entire student
        System.out.println("Replacing Charlie Cortes with Chris Chandler, who has scores of 67, 97, 75, 62, and 91");
        int[] chrisScore = {67,97,75,62,91};
        
        replaceEntireStudent(array, "Charlie Cortes", "Chris Chandler", chrisScore);
        printArray(array);
        System.out.println();
        //done replacing an entire student
        
        
        //now we'll insert a new student before another
        System.out.println("Inserting Drew Dapict before Dylan Drews, with scores of 52, 88, 65, 74, and 99");
        int[] drewScore = {52,88,65,74,99};
        
        insertBefore(array, "Dylan Drews", "Drew Dapict", drewScore);
        printArray(array);
        System.out.println();
        //done inserting before
        
        
        //final task is to delete a student
        System.out.println("Deleting Drew Dapict");
        
        deleteStudent(array, "Drew Dapict");
        printArray(array);
        
        System.out.println();
        //and we're done!
        
    }
}
