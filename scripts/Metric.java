public class Metric
{
   public static double milesToKilometers(double miles)
   {
      double kilo = miles * 1.609;
      return kilo;
   }
   public static double kilometersToMiles(double kilo)
   {
      double miles = kilo / 1.609;
      return miles;
   }
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double miles, kilos;
      
      System,out.print("Enter miles: ");
      miles = keyboard.nextDouble();
      
      Metric m = new Metric();
      kilos = m.milesToKilometers(miles); // this file isn't done
   }
}