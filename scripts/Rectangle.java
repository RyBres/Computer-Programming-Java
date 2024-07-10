public class Rectangle
{
   private int length;
   private int width;
   
   // const w/ arg
   public Rectangle()
   {
      length = 0;
      width = 0;
   }
   // constr w/o arg
   public Rectangle(int l, int w)
   {
      length = l;
      width = w;
   }
   //setLength
   public void setLength(int l)
   {
      length = l;
   }
   
   //setWidth
   public void setWidth(int w)
   {
      width = w;
   }
   //getLength
   public int getLength()
   {
      return length;
   }
   
   //getWidth
   public int getWidth()
   {
      return width;
   }
   // area method
   public int getArea()
   {
      return length * width;
   }
   
   
   //toString
   public String toString()
   {
      String str = "Length is " + length
                  +"\nWidth is " + width
                  +"\nArea is " + getArea();
      
      return str;
   }

   // equals method
   public boolean equals(Rectangle obj)
   {
      if(length == obj.length && width == obj.width)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   // Testing
   public static void main(String[] args)
   {
      Rectangle rec1 = new Rectangle(9, 10);
      Rectangle rec2 = new Rectangle(9, 10);
      
      if(rec1.equals(rec2))
      {
         System.out.println("Equivalent");
      }
      else
      {
         System.out.println("Not equivalent");
      }
   }   
}