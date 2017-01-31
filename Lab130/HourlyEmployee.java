/**
 * Amanda Torres
 * Lab 130
 * 30 January 2017
 */
public class HourlyEmployee extends Employee
{
    private int hourlyRate;

    public HourlyEmployee()
    {
        super();
        hourlyRate = 0;
    }
    
    public HourlyEmployee(String name, int age, int contact, String gender, int startDate, String positionTitle, int hourlyRate)
    {
        super(name, age, contact, gender, startDate, positionTitle, hourlyRate):
        this.hourlyRate = hourlyRate;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
