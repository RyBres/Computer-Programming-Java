import java.util.Scanner;

public class simple_if
{
   public static void main(String[] arg)
   {
      // Step 0: Declare variables
      Scanner keyboard = new Scanner(System.in);
      double age;
      
      // Step 1: Enter user's age
      System.out.print("Enter your age: ");
      age = keyboard.nextInt();
      
      if (age < 1 || age > 110)
      {
         System.out.println("Invalid age");
      }
      
      // Step 2: List of operations
      
      
      // Step 3: Print user's age
      System.out.println(age);
      
      
   }
}