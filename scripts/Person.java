public class Person
{
   private String name;
   private String SSN;
   
   public Person()
   {
      name = null;
      SSN = null;
   }
   public Person(String n, String s)
   {
      name = n;
      SSN = s;
   }
   
   public void setName(String n)
   {
      name = n;
   }
   public void setSSN(String s)
   {
      SSN = s;
   }
   public String getName()
   {
      return name;
   }
   public String getSSN()
   {
      return SSN;
   }
   
   public String toString()
   {
      String str = "Name is " + name
                  +"\nSSN is " + SSN;
                  
      return str;
   }
}