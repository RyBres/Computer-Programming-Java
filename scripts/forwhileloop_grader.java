import java.util.Scanner;

public class forwhileloop_grader
{
   public static void main(String[] arg)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      double average, grade, total = 0.0;
      int size;
      
      System.out.print("Enter the number of grades you will enter: ");
      size = keyboard.nextInt();
      
      // Step 1: Input vars and get total
      for (int i = 0; i < size; i++)
      {
         System.out.print("Enter a grade for assignment " + (i + 1) + ": ");
         grade = keyboard.nextInt();
         
         // While loop to check for grades outside of bounds, need variable for grade
         
         while (grade < 0 || grade > 100)
         {
            System.out.print("Invalid grade. Enter grade again: ");
            grade = keyboard.nextInt(); // This input will overwrite the incorrect one
         }
         
         total += grade;
      }
      
      // Step 2: List of operations
      if (size == 0)
      {
         System.out.println("There are no grades entered.");
      }
      else
      {
         average = total / size;
         
         // Step 3: Display average
         System.out.println("Your average grade is: " + average);
      }

   }
   
}