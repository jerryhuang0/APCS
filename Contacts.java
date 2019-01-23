
/**
 * Write a description of class Contacts here.
 *
 * @Gerald Huang (your name)
 * @April 4, 2018 (a version number or a date)
 */
public class Contacts
{
    private String name, relation, birth, phone, email;
    
    public Contacts(String name, String relation, String birth, String phone, String email)
    {
        this.name = name;
        this.relation = relation;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getRelation()
    {
        return relation;
    }
    
    public String getBirth()
    {
        return birth;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String toString()
    {
        return name + " " + relation + " " + birth + " " + phone + " " + email;
    }
}
