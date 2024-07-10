public class Flower extends Plant implements Growable // b. Subclass & c. Interface
{
   double petalLength, petalWidth, diameter, numPetals;
   String color;
   
   // Constructors
   public Flower()
   {
      super(); // g. Polymorphism (superclass reference)
      petalLength = 0.0;
      petalWidth = 0.0;
      diameter = 0.0;
      numPetals = 0.0;
      color = null;
   }
   
   public Flower(String s, String cn, String rt, int hs, double h, double pl, double pw, double d, double np, String c)
   {
      super(s, cn, rt, hs, h); // g. Polymorphism (superclass reference)
      this.petalLength = pl;
      this.petalWidth = pw;
      this.diameter = d;
      this.numPetals = np;
      this.color = c;
   }
   
   // Accessor methods
   public double getPetalLength() // b. Accessor method
   {
       return petalLength;
   }
   
   public double getPetalWidth() // b. Accessor method
   {
       return petalWidth;
   }
   
   public double getDiameter() // b. Accessor method
   {
       return diameter;
   }
   
   public double getNumPetals() // b. Accessor method
   {
       return numPetals;
   }
   
   public String getColor() // b. Accessor method
   {
       return color;
   }

   
   // Mutator methods
   public void setPetalLength(double pl) // b. Mutator method
   {
      this.petalLength = pl;
   }
   
   public void setPetalWidth(double pw) // b. Mutator method
   {
      this.petalWidth = pw;
   }
   
   public void setDiameter(double d) // b. Mutator method
   {
      this.petalWidth = d;
   }
   
   public void setNumPetals(double np) // b. Mutator method
   {
      this.numPetals = np;
   }
   
   public void setColor(String c) // b. Mutator method
   {
      this.color = c;
   }
   
   // toString method
   public String toString() // b. toString method
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
   public void Grow() // e. Method overriding
   {
      System.out.println("The flower is growing...");
   }
   
   public void Photosynthesis() // c. Interface method
   {
      System.out.println("The flower is undergoing photosynthesis...");
   }
   
   public void Respiration() // c. Interface method
   {
      System.out.println("The flower is undergoing respiration...");
   }
   
   public void Transpiration() // e. Method overriding
   {
      System.out.println("The flower is undergoing transpiration...");
   }
   
   // Other methods (overrides parent method in Plant)
   public void windyConditions() // e. Method overriding
   {
      System.out.println("The flower bends gently in the wind, losing a petal or two in the process.");
   }
}
