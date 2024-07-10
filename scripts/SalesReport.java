import java.io.*; // imports File and FileNotFoundException classes
import java.util.*; // imports Scanner and InputMismatchException classes
import java.text.DecimalFormat;

public class SalesReport
{
   public static void main(String[] args)
   {
      System.out.println("Working Directory = " + System.getProperty("user.dir"));
      String fileName = "SalesData.txt.txt"; // I messed up the naming
      int months = 0;
      double eachMonth, totalSales = 0.0, averageSales;
      
      DecimalFormat num = new DecimalFormat("#,###.00");
      
      try
      {
         // Open connection
         File file = new File(fileName);
         Scanner inputFile = new Scanner(file); //might generate FileNotFound
         
         while (inputFile.hasNext())
         {
            eachMonth = inputFile.nextDouble(); //might generate InputMismatch
            
            totalSales += eachMonth;
            months++;
         }
         
         inputFile.close();
         averageSales = totalSales / months;
         
         System.out.println("The average is " + num.format(averageSales));
      }
      catch (FileNotFoundException e)
      {
         System.out.println("The file " + fileName + " does not exist");
      }
      catch(InputMismatchException e)
      {
         System.out.println("Non-numeric data found in the file.");
      }
      catch(Exception e)
      {
         System.out.println(e.getMessage());
      }
      finally
      {
         System.out.println("This is the rest of the code...");
      }
      
   }
}