public class RectangleDemo
{
   public static void main(String[] args)
   {
      // Test empty rectangle
      Rectangle r1;
      r1 = new Rectangle();
      
      System.out.println(r1.toString());
      
      // With args
      Rectangle r2 = new Rectangle(15,10);
      System.out.println(r2.toString());
      
      
      // Get area
      int area = r2.getLength() * r2.getWidth();
      System.out.println("The area is " + area);
      
      // With method
      System.out.println("The area from area() method is " + r2.area());
      
      
   }
}