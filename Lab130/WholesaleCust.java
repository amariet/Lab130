/**
 * Amanda Torres
 * Lab 130
 * 31 January 2017
 */
public class WholesaleCust extends Customer
{
    private int markupRate;
    private String company;

    public WholesaleCust()
    {
        super();
        markupRate = 0;
        company = "";
    }

    public WholesaleCust(String name, int age, int contact, String  gender, String region, int markupRate, String company)
    {
        super(name, age, contact, gender, region);
        this.markupRate = markupRate;
        this.company = company;
    }
    
    public void setMarkupRate(int m)
    {
        markupRate = m;
    }
    
    public int getMarkupRate()
    {
        return markupRate;
    }
    
    public void setCompany(String c)
    {
        company = c;
    }
    
    public String getCompany()
    {
        return company;
    }
    
    public String info()
    {
        String inf = super.info();
        return(inf + "\tMarkup Rate: " + markupRate + "\tCompany: " + company);
    }
}
