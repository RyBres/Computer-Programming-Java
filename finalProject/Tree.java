public class Tree extends Plant implements Growable // b. Subclass & c. Interface
{
   private double trunkRadius, ageYears;
   
   // Constructors
   public Tree()
   {
      super(); // g. Polymorphism (superclass reference)
      trunkRadius = 0.0;
      ageYears = 0.0;
   }
   
   public Tree(String s, String cn, String rt, int hs, double h, double tr, double ay)
   {
      super(s, cn, rt, hs, h); // g. Polymorphism (superclass reference)
      this.trunkRadius = tr;
      this.ageYears = ay;
   }
   
   // Accessor methods
   public double getTrunkRadius() // b. Accessor method
   {
       return trunkRadius;
   }
   
   public double getAgeYears() // b. Accessor method
   {
      return ageYears;
   }
   
   // Mutator methods
   public void setTrunkRadius(double tr) // b. Mutator method
   {
      this.trunkRadius = tr;
   }
   
   public void setTrunkRadius(int tr) // d. Method overloading
   {
      this.trunkRadius = tr;
   }
   
   public void setAgeYears(double ay) // b. Mutator method
   {
      this.ageYears = ay;
   }
   
   public void setAgeYears(int ay) // d. Method overloading
   {
      this.ageYears = ay;
   }
   
   // Implement abstract methods from Growable as concrete
   public void Grow() // e. Method overriding
   {
      System.out.println("The tree is growing...");
   }
   
   public void Photosynthesis() // c. Interface method
   {
      System.out.println("The tree is undergoing photosynthesis...");
   }
   
   public void Respiration() // c. Interface method
   {
      System.out.println("The tree is undergoing respiration...");
   }
   
   public void Transpiration() // e. Method overriding
   {
      System.out.println("The tree is undergoing transpiration...");
   }
   
   // toString method
   public String toString() // b. toString method
   {
        String str = "Species name is " + getSpecies()
                + "\nCommon name is " + getCommonName()
                + "\nReproduction type is " + getReproductionType()
                + "\nRequires " + getHoursSunlight() + " hours of sunlight/day"
                + "\nHeight is " + getHeight() + " centimeters"
                + "\nTrunk radius is " + trunkRadius + " centimeters"
                + "\nAge is " + ageYears + " years";
        return str;
    }
   
   // Other methods (overrides parent method in Plant)
   public void windyConditions() // e. Method overriding
   {
      System.out.println("The tree sways gently in the wind, with its branches creaking and its leaves rustling in the process.");
   }
}
