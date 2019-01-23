
/**
 * Write a description of class GradebookTester here.
 *
 * @Gerald Huang (your name)
 * @April 12, 2018 (a version number or a date)
 */
public class GradebookTester
{
    public static String calcGrade(double[] array)
    {
        double sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        
        double average = sum / array.length;
        
        if(average <= 59)
        {
            return "F";
        }
        else if((average > 59) && (average <= 69))
        {
            return "D";
        }
        else if((average > 69) && (average <= 79))
        {
            return "C";
        }
        else if((average > 79) && (average <= 89))
        {
            return "B";
        }
        else if(average > 89)
        {
            return "A";
        }
        else;
        return "";
    }
    
    public static void main(String[] args)
    {
        System.out.println("Student names and scores");
        
        double[] AAScores = {75, 36.5, 88.4, 93};
        double[] BBScores = {56, 88, 35, 100};
        double[] CCScores = {83, 96, 87, 99};
        double[] empty = {};
        double[] EEScores = {66, 85.2, 45};
        
        Gradebook AA = new Gradebook("Albert", "Apple", AAScores);
        Gradebook BB = new Gradebook("Beatrice", "Blues", BBScores);
        Gradebook CC = new Gradebook("Charlie", "Chaplin", CCScores);
        
        //the below line of code will trigger an empty array exception
        Gradebook DD = new Gradebook("Deborah", "Dues", empty);
        

        //the below line of code will trigger an empty name exception
        //Gradebook EE = new Gradebook("", "", EEScores);
        
        AA.setGrade(calcGrade(AAScores));
        BB.setGrade(calcGrade(BBScores));
        CC.setGrade(calcGrade(CCScores));
        //DD.setGrade(calcGrade(empty));
        
        System.out.println(AA.toString());
        System.out.println(BB.toString());
        System.out.println(CC.toString());
        //System.out.println(DD.toString());
        
        //the below line of code just prints out object EE
        //System.out.println(EE.toString());        
        
    }
}
