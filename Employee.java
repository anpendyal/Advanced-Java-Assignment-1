//Employee Class
//Anooshka Pendyal

//This class represents an employee and is a superclass to Hourly Employee and Salaried Employee.
//It has two attributes: name (String) and hire date (Date).
//It contains a getter and setter method for the two attributes, a no argument constructor, and a parameterized constructor.
//It has a display attributes method that is null. It used polymorphically in the subclasses to display unique attributes.

public class Employee
{
    //attributes
    private String name;
    private Date hireDate;

    //no argument constructor
    public Employee()
    {
        name = "";
        hireDate = new Date();
    }

    //parameterized constructor
    public Employee(String newName, int m, int d, int y)
    {
        name = newName;
        hireDate = new Date(m, d, y);
    }

    //getter method for name
    public String getName()
    {
        return name;
    }

    //getter method for hireDate -- uses Date class's getter method
    public String getHireDate()
    {
        return hireDate.getDate();
    }
    
    //setter method for name
    public void setName(String newName)
    {
        name = newName;
    }

    //setter method for hireDate -- uses Date class's setter method
    public void setHireDate(int m, int d, int y)
    {
        hireDate.setDate(m, d, y);
    }

    //display attributes method will be used polymorphically in the subclasses -- it is a null method in the superclass
    public void displayAttributes()
    {
    }
}

