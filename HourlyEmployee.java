//Hourly Employee Class
//Anooshka Pendyal

//This class is a subclass of the Employee class. It has two additional attributes that represents the hourly wage rate and the hours worked.
//It contains a getter and setter method for the two attributes, a no argument constructor, and a parameterized constructor.
//It has a display attributes method that is used polymorphically to display the hourly wage rate and the hours worked.

public class HourlyEmployee extends Employee
{
    //attributes
    private float hourlyWageRate;
    private float hoursWorked;

    //no argument constructor
    public HourlyEmployee()
    {
        super();
        hourlyWageRate = 0;
        hoursWorked = 0;
    }

    //parameterized constructor
    public HourlyEmployee(float newWageRate, float newHoursWorked,String newName, int m, int d, int y)
    {
        super( newName, m, d, y);
        hourlyWageRate = newWageRate;
        hoursWorked = newHoursWorked;
    }

    //getter method for hourly wage rate
    public float getHourlyWageRate()
    {
        return hourlyWageRate;
    }

    //getter method for hours worked
    public float getHoursWorked()
    {
        return hoursWorked;
    }

    //setter method for hourly wage rate
    public void setHourlyWageRate(float newWageRate)
    {
        hourlyWageRate =  newWageRate;
    }

    //setter method for hours worked
    public void setHoursWorked( float newHoursWorked)
    {
        hoursWorked = newHoursWorked;
    }

    //display attributes method is used polymorphically -- displays hourly wage rate and hours worked
    public void displayAttributes()
    {
        System.out.println("Hourly Wage Rate: " + getHourlyWageRate());
        System.out.println("Hours Worked: " + getHoursWorked());
    }
}