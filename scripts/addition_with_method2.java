
import java.util.Scanner;

public class addition_with_method2
{
   public static void main(String[] args)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      int num1, num2;
      
      // Step 1: User input
      System.out.print("Enter first number: ");
      num1 = keyboard.nextInt();
      
      System.out.print("Enter second number: ");
      num2 = keyboard.nextInt();
      
      // Step 2: Call addition method with arguments
      addition(num1, num2);
      
   }
   
   public static void addition(int n1, int n2) // make sure to pass args of the proper type
   {    
      // Step 0: Declare vars
      int sum;
   
      // Step 1: Arithmetic
      sum = n1 + n2;
      
      // Step 2: Display result
      System.out.println("The sum is " + sum);
   }
}