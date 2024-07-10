public class Employee
{
   // Variables
   private String name, date;
   private double id;
   
   // Constructors
   public Employee()
   {
      this.name = null;
      this.date = null;
      this.id = 0;
   }
   
   public Employee(String n, String d, double id)
   {
      this.name = n;
      this.date = d;
      this.id = id;
   }
   
   // Mutate methods
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setDate(String date)
   {
      this.date = date;
   }
   
   public void setId(double id)
   {
      this.id = id;
   }
   
   // Access methods
   public String getName()
   {
      return name;
   }
   
   public String getDate()
   {
      return date;
   }
   
   public double getId()
   {
      return id;
   }
   
   
}