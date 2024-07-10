import java.util.Scanner;

public class PersonDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String myName, mySSN;
      
      System.out.print("Enter your name: ");
      myName = keyboard.nextLine();
      
      System.out.print("Enter your SSN: ");
      mySSN = keyboard.nextLine();
      
      Person p1 = new Person(myName, mySSN);
      
      System.out.println("Name is " + p1.getName());
   }
}