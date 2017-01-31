/**
 * Amanda Torres
 * Lab 130
 * 30 January 2017
 */
import java.util.Calendar;
public class Employee extends Person
{
    private String startDate;
    private String positionTitle;

    public Employee()
    {
        super();
        startDate = Calendar.getInsrance().getCalendar(Calendar.YEAR);
        positionTitle = "Employee";
    }
    
    public Employee(String name, int age, String contact, String gender, String startDate, String postitionTitle)
    {
        super(name, age, contact, gender);
        this.startDate = startDate;
        this.positionTitle = positionTitle;
    }
    
    public void setStartDate(String date)
    {
        startDate = date;
    }
    
    public String getStartDate()
    {
        return startDate;
    }
    
    public void setPositionTitle(String title)
    {
        positionTitle = title;
    }
    
    public String getPositionTitle()
    {
        return positionTitle;
    }

    public String info()
    {
        return ("Person: Employee\tName: " + getName() + "\tAge: " + getAge() + "\tContact: " + getContact()
                 + "\tGender: " + getGender() + "\tStart Year: " + startDate + "\tPosition: " + positionTitle);
    }
}
