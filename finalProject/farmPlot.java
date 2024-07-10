/**
Aggregation class that contains a plant (or rather, a collection of a defined plant variety).

Instantiating a farmPlot object allows the user to create a "farm plot" that is filled with a class of plant (or its subclasses, like tree or flower) 
of any given variety.
*/

public class farmPlot // h. Aggregation
{
   private Plant plant;
   
   // Constructor
   public farmPlot(Plant plant)
   {
      this.plant = plant;
   }
   
   // Accessor
   public Plant getPlant() // h. Accessor method
   {
      return plant;
   }
   
   // Mutator
   public void setPlant(Plant plant) // h. Mutator method
   {
      this.plant = plant;
   }
   
   // toString
   public String toString() // h. toString method
   {
      return "The typical crop in this farmplot has the following features: \n" + plant.toString();
   }
   
   // Static method
   public static void showPlantInfo(Plant plant) // f. Static method
   {
      System.out.println("Here is some basic info about the crop planted in your farm plot."
                        +"\nSpecies is: " + plant.getSpecies()
                        +"\nCommon name is: " + plant.getCommonName());
   }
}
