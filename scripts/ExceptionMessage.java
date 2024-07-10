import java.io.*;
import java.util.Scanner;

public class ExceptionMessage
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      
      System.out.print("Enter the file name: ");
      fileName = keyboard.nextLine();
      
      // 1. Open file
      try
      {
         File file = new File(fileName);
         
         if (!file.exists())
         {
            throw new FileNotFoundException();
         }
         
         Scanner inputFile = new Scanner(file);
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found");
      }
   }
}