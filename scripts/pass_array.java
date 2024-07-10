
public class pass_array
{

   public static void main(String[] args)
   {
      // Step 0: Declare vars
      int[] myArray = {2, 4, 6, 8, 10};
      
      // Step 1: Call method
      showArray(myArray);
   }
   
   public static void showArray(int[] a)
   {
      System.out.print("Elements are: ");
      
      for(int i = 0; i < a.length; i++)
      {
         if (i < (a.length - 1))
         {
            System.out.print(a[i] + ", ");
         }
         else
         {
            System.out.print(a[i] + ".");
         }
      }
      
   }
   
}