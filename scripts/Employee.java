public class Employee extends Person
{
   private double salary;
   private String position;
   
   public Employee()
   {
      super(); // the super class in this case is person, and must be referred to here
      salary = 0;
      position = null;
   }
   
   public Employee(String name, String SSN, int salary, String position)
   {
      super(name, SSN); 
      this.salary = salary;
      this.position = position;
   }
   
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   public void setPosition(String position)
   {
      this.position = position;
   }
   public double getSalary()
   {
      return salary;
   }
   public String getPosition()
   {
      return position;
   }
   
   public String toString()
   {
      String str = "Name is " + getName()
                  +"\nSSN is " + getSSN()
                  +"\nSalary is " + salary
                  +"\nPosition is " + position;
                  
      return str;
   }
   public static void main(String[] args)
   {
      Employee e1 = new Employee();
      e1.setName("Mike");
      e1.setSSN("12313123");
      e1.setSalary(100000);
      e1.setPosition("Janitorial Intern");
      
      System.out.println(e1.toString());
     
   }
   
}