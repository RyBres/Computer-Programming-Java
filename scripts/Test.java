public class Test {
   public static void main( String args[] )
   {
      int a[];
	
      a = new int[ 10 ];

      for ( int i = 0; i < a.length; i++ ) 
         a[ i ] = i + 1 * 2;

      int result = 0;
      for ( int i = 0; i < a.length; i++ ) {
         result += a[ i ];
      }
	
      System.out.println("Result is : " + result);
   }
}
