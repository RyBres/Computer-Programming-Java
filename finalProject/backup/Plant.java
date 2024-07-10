public class Plant
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
   public void setspecies(String s)
   {
      this.species = s;
   }
   
   public void setCommonName(String cn)
   {
      this.commonName = cn;
   }
   
   public void setReproductionType(String rt)
   {
      this.reproductionType = rt;
   }
   
   public void setHoursSunlight(int hs)
   {
      this.hoursSunlight = hs;
   }
   
   public void setHeight(double h)
   {
      this.height = h;
   }
   
   // Accessor methods
   public String getSpecies()
   {
      return species;
   }
   
   public String getCommonName()
   {
      return commonName;
   }
   
   public String getReproductionType()
   {
      return reproductionType;
   }
   
   public int getHoursSunlight()
   {
      return hoursSunlight;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   // toString method
   public String toString()
   {
      String str = "Species name is " + species
           +"\nCommon name is " + commonName
           +"\nReproduction type is " + reproductionType
           +"\nRequires " + hoursSunlight + " of sunlight/day"
           +"\nHeight is " + height + " centimeters";
      
      return str;
            
   }
   
   // Other methods (to be overridden by subclasses)
   public void windyConditions()
   {
      System.out.println("The plant sways gently in the wind.");
   }
   
}