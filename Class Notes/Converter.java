
/**
 * Write a description of class Converter here.
 *
 * @author gcschmit
 * @version 26 September 2017
 */
public class Converter
{
    public static double calculateAreaOfCircle( double radius )
    {
        /*
         * Instead of using a "magic number" (e.g., 3.14159), use
         *      constants defined by the Java Standard Library.
         *      
         *  For example, in Math.java:
         *  
         *  public static final double PI = 3.141592654;
         *  
         *  Static: one value for the variable for all objects of the class;
         *              can be accessed directly through the class
         *              (e.g., Math.PI)
         */
        double area = Math.PI * radius * radius;
        return area;
    }
    
    public static double convertFeetToLightyears( double feet )
    {
        /*
         * Declare a constant with the final keyword.
         * 
         *  If we try to change the value, a compiler error will be generated.
         */
        final double LIGHTYEARS_FOR_EVERY_FOOT = 3.22174e-17;
        
        double lightYears = feet * LIGHTYEARS_FOR_EVERY_FOOT;
        
        // LIGHTYEARS_FOR_EVERY_FOOT = 2;
        
        return lightYears;
    }
    
    public static void penniesToDollarsAndCents( int pennies )
    {
        final int PENNIES_FOR_EVERY_DOLLAR = 100;
        
        /*
         * Use integer division to calculate how many whole dollars
         *      based on the specified number of pennies.
         *  
         *  Integer division (like // Python) discards the remainder (truncates)
         *      For example: ( 3 / 4 ) evaluates to 0; ( 3.0 / 4 ) evaluates to 0.75
         */
        int dollars = pennies / PENNIES_FOR_EVERY_DOLLAR;
        
        /*
         * Use the modulo (mod, remainder) operator to calculate how many
         *      cents remain.
         *  
         *  The mod (%) operator returns the remainder of the division operation.
         *  
         *  It can be very useful when paired with integer division.
         *  
         *  Examples:
         *      7 % 2 = 1
         *      11 % 3 = 2
         *      6 % 2 = 0
         */
        int cents = pennies % PENNIES_FOR_EVERY_DOLLAR;
        
        System.out.println( "Dollars: " + dollars + ", Cents:" + cents );
    }
}





