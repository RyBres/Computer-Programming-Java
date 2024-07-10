public class Stock
{
   private String symbol;
   private double sharePrice;
   
   // Constructors  
   public Stock(String sym, double sp)
   {
      this.symbol = sym;
      this.sharePrice = sp;
   }
   
   // set methods
   public void setSymbol(String sym)
   {
      this.symbol = sym;
   }
   
   public void setSharePrice(double sp)
   {
      this.sharePrice = sp;
   }
   
   // get methods
   public String getSymbol()
   {
      return symbol;
   }
   
   public double getSharePrice()
   {
      return sharePrice;
   }
   
   //toString
   public String toString()
   {
      String str = "Symbol is " + symbol
                  +"\nShare price is " + sharePrice;
      
      return str;
   }
   
   // equals method
   public boolean equals(Stock s)
   {
      if(symbol.equals(s.symbol) && sharePrice == s.sharePrice)
         return true;
      else
         return false;
   }
   
   // testing
   public static void main(String[] args)
   {
      Stock company1 = new Stock("Apple", 100.00);
      Stock company2 = new Stock("Apple", 100.00);
      
      if (company1.equals(company2))
      {
         System.out.println("Same name");
      }
      else
      {
         System.out.println("Different name");
      }
   }
}