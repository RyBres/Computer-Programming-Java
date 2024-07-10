import java.util.Scanner;

public class if_else
{
   public static void main(String[] arg)
   {
      // Step 0: Declare variables
      Scanner keyboard = new Scanner(System.in);
      double age;
      
      // Step 1: Enter user's age
      System.out.print("Enter your age: ");
      age = keyboard.nextInt();
      
      // Step 2: List of operations
      
      
      // Step 3: Print user's age
      if (age < 1 || age > 110)
      {
         System.out.println("Invalid age");
      }
      else
      {
         System.out.println("Your age is " + age);
      }
   }
}