// Ryan Bresnahan
// repeating statement homework
// prompt 2: do while grader

import java.util.Scanner;

public class repeat_statement_q2
{
   public static void main(String[] args)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      double grade, average, total = 0.0;
      int i = 0;
      
      // Step 1: Do-While Loop
      System.out.println("Please enter each grade (between 0 and 100) one at a time. To stop, enter 999.");
      
      do
      {
         
         System.out.print("Please enter a grade to be added to your total: ");
         grade = keyboard.nextInt();
         
         if (grade != 999)
         {
         
            while (grade < 0 || grade > 100)
            {
               System.out.print("Invalid entry. Enter grade again: ");
               grade = keyboard.nextInt();
               
               if (grade == 999) // Allow for process exit after incorrect entry
               {
                  break;
               }
               
            }
         
         if (grade != 999)
         {
            total += grade;
            i++;
         }
         
         }
         
      } while (grade != 999);
      
      if (i == 0)
      {
         System.out.print("There are no grades entered.");
      }
      else
      {
         // Step 2: Arithmetic operations
         average = total / i;
         
         // Step 3: Display result
         System.out.println("Your average grade is: " + average);
      }
      
   }
   
}