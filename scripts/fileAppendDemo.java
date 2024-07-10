import java.util.Scanner;
import java.io.*;

public class fileAppendDemo
{
   public static void main(String[] args) throws IOException
   {
      FileWriter fWriter = new FileWriter("myFriends.txt");
      PrintWriter outputFile = new PrintWriter(fWriter);
      
      outputFile.println("Veronica");
      outputFile.println("Robert");
      outputFile.println("George");
      
      outputFile.close();
      
      System.out.println("Success!");
   }
}