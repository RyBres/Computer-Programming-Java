import java.util.Scanner;

public class payroll
{
   public static void main(String[] arg)
   {
      // Step 0: Variable declarations
      Scanner keyboard = new Scanner(System.in);
      int hours;
      double hourly_rate, gross_pay, state_amt, fed_amt, net_pay;
      final double state_rate = 0.03, fed_rate = 0.02; // Constants use final statement
      
      // Step 1: Ask for user inputs
      System.out.print("Enter hourly rate: ");
      hourly_rate = keyboard.nextDouble();
      
      if (hourly_rate <= 0)
      {
         System.out.printlnO("You entered an invalid hourly rate.")
      } 
      
      System.out.print("Enter total hours: ");
      hours = keyboard.nextInt();
      
      if (hours <= 0 || hours > 50)
      {
         System.out.println("You entered an invalid hours.")
      }
      
      // Step 2: List of operations
      gross_pay = hourly_rate * hours;
      state_amt = gross_pay * state_rate;
      fed_amt = gross_pay * fed_rate;
      net_pay = gross_pay - state_amt - fed_amt;
      
      // Step 3: Display
      System.out.println("Gross pay is " + gross_pay);
      System.out.println("State tax amount is " + gross_pay);
      System.out.println("Federal tax amount is " + fed_amt);
      System.out.println("Net pay is " + net_pay);
   }
}