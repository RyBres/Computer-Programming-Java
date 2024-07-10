public class ProductionWorker extends Employee
{
   // Variables
   private int shift;
   private double rate;
   
   // Constructors
   public ProductionWorker()
   {
      super();
      this.shift = 0;
      this.rate = 0.0;
   }
   public ProductionWorker(String name, String date, double id, int shift, double rate)
   {
      super(name, date, id);
      this.shift = shift;
      this.rate = rate;
   }
   
   // Mutate methods
   public void setShift(int shift)
   {
      this.shift = shift;
   }
   public void setRate(double rate)
   {
      this.rate = rate;
   }
   
   // Access methods
   public int getShift()
   {
      return shift;
   }
   
   public double getRate()
   {
      return rate;
   }
}