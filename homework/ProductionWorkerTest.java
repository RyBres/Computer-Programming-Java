
import java.util.Scanner;

public class ProductionWorkerTest
{
   
   // Helper class
   public static class helperClass {
       private int userInput;
       private String message;
   
       public helperClass(int userInput, String message) {
           this.userInput = userInput;
           this.message = message;
       }
   
       public int retryIntEntry(Scanner keyboard) {
           if (userInput != 1 && userInput != 2) {
               while (userInput != 1 && userInput != 2) {
                   System.out.println("\nYour entry could not be recognized. Please try again, or enter 999 if you wish to exit the process.");
                   System.out.print(message);
                   userInput = keyboard.nextInt();
   
                   if (userInput == 999) {
                       System.exit(0);
                   }
               }
           }
           return userInput;
       }
   }
   
   // Main method
   public static void main(String[] args)
   {
   
      // 1. Variables
      Scanner keyboard = new Scanner(System.in);
      String name = null, date = null;
      int id = 0, shift = 0, selection;
      double rate = 0.0;
      
      // 2. User choice of demo method
      System.out.print("Enter 1 if you would like to enter worker info, or enter 2 if you want a premade entry to be displayed: ");
      selection = keyboard.nextInt();
      
      // 3. Input verification
      helperClass initialRetry = new helperClass(selection, "Enter 1 if you would like to enter worker info, or enter 2 if you want a premade entry to be displayed: ");
      selection = initialRetry.retryIntEntry(keyboard);
      keyboard.nextLine();
      
      // 4. Assign values to variables
      if (selection == 1)
      {
         // Get user input
         System.out.print("Enter worker name: ");
         name = keyboard.nextLine();
         
         System.out.print("Enter date: ");
         date = keyboard.nextLine();
         
         System.out.print("Enter worker ID: ");
         id = keyboard.nextInt();
         
         System.out.print("Enter shift (1 for day, 2 for night): ");
         shift = keyboard.nextInt();
         
         helperClass shiftRetry = new helperClass(shift, "Enter 1 for day shift, or enter 2 for night shift: ");
         shift = shiftRetry.retryIntEntry(keyboard);
         keyboard.nextLine();
         
         
         System.out.print("Enter hourly pay rate: ");
         rate = keyboard.nextDouble();
      }
      else if (selection == 2)
      {
         name = "Ryan Bresnahan";
         date = "6/14/2024";
         id = 123;
         shift = 2;
         rate = 30.0;
      }
      
      // 5. Initialize prodWorker with input
      ProductionWorker prodWorker = new ProductionWorker(name, date, id, shift, rate);
      
      // 6. Show result
      System.out.println("Name is: " + prodWorker.getName()); 
      System.out.println("Date is: " + prodWorker.getDate());
      System.out.println("ID is: " + prodWorker.getId());
      System.out.println("Shift is (1 = day, 2 = night): " + prodWorker.getShift());
      System.out.println("Hourly rate is: " + prodWorker.getRate());
      
      
   }
}