import java.util.Scanner;

public class switch_statement
{
   public static void main(String[] arg)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      int year;
      
      // Step 1: User input
      System.out.println("Enter 1 for Frosh, 2 for Soph, 3 for Jun, and 4 for Sen.");
      year = keyboard.nextInt();
      
      // Step 2: List of operations
      
      // Step 3: Display w/ comparison to classic if-else
      switch(year)
      {
         case 1: System.out.println("Freshman");
            break;
         case 2: System.out.println("Sophomore");
            break;
         case 3: System.out.println("Junior");
            break;
         case 4: System.out.println("Senior");
            break;
         
         default:
            System.out.println("Invalid input.");
      }
      
      /*
      if (year == 1)
      {
         System.out.println("Freshman");
      }
      else if (year == 2)
      {
         System.out.println("Sophomore");
      }
      else if (year == 3)
      {
         System.out.println("Junior");
      }
      else if (year == 4)
      {
         System.out.println("Senior");
      }
      else
      {
         System.out.println("Invalid input.");
      }
      */
   }
}