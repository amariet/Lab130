/**
 * Amanda Torres
 * Lab 130
 * 30 January 2017
 */
public abstract class Person
{
    private String name;
    private int age;
    private String contact;
    private String gender;

    public Person()
    {
        name = "";
        age = 0;  
        contact = "";
        gender = "";
    }

    public Person(String name, int age, String contact, String gender)
    {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.gender = gender;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public int getAge()
    {
        return age;
    }

    public void setContact(String c)
    {
        contact = c;
    }

    public String getContact()
    {
        return contact;
    }

    public void setGender(String g)
    {
        gender = g;
    }

    public String getGender()
    {
        return gender;
    }

    public abstract void info();

}
