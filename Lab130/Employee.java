/**
 * Amanda Torres
 * Lab 130
 * 30 January 2017
 */
public class Employee extends Person
{
    private String startDate;
    private String positionTitle;

    public Employee()
    {
        startDate = "";
        positionTitle = "";
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
        
    }
    
    public int yearsServed()
    {
    }
}
