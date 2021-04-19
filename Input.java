//Input Class
//Provided by CTY
import javax.swing.*;

public class Input
{
//user input for byte
 public static byte getByte( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return Byte.parseByte( input );
 }

//user input for short
 public static short getShort( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return Short.parseShort( input );
 }

 //user input for integer
 public static int getInt( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return Integer.parseInt( input );
 }

 //user input for long
 public static long getLong( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return Long.parseLong( input );
 }
 
 //user input for float
 public static float getFloat( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return Float.parseFloat( input );
 }

 //user input for double
 public static double getDouble( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return Double.parseDouble( input );
 }

 //user input for boolean
 public static boolean getBoolean( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return Boolean.parseBoolean( input );
 }

 //user input for character
 public static char getChar( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return input.charAt(0);
 }

 //user input for String
 public static String getString( String s )
 {
  String input = JOptionPane.showInputDialog( s );
  return input;
 }
 
}