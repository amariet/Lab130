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
    
        Customer c1 = new Customer ("Customer", 16, "845-156-9458", "female", "Illinois");
        Customer c2 = new RetailCustomer ("Retail customer", 48, "454-684-7951", "female", "Kansas", 67);
        Customer c3 = new WholesaleCustomer ("Wholesale customer", 42, "945-214-8974", "male", "Oregon", 45, "Apple");
        Customer c4 = new Customer();
        Customer c5 = new RetailCustomer();
        Customer c6 = new WholesaleCustomer();
        Employee e1 = new Employee ("General Employee", 17, "878-1545-9475", "male", 15 January 2011, "Mailman");
        Employee e2 = new HourlyEmployee ("Hourly Employee", 32, "458-154-9845", "male", 27 May 2010, "Paletero", 16.00);
        Employee e3 = new SalariedEmployee ("Salaried Employee", 48, "485-245-9874", "female", 25 August, "Nurse", 60000);
        Employee e4 = new Employee();
        Employee e5 = new HourlyEmployee();
        Employee e6 = new SalariedEmployee();

