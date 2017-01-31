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
    
        people.add(c1);
        people.add(c2);
        people.add(c3);
        people.add(c4);
        people.add(c5);
        people.add(c6);
        people.add(e1);
        people.add(e2);
        people.add(e3);
        people.add(e4);
        people.add(e5);
        people.add(e6);
        
        for (int i = 0; i < p.size(); i++)
        {
            System.out.print(p.get(i).info());
            System.out.print("\n");
        }
        
        System.out.print("\n\n\n");
        c4.setName("Annie"); c4.setAge(18); c4.setContact("545-145-9845"); c4.setGender("female"); c4.setRegion("Idaho");
        c5.setName("Mark"); c5.setAge(64); c5.setContact("945-218-3155"); c5.setGender("male"); c5.setRegion("California");c5.setMarkupRate(84);
        c6.setName("Jordie"); c6.setAge(17); c6.setContact("125-515-5148"); c6.setGender("female"); c6.setRegion("California"); c6.setMarkupRate (65); c6.setCompany ("Barnes & Noble");
        e4.setName("Jim"); e4.setAge(57); e4.setContact("645-845-7895"); e4.setGender("male"); e4.setStartDate("14 May 1987") e4.setPositionTitle("Doctor");
        e5.setName("Lorna"); e5.setAge(31); e5.setContact("548-456-9231"); e5.setGender("female"); e5.setStartDate("18 September 2016"); e5.setPositionTitle("Cashier"); e5.setHourlyRate(10.50);
        e6.setName("Mike"); e6.setAge(26); e6.setContact("315-139-8745"); e6.setGender("male"); e6.setStartDate("06 October 2012"); e6.setPositionTitle("Graphic Design Artist"); e6.setAnnualSalary(40000);
