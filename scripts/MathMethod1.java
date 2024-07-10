import java.util.Scanner;

public class MathMethod1
{
   public static void main(String[] args)
   {
      addition();
   }
   public static void addition()
   {
      Scanner keyboard = new Scanner(System.in);
      int num1, num2, sum;
      
      System.out.print("Enter first number: ");
      num1 = keyboard.nextInt();
      
      System.out.print("Enter second number: ");
      num2 = keyboard.nextInt();
      
      sum = num1 + num2;
      
      System.out.println("The sum is " + sum); // this file isn't done
   }
}