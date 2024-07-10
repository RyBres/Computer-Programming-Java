// Ryan Bresnahan
// Selective statement homework
// Prompt 1: Roman Numerals

import java.util.Scanner;

public class selective_statement_q1
{
   public static void main(String[] arg)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      int number;
      
      // Step 1: User input
      System.out.println("Enter a number from 1 - 10. The program will print the number as a Roman numeral.");
      number = keyboard.nextInt();
      
      // Step 2: List of operations
      
      // Step 3: Display with switch
      switch(number)
      {
         case 1: System.out.println("I");
            break;
         case 2: System.out.println("II");
            break;
         case 3: System.out.println("III");
            break;
         case 4: System.out.println("IV");
            break;
         case 5: System.out.println("V");
            break;
         case 6: System.out.println("VI");
            break;
         case 7: System.out.println("VII");
            break;
         case 8: System.out.println("VIII");
            break;
         case 9: System.out.println("IX");
            break;
         case 10: System.out.println("X");
            break;
            
         default: System.out.println("Invalid input.");
      }
   }
}