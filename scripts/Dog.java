public class Dog extends Animal
{
   public void makeSound(boolean injured) // Since the parameter list is different, this would not work since abstract method in animal has no params
   {
      if(injured)
      {
         System.out.println("Whimper");
      }
   }
   
   public void makeSound()
   {
      System.out.println("Woof!");
   }
}