
/**
 * Write a description of class ContactsTester here.
 *
 * @Gerald Huang (your name)
 * @April 4, 2018 (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class ContactsTester
{
    public static void printArray(Contacts[] array)
    {
        System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
        
        for(Contacts s : array)
        {
            System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
        }
    }
    
    public static Contacts[] sortName(Contacts[] array)
    {
        Contacts[] dest = new Contacts[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                Contacts obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getName().compareTo(dest[k - 1].getName()) > 0)
                    {
                        insertInd = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                
                dest[ insertInd ] = obj;
            }
            
            return dest;
        
    }
    
    public static Contacts[] sortRelation(Contacts[] array)
    {
        Contacts[] dest = new Contacts[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                Contacts obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getRelation().compareTo(dest[k - 1].getRelation()) > 0)
                    {
                        insertInd = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                
                dest[ insertInd ] = obj;
            }
            
            return dest;
        
    }
    
    public static Contacts[] sortBirth(Contacts[] array)
    {
        Contacts[] dest = new Contacts[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                Contacts obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getBirth().compareTo(dest[k - 1].getBirth()) > 0)
                    {
                        insertInd = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                
                dest[ insertInd ] = obj;
            }
            
            return dest;
        
    }
    
    public static Contacts[] sortPhone(Contacts[] array)
    {
        Contacts[] dest = new Contacts[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                Contacts obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getPhone().compareTo(dest[k - 1].getPhone()) > 0)
                    {
                        insertInd = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                
                dest[ insertInd ] = obj;
            }
            
            return dest;
        
    }
    
    public static Contacts[] sortEmail(Contacts[] array)
    {
        Contacts[] dest = new Contacts[array.length];
        
            for(int i = 0; i < array.length; i++)
            {
                Contacts obj = array[i];
                int insertInd = 0;
                int k = i;
                
                while(k > 0 && insertInd == 0)
                {
                    if(obj.getEmail().compareTo(dest[k - 1].getEmail()) > 0)
                    {
                        insertInd = k;
                    }
                    else
                    {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                
                dest[ insertInd ] = obj;
            }
            
            return dest;
        
    }
    
    public static void seqName(Contacts[] array, String name)
    {
        boolean exists = false;
        List<Contacts> person = new ArrayList<Contacts>();
        for(int i = 0; i < array.length; i++)
        {
            if(name.equalsIgnoreCase(array[i].getName()))
            {
                exists = true;
                person.add(array[i]);
            }
        }
        
        if(exists)
        {
            System.out.println("The name matches the name for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The name does not match the name for any contact in the array");
        }
    }
    
    public static void seqRelation(Contacts[] array, String relation)
    {
        boolean exists = false;
        List<Contacts> person = new ArrayList<Contacts>();
        for(int i = 0; i < array.length; i++)
        {
            if(relation.equalsIgnoreCase(array[i].getRelation()))
            {
                exists = true;
                person.add(array[i]);
            }
        }
        
        if(exists)
        {
            System.out.println("The relation matches the relation for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The relation does not match the relation for any contact in the array");
        }
    }
    
    public static void seqBirth(Contacts[] array, String birth)
    {
        boolean exists = false;
        List<Contacts> person = new ArrayList<Contacts>();
        for(int i = 0; i < array.length; i++)
        {
            if(birth.substring(0,3).equalsIgnoreCase(array[i].getBirth().substring(0,3)))
            {
                exists = true;
                person.add(array[i]);
            }
        }
        
        if(exists)
        {
            System.out.println("The birthday matches the birthday for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The birthday does not match the birthday for any contact in the array");
        }
    }
    
    public static void seqPhone(Contacts[] array, String phone)
    {
        boolean exists = false;
        List<Contacts> person = new ArrayList<Contacts>();
        for(int i = 0; i < array.length; i++)
        {
            if(phone.equalsIgnoreCase(array[i].getPhone()))
            {
                exists = true;
                person.add(array[i]);
            }
        }
        
        if(exists)
        {
            System.out.println("The phone number matches the phone number for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The phone number does not match the phone number for any contact in the array");
        }
    }
    
    public static void seqEmail(Contacts[] array, String email)
    {
        boolean exists = false;
        List<Contacts> person = new ArrayList<Contacts>();
        for(int i = 0; i < array.length; i++)
        {
            if(email.equalsIgnoreCase(array[i].getEmail()))
            {
                exists = true;
                person.add(array[i]);
            }
        }
        
        if(exists)
        {
            System.out.println("The email matches the email for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The email does not match the email for any contact in the array");
        }
    }
    
    public static void binName(Contacts[] array, String name)
    {
        int high = array.length;
        int low = -1;
        int probe;
        String target = name;
        List<Contacts> person = new ArrayList<Contacts>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getName().compareTo(target) > 0 )
            high = probe;
            else
            {
                low = probe;
                if(array[low].getName().equalsIgnoreCase(target))
                {
                    person.add(array[low]);
                    exists = true;
                }
            }
        }
        
        if(exists)
        {
            System.out.println("The name matches the name for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The name does not match the name for any contact in the array");
        }
    }
    
    public static void binRelation(Contacts[] array, String relation)
    {
        int high = array.length;
        int low = -1;
        int probe;
        String target = relation;
        List<Contacts> person = new ArrayList<Contacts>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getRelation().compareTo(target) > 0 )
            high = probe;
            else
            {
                low = probe;
                if(array[low].getRelation().equalsIgnoreCase(target))
                {
                    exists = true;
                    person.add(array[low]);
                    //int place = low;
        
                    //while(array[place].getRelation().equalsIgnoreCase(target))
                    //{
                        //person.add(array[place]);
                        //place--;
                    //}
        
                    //place = low;
        
                    //while(array[place + 1].getRelation().equalsIgnoreCase(target))
                    //{
                        //person.add(array[place + 1]);
                        //place++;
                    //}
                }
            }
        }
        
        
        if(exists)
        {
            System.out.println("The relation matches the relation for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The relation does not match the relation for any contact in the array");
        }
    }
    
    public static void binBirth(Contacts[] array, String birth)
    {
        int high = array.length;
        int low = -1;
        int probe;
        String target = birth;
        List<Contacts> person = new ArrayList<Contacts>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getBirth().substring(0,3).compareTo(target.substring(0,3)) > 0 )
            high = probe;
            else
            {
                low = probe;
                if(array[low].getBirth().substring(0,3).equalsIgnoreCase(target.substring(0,3)))
                {
                    person.add(array[low]);
                    exists = true;
                }
            }
        }
        
        if(exists)
        {
            System.out.println("The birthday matches the birthday for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The birthday does not match the birthday for any contact in the array");
        }
    }
    
    public static void binPhone(Contacts[] array, String phone)
    {
        int high = array.length;
        int low = -1;
        int probe;
        String target = phone;
        List<Contacts> person = new ArrayList<Contacts>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getPhone().compareTo(target) > 0 )
            high = probe;
            else
            {
                low = probe;
                if(array[low].getPhone().equalsIgnoreCase(target))
                {
                    person.add(array[low]);
                    exists = true;
                }
            }
        }
        
        if(exists)
        {
            System.out.println("The phone number matches the phone number for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The phone number does not match the phone number for any contact in the array");
        }
    }
    
    public static void binEmail(Contacts[] array, String email)
    {
        int high = array.length;
        int low = -1;
        int probe;
        String target = email;
        List<Contacts> person = new ArrayList<Contacts>();
        boolean exists = false;
        
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( array[ probe ].getEmail().compareTo(target) > 0 )
            high = probe;
            else
            {
                low = probe;
                if(array[low].getEmail().equalsIgnoreCase(target))
                {
                    person.add(array[low]);
                    exists = true;
                }
            }
        }
        
        if(exists)
        {
            System.out.println("The email matches the email for at least one of the contacts in the array");
            System.out.printf("%-30s %15s %15s %15s %40s %n", "Name", "Relation", "Birth", "Phone", "Email");
            for(Contacts s : person)
            {
                System.out.printf("%-30s %15s %15s %15s %40s %n", s.getName(), s.getRelation(), s.getBirth(), s.getPhone(), s.getEmail());
            }
        }
        else
        {
            System.out.println("The email does not match the email for any contact in the array");
        }
    }
    
    public static void main(String[] args)
    {
        Contacts[] array = {new Contacts("Albert Apple", "Friend", "Dec 08", "904-223-5555", "albertapple@flvs.net"),
                            new Contacts("Britney Blues", "Best Friend", "Feb 23", "553-563-8596", "britneyblues@gmail.com"),
                            new Contacts("Charlie Chaplin", "Uncle", "Apr 16", "235-856-2468", "charliechaplin@cnn.com"),
                            new Contacts("Dusty Doln", "Brother", "May 02", "356-258-8548", "dustydoln@yahoo.com"),
                            new Contacts("Ethan Elemental", "Friend", "Nov 12", "524-635-8758", "ethanelemental@msn.com"),
                            new Contacts("Fred Flintstone", "Best Friend", "Oct 20", "324-205-3201", "flintstones@hotmail.com"),
                            new Contacts("Garfield Gnot", "Tutor", "Mar 16", "869-542-3256", "garfieldgnot@live.com"),
                            new Contacts("Harold Hunt", "Uncle", "Jan 08", "216-323-5696", "haroldhunt@outlook.com"),
                            new Contacts("Ingvar Innin", "Father", "Sep 12", "985-326-4157", "ingvarinnin@gmail.com"),
                            new Contacts("Jerry Jermos", "Friend", "Dec 14", "253-487-5287", "jerryjermos@yahoo.com")};
                            
        System.out.println("The array printed out: ");
        printArray(array);        
        System.out.println();
        
        System.out.println("Binary search for the name \"Albert Apple\"");
        sortName(array);
        //printArray(array);
        binName(array, "Albert Apple");
        System.out.println();
        
        System.out.println("Binary search for the name \"Alfred Agnes\"");
        binName(array, "Alfred Agnes");
        System.out.println();
        
        System.out.println("Binary search for the relationship \"Friend\"");
        array = sortRelation(array);
        //printArray(array);
        binRelation(array, "Friend");
        System.out.println();
        
        System.out.println("Binary search for the relationship \"Aunt\"");
        binName(array, "Aunt");
        System.out.println();
        
        System.out.println("Sequential search for the birth month of \"December\"");
        seqBirth(array, "December");
        System.out.println();
        
        System.out.println("Sequential search for the birth month of \"August\"");
        seqBirth(array, "August");
        System.out.println();
        
        System.out.println("Sequential search for the phone number \"216-323-5696\"");
        seqPhone(array, "216-323-5696");
        System.out.println();
        
        System.out.println("Sequential search for the phone number \"123-456-7890\"");
        seqPhone(array, "123-456-7890");
        System.out.println();
        
        System.out.println("Sequential search for the email \"ethanelemental@msn.com\"");
        seqEmail(array, "ethanelemental@msn.com");
        System.out.println();
        
        System.out.println("Sequential search for the phone number \"fakeemail@gmail.com\"");
        seqEmail(array, "fakeemail@gmail.com");
    }
}
