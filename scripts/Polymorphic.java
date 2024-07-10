public class Polymorphic
{
   public static void main(String[] args)
   {
      Person[] tests = new Person[3];
      
      Person p = new Person("John", "1234567");
      Person s = new Student("Alex", "3456", "CS", 3.5);
      Person e = new Employee("Jane", "5678", 234567, "Manager");
      
      tests[0] = p;
      tests[1] = s;
      tests[2] = e;
      
      tests[0].setName("Mike");
      tests[1].setName("Alice");
   }
}