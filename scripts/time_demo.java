import java.util.Scanner;


public class time_demo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int myH, myM, myS;
      
      System.out.print("Enter hours: ");
      myH = keyboard.nextInt();
      
      System...
      
      Time t2 = new Time(myH, myM, myS);
      
      
      Time t1 = new Time();
      
      // Display components of t1
      System.out.println("Hours is " + t1.get_hours());
      System.out.println("Minutes is " + t1.get_minutes());
      System.out.println("Seconds is " + t1.get_seconds());
      
      // Display with built in method
      System.out.println(t1.to_string());
      
      // Update time
      t1.set_hours(1);
      t1.set_minutes(33);
      
      // Display again with built in method
      System.out.println(t1.to_string());
   }
}