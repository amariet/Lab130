/**
 * Amanda Torres
 * Lab 130
 * 30 January 2017
 */
public abstract class Person
{
    private String personName;
    private int personAge;
    private int personContact;
    private String personGender;

    public Person()
    {
        personName = "";
        personAge = 0;
        personContact = 0;
        personGender = "";
    }
    
    public Person(String name, int age, int contact, String gender)
    {
        personName = name;
        personAge = age;
        personContact = contact;
        personGender = gender;
    }
    
    public void setName(String name)
    {
        personName = name;
    }
    
    public String getName()
    {
        return personName;
    }
    
    public void setAge(int age)
    {
        personAge = age;
    }
    
    public int getAge()
    {
        return personAge;
    }
    
    public void setContact(int contact)
    {
        personContact = contact;
    }
    
    public int getContact()
    {
        return personContact;
    }
    
    public void setGender(String gender)
    {
        personGender = gender;
    }
    
    public String getGender()
    {
        return personGender;
    }

    public abstract void info();
    
}
