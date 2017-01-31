/**
 * Amanda Torres
 * Lab 130
 * 30 January 2017
 */
public class Customer extends Person
{
    private String region;

    public Customer()
    { 
        super();
        customerRegion = "";
    }
    
    public Customer(String name, int age, int contact, String gender, String region)
    {
        super(name, age, contact, gender);
        this.region = region;
    }
    
    public void setRegion(String r)
    {
        region = r;
    }
    
    public String getRegion()
    {
        return region;
    }

    public String info()
    {
        return("Person : Customer\tName: " + getName() + "\tAge: " + getAge() + "\tContact: " + getContact() + "\tGender: " + getGender() + "\tRegion: " + region);
    }
}