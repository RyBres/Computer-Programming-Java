public class Address
{
   private String streetAddress;
   private String city;
   private String state;
   private String zipCode;
   
   public Address()
   {
   
   this.streetAddress = this.city = this.state = this.zipCode = null;
   
   /*
      this.streetAddress = null;
      this.city = null;
      this.state = null;
      this.zipCode = null;
   */
   }
   
   public Address(String sa, String c, String stt, String z)
   {
      this.streetAddress = sa;
      this.city = c;
      this.state = stt;
      this.zipCode = z;
   }
   public String toString()
   {
      String str = streetAddress + ", " + city + ", " + state + ", " + zipCode;
      return str;
   }
}