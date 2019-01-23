
/**
 * Write a description of class HomeworkTester here.
 *
 * @Gerald Huang (your name)
 * @Feb 23, 2018 (a version number or a date)
 */

import java.util.ArrayList;

public class HomeworkTester
{
    public static void main(String[] args)
    {
        ArrayList<Homework> school = new ArrayList<Homework>();
        
        IBEnglishIV english = new IBEnglishIV();
        english.createAssn(12, "English");
         
        IBTheoryOfKnowledge tok = new IBTheoryOfKnowledge();
        tok.createAssn(2, "Theory of Knowledge");
        
        APCalculusBC calc = new APCalculusBC();
        calc.createAssn(9, "Calculus");
        
        APComputerScience cs = new APComputerScience();
        cs.createAssn(5, "Computer Science");
        
        school.add (english);
        school.add (tok);
        school.add (calc);
        school.add(cs);
        
        System.out.println("            To-do list            ");
        System.out.println("----------------------------------");
        
        for(Homework s : school)
        {
            System.out.println(s.toString());
        }
    }
}
