
import java.util.Scanner;

public class Employee2
{
   private String name;
   private int id;
   private Address h_address;
   
   public Employee2()
   {
      name = " ";
      id = 0;
      h_address = null;
   }
   public Employee2(String name, int id, Address h_address)
   {
      this.name = name;
      this.id = id;
      this.h_address = h_address;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setId(int id)
   {
      this.id = id;
   }
   public String getName()
   {
      return name;
   }
   public int getId()
   {
      return id;
   }
   
   public String toString()
   {
      String str = "Employee name is " + name
                  +"\nEmployee id is " + id
                  +"\nEmployee address is " + h_address.toString();
      return str;
   }
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String empName, streetAddress, city, state, zipCode;
      int empId;
      
      System.out.print("Enter you name: ");
      empName = keyboard.nextLine();
      
      System.out.print("Enter you id: ");
      empId = keyboard.nextInt();
      
      keyboard.nextLine(); // you need this so you can enter the next input!
      
      System.out.print("Enter your street address: ");
      streetAddress = keyboard.nextLine();
      
      System.out.print("Enter your city: ");
      city = keyboard.nextLine();
      
      System.out.print("Enter you state: ");
      state = keyboard.nextLine();
      
      System.out.print("Enter your zip code: ");
      zipCode = keyboard.nextLine();
      
      Address empAdd = new Address(streetAddress, city, state, zipCode);
      
      Employee2 e = new Employee2(empName, empId, empAdd);
      
      System.out.println(e.toString());
   }
}