

public class Time
{
   private int hours;
   private int minutes;
   private int seconds;
   
   /*
   If the two constructors below were not written, the compiler would create one automatically (same as the first one)
   This is because it assigns 0 automatically to the elements above.
   
   HOWEVER, the second constructor is needed for the function to accept arguments. Hence, if called, it wouldn't accept args.
   
   That's why we have two constructors here - although the first isn't necessary due to the reasons above.
   */
   
   // Constructor with NO arguments
   public Time() // Note how there is no return type (i.e. void, int, etc.) since we're defining a class
   {
      hours = 0;
      minutes = 0;
      seconds = 0;
   }
   
   // Constructor with arguments
   public Time(int h, int m, int s) // We can have both of these constructors since they have different signatures (i.e., diff parameters contained in paren)
   {
      hours = h;
      minutes = m;
      seconds = s;
   }
   
   public void set_hours(int h)
   {
      hours = h;
   }
   public void set_minutes(int m)
   {
      minutes = m;
   }
   public void set_seconds(int s)
   {
      seconds = s;
   }
   
   public int get_hours()
   {
      return hours;
   }
   public int get_minutes()
   {
      return minutes;
   }
   public int get_seconds()
   {
      return seconds;
   }
   
   public String to_string()
   {
      String str = "Time is " + hours + ":" + minutes + ":" + seconds;
      
      return str;
   }
   
}