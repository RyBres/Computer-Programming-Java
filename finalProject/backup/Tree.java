public class Tree extends Plant implements Growable
{
   private double trunkRadius, ageYears;
   
   // Constructors
   public Tree()
   {
      super();
      trunkRadius = 0.0;
      ageYears = 0.0;
   }
   
   public Tree(String s, String cn, String rt, int hs, double h, double tr, double ay)
   {
      super(s, cn, rt, hs, h);
      this.trunkRadius = tr;
      this.ageYears = ay;
   }
   
   // Accessor methods
   public double getTrunkRadius() 
   {
       return trunkRadius;
   }
   
   public double getAgeYears()
   {
      return ageYears;
   }
   
   // Mutator methods
   public void setTrunkRadius(double tr)
   {
      this.trunkRadius = tr;
   }
   
   public void setTrunkRadius(int tr) // Method overloading: two set methods for trunkRadius, but one accepts int and other double
   {
      this.trunkRadius = tr;
   }
   
   public void setAgeYears(double ay)
   {
      this.ageYears = ay;
   }
   
   public void setAgeYears(int ay)  // Method overloading: two set methods for ageYears, but one accepts int and other double
   {
      this.ageYears = ay;
   }
   
   
   // Implement abstract methods from Growable as concrete
   public void Grow()
   {
      System.out.println("The tree is growing...");
   }
   
   public void Photosynthesis()
   {
      System.out.println("The tree is undergoing photosynthesis...");
   }
   
   public void Respiration()
   {
      System.out.println("The tree is undergoing respiration...");
   }
   
   public void Transpiration()
   {
      System.out.println("The tree is undergoing transpiration...");
   }
   
   // toString method
   public String toString() 
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
   public void windyConditions()
   {
      System.out.println("The tree sways gently in the wind, with its branches creaking and its leaves rustling in the process.");
   }
}