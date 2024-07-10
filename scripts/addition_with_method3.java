
import java.util.Scanner;

public class addition_with_method3
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int num1, num2, sum;
      
      // Step 1: Ask user inputs
      System.out.print("Enter first number: ");
      num1 = keyboard.nextInt();
      
      System.out.print("Enter second number: ");
      num2 = keyboard.nextInt();
      
      // Step 2: Call addition method
      sum = addition(num1, num2); // In paren are the arguments.
      
      //Step 3: Display 
      System.out.println("The sum is " + sum);
      
   }
   
   public static int addition(int n1, int n2) // since we want to return an int, we specify int instead of void.
                                              // Inside the paren are the parameters.
   {
      // Step 0: Arithmetic
      return (n1 + n2);
      
   }
   
}