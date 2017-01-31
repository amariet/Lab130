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
        super(name, age, contact, gender, startDate, positionTitle):
        this.hourlyRate = hourlyRate;
    }

    public void setHourlyRate(int rate)
    {
        hourlyRate = rate;
    }
    
    public int getHourlyRate()
    {
        return rate;
    }
    
    public double calcPay(int hours)
    {
        return hours * hourlyRate;
    }
    
    public String info()
    {
        String inf = super.info();
        return(inf + "\tHourly Rate: " + hourlyRate);
    }
}
