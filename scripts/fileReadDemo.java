import java.util.Scanner;
import java.io.*;

public class fileReadDemo
{
   public static void main(String[] args) throws IOException
   {
      // 0. Initialize variables/objects
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      
      System.out.println("Enter the file name: ");
      fileName = keyboard.nextLine();
      
      // 1. Open file connection
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
      
      // 2. Read file
      while (inputFile.hasNext())
      {
         String name = inputFile.nextLine();
      }
      
      // 3. Close file connection
      inputFile.close();
      
      System.out.println("Success!");
      
   }
}