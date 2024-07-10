
import java.util.Scanner;

public class retailPriceCalculator
{
   public static void main(String[] args)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      double wholeCost, markupPercent, retailPrice;
      String roundPrice;
      
      // Step 1: User input
      System.out.print("Enter the wholesale cost: $");
      wholeCost = keyboard.nextFloat();
      
      System.out.print("\nEnter the markup percentage (ex: 56.23, 70.1, etc.): ");
      markupPercent = keyboard.nextFloat() / 100;
      
      // Step 2: Call method
      retailPrice = calculateRetail(wholeCost, markupPercent);
      
      // Step 3: Print answer
      roundPrice = String.format("%.2f", retailPrice);
      System.out.print("\nThe retail price is $" + roundPrice + ".");
   }
   
   public static double calculateRetail(double cst, double pct)
   {
      return (cst + cst*pct);
   }
}