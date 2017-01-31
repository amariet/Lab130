/**
* Amanda Torres
* Lab 130
* 31 January 2017
*/

import java.util.ArrayList;
public class Tester
{
  public static void main()
  {
    ArrayList<Peron> p = new ArrayList<Person>();
    
        Customer c1 = new Customer ("Customer", 35, "123-345-4567", "male", "California");
        Customer c2 = new RetailCustomer ("Retail customer", 36, "123-345-4567", "female", "Nevada", 75);
        Customer c3 = new WholesaleCustomer ("Wholesale customer", 37, "123-345-4567", "female", "Colorado", 30, "Amazon");
        Customer c4 = new Customer();
        Customer c5 = new RetailCustomer();
        Customer c6 = new WholesaleCustomer();
        Employee e1 = new Employee ("General Employee", 45, "987-654-4321", "female", 2001, "Doctor");
        Employee e2 = new HourlyEmployee ("Hourly Employee", 46, "987-654-4321", "male", 2002, "Ice Cream Scooper", 12.00);
        Employee e3 = new SalariedEmployee ("Salaried Employee", 47, "987-654-4321", "female", 2003, "Engineer", 80000);
        Employee e4 = new Employee();
        Employee e5 = new HourlyEmployee();
        Employee e6 = new SalariedEmployee();

