import java.util.Scanner;

public class nested_selective
{
   public static void main(String[] arg)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      String school, major;
      
      // Step 1: User input
      System.out.print("Enter school name: ");
      school = keyboard.nextLine();
      
      System.out.print("Enter a major: ");
      major = keyboard.nextLine();
      
      // Step 2: List of operations
      
      // Step 3: Display
      if (school.equals("Rutgers")) // Instead of ==, you use .equals() function for strings.
      {
         if (major.equals("CS") || major.equals("IT"))
         {
            System.out.println("You need to take programming classes!");
         }
         else
         {
            System.out.println("You must be either a CS or IT student.");
         }
      }
      else
      {
         System.out.println("You must be a Rutgers student.");
      }
   }
}