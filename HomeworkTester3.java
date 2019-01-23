
/**
 * Write a description of class HomeworkTester3 here.
 *
 * @Gerald Huang (your name)
 * @Feb 28, 2018 (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class HomeworkTester3
{
    public static void main(String[] args)
    {
        List<Homework3> school = new ArrayList<Homework3>();
        
        Homework3 english = new IBEnglishIV3();
        english.createAssn(12, "English");
        english.doHw(5);
        
        Homework3 tok = new IBTheoryOfKnowledge3();
        tok.createAssn(2, "Theory of Knowledge");
        tok.doHw(1);
        
        Homework3 calc = new APCalculusBC3();
        calc.createAssn(9, "Calculus");
        calc.doHw(7);
        
        Homework3 cs = new APComputerScience3();
        cs.createAssn(5, "Computer Science");
        cs.doHw(1);
        
        school.add (english);
        school.add (tok);
        school.add (calc);
        school.add (cs);
        
        System.out.println("            To-do list            ");
        System.out.println("----------------------------------");
        
        for(Homework3 s : school)
        {
            System.out.println(s.toString());
        }
    }
}
