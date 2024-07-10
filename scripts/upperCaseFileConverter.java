import java.util.Scanner;
import java.io.*;

public class upperCaseFileConverter
{
   public static void main(String[] args) throws IOException
   {
      String inFileName, outFileName, input, output;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the input file name: ");
      inFileName = keyboard.nextLine();
      
      System.out.print("Enter the output file name: ");
      outFileName = keyboard.nextLine();
      
      // 1. Open connection
      File file = new File(inFileName);
      Scanner inputFile = new Scanner(file);
      
      PrintWriter outputFile = new PrintWriter(outFileName);
      
      // 2. Read data from inFileName and write data to outFileName
      while (inputFile.hasNext())
      {
         input = inputFile.nextLine();
         output = input.toUpperCase();
         outputFile.println(input);
      }
      
      // 3. Close connection
      inputFile.close();
      outputFile.close();
      
   }
}