import java.util.*;

public class StringReverse
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String inputString;
      
      System.out.print("Enter a string: ");
      inputString = keyboard.nextLine();
      
      System.out.println("The string before is " + inputString);
      StringBackward(inputString);
   }
   public static void StringBackward(String s)
   {
      if (s.length() == 0)
      {
         return;
      }
      else
      {
         System.out.print(s.substring(s.length() - 1)); // substring subsets the string
         StringBackward(s.substring(0, s.length() - 1));
      }
   }
}