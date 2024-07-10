import java.io.*;

public class StringTest
{
   public static void main(String[] args)
   {
      String str = new String("Welcome to our class.");
      
      System.out.print("String length is " + str.length());
      
      System.out.print("Str.substring(10) is: " + str.substring(10));
      
      System.out.println("Str.substring(10, 15) is: " + str.substring(10, 15));
   }
}