import java.util.Scanner;

public class arrayFmax
{
   public static void main(String[] args)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      int intMax, intMin, indexMax = 0, indexMin = 0;
      int [] fmax = new int[10];
      
      // Step 1: Get user input
      System.out.print("Enter element 0 of the array: "); // Referring to the elements as their actual index, not i + 1
      fmax[0] = keyboard.nextInt();
      intMax = fmax[0];
      intMin = fmax[0];
      
      for (int i = 1; i < 10; i++)
      {
         System.out.print("Enter element " + i + " of the array: ");
         fmax[i] = keyboard.nextInt();
         
         if (fmax[i] > intMax)
         {
            intMax = fmax[i];
            indexMax = i;
         }
         if (fmax[i] < intMin)
         {
            intMin = fmax[i];
            indexMin = i;
         }
      }
      
      // Step 2: Display answer
      System.out.print("\nThe array you generated: [");
      for (int k = 0; k < 10; k++)
      {
         if (k < (fmax.length - 1))
         {
            System.out.print(fmax[k] + ", ");
         }
         else
         {
            System.out.print(fmax[k] + "]\n");
         }
      }
      
      System.out.println("\nThe maximum value is: " + intMax);
      System.out.println("This is element number " + indexMax + " in the list of numbers.");
      
      System.out.println("\nThe minimum value is: " + intMin);
      System.out.println("This is element number " + indexMin + " in the list of numbers.");
   }
}