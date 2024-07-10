public class Plant // a. Superclass
{
   private String species, commonName, reproductionType;
   private int hoursSunlight;
   private double height;
   
   // Constructors
   public Plant()
   {
      species = null;
      commonName = null;
      reproductionType = null;
      hoursSunlight = 0;
      height = 0.0;
   }
   
   public Plant(String s, String cn, String rt, int hs, double h)
   {
      this.species = s;
      this.commonName = cn;
      this.reproductionType = rt;
      this.hoursSunlight = hs;
      this.height = h;
   }
   
   // Mutator methods
   public void setSpecies(String s) // a. Mutator method
   {
      this.species = s;
   }
   
   public void setCommonName(String cn) // a. Mutator method
   {
      this.commonName = cn;
   }
   
   public void setReproductionType(String rt) // a. Mutator method
   {
      this.reproductionType = rt;
   }
   
   public void setHoursSunlight(int hs) // a. Mutator method
   {
      this.hoursSunlight = hs;
   }
   
   public void setHeight(double h) // a. Mutator method
   {
      this.height = h;
   }
   
   // Accessor methods
   public String getSpecies() // a. Accessor method
   {
      return species;
   }
   
   public String getCommonName() // a. Accessor method
   {
      return commonName;
   }
   
   public String getReproductionType() // a. Accessor method
   {
      return reproductionType;
   }
   
   public int getHoursSunlight() // a. Accessor method
   {
      return hoursSunlight;
   }
   
   public double getHeight() // a. Accessor method
   {
      return height;
   }
   
   // toString method
   public String toString() // a. toString method
   {
      String str = "Species name is " + species
           +"\nCommon name is " + commonName
           +"\nReproduction type is " + reproductionType
           +"\nRequires " + hoursSunlight + " of sunlight/day"
           +"\nHeight is " + height + " centimeters";
      
      return str;
   }
   
   // Other methods (to be overridden by subclasses)
   public void windyConditions() // a. Method to be overridden
   {
      System.out.println("The plant sways gently in the wind.");
   }
}
