/**
 * Amanda Torres
 * Lab 130
 * 30 January 2017
 */
import java.util.Calendar;
public class Employee extends Person
{
    private int startDate;
    private String positionTitle;

    public Employee()
    {
        super();
        startDate = Calendar.getInsrance().getCalendar(Calendar.YEAR);
        positionTitle = "Employee";
    }
    
    public Employee(String name, int age, int contact, String gender, int startDate, String postitionTitle)
    {
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
    
    public int yearsServed()
    {
    }
}
