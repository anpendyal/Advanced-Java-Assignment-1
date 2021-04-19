//Assignment 1
//Anooshka Pendyal

//This program contains different kinds of employee objects. There are two kinds: Hourly and Salaried.
//First, it asks for the amount of employees and runs a loop for each of the employees in order to collect info on their attributes.
//Then, it runs another loop to display the attibutes.

public class Assignment1
{
    public static void main(String [] args)
    {

        //input for the number of employees
        int numOfEmployees = Input.getInt("How many employees would you like to have in your array? ");

        //creates employee array to hold all of the employee objects
        Employee [] employeeArray = new Employee[numOfEmployees];

        //loop to collect info for each employee
        for (int i = 0; i < numOfEmployees; i++)
        {
            //user input for employee's name
            String name = Input.getString("What is the employee's name? ");

            //user input for employee's hire date
            int month = Input.getInt("Enter the month of their hire date in a numerical fashion (ex. February = 2): ");
            int day = Input.getInt("Enter the day of their hire date: ");
            int year = Input.getInt("Enter the year of their hire date: ");
        
            //correctTypeInput is used in the while loop to make sure that the input is either 'H' or 'S'
            boolean correctTypeInput = false;

            while (correctTypeInput == false)
            {
                //user input for type of employee
                char typeOfEmployee = Input.getChar("Enter 'H' if the employee is hourly or 'S' if the employee is salaried: ");

                if (typeOfEmployee == 'H')
                {
                    //user input for hourly employee attributes
                    float hourlyWageRate = Input.getFloat("Enter the employee's hourly wage rate: ");
                    float hoursWorked = Input.getFloat("Enter the number of hours the employee works: ");

                    //create hourly employee object using parameterized constructor
                    employeeArray[i] = new HourlyEmployee(hourlyWageRate, hoursWorked, name, month, day, year);

                    //break loop
                    correctTypeInput = true;
                }
                else if (typeOfEmployee == 'S')
                {
                    //user input for salaried employee attributes
                    int annualSalary = Input.getInt("Enter the employee's annual salary: ");

                    //create salaried employee object using parameterized constructor
                    employeeArray[i] = new SalariedEmployee(annualSalary, name, month, day, year);

                    //break loop
                    correctTypeInput = true;
                }
                else
                {
                    //tell user what they must enter and continues the loop
                    System.out.println("Please enter only 'H' or 'S'.");
                }
            }
        }

        System.out.println();

        //loop to display name, hire date, and attributes unique to type of employee
        for (int i = 0; i < numOfEmployees; i++)
        {
            System.out.println("Name: " + employeeArray[i].getName());
            System.out.println("Hire Date: " + employeeArray[i].getHireDate());
            employeeArray[i].displayAttributes();
            System.out.println();
        }
    }
}