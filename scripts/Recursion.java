public class Recursion
{
   public static void main(String[] args)
   {
      message(5); // this main method is calling the recursive method, message()
   }
   public static void message(int n)
   {
      if (n > 0)
      {
         System.out.println("This is a recursive method.");
         message(n-1);
      }
   }
}