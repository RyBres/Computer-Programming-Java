
import java.util.Scanner;

public class addition
{
   public static void main(String[] args)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      int num1, num2, sum;
      
      // Step 1: User input
      System.out.print("Enter first number: ");
      num1 = keyboard.nextInt();
      
      System.out.print("Enter second number: ");
      num2 = keyboard.nextInt();
      
      // Step 2: Arithmetic
      sum = num1 + num2;
      
      // Step 3: Display result
      System.out.println("The sum is " + sum);
      
   }

}