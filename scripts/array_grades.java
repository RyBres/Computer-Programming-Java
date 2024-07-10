
import java.util.Scanner;

public class array_grades
{
   public static void main(String[] args)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      int size, total = 0;
      double average;
      
      // Step 1: User input
      System.out.print("Number of grades you will enter: ");
      size = keyboard.nextInt();
      
      int [] grade = new int[size]; // Step 0 - needs to be init after size is entered
      
      for (int i = 0; i < size; i++)
      {
         System.out.print("Enter grade " + (i + 1) + ": ");
         grade[i] = keyboard.nextInt();
         total += grade[i];
      }
      
      // Step 3: Result
      if (size == 0)
      {
         System.out.println("There are no grades entered.");
      }
      else
      {
         average = total / size;
         System.out.println("Your average is " + average);
      }
      
      // Step 4: Show all grades
      for (int i = 0; i < size; i++)
      {
         System.out.print(grade[i] + " ");
      }
      
   }
}