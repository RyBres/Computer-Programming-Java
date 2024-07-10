public class SubClass1 extends SuperClass1
{
   public SubClass1()
   {
      super(); //if super() statement is not given, then the compiler will create one for the superclass constructor anyways (default constructor)
      System.out.println("This is the subclass constructor.");
   }
   
   public static void main(String[] args)
   {
      SubClass1 s = new SubClass1();
   }
}