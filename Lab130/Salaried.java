
/**
 * Amanda Torres
 * Lab 130
 * 31 January 2017
 */
public class Salaried extends Employee
{
    private double annualSalary;

    public Salaried()
    {
        super();
        annualSalary = 0;
    }
    
    public Salaried(String name, int age, String contact, String gender, String startDate, String positionTitle)
    {
        super(name, age, contact, gender, startDate, poitionTitle);
        this.annualSalary = annualSalary;
    }
    
    public void setAnnualSalary(double annual)
    {
        annualSalary = annual;
    }
    
    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public double calcPay(double payPeriod)
    {
        return annualSalary * (payPeriod / 245.0);
    }
    
    public String info()
    {
        String inf = super.info();
        return(inf + "\tAnnual Salary: " + annualSalary);
    }
}
