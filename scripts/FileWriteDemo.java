import java.util.Scanner;
import java.io.*; // * allows us to import all classes

public class FileWriteDemo
{
   public static void main(String[] args) throws IOException // you need throws... so that it can compile - this is needed for IO methods
   {
      // 0. Initialize objects/variables
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String friendName;
      int numFriends;
      
      System.out.print("Enter number of friends: ");
      numFriends = keyboard.nextInt();
      
      keyboard.nextLine(); // take care of newline made by nextInt()
      
      System.out.print("Enter filename: ");
      fileName = keyboard.nextLine();
   
      // 1. Open the file
      PrintWriter outputFile = new PrintWriter(fileName);
      
      // 2. Write to file
      for (int i = 1; i <= numFriends; i++)
      {
         System.out.print("Enter the name of friend name " + i + ": ");
         friendName = keyboard.nextLine();
         
         outputFile.println(friendName); // uses identically named method as System's println, but it's for output file
      }
      
      // 3. Close file connection
      outputFile.close();
      
      System.out.println("Success!");
      
   }
}