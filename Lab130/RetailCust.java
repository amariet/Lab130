/**
 * Amanda Torres
 * Lab 130
 * 31 January 2017
 */
public class RetailCust extends Customer
{
    private int markupRate;

    public RetailCust()
    {
        super();
        markupRate = 0;
    }
    
    public RetailCust(String name, int age, String contact, String gender, String region, int markupRate)
    {
        super(name, age, contact, gender, region);
        this.markupRate = markupRate;
    }
    
    public void setMarkupRate(int m)
    {
        markupRate = rate;
    }
    
    public int getMarkupRate()
    {
        return markupRate;
    }

    public int sampleMethod(int y)
    {
        String inf = super.info();
        return(inf + "\tMarkup Rate: " + markupRate);
    }
}
