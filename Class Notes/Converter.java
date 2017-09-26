
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
         *      constants defined by us or the Java Standard Library.
         *      
         *  For example, in the Math class is defined:
         *  
         *      public static final double PI = 3.141592654;
         *  
         *  static: one value for the variable for all objects of the class;
         *              can be accessed directly through the class
         *              (e.g., Math.PI)
         */
        double area = Math.PI * radius * radius; // Math.PI * Math.pow(radius,2)
        return area;
    }
    
    public static double convertFeetToLightyears( double feet )
    {
        /*
         * Declare a constant with the final keyword.
         *      If we try to change the value, a compiler error will be generated.
         */
        final double LIGHTYEARS_FOR_EVERY_FOOT = 3.22174e-17;
        
        //LIGHTYEARS_FOR_EVERY_FOOT = 2;
        
        double lightyears = feet * LIGHTYEARS_FOR_EVERY_FOOT;
        return lightyears;
    }
    
    public static void penniesToDollarsAndCenters( int pennies )
    {
        final int PENNIES_FOR_EVERY_DOLLAR = 100;
        
        /*
         * Use integer division to calculate how many whoel dollars
         *      based on the specified number of pennies.
         *   
         *  Integer division (like // Python) discards the remainder (truncates)
         *      For example: (3 / 4) evaluates to 0; (3.0 / 4) evaluates to 0.75
         */
        int dollars = pennies / PENNIES_FOR_EVERY_DOLLAR;
    }
}





