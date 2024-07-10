public class AnimalDemo
{
   public static void main(String[] args)
   {
      Animal cat = new Cat();
      Animal dog = new Dog();
      
      Animal[] tests = new Animal[2];
      tests[0] = cat;
      tests[1] = dog;
      
      for (int i = 0; i < tests.length; i++)
      {
         System.out.println(tests[i]);
      }
   }
}