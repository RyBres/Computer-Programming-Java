import java.util.Scanner;

public class switch_channel
{
   public static void main(String[] arg)
   {
      // Step 0: Declare vars
      Scanner keyboard = new Scanner(System.in);
      int channel;
      
      // Step 1: User input
      System.out.println("Enter 1 for CBS, 2 and 11 for ABC, 3 for FOX, and 4 for NBC.");
      channel = keyboard.nextInt();
      
      // Step 2: List of operations
      
      // Step 3: Display with switch
      switch(channel) // the channel arg only choose where in the switch it begins to evaluate. It only stops bc of the break statements.
      {
         case 1: System.out.println("CBS");
            break;
         case 2: case 11: System.out.println("ABC");
            break;
         case 3: System.out.println("FOX");
            break;
         case 4: System.out.println("NBC");
            break;
            
         default: System.out.println("Invalid input.");
      }
   }
}