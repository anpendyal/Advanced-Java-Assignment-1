//Salaried Employee
//Anooshka Pendyal

//This class is a subclass of the Employee class. It has an additional attribute that represents the annual salary.
//It contains a getter and setter method for the annual salary attribute, a no argument constructor, and a parameterized constructor.
//It has a display attributes method that is used polymorphically to display the annual salary.

public class SalariedEmployee extends Employee
{
    //attributes
    private int annualSalary;

    //no argument constructor
    public SalariedEmployee()
    {
        super();
        annualSalary = 0;
    }

    //parameterized constructor
    public SalariedEmployee(int newAnnualSalary, String newName, int m, int d, int y)
    {
        super(newName, m, d, y);
        annualSalary = newAnnualSalary;
    }

    //getter method for annual salary
    public int getAnnualSalary()
    {
        return annualSalary;
    }

    //setter method for annual salary
    public void setAnnualSalary(int newSalary)
    {
        annualSalary =  newSalary;
    }

    //display attributes method is used polymorphically -- displays the annual salary
    public void displayAttributes()
    {
        System.out.println("Annual Salary: " + getAnnualSalary());
    }
}