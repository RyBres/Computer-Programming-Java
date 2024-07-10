import java.util.Scanner;

public class factorialRecursion
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int number;
      
      System.out.print("Enter a number: ");
      number = keyboard.nextInt();
      System.out.println("The answer is " + factorial(number));
   }
   public static int factorial(int n)
   {
      if(n == 0)
      {
         return 1;
      }
      else
      {
         return n * factorial(n-1);
      }
   }
}