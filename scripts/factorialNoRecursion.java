import java.util.Scanner;

public class factorialNoRecursion
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int n, ans = 1;
      
      System.out.print("Enter a number: ");
      n = keyboard.nextInt();
      
      for (int i = 1; i <= n; i++)
      {
         ans = ans * i;
      }
      
      System.out.println("The answer is " + ans);
   }
}