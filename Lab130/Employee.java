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
    
    public Employee(String date, String title)
    {
        startDate = date;
        positionTitle = title;
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
        return 
    }
    
    public int yearsServed()
    {
    }
}
