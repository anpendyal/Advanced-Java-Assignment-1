//Date Class
//Provided by CTY

import java.util.Scanner;

public class Date
{
  //attributes
  private int month;
  private int day;
  private int year;
  
  //no argument constructor
  public Date()
  {
    month = 0;
    day = 0;
    year = 0;
  }

  //parameterized constructor
  public Date( int m, int d, int y )
  {
    month = editMonth( m );
    day = editDay( d );
    year = editYear( y );
  }

  //setter method for date (also checks each input)
  public void setDate( int m, int d, int y )
  {
    month = editMonth( m );
    day = editDay( d );
    year = editYear( y );
  }

  //getter method for date
  public String getDate()
  {
    return month + "/" + day + "/" + year;
  }

  //getter methods for individual parts of date
  public int getMonth() { return month; }
  public int getDay() { return day; }
  public int getYear() { return year; }
  
  //checks input for month, makes sure it ranges from 1 to 12
  protected int editMonth( int m )
  {
    if( m >= 1 && m <= 12 )
      return m;
    else
    {
      Scanner input = new Scanner( System.in );
      while( !( m >= 1 && m <= 12 ) )
      {
        System.out.print( "Month must be 1-12 --- Please re-enter: " );
        m = input.nextInt();
      }
      return m;
    }          
  }
  
  //checks input for day, makes sure the day entered does not exceed the number of days in the month
  protected int editDay( int d )
  {
    int [] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    if( d >= 1 && d <= monthDays[month - 1] )
      return d;
    else
    {
      Scanner input = new Scanner( System.in );
      while( !( d >= 1 && d <= monthDays[month - 1] ) )
      {
        System.out.print( "Day must be 1 - " + monthDays[month - 1] + " --- please re-enter: " );
        d = input.nextInt();
      }
      return d;
    }
  }
  
  //checks input for year, makes sure the year entered is greater than 1
  protected int editYear( int y )
  {
    if( y >= 1 )
      return y;
    else
    {
      Scanner input = new Scanner(System.in);
      while( y < 1 )
      {
        System.out.print( "Year must be greater than 1 --- please re-enter: " );
        y = input.nextInt();
      }
      return y;
    }
  }
}