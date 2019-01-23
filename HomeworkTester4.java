
/**
 * Write a description of class HomeworkTester3 here.
 *
 * @Gerald Huang (your name)
 * @March 1, 2018 (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class HomeworkTester4
{
    public static void main(String[] args)
    {
        List<Homework4> school = new ArrayList<Homework4>();
        
        Homework4 english = new IBEnglishIV4();
        english.createAssn(12, "English");
        //english.doHw(5);
        
        Homework4 tok = new IBTheoryOfKnowledge4();
        tok.createAssn(2, "Theory of Knowledge");
        //tok.doHw(1);
        
        Homework4 calc = new APCalculusBC4();
        calc.createAssn(9, "Calculus");
        //calc.doHw(7);
        
        Homework4 cs = new APComputerScience4();
        cs.createAssn(5, "Computer Science");
        //cs.doHw(1);
        
        school.add (english);
        school.add (tok);
        school.add (calc);
        school.add (cs);
        
        System.out.println("            To-do list            ");
        System.out.println("----------------------------------");
        
        for(Homework4 s : school)
        {
            System.out.println(s.toString());
        }
        
        System.out.println("       Comparing My Homework      ");
        System.out.println("----------------------------------");
        
        int counter = 0;
        int compare = 2;
        int j = 0;
        
        for(int i = 0; i < school.size(); i++)
        {
            for(j = counter; j < school.size(); j++)
            {
                if(i != j)
                {
                    compare = (school.get(i)).compareTo(school.get(j));
                }
                
                if(compare == -1)
                {
                    System.out.println("The homework for " + (school.get(i)).getHwType() + (school.get(i)).printLess() + (school.get(j)).getHwType());
                }
                
                if(compare == 0)
                {
                    System.out.println("The homework for " + (school.get(i)).getHwType() + (school.get(i)).printEqual() + (school.get(j)).getHwType());
                }
                
                if(compare == 1)
                {
                    System.out.println("The homework for " + (school.get(i)).getHwType() + (school.get(i)).printMore() + (school.get(j)).getHwType());
                }
                
                compare = 2;
            }
            counter++;
        }
    }
}
