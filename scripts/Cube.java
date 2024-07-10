public class Cube extends Rectangle implements Shapes
{
   // Define variables
   private double height; // Only need to define height since Cube is extension of Rectangle, which has length and width
   
   // Constructors
   public Cube()
   {
      super(); // Rectangle contains length and width in constructor
      height = 0.0;
   }
   public Cube(double l, double w, double h)
   {
      super(length, width);
      this.height = h;
   }
   
   // Set height
   public void setHeight(int h)
   {
      this.height = h;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getSurfaceArea()
   {
      return (getArea() * 6);
   }
   
   public double getVolume()
   {
      return (getArea() * height);
   }
   /*
   // equals method
   public boolean equals(Cube obj)
   {
      if(length == obj.length && width == obj.width && obj.height)
      {
         return true;
      }
      else
      {
         return false;
      }
   }*/
   
   // toString method
   public  String toString()
   {
      String str = "Length is " + getLength()
                  +"\nWidth is " + getWidth()
                  +"\nHeight is " + height
                  +"\nSurface area is " + getSurfaceArea()
                  +"\nVolume is " + getVolume();
                  
      return str;               
   }
   
   // draw method - you need this because it's an abstract method in Shapes
   public void draw()
   {
      System.out.println("Drawing a cube...");
   }
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double myLength, myWidth, myHeight;
      
      System.out.print("Enter length: ");
      myLength = keyboard.nextDouble();
      
      System.out.print("Enter width: ");
      myWidth = keyboard.nextDouble();
      
      System.out.print("Enter height: ");
      myHeight = keyboard.nextDouble();
   }
   
}