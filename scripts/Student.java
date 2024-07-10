public class Student extends Person // is a subclass of person
{
   private String major;
   private double GPA;
   
   //no arg constructor
   
   public Student()
   {
      super(); // the super class in this case is person, and must be referred to here
      major = null;
      GPA = 0.0;
   }
   
   /*
   //arg constructor
   public Student(String n, String s, String m, double gpa) // you need to have the args from Employee as well, since it's super class
   {
      super(n, s); // need to refer to the args of super class
      major = m;
      GPA = gpa;
   }
   */
   
   public Student(String name, String SSN, String major, double GPA) // another way to do this
   {
      super(name, SSN); 
      this.major = major; // leading with this. to refer to the major defined above in private STring major etc.
      this.GPA = GPA;
   }
   
   public void setMajor(String major)
   {
      this.major = major;
   }
   public void setGPA(double GPA)
   {
      this.GPA = GPA;
   }
   public String getMajor()
   {
      return major;
   }
   public double getGPA()
   {
      return GPA;
   }
   
   public String toString()
   {
      String str = "Name is " + getName()
                  +"\nSSN is " + getSSN()
                  +"\nMajor is " + major // major is inside current class (private) so can be accessed
                  +"\nGPA is " + GPA;
                  
      return str;
   }
   
}