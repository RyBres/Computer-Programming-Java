public class Flower extends Plant implements Growable
{
   double petalLength, petalWidth, diameter, numPetals;
   String color;
   
   // Constructors
   public Flower()
   {
      super();
      petalLength = 0.0;
      petalWidth = 0.0;
      diameter = 0.0;
      numPetals = 0.0;
      color = null;
   }
   
   public Flower(String s, String cn, String rt, int hs, double h, double pl, double pw, double d, double np, String c)
   {
      super(s, cn, rt, hs, h);
      this.petalLength = pl;
      this.petalWidth = pw;
      this.diameter = d;
      this.numPetals = np;
      this.color = c;
   }
   
   // Accessor methods
   public double getPetalLength() 
   {
       return petalLength;
   }
   
   public double getPetalWidth() 
   {
       return petalWidth;
   }
   
   public double getDiameter() 
   {
       return diameter;
   }
   
   public double getNumPetals() 
   {
       return numPetals;
   }
   
   public String getColor() 
   {
       return color;
   }

   
   // Mutator methods
   public void setPetalLength(double pl)
   {
      this.petalLength = pl;
   }
   
   public void setPetalWidth(double pw)
   {
      this.petalWidth = pw;
   }
   
   public void setDiameter(double d)
   {
      this.petalWidth = d;
   }
   
   public void setNumPetals(double np)
   {
      this.numPetals = np;
   }
   
   public void setColor(String c)
   {
      this.color = c;
   }
   
   // toString method
   public String toString()
   {
      String str = "Species name is " + getSpecies()
           +"\nCommon name is " + getCommonName()
           +"\nReproduction type is " + getReproductionType()
           +"\nRequires " + getHoursSunlight() + " of sunlight/day"
           +"\nHeight is " + getHeight() + " centimeters"
           +"\nPetal length is " + petalLength + " centimeters"
           +"\nPetal width is " + petalWidth + " centimeters"
           +"\nDiameter is " + diameter + " centimeters"
           +"\nNumber of petals is " + numPetals
           +"\nColor is " + color;
           
      return str;
   }
   
   // Implement abstract methods from Growable as concrete
   public void Grow()
   {
      System.out.println("The flower is growing...");
   }
   
   public void Photosynthesis()
   {
      System.out.println("The flower is undergoing photosynthesis...");
   }
   
   public void Respiration()
   {
      System.out.println("The flower is undergoing respiration...");
   }
   
   public void Transpiration()
   {
      System.out.println("The flower is undergoing transpiration...");
   }
   
   // Other methods (overrides parent method in Plant)
   public void windyConditions()
   {
      System.out.println("The flower bends gently in the wind, losing a petal or two in the process.");
   }
}