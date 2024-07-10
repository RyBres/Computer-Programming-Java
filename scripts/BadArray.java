public class BadArray
{
   public static void main(String[] args)
   {
      int[] numbers = {1, 2, 3};
      
      for (int i = 0; i < numbers.length; i++) // the i <= 3 is wrong. I changed it to be relative now
      {
         System.out.println(numbers[i]);
      }
   }
}