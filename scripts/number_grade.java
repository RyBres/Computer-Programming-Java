import java.util.Scanner;

public class number_grade
{
   public static void main(String[] arg)
   {
      // Step 1: Declare vars
      Scanner keyboard = new Scanner(System.in);
      double num_grade;
      char let_grade;
      
      // Step 2: Get input 
      System.out.print("Enter your numeric grade: "); // Note that print is used since we want it on the same line - otherwise use println
      num_grade = keyboard.nextInt();
      
      
      // Step 3: Assign letter grade (if-else)
      if (num_grade >= 90.0)
      {
         let_grade = 'A'; // Characters use single quotes and strings use double quotes
      }
      else if (num_grade >= 80.0 && num_grade < 90.0)
      {
         let_grade = 'B';
      }
      else if (num_grade >= 70.0 && num_grade < 80.0)
      {
         let_grade = 'C';
      }
      else if (num_grade >= 60.0 && num_grade < 70.0)
      {
         let_grade = 'D';
      }
      else
      {
         let_grade = 'F';
      }
      
      
      // Step 4: Print result
      System.out.println("Your grade is a(n) " + let_grade);
   }
}